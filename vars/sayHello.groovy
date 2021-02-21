#!/usr/bin/env groovy

def call(String name,int age,Map m) {
  echo "Hello, ${name},${age}"
  m.each{entry -> println "$entry.key: $entry.value"}
  helloWorldExternal(name: "shail", dayOfWeek: "Sunday")
 
 
 
} 


