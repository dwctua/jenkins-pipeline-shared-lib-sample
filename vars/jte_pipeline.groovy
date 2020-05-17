withJte(Closure nodeAction) {
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
          withJte {
            generate()
          }
        }
      }
    }
  }
}  
