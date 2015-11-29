(require '[cljs.build.api :as b])

(b/watch (b/inputs "src" "test")
  {:main 'appfortesting.core_tests
   :target :nodejs
   :output-to "out/appfortesting.js"
   :output-dir "out"
   :verbose true})
