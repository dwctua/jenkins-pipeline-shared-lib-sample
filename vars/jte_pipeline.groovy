void withJte(Closure nodeAction) {
//  podTemplate(
  template nodeAction
}

def call() {
  pipeline {
      agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
      stage('intial') {
        steps {
          script{
            withJte {
              read_json('config/host.json')
              generate()
            }
          }
        }
      }
    }
  }
}  
