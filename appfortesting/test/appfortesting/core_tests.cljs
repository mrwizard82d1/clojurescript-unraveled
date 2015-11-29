(ns appfortesting.core-tests
  (:require [cljs.test :as t]
            [appfortesting.core :as core]))

(enable-console-print!)

(t/deftest my-first-test
  ;; Exchange the two expressions to make tests fail or pass, respectively.
  #_(t/is (= 1 2))
  (t/is (not= 1 2))
)

(t/deftest my-second-test
  (t/is (core/leap? 1996))
  (t/is (not (core/leap? 1997)))
  (t/is (not (core/leap? 1998)))
  (t/is (not (core/leap? 1999)))
  (t/is (core/leap? 2000))
  (t/is (not (core/leap? 1900))))

(set! *main-cli-fn* #(t/run-tests))