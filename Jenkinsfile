pipeline {
  agent {
    docker {
      image 'ubuntu:16.04'
    }

  }
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
  }
  options {
    timeout(time: 1, unit: 'HOURS')
  }
}