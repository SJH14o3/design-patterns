package com.sjh14o3.designPatterns.flyweight.problem

class Document(private val formatFactory: CharacterFormatFactory) {
    private val characters = mutableListOf<DocumentCharacter>()
    fun addCharacter(
        character: Char,
        fontFamily: String,
        fontSize: Int,
        fontColor: String,
        isBold: Boolean,
        isItalic: Boolean
    ) {
        val format = formatFactory.getFormat(
            fontFamily = fontFamily,
            fontSize = fontSize,
            fontColor = fontColor,
            isBold = isBold,
            isItalic = isItalic
        )

        characters.add(
            DocumentCharacter(character = character, position = characters.size, format = format)
        )
    }

    fun show() {
        characters.forEach {
            it.format.show(character = it.character, position = it.position)
        }
    }
}
