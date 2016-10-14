(ns qbits.tlp
  (:import
   (com.taykey.twitterlocationparser.dto.Location)
   (com.taykey.twitterlocationparser DefaultLocationParser)
   (com.taykey.twitterlocationparser.dto LocationType)))

(defrecord Location [name alternate-names state-code country-code type
                     population latitude longitude])

(defn jloc->loc [^com.taykey.twitterlocationparser.dto.Location loc]
  (Location.
   (.getName loc)
   (.getAlternateNames loc)
   (.getStateCode loc)
   (.getCountryCode loc)
   (case (-> loc .getType .name)
     "City" :city
     "State" :state
     "Country" :country)
   (.getPopulation loc)
   (.getLatitude loc)
   (.getLongitude loc)))

(defn load-parser []
  (DefaultLocationParser.))

(defprotocol LocationParser
  (find-location [this text]))

(extend-protocol LocationParser
  DefaultLocationParser
  (find-location [this text]
    (some-> this (.parseText text) jloc->loc)))


;; (def p (load-parser))

;; (clojure.pprint/pprint (find-location p "france"))
