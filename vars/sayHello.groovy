#!/usr/bin/env groovy

def call(String name,int age,Map m) {
  echo "Hello, ${name},${age}"
  m.each{entry -> println "$entry.key: $entry.value"}
  sh '''
 docker pull aquasec/trivy
 docker pull venafidevops/venafi-java-base
 docker run --rm aquasec/trivy -o res1.out image  venafidevops/venafi-java-base 
 exitcode=$?
  echo "RESULT 1:--- $my_exit_code"

                    # Check scan results
                    if [ ${my_exit_code} == 1 ]; then
                        echo "Image scanning failed. Some vulnerabilities found"
                        exit 1;
                    else
                        echo "Image is scanned Successfully. No vulnerabilities found"
                    fi;
  '''
} 

