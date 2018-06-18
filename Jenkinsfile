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
      agent {
        docker {
          image 'maven:3.5-jdk-8-slim'
        }

      }
      steps {
        echo 'Building'
        sleep 5
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploying'
      }
    }
  }
}