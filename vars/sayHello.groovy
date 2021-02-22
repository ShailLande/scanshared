#!/usr/bin/env groovy

def call(String imgname,String SRC_DOCKER_REGISTRY,String ARTIFACTORY_USERNAME,String ARTIFACTORY_PASSWD) {
  echo "Hello, ${imgname}"
  sh 'docker login https://${SRC_DOCKER_REGISTRY} -u shail.lande -p Ganeshya@112129'
  sh(returnStdout: true, script: 'docker pull aquasec/trivy')
  sh(returnStdout: true, script: "docker pull ${imgname}")
  def rc = sh(script: "docker run --rm aquasec/trivy image ${imgname}")//\\\"${since}\\\""
  return "${rc}"
  } 


