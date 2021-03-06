(ns rn.native-base.core
  (:refer-clojure :exclude [list])
  (:require
    [rn.native-base.util :refer [adapt-class]]
    [native-base :as nb]))

;; layout
(def root (adapt-class nb/Root))
(def container (adapt-class nb/Container))
(def content (adapt-class nb/Content))
(def header (adapt-class nb/Header))
(def title (adapt-class nb/Title))
(def footer (adapt-class nb/Footer))
(def footer-tab (adapt-class nb/FooterTab))
(def left (adapt-class nb/Left))
(def right (adapt-class nb/Right))
(def body (adapt-class nb/Body))
(def view (adapt-class nb/View))
(def segment (adapt-class nb/Segment))
(def tab (adapt-class nb/Tab))
(def tabs (adapt-class nb/Tabs))
(def tab-heading (adapt-class nb/TabHeading))
(def scrollable-tab (adapt-class nb/ScrollableTab))
;; Components
(def accordion (adapt-class nb/Accordion))
(def action-sheet (adapt-class nb/ActionSheet))
(def badge (adapt-class nb/Badge))
(def button (adapt-class nb/Button))
(def card (adapt-class nb/Card))
(def card-item (adapt-class nb/CardItem))
(def check-box (adapt-class nb/CheckBox))
(def date-picker (adapt-class nb/DatePicker))
(def deck-swiper (adapt-class nb/DeckSwiper))
(def fab (adapt-class nb/Fab))
(def icon (adapt-class nb/Icon))
(def list (adapt-class nb/List))
(def list-item (adapt-class nb/ListItem))
(def separator (adapt-class nb/Separator))
(def switch (adapt-class nb/Switch))
(def radio (adapt-class nb/Radio))
(def spinner (adapt-class nb/Spinner))
(def swipe-row (adapt-class nb/SwipeRow))
(def thumbnail (adapt-class nb/Thumbnail))
(def toast (adapt-class nb/Toast))
(def h1 (adapt-class nb/H1))
(def h2 (adapt-class nb/H2))
(def h3 (adapt-class nb/H3))
(def text (adapt-class nb/Text))
(def drawer (adapt-class nb/Drawer))

;; Form elements
(def form (adapt-class nb/Form))
(def item (adapt-class nb/Item))
(def input (adapt-class nb/Input))
(def label (adapt-class nb/Label))
(def picker (adapt-class nb/Picker))
(def textarea (adapt-class nb/Textarea))

;; Theme
(def style-provider (adapt-class nb/StyleProvider))

