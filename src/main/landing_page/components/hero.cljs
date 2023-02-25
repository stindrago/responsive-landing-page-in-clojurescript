(ns landing-page.components.hero)

(defn main []
  [:div {:class "hero min-h-screen bg-base-200"}
   [:div {:class "hero-content text-center"}
    [:div {:class "max-w-md"}
     [:h1 {:class "text-5xl font-bold"} "❤️ ClojureScript"]
     [:p {:class "py-6"} "Build a responsive landing page in ClojureScript, Reagent and TailwindCSS."]
     [:a {:class "btn btn-primary"
          :href "#main"} "Get Started"]]]])
