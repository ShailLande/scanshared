import groovy.json.JsonSlurper 
def call(java.util.List myimglist,String SRC_DOCKER_REGISTRY,String ARTIFACTORY_USERNAME,String ARTIFACTORY_PASSWD,String Branch) {
  def rcmap = [:]
  for(imgname in myimglist)
  {
   echo "Running scan for - ${imgname}"
  //sh 'docker login https://${SRC_DOCKER_REGISTRY} -u ${ARTIFACTORY_USERNAME} -p ${ARTIFACTORY_PASSWD}'
  sh(returnStdout: true, script: 'docker pull aquasec/trivy')
  sh(returnStdout: true, script: "docker pull ${imgname}")
  def rc="-1"
  if (Branch == "master")
  rc = sh(returnStatus:true,label:"Testing Img" ,script: "docker run --rm -v /var/run/docker.sock:/var/run/docker.sock aquasec/trivy --exit-code 1 --severity CRITICAL,HIGH ${imgname}")
  else
  rc = sh(returnStatus:true,label:"Testing Img" ,script: "docker run --rm -v /var/run/docker.sock:/var/run/docker.sock aquasec/trivy --severity CRITICAL,HIGH ${imgname}")
   // rcmap["${imgName}"]="${rc}"
  if("${rc}" == "1") 
    echo "Build failed due to HIGH or CRITICAL Vulnerabilties for Image- ${imgname}"
  else
   echo "Build Scanned for Image - ${imgname}" 
    
    
  }
  return "${rcmap}"
  
  } 
