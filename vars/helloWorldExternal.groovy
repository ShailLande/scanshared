def call(Map config = [:]) {
    loadLinuxScript(name: 'script.sh')
    sh "./script.sh ${config.name} ${config.dayOfWeek}"
}
