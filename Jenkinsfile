pipeline {
    agent any

environment {
    VERSION = readMavenPom().getVersion()
}

    stages {

	stage("version"){
		echo "${VERSION}"
	}

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
        }

	stage('Testing Environment') {
            steps {
                echo "Testing env"
            }
        }

      stage('Staging') {

	when{
		expression{
		env.BRANCH_NAME=='developer'
		}
	}
            steps {
                echo "Staging"
            }
        }
      stage('Production') {
        
	when{
		expression{
		env.BRANCH_NAME=='master'
		}
	}    
	steps {
                echo "Production"
            }
        }
    }
}
