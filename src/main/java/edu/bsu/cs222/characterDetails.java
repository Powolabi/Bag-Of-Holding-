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

    public characterDetails(String name, String race, String alignment, String characterClass, int hitPoints,
                            int armorClass, int speed, int level)
    {
        this.name = name;
        this.race = race;
        this.alignment = alignment;
        this.characterClass = characterClass;
        this.hitPoints = hitPoints;
        this.armorClass = armorClass;
        this.speed = speed;
        this.level = level;
    }

    public String getName()
    {
        return this.name;
    }

    public String getRace()
    {
        return this.race;
    }

    public String getAlignment()
    {
        return this.alignment;
    }

    public String getCharacterClass()
    {
        return this.characterClass;
    }

    public int getHitPoints()
    {
        return this.hitPoints;
    }

    public int getArmorClass()
    {
        return this.armorClass;
    }

    public int getSpeed()
    {
        return this.speed;
    }

    public int getLevel()
    {
        return this.level;
    }
}
