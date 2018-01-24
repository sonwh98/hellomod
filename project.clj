(defproject hello/mod "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.9.946" :scope "provided"]]
  :plugins [[lein-cljsbuild "1.1.7"]]
  :source-paths ["src" ]
  :cljsbuild  {:builds {:prod {:source-paths ["src" ]
                               :compiler {:output-dir "out"
                                          :asset-path "/out"
                                          :optimizations :advanced
                                          :verbose true
                                          :parallel-build true
                                          ;;:main "foo.core"
                                          :modules {:foo {:entries #{"foo.core"}
                                                          :output-to "out/foo.js"}
                                                    :bar {:entries #{"bar.core"}
                                                          :output-to "out/bar.js"}}
                                          }}}})
