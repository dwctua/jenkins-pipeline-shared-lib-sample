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
              read_json('/home/jenkins/workspace/test-shared-lib_master/config/host.json')
              generate()
            }
          }
        }
      }
    }
  }
}  
