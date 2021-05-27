(ns cfj.core
  (:import [cfj Event]))

(defrecord EventImpl [name ts]
  Event
  (getTimestamp [_] ts)
  (getName [_] name)
  (toString [_] (str "Event [" name "] at ["  ts "]")))