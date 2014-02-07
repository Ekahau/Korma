(ns korma.mssql
  (:require [clojure.string :as string]))

(defn translate-to-dialect [query]
  (-> query
    (update-in [:sql-str] #(string/replace % #"TRUE" "1"))
    (update-in [:sql-str] #(string/replace % #"FALSE" "0"))))
