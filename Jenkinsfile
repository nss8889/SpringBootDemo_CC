pipeline {
  agent any
  stages {
    stage('Initial') {
      steps {
        sh '''echo "Starting Pipeline"
'''
        sh 'echo "Second Step"'
      }
    }
    stage('Build') {
      steps {
        sleep 5
        echo 'Sleeping for 5 seconds.'
        sh 'echo "Finished."'
      }
    }
  }
}