import groovy.json.JsonSlurper 
def call(String imgname,String SRC_DOCKER_REGISTRY,String ARTIFACTORY_USERNAME,String ARTIFACTORY_PASSWD) {
  echo "Hello, ${imgname}"
  //sh 'docker login https://${SRC_DOCKER_REGISTRY} -u ${ARTIFACTORY_USERNAME} -p ${ARTIFACTORY_PASSWD}'
  sh(returnStdout: true, script: 'docker pull aquasec/trivy')
  sh(returnStdout: true, script: "docker pull ${imgname}")
  def rc = sh(returnStatus:true,script: "docker run  --rm aquasec/trivy --exit-code 1 --severity CRITICAL,HIGH ${imgname}")
  if("${rc}" == 1) 
  echo "Build failed due to HIGH or CRITICAL Vulnerabilties for Image- ${imgname}"
  else
   echo "Build Passed for Image - ${imgname}" 
  } 
