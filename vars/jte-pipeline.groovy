def call() {
  pipeline {
    stages {
      stage('intial') {
        steps {
          generate()
        }
      }
    }
  }
}  
