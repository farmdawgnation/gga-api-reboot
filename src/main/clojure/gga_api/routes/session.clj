(ns gga-api.routes.session
  (:require [gga-api.schemas :as gga]
            [gga-api.util :as u]
            [monger.collection :as mc]
            [compojure.core :refer :all]
            [liberator.core :refer [resource defresource]]
            [schema.core :as sm]))

(defroutes session-routes
  (ANY "/sessions" [] (resource :available-media-types ["application/json" "text/plain"]
                                :handle-ok (sm/fn [ctx] :- [gga/Session]
                                             (mc/find-maps u/db "sessions")))))
