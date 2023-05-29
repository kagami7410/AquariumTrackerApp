pipeline {
    agent {
        node{
            label 'CentOS-Agent2'
        }
    }

    stages {
        stage('set up') {
            steps {
                sh 'git clone https://github.com/kagami7410/AquariumTrackerApp.git '
            }
        }
                stage('Bye') {
            steps {
                echo 'Bye'
            }
        }
    }
}