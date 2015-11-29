(ns myclosureapp.core
  (:require [goog.dom :as gdom])
  (:import goog.History))

(enable-console-print!)

(let [element (gdom/getElement "foo")
      history-instance (History.)]
  (println "(In a hushed voice) And the element is ... " element)
  (println "That was some history, huh?" history-instance))


