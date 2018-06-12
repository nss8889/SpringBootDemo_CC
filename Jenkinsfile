pipeline {
  agent any
  stages {
    stage('Initial') {
      parallel {
        stage('Initial') {
          steps {
            sh '''echo "Starting Pipeline"
'''
            sh 'echo "Second Step"'
          }
        }
        stage('S12') {
          steps {
            sh 'echo "..!!.."'
          }
        }
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