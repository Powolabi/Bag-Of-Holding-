package bsu.cs222.edu;

public class abilityScores {
    public static int Strength;
    public static int Dexterity;
    public static int Constitution;
    public static int Intelligence;
    public static int Wisdom;
    public static int Charisma;

    public static void setStrength(int strength) {
        Strength = strength;
    }

    public static void setDexterity(int dexterity) {
        Dexterity = dexterity;
    }

    public static void setConstitution(int constitution) {
        Constitution = constitution;
    }

    public static void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }

    public static void setWisdom(int wisdom) { Wisdom = wisdom; }

    public static void setCharisma(int charisma) {
        Charisma = charisma;
    }

    public static int getStrength() {
        return Strength;
    }

    public static int getDexterity() {
        return Dexterity;
    }

    public static int getConstitution() {
        return Constitution;
    }

    public static int getIntelligence() {
        return Intelligence;
    }

    public static int getWisdom() {
        return Wisdom;
    }

    public static int getCharisma() {
        return Charisma;
    }

    // set ability score modifiers
}
