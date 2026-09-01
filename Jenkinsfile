pipeline {
    agent any

    tools {
        jdk 'Java21'
    }

    stages {
        stage('Checkout Code') {
            steps {
                echo 'Checking out Fntech Financial QA Automation codebase...'
            }
        }

        stage('Compile & Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Execute BDD Test Suite') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            echo 'Publishing Cucumber HTML Test Report...'
            cucumber fileIncludePattern: '**/target/cucumber-reports.json',
            sortingMethod: 'NATURAL'
        }
    }
}
