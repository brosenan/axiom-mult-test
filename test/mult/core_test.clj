(ns mult.core-test
  (:require [midje.sweet :refer :all]
            [mult.core :refer :all]
            [perm.QmeNZ1xXpM5M9HDrPkkoH7ZkYsMZUHuYrbtTDLUsdcQc8V :as clg]))

(fact
 (clg/simulate-with mult
                    (clg/f [:mult/a 2])
                    (clg/f [:mult/a 3])
                    (clg/f [:mult/b 2 3])
                    (clg/f [:mult/b 2 5]))
 => #{(clg/f [2 3 6])
      (clg/f [2 5 10])})
