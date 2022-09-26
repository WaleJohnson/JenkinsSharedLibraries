def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       sh "echo 'Building'"
     }
  else if ("${stageName}" == "SonarQube Report")
     {
       sh "echo 'Testing'"
     }
  else if ("${stageName}" == "Upload Into Nexus")
     {
       sh "echo 'Deploying'"
     }
}
