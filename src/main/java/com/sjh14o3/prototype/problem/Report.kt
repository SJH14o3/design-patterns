package com.sjh14o3.prototype.problem

import java.time.LocalDate

class Report(
    metaData: MutableList<String>,
    var title: String,
    var author: String,
    var department: String,
    var date: LocalDate,
    var summary: String,
    var sections: List<String>,
    var references: List<String>,
    var font: String,
    var fontSize: Int,
    var pageSize: Int
) : DocumentPrototype(metaData) {
    override fun clone(): Report {
        return Report(metaDataDeepCopy(), this.title, this.author, this.department, this.date, this.summary,
            this.sections, this.references, this.font, this.fontSize, this.pageSize)
    }
}