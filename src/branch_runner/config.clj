(ns branch-runner.config)

(def service-name "Akita")

(def base-dir "/home/jfinger")
; (def base-dir "/home/jono/files/plos")

(def remote-repo "git@github.com:PLOS/akita")

(def lambdacd-project-dir (str base-dir "/ownCloud/lambdaCd/branch-runner-lcd"))

(def lambdacd-dockerfiles-dir (str base-dir "/src/Dockerfiles"))

(def local-git-dir (str base-dir "/src/akita"))

; (def github-api-branch-list "https://api.github.com/repos/jonocodes/lcd-test-app/branches")

; (def projects [{:pipeline-url "/develop"
;                 :branch "develop"
;                 :port   2222}
;                {:pipeline-url "/feature-foo"
;                 :branch "feature-foo"
;                 :port   3333}
;                 ])
