package edu.bsu.cs222;

public class characterDetails {
    public static String name;
    public static String race;
    public static String alignment;
    public static String characterClass;
    public static int hitPoints;
    public static int armorClass;
    public static int speed;
    public static int level;

    public characterDetails(String text, String text1, String text2, String text3, int parseInt, int parseInt1, int parseInt2, int parseInt3) {
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

    public int getHitPoints()
    {
        return hitPoints;
    }

    public int getArmorClass()
    {
        return armorClass;
    }

    public int getSpeed()
    {
        return speed;
    }

    public int getLevel()
    {
        return level;
    }
}
