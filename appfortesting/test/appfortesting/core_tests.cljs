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

(t/deftest my-async-test
  (t/async done
           ;; Exchange commenting of next two expressions to change tests from failing to succeeding.
           (core/async-leap? 1997 (fn [result]
                                    (t/is (true? result))
                                   (done)))
           ;; (core/async-leap? 1996 (fn [result]
           ;;                          (t/is (true? result))
           ;;                          (done)))
           ))

(set! *main-cli-fn* #(t/run-tests))

(defmethod t/report [::t/default :end-run-tests]
  [m]
  (if (t/successful? m)
    (set! (.-exitCode js/process) 0)
    (set! (.-exitCode js/process) 1)))
