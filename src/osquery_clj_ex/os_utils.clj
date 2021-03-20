(ns osquery-clj-ex.os-utils)

(defn get-os-name [] (System/getProperty "os.name"))
(defn is-windows? [] (. (get-os-name) startsWith "Windows"))
(defn is-unix? [] (. (get-os-name) startsWith "Unix"))

; Just implemented in Linux

(defn add-user [name pass]
  (if (is-windows?)
    {:result :KO :detail "That functionality is not implemented in your SO yet."}
    {:result :OK :detail "Need to be done..."}))

(defn delete-user [name]
  (if (is-windows?)
    {:result :KO :detail "That functionality is not implemented in your SO yet."}
    ))

(defn delete-process [pid]
  (if (is-windows?)
    {:result :KO :detail "That functionality is not implemented in your SO yet."}
    ))
(defn install-package []
  (if (is-windows?)
    {:result :KO :detail "That functionality is not implemented in your SO yet."}
    ))
(defn delete-package []
  (if (is-windows?)
    {:result :KO :detail "That functionality is not implemented in your SO yet."}))