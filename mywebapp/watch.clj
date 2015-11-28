(require '[cljs.build.api :as b])

(b/watch "src"
         {:output-to "main.js"
          :output-dir "out/"
          :source-map "main.js.map"
          :main 'mywebapp.core
          ;; Do not need verbose because watching **already** provides verbose output (I think).
          :optimizations :none})
