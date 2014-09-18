(defproject servestatic "0.1.0-SNAPSHOT"
  :description "Serves files from a directory on HTTP"
  :url "https://github.com/khernyo/servestatic"
  :license {:name "Public Domain"
            :url "http://unlicense.org/UNLICENSE"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring "1.3.1"]]
  :main servestatic.core)
