(ns osquery-clj-ex.osquery-service
  (:require [osquery-clj.core :as osquery]))

;; Users queries
(defn get-logged-users []
  (osquery/query "SELECT * FROM users;"))

(defn get-logged-user-by-id [uid]
  (osquery/query (format "SELECT * FROM users WHERE uid = %s;" uid)))

(defn add-user [name pass] "Need to be done...")
(defn delete-user [name] "Need to be done...")

;; Processes queries

(defn get-processes []
  (osquery/query "SELECT * FROM processes;"))

(defn get-process-by-id [pid]
  (osquery/query (format "SELECT * FROM processes WHERE pid = %s;" pid)))

(defn delete-processe [pid] "Need to be done...")

;; OS Queries

(defn get-os-version []
  (osquery/query "SELECT version FROM os_version;"))

(defn get-kernel-version []
  (osquery/query "SELECT version FROM kernel_info;"))

(defn get-memory-capacity []
  (osquery/query "SELECT memory_total FROM memory_info;"))


;; Packages Queries

(defn get-installed-package []
  (osquery/query "SELECT * FROM deb_packages"))

(defn install-package [] "Need to be done...")
(defn delete-package [] "Need to be done...")