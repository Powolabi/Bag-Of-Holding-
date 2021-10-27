package edu.bsu.cs222;

public class bonuses {
    private static int Strength;
    private static int Dexterity;
    private static int Constitution;
    private static int Intelligence;
    private static int Wisdom;
    private static int Charisma;

    public static void setStrengthBonus(int strength) {
        Strength = strength;
    }

    public static void setDexterityBonus(int dexterity) {
        Dexterity = dexterity;
    }

    public static void setConstitutionBonus(int constitution) {
        Constitution = constitution;
    }

    public static void setIntelligenceBonus(int intelligence) { Intelligence = intelligence; }

    public static void setWisdomBonus(int wisdom) {
        Wisdom = wisdom;
    }

    public static void setCharismaBonus(int charisma) {
        Charisma = charisma;
    }

    public static int getStrengthBonus(){
        return Strength;
    }

    public static int getDexterityBonus() {
        return Dexterity;
    }

    public static int getConstitutionBonus() {
        return Constitution;
    }

    public static int getIntelligenceBonus() {
        return Intelligence;
    }

    public static int getWisdomBonus() {
        return Wisdom;
    }

    public static int getCharismaBonus() {
        return Charisma;
    }
}
