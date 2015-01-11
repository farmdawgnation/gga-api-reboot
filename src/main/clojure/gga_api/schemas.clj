(ns gga-api.schemas
  (:require [schema.core :as sm])
  (:import [org.bson.types ObjectId]))

(def Session
  {:_id           ObjectId
   :assemblyId    sm/Num
   :name          sm/Str
   :current       sm/Bool})

(def Address
  {:city                        sm/Str
   :state                       sm/Str
   :street                      sm/Str
   :zip                         sm/Num
   (sm/optional-key :phone)     sm/Str})

(def Member
  {:_id                                   ObjectId
   :assemblyId                            sm/Num
   :type                                  (sm/either "senator"
                                                     "representative")
   :firstName                             sm/Str
   :middleName                            sm/Str
   :lastName                              sm/Str
   :nickname                              sm/Str
   :party                                 (sm/either "R" "D")
   :district                              sm/Num
   (sm/optional-key :city)                sm/Str
   :photoUri                              sm/Str
   (sm/optional-key :capitolAddress)      Address
   (sm/optional-key :districtAddress)     Address
   :sessions                              [ObjectId]})

(def Committee
  {:_id                 ObjectId
   :sessionId           ObjectId
   :type                (sm/either "house" "senate")
   (sm/optional-key :parentId)  ObjectId
   :assemblyCode        sm/Str
   :assemblyId          sm/Num
   :name                sm/Str
   :description         sm/Str
   :members             [{:personId ObjectId
                          :title sm/Str}]})


