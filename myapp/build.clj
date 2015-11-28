(require '[cljs.build.api :as b])

(b/build "src"
         {:main 'myapp.core
          :output-to "main.js"
          :output-to-dir "out"
          :target :nodejs
          :verbose true})
