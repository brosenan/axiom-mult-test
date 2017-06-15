(ns mult.core
  (:require [permacode.core :as perm]
            [perm.QmeNZ1xXpM5M9HDrPkkoH7ZkYsMZUHuYrbtTDLUsdcQc8V :as clg]))


(clg/defrule mult [a b ab]
  [:mult/a a] (clg/by-anyone)
  [:mult/b a b] (clg/by-anyone)
  (let [ab (* a b)]))
