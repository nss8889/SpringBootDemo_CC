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
        stage('Print') {
          steps {
            echo 'HI'
          }
        }
        stage('sleep') {
          steps {
            sleep 2
          }
        }
      }
    }
    stage('Build') {
      steps {
        echo 'Building'
        sleep 5
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploying'
        sh 'whoami'
      }
    }
  }
}