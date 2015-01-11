(defproject gga-api "0.1.0-SNAPSHOT"
  :description "A REST API for the Georgia General Assembly."
  :url "https://gga.apis.gaodp.org"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [lib-noir "0.9.5"]
                 [ring-server "0.3.1"]
                 [selmer "0.7.7"]
                 [com.taoensso/timbre "3.3.1"]
                 [com.taoensso/tower "3.0.2"]
                 [markdown-clj "0.9.58"
                  :exclusions [com.keminglabs/cljx]]
                 [environ "1.0.0"]
                 [im.chit/cronj "1.4.3"]
                 [noir-exception "0.2.3"]
                 [prone "0.8.0"]
                 [prismatic/schema "0.3.3"]]
  :source-paths ["src/main/clojure"]
  :resource-paths ["src/main/resources"]
  :test-paths ["src/test/clojure"]
  :java-source-paths ["src/main/java"]
  :uberjar-name "gga-api.jar"
  :repl-options {:init-ns gga-api.repl}
  :jvm-opts ["-server"]
  :plugins [[lein-ring "0.9.0"]
            [lein-environ "1.0.0"]
            [lein-ancient "0.5.5"]
            [lein-javadoc "0.1.1"]]
  :javadoc-opts {:package-names ["gov.ga.legis"]
                 :output-dir "target/javadoc"}
  :ring {:handler gga-api.handler/app
         :init    gga-api.handler/init
         :destroy gga-api.handler/destroy
         :uberwar-name "gga-api.war"}
  :profiles
  {:uberjar {:omit-source true
             :env {:production true}
             :aot :all}
   :production {:ring {:open-browser? false
                       :stacktraces?  false
                       :auto-reload?  false}}
   :dev {:dependencies [[ring-mock "0.1.5"]
                        [ring/ring-devel "1.3.2"]
                        [pjstadig/humane-test-output "0.6.0"]]
         :injections [(require 'pjstadig.humane-test-output)
                      (pjstadig.humane-test-output/activate!)]
         :env {:dev true}}}
  :min-lein-version "2.0.0")
