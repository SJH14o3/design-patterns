package com.sjh14o3.mediator.software_development_team

class DevelopmentMediator: Mediator {
    private val shareholders: MutableSet<Shareholder> = mutableSetOf()
    override fun notifyForCommit(commitMessage: String, developer: Developer) {
        for (shareholder in shareholders) {
            if (shareholder !is Developer) {
                shareholder.receiveMessage("$developer made new commit with message (${commitMessage}).")
            }
        }
    }

    fun addShareholder(shareholder: Shareholder) {
        // won't add already existing shareholder
        shareholders.add(shareholder)
    }
}