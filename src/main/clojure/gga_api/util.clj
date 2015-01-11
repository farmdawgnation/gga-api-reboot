(ns gga-api.util
  (:require [noir.io :as io]
            [markdown.core :as md]
            [monger.core :as mg]))

(defn md->html
  "reads a markdown file from public/md and returns an HTML string"
  [filename]
  (md/md-to-html-string (io/slurp-resource filename)))

(def db (let [conn (mg/connect)]
  (mg/get-db conn "galegis-api-dev")))
