(defproject cc.qbits/tlp "1.0.0"
  :description "Twitter Location Parser: fast tool to parse location out of twitter users"
  :dependencies [[org.clojure/clojure "1.9.0-alpha13"]
                 [com.stuartsierra/component "0.3.1"]
                 [org.slf4j/slf4j-api "1.7.21"]
                 [org.slf4j/slf4j-log4j12 "1.7.21"]]
  :profiles {:test {:dependencies [[junit/junit "4.12"]]}}
  :source-paths ["src/clj"]
  :java-source-paths ["src/java"]
  :global-vars {*warn-on-reflection* true})
