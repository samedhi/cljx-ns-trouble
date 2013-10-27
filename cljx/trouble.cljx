(ns #+clj cljx-ns-trouble.trouble
    #+cljs cljx-ns-trouble.macros.trouble)

(def a "123")

;; IF you visit this file and then attempt to switch to the
;; namespace of this file [Ctrl-c Meta-n], it complains
;; about some missing delimiter?

;; If you first [Ctrl-c-k] the file and then evaluate the expression
;; at 4, it fails with a "Namespace not found".

;; If however you first evaluate the expression at 1 and then the
;; expression at 4, it works fine.

;; If you remove the cljx readers and make it simple like the following:
;; (ns cljx-ns-trouble.trouble)
;; then of course it works fine.


