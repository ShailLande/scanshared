package com.cleverbuilder

class DefaultJenkinsExecutor implements JenkinsExecutor {
    private final script

    DefaultJenkinsExecutor(script) {
        this.script = script
    }

    @Override
    String sh(String command) {
        script.sh(script: command, returnStdout: true)
    }

    @Override
    void echo(String message) {
        script.echo(message)
    }

    @Override
    void stage(String name, Closure config) {
        script.stage(name, config)
    }
    
}
