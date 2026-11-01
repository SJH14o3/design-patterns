package com.sjh14o3.designPatterns.flyweight.problem

class ConcreteCharacterFormat(private val fontFamily: String, private val fontSize: Int, private val fontColor: String,
                              private val isBold: Boolean, private val isItalic: Boolean) : CharacterFormat {
    override fun show(character: Char, position: Int) {
        println(
            "Position $position: Character '$character' " +
                    "with font=$fontFamily, size=$fontSize, color=$fontColor, " +
                    "bold=$isBold, italic=$isItalic"
        )
    }

    override fun toString(): String {
        return "font=$fontFamily, size=$fontSize, color=$fontColor, " +
                "bold=$isBold, italic=$isItalic"
    }
}