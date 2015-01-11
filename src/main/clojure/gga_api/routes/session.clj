(ns gga-api.routes.session
  (:require [gga-api.schemas :as gga]
            [gga-api.util :as u]
            [monger.collection :as mc]
            [compojure.core :refer :all]
            [liberator.core :refer [resource defresource]]
            [schema.core :as sm])
  (:import [org.bson.types ObjectId]))

(defroutes session-routes
  (ANY "/api/v1/sessions/:id" [id]
    (resource :available-media-types ["application/json" "text/plain"]
              :exists? (fn [_] (= (mc/count u/db "sessions" {:_id (ObjectId. id)}) 1))
              :handle-ok (fn [_]
                (sm/validate gga/Session
                  (mc/find-one-as-map u/db "sessions" {:_id (ObjectId. id)})))))

  (ANY "/api/v1/sessions" []
    (resource :available-media-types ["application/json" "text/plain"]
              :handle-ok (fn [ctx]
                (sm/validate [gga/Session]
                  (mc/find-maps u/db "sessions"))))))
