#!/usr/bin/groovy

def call(
    String region,
    clusterName,
    clusterService,
    String image,
    boolean waitForServiceSteadyState=false,
    String timeout = "300",
    String maxDefinitions = "5") {
    
    echo "ecsDeploy function..."

    // def awsProfile = config.awsProfile // aws profile to use
    // def clusterName = config.clusterName // ecs cluster deploying to
    // def clusterService = config.clusterService // ecs cluster service being deployed to
    // def image = config.image // image to deploy
    // def region = config.region
    // def noWait = config.noWait
    // def maxDefinitions = 5 // number of ecs task definitions to keep (old ones will be archived)
    // def timeout = 300 // amount of time we give ecs to respond to with result of deployment

//    if(noWait == "true"){
//        println "FAST DEPLOYMENT..."
//        command = "ecs-deploy-no-wait.sh"
//    }
//    else{
        println "SLOW DEPLOYMENT..."
        command = "ecs-deploy.sh"
//    }
    
    if (region) {
        command += " -r ${region}"
    }

    if (timeout) {
        command += " --timeout ${timeout} "
    }

    if (maxDefinitions) {
        command += " --max-definitions ${maxDefinitions} "
    }
    
    if (!waitForServiceSteadyState) {
        command += " --skip-deployments-check "
    }
    
    sh """
        ${command} -c ${clusterName} -n ${clusterService} -i ${image} -v
    """
}

groovy ecs-deploy.sh