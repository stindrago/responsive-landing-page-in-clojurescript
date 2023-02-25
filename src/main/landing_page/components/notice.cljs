(ns landing-page.components.notice
  (:require [reagent.core :as r]))

(def state (r/atom {:hidden false}))

(defn main []
  [:div
   {:class (str "toast toast-center sm:toast-start z-10 " (when (:hidden @state) "hidden"))}
   [:div
    {:class "alert shadow-lg"}
    [:div
     [:svg
      {:xmlns "http://www.w3.org/2000/svg",
       :fill "none",
       :viewBox "0 0 24 24",
       :class "stroke-info flex-shrink-0 w-6 h-6"}
      [:path
       {:stroke-linecap "round",
        :stroke-linejoin "round",
        :stroke-width "2",
        :d "M13 16h-1v-4h-1m1-4h.01M21 12a9 9 0 11-18 0 9 9 0 0118 0z"}]]
     [:div
      [:h3 {:class "font-bold"} "We don't use cookies for no reason!"]
      [:div {:class "text-xs"} "Press the button to dismiss."]]]
    [:div {:class "flex-none"}
     [:button
      {:class "btn btn-sm sm:btn-circle btn-wide"
       :on-click #(swap! state assoc :hidden true)}
      [:svg
       {:xmlns "http://www.w3.org/2000/svg",
        :class "h-6 w-6",
        :fill "none",
        :viewBox "0 0 24 24",
        :stroke "currentColor"}
       [:path
        {:stroke-linecap "round",
         :stroke-linejoin "round",
         :stroke-width "2",
         :d "M6 18L18 6M6 6l12 12"}]]]]]])
