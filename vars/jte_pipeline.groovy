def call() {
  pipeline {
      agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
      stage('intial') {
        steps {
          generate()
        }
      }
    }
  }
}  
