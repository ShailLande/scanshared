#!/bin/bash
echo "Test start **************"
 docker pull aquasec/trivy
 docker pull venafidevops/venafi-java-base
 docker run --rm aquasec/trivy image  venafidevops/venafi-java-base 
 echo "Test done *******************"
