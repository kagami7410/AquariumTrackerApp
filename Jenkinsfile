podTemplate {
    node(POD_LABEL) {
        stages{
            stage('set up') {
                steps {
                    sh 'rm -rf AquariumTrackerApp'
                    sh 'git clone https://github.com/kagami7410/AquariumTrackerApp.git '
                }
            }
            stage('maven package') {
                steps {
                    sh 'mvn clean package'
                }
            }
            stage('docker build') {
                steps {
                    sh 'docker build -t tracker_app .'
                    echo 'docker build complete!!!!!!!'
                }
            }
        }
    }
}