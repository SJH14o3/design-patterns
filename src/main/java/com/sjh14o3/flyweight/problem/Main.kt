package com.sjh14o3.flyweight.problem

fun main() {
    val formatFactory = CharacterFormatFactory()
    val document = Document(formatFactory)

    val text = "Hello"

    for (i in text.indices) {
        document.addCharacter(
            character = text[i],
            fontFamily = "Arial",
            fontSize = 14,
            fontColor = "Black",
            isBold = i == 0,
            isItalic = false
        )
    }

    document.show()

    println()
    println("Number of flyweight objects: ${formatFactory.numberOfFlyweights()}")
}