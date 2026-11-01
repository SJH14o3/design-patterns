package com.sjh14o3.designPatterns.mediator.software_development_team

interface Mediator {
    fun notifyForCommit(commitMessage: String, developer: Developer)
}