(ns appfortesting.core)

#_(enable-console-print!)

#_(println "Hello world!")

(defn leap? [year]
  (or (and (zero? (js-mod year 4))
           (pos? (js-mod year 100)))
      (zero? (js-mod year 400))))
