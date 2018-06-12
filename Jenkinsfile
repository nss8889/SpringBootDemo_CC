pipeline {
  agent any
  stages {
    stage('Initial') {
      parallel {
        stage('Initial') {
          steps {
            sleep 2
          }
        }
        stage('') {
          steps {
            echo 'HI'
          }
        }
      }
    }
    stage('Build') {
      steps {
        sleep 5
      }
    }
  }
}