package edu.bsu.cs222;

public class characterDetails {
    public static String name;
    public static String race;
    public static String alignment;
    public static String characterClass;
    public static String  hitPoints;
    public static String armorClass;
    public static String speed;
    public static String level;

    public characterDetails(String text, String text1, String text2, String text3, String parseInt, String parseInt1, String parseInt2, String parseInt3) {
        characterDetails.name = text;
        characterDetails.race = text1;
        characterDetails.characterClass = text2;
        characterDetails.alignment = text3;
        characterDetails.hitPoints = parseInt;
        characterDetails.armorClass = parseInt1;
        characterDetails.speed = parseInt2;
        characterDetails.level = parseInt3;
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

    public String getHitPoints()
    {
        return hitPoints;
    }

    public String getArmorClass()
    {
        return armorClass;
    }

    public String getSpeed()
    {
        return speed;
    }

    public String getLevel()
    {
        return level;
    }
}
