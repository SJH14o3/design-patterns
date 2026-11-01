package com.sjh14o3.designPatterns.flyweight.problem

class CharacterFormatFactory {

    private val formats = HashMap<String, CharacterFormat>()

    fun getFormat(fontFamily: String, fontSize: Int, fontColor: String, isBold: Boolean, isItalic: Boolean): CharacterFormat {
        val key = "$fontFamily|$fontSize|$fontColor|$isBold|$isItalic"
        return formats.getOrPut(key) {
            println("Creating new format: $key")
            com.sjh14o3.designPatterns.flyweight.problem.ConcreteCharacterFormat(
                fontFamily = fontFamily,
                fontSize = fontSize,
                fontColor = fontColor,
                isBold = isBold,
                isItalic = isItalic
            )
        }
    }

    fun numberOfFlyweights(): Int {
        return formats.size
    }
}