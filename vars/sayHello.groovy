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
    println("Exception in Docker Pull: ${e}")
    
  }
  
  try
  {
   sh(returnStdout: true, script: "docker pull ${imgname}")
  }
  catch (Exception e)
  {
    println("Exception in Docker pull Image : ${e}")
  
  }
  
  def rc=-1
  try
  {
    rc = sh(script: "docker run --rm aquasec/trivy --exit-code 1 --severity CRITICAL,HIGH ${imgname}")
  }
  catch (Exception e)
  {
    println("Exception in Docker Run Image: ${e}")
    return 1
  }
 
  return "${rc}"
  } 


/*
 
  sh(returnStdout: true, script: 'docker pull aquasec/trivy')
 
  
 
   sh(returnStdout: true, script: "docker pull ${imgname}")

  

    def rc = sh(script: "docker run --rm aquasec/trivy image ${imgname}")
   

  return "${rc}"
  } 
  */


