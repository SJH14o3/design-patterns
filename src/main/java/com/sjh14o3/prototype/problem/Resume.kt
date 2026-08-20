package com.sjh14o3.prototype.problem

class Resume(
    metaData: MutableList<String>,
    var title: String,
    var author: String,
    var email: String,
    var phone: String,
    var summary: String,
    var skills: List<String>,
    var experience: List<String>,
    var education: List<String>,
    var font: String,
    var fontSize: Int
) : DocumentPrototype(metaData) {
    override fun clone(): Resume {
        return Resume(metaDataDeepCopy(), this.title, this.author, this.email, this.phone, this.summary, this.skills,
            this.experience, this.education, this.font, this.fontSize)
    }
}