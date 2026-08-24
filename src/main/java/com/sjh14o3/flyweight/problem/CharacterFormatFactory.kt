package com.sjh14o3.flyweight.problem

class CharacterFormatFactory {

    private val formats = HashMap<String, CharacterFormat>()

    fun getFormat(fontFamily: String, fontSize: Int, fontColor: String, isBold: Boolean, isItalic: Boolean): CharacterFormat {
        val key = "$fontFamily|$fontSize|$fontColor|$isBold|$isItalic"
        return formats.getOrPut(key) {
            println("Creating new format: $key")
            ConcreteCharacterFormat(
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