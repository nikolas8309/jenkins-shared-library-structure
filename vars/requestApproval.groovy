def call(String deployEnv,Integer time=1,String unit="HOURS") {
    notifyApproval(deployEnv)
    
    timeout(time: time, unit: unit) {
        input id: 'APPLY_CHANGES',
                message: "Would you like to deploy changes to ${deployEnv}?",
                ok: 'Deploy',
                submitterParameter: 'CONFIRMED_BY'
    }
}