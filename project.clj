(defproject cljx-ns-trouble "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :aliases {"test!"  ["do" "clean," "test"]
            "repl-headless"["trampoline" "do" "clean," "cljx," "repl" ":headless"]}
  :plugins [[com.keminglabs/cljx "0.3.1"]]
  :source-paths ["src" "generated/cljs"]
  :clean-targets [:target-path "app/generated"]
  :test-paths   ["src" "test" "generated/clj"]
  :cljx {:builds [{:source-paths ["cljx"]
                   :output-path "generated/clj/cljx.namespace.trouble"
                   :rules :clj}
                  
                  {:source-paths ["cljx"]
                   :output-path "generated/cljs/cljx.namespace.trouble"
                   :rules :cljs}]}
  :hooks [cljx.hooks])
