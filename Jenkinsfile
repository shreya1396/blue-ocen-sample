pipeline {
  agent {
    docker {
      image 'ubuntu:16.04'
    }

  }
  options {
        timeout(time: 1, unit: 'HOURS') 
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
}
