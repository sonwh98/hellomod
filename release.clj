(require '[cljs.build.api :as b])

(b/build "src"
         {:output-dir "out"
          :asset-path "/out"
          :optimizations :advanced
          :verbose true
          :main 'foo.core
          :modules {:foo {:entries '#{foo.core}
                          :output-to "out/foo.js"}
                    :bar {:entries '#{bar.core}
                          :output-to "out/bar.js"}}})

(System/exit 0)
