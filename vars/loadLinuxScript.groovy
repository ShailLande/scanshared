def call(Map config = [:]) { 
  echo "tttttt ${config.name}"
  def scriptcontents = libraryResource "com/planetpope/scripts/linux/${config.name}"    
  writeFile file: "${config.name}", text: scriptcontents 
  sh "chmod a+x ./${config.name}"
  String cmd = /$
  echo "cMDDDD = ${cmd}"
} 
