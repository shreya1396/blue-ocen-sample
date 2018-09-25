pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Jenkins Minute Pipeline'
      }
    }
    stage('buildone') {
      steps {
        echo 'goodmorning'
      }
    }
    stage('buildtwo') {
      steps {
        echo 'have a nice day'
      }
    }
  }
  options {
    timeout(time: 1, unit: 'HOURS')
  }
}