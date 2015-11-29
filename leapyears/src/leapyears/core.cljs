(ns leapyears.core
  (:require [goog.dom :as gdom]
            [goog.events :as gevents]
            [cljs.reader :refer (read-string)]))

(enable-console-print!)

(def input (gdom/getElement "year"))
(def result (gdom/getElement "result"))

(defn leap? [year]
  (or (and (zero? (js-mod year 4))
           (not (zero? (js-mod year 100))))
      (zero? (js-mod year 400))))

(defn on-change [event]
  (let [target (.-target event)
        value (read-string (.-value target))]
    (if (leap? value)
      (set! (.-innerHTML result) "YES")
      (set! (.-innerHTML result) "NO"))))

(gevents/listen input "keyup" on-change)
