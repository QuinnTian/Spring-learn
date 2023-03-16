package com.ismeoh.DI.useXml.Beans_Auto_Wiring.ByName;

public class TextEditor {
    private SpellChecker spellChecker;
    private String name;

    public void setSpellChecker4( SpellChecker spellChecker4 ){
        this.spellChecker = spellChecker4;
    }
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
