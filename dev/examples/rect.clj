(ns examples.rect
  (:require
    [examples.util :as util]
    [io.github.humbleui.core :as core]
    [io.github.humbleui.paint :as paint]
    [io.github.humbleui.ui :as ui]))

(ui/defcomp ui []
  (util/table
    "Solid fill"
    [ui/rect {:paint (paint/fill 0x80FFDB2C)}
     [ui/padding {:padding 10}
      "Solid fill"]]

    "Stroke"
    [ui/rect {:paint (paint/stroke 0x80FFDB2C (ui/scaled 2))}
     [ui/padding {:padding 10}
      "Stroke"]]
    
    "Rounded: 1 radius"
    [ui/rect {:paint  (paint/fill 0x80FFDB2C)
              :radius 10}
     [ui/padding {:padding 10}
      "1 radius"]]

    "Rounded: 2 radii"
    [ui/rect {:paint  (paint/fill 0x80FFDB2C)
              :radius [5 15]}
     [ui/padding {:padding 10}
      "2 radii"]]
    
    "Rounded: 4 radii"
    [ui/rect {:paint  (paint/fill 0x80FFDB2C)
              :radius [5 10 15 20]}
     [ui/padding {:padding 10}
      "4 radii"]]
    
    "Rounded: 8 radii"
    [ui/rect {:paint  (paint/fill 0x80FFDB2C)
              :radius [0 3 6 9 12 15 18 21]}
     [ui/padding {:padding 10}
      "8 radii"]]))
