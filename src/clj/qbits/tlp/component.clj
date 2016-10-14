(ns qbits.tlp.component
  (:require
   [com.stuartsierra.component :as com]
   [qbits.tlp :as tlp])
  (:import
   (com.taykey.twitterlocationparser DefaultLocationParser)))

(defrecord LocationParser [^DefaultLocationParser parser]
  tlp/LocationParser
  (find-location [this text]
    (tlp/find-location parser text))
  com/Lifecycle
  (start [this]
    (assoc this :parser (tlp/load-parser)))
  (stop [this]
    (assoc this :parser nil)))
