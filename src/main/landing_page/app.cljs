(ns landing-page.app
  (:require [reagent.dom :as rd]
            [landing-page.components.footer :as footer]
            [landing-page.components.terminal :as terminal]
            [landing-page.components.hero :as hero]
            [landing-page.components.notice :as notice]))

(defn app []
  [:div {:data-theme "dracula"}
   [hero/main]
   [terminal/main]
   [footer/main]
   [notice/main]])

(defn start []
  (rd/render [app]
             (.getElementById js/document "app")))

(defn main []
  (start))
