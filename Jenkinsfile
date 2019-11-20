pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                   echo "Test"
                }
            }
        stage('Build') {
            steps {
		    sh 'mvn package -DskipTests'
		    sh 'docker build -t="jaymacdocker/procedures-project-server:latest" .'
                }
            }
        stage('Deploy') {
            steps {
		    sh 'docker push jaymacdocker/procedures-project-server:latest'
            }

	stage('Testing Environment') {
            steps {
                echo "hello"
            }
        }
      stage('Staging') {
            steps {
                echo "hello"
            }
        }
      stage('Production') {
            steps {
                echo "hello"
            }
        }
    }
}
