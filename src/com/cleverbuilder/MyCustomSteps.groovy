package com.cleverbuilder

class MyCustomSteps implements Serializable {
    private final JenkinsExecutor jenkinsExecutor

    MyCustomSteps(JenkinsExecutor jenkinsExecutor) {
        this.jenkinsExecutor = jenkinsExecutor
    }

    void execute() {
        jenkinsExecutor.sh('ls -l')
        jenkinsExecutor.echo('Done!')
    }
}
