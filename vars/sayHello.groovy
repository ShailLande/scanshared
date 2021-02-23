#!/usr/bin/env groovy

def call(String imgname,String SRC_DOCKER_REGISTRY,String ARTIFACTORY_USERNAME,String ARTIFACTORY_PASSWD) {
  echo "Hello, ${imgname}"
  //sh 'docker login https://${SRC_DOCKER_REGISTRY} -u ${ARTIFACTORY_USERNAME} -p ${ARTIFACTORY_PASSWD}'
  
  
  #!/usr/bin/env groovy

def call(String imgname,String SRC_DOCKER_REGISTRY,String ARTIFACTORY_USERNAME,String ARTIFACTORY_PASSWD) {
  echo "Hello, ${imgname}"
  //sh 'docker login https://${SRC_DOCKER_REGISTRY} -u ${ARTIFACTORY_USERNAME} -p ${ARTIFACTORY_PASSWD}'
  try
  {
  sh(returnStdout: true, script: 'docker pull aquasec/trivy')
  }
  catch (Exception e)
  {
    println("Exception: ${e}")
    return 1
  }
  
  try
  {
   sh(returnStdout: true, script: "docker pull ${imgname}")
  }
  catch (Exception e)
  {
    println("Exception: ${e}")
    return 1
  }
  
  try
  {
    def rc = sh(script: "docker run --rm aquasec/trivy image ${imgname}")
  }
  catch (Exception e)
  {
    println("Exception: ${e}")
    return 1
  }
 

  return 0
  } 


/*
 
  sh(returnStdout: true, script: 'docker pull aquasec/trivy')
 
  
 
   sh(returnStdout: true, script: "docker pull ${imgname}")

  

    def rc = sh(script: "docker run --rm aquasec/trivy image ${imgname}")
   

  return "${rc}"
  } 
  */


