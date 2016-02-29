A simple Docker Spring Boot Jersey 2 API for use by the CloudBees mobile-deposit-ui example. Uses a Jenkinsfile to automatically create a Jenkins Workflow job.

## Useful URLS

###Application endpoints

GET /account/deposit - requires Accept:application/json
- note this can be overriden in DepositEndpoint.java to accept text

###Management Endpoints
GET /spring/info - customised to show the scm and build related info
POST /spring/shutdown - cause the container to stop. Useful for 
shutting down at the end of build testing

##Build Properties
The following can be specified at build time to inject version information:

${BUILD_NUMBER}
${BUILD_URL}
${GIT_COMMIT}


