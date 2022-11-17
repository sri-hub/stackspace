properties([pipelineTriggers([githubPush()])])

node {
        git url: 'https://github.com/sri-hub/stackspace.git',branch: 'main'
        stage ('Compile Stage') {

            echo "compiling"
            echo "compilation completed"
        }

        stage ('Testing Stage') {

            echo "testing completed"
            echo "testing completed"
        }
        stage("Deploy") {

                echo "deployment completed"
                        }
            }
}