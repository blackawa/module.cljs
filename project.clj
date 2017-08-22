(defproject duct/module.cljs "0.3.0"
  :description "Duct module for developing and compiling ClojureScript"
  :url "https://github.com/duct-framework/module.cljs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [org.clojure/clojurescript "1.9.908"]
                 [binaryage/devtools "0.9.3"]
                 [duct/core "0.6.0"]
                 [duct/compiler.cljs "0.2.0"]
                 [duct/server.figwheel "0.2.0"]
                 [integrant "0.6.1"]])
