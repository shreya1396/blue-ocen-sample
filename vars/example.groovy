def call(body) {
	
	        def config = [:]
	        body.resolveStrategy = Closure.DELEGATE_FIRST
	        body.delegate = config
	        body()
	

	        node {
	            // Clean workspace before doing anything
	            deleteDir()
	

	            try {
	                stage ('Cloning done') {
	                    checkout scm
	                }
	                stage ('Build done') {
	                    sh "echo 'build completed'"
	                }
               } catch (err) {
                currentBuild.result = 'FAILED'
                throw err
            }
        }
    }


