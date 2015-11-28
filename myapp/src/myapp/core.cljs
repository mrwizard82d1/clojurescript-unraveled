(ns myapp.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn -main [& args]
  (println "Hello, ClojureScript Unraveled World!"))

(set! *main-cli-fn* -main)
