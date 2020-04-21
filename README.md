# rn-native-base
native-base wrapper for Clojurescript

[![Clojars](https://img.shields.io/clojars/v/rn-native-base.svg)](https://clojars.org/rn-native-base)

## Full usage tutorial
Create a Clojurescript `react-native` project. For the detailed info how to do it, check the [rn-native-base-example-todo](https://github.com/markokocic/rn-native-base-example-todo) example project using this library. 

## Short usage info

### Add Clojurscript `rn-native-base` dependency
Add `rn-native-base` as a dependency to your project.
```clojure
[rn-native-base "<Latest-Version>"]
```

### Add `native-base` dependency to `react-native`
You can use both `npm` and `yarn` tools
```shell script
yarn add native-base
```
```shell script
npm install --save native-base
```

After installing you need to link it to your project
```shell script
npx react-native link
```

### Code
Import rn-native base and start coding. The example below is from [rn-native-base-example-todo](https://github.com/markokocic/rn-native-base-example-todo) example project. Check it's source code for the sample working code. 

```clojure
(ns rn.native-base-example-todo.todo-screen
  (:require [steroid.rn.core :as rn]
            [re-frame.core :as rf]
            [reagent.core :as r]
            [rn.native-base.core :as nb]
            [rn.native-base.easy-grid :as eg]))

(defn- todo-item [{:keys [key text checked]}]
  [nb/list-item {:key key}
   [nb/check-box {:checked  checked
                  :on-press #(rf/dispatch [:todos/check key])}]
   [nb/body {:style {:flex 1}}
    [nb/text {:style {:font-size 17 :font-weight :bold :text-decoration-line (if checked :line-through :none)}}
     (str text)]]
   [rn/touchable-opacity {:on-press #(rf/dispatch [:todos/delete key])}
    [nb/icon {:name "trash" :style {:font-size 30 :color :red}}]]])

(defn- todos []
  (let [todos (rf/subscribe [:todos/all])]
    [rn/flat-list {:data @todos :render-fn todo-item}]))

(defn- input-container []
  (let [value (r/atom "")]
    (fn []
      [nb/list-item {:no-indent true :style {:border-bottom-width 3}}
       [nb/input {:multiline      true
                  :placeholder    "What do you want to do today?" :placeholder-text-color "#abbabb"
                  :value          @value
                  :on-change-text (fn [v] (reset! value v) (r/flush))}]
       [rn/touchable-opacity {:on-press (fn [] (rf/dispatch [:todos/add @value]) (reset! value ""))}
        [nb/icon {:name  :add :type "MaterialIcons"
                  :style {:font-size 30 :color :blue}}]]])))

(defn screen []
  [nb/container
   [nb/header {:transparent true}
    [nb/left]
    [nb/body
     [nb/h1 {:style {:color :red}} "Todo List"]]]
   [nb/view
    [input-container]
    [todos]]])
```
