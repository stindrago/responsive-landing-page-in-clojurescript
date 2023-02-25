(ns landing-page.components.terminal)

(defn main []
  [:div {:class "flex justify-center p-8 py-16"
         :id "main"}
   [:div {:class "mockup-code"}
    [:pre {:data-prefix "$"}
     [:code "git clone https://git.dragoi/costin/responsive-landing-page-in-clojurescript"]]
    [:pre {:data-prefix ">", :class "text-warning"}
     [:code "Cloning into 'responsive-landing-page-in-clojurescript'..."]]
    [:pre {:data-prefix "$"}
     [:code "cd responsive-landing-page-in-clojurescript"]]
    [:pre {:data-prefix "$"}
     [:code "npm run release"]]
    [:pre {:data-prefix ">", :class "text-warning"}
     [:code "[:app] Compiling..."]]
    [:pre {:data-prefix ">", :class "text-success"}
     [:code "[:app] Build completed."]]]])
