package com.sjh14o3.mediator.software_development_team

interface Mediator {
    fun notifyForCommit(commitMessage: String, developer: Developer)
}