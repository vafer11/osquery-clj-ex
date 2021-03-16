(ns osquery-clj-ex.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.middleware.json :refer [wrap-json-response]]
            [ring.util.response :refer [response]]
            [osquery-clj-ex.osquery-service :refer :all]))

(defn make-response [res]
  (-> res
      (vec)
      (response)))

(defroutes app-routes
  (GET "/api/users/" [] (make-response (get-logged-users)))
  (GET "/api/user/:uid" [uid] (make-response (get-logged-user-by-id uid)))
  (GET "/api/processes/" [] (make-response (get-processes)))
  (GET "/api/process/:pid" [pid] (make-response (get-process-by-id pid)))
  (GET "/api/os/" [] (make-response (get-os-version)))
  (GET "/api/kernel/" [] (make-response (get-kernel-version)))
  (GET "/api/memory/" [] (make-response (get-memory-capacity)))
  (GET "/api/package/" [] (make-response (get-installed-package)))
  (route/not-found "Not Found"))

(def app
  (-> app-routes
      (wrap-json-response)
      (wrap-defaults site-defaults)))
