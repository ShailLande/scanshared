import groovy.json.JsonSlurper 
def call(String imgname,String SRC_DOCKER_REGISTRY,String ARTIFACTORY_USERNAME,String ARTIFACTORY_PASSWD) {
  echo "Hello, ${imgname}"
  //sh 'docker login https://${SRC_DOCKER_REGISTRY} -u ${ARTIFACTORY_USERNAME} -p ${ARTIFACTORY_PASSWD}'
  sh(returnStdout: true, script: 'docker pull aquasec/trivy')
  sh(returnStdout: true, script: "docker pull ${imgname}")
  def rc = sh(returnStatus:true,script: "docker run --exit-code 1 --rm aquasec/trivy  --severity CRITICAL,HIGH ${imgname}")
  echo "RCCCC - ${rc}"
  return "${rc}"
  } 
