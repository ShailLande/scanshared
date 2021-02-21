def call(Map config = [:]) {
     echo "zzzzzzz - ${config.dayOfWeek}"
    loadLinuxScript(name: 'script.sh')
    sh "./script.sh"
}
