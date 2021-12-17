package edu.bsu.cs222;

public class characterDetails {
    public static String name;
    public static String race;
    public static String alignment;
    public static String characterClass;
    public static String hitPoints;
    public static String armorClass;
    public static String level;
    public static String Strength;
    public static String Dexterity;
    public static String Constitution;
    public static String Intelligence;
    public static String Wisdom;
    public static String Charisma;

    public characterDetails(String text, String text1, String text2, String text3, String parseInt3, String parseInt4, String parseInt5, String parseInt6, String parseInt7, String parseInt8, String parseInt9, String parseInt10, String parseInt11) {
        characterDetails.name = text;
        characterDetails.race = text1;
        characterDetails.characterClass = text2;
        characterDetails.alignment = text3;
        characterDetails.level = parseInt3;
        characterDetails.armorClass = parseInt4;
        characterDetails.hitPoints = parseInt5;

        characterDetails.Strength = parseInt6;
        characterDetails.Dexterity = parseInt7;
        characterDetails.Constitution = parseInt8;
        characterDetails.Intelligence = parseInt9;
        characterDetails.Charisma = parseInt10;
        characterDetails.Wisdom = parseInt11;
    }

    public String getName()
    {
        return name;
    }

    public String getRace()
    {
        return race;
    }

    public String getAlignment()
    {
        return alignment;
    }

    public String getCharacterClass()
    {
        return characterClass;
    }

    public String getLevel()
    {
        return level;
    }

    public String getArmor() {return armorClass;}

    public String getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(String hitPoints) {
        characterDetails.hitPoints = hitPoints;
    }

    public void setStrength(String strength) {
        Strength = strength;
    }

    public void setDexterity(String dexterity) {
        Dexterity = dexterity;
    }

    public void setConstitution(String constitution) {
        Constitution = constitution;
    }

    public void setIntelligence(String intelligence) {
        Intelligence = intelligence;
    }

    public void setWisdom(String wisdom) { Wisdom = wisdom; }

    public void setCharisma(String charisma) {
        Charisma = charisma;
    }

    public static void setLevel(String level) {
        characterDetails.level = level;
    }

    public static String getStrength() {
        return Strength;
    }

    public static String getDexterity() {
        return Dexterity;
    }

    public static String getConstitution() {
        return Constitution;
    }

    public static String getIntelligence() {
        return Intelligence;
    }

    public static String getWisdom() {
        return Wisdom;
    }

    public static String getCharisma() {
        return Charisma;
    }

    public static String getArmorClass(){
        return armorClass;
    }
}
