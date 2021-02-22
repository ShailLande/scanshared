#!/usr/bin/env groovy
package com.cleverbuilder

interface JenkinsExecutor extends Serializable {
    void stage(String name, Closure config)
    String sh(String command)
    void echo(String message)
    
}
