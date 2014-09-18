(ns servestatic.core
  (:gen-class)
  (:require [ring.middleware.content-type :refer [wrap-content-type]]
            [ring.middleware.file :refer [wrap-file]]
            [ring.middleware.not-modified :refer [wrap-not-modified]]
            [ring.adapter.jetty :as jetty]))

(defn app [path]
  (-> (fn [request]
        {:status 404
         :body "<h1>Page not found</h1>"
         :headers {"Content-Type" "text/html"}})
      (wrap-file path)
      (wrap-content-type)
      (wrap-not-modified)))

(defn -main [& args]
  (jetty/run-jetty (app (first args))
                   {:port 3000}))
