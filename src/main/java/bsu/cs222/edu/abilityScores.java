package bsu.cs222.edu;

public class abilityScores {
    public static int Strength;
    public static int Dexterity;
    public static int Constitution;
    public static int Intelligence;
    public static int Wisdom;
    public static int Charisma;

    public void setStrength(int strength) {
        this.Strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.Dexterity = dexterity;
    }

    public void setConstitution(int constitution) {
        this.Constitution = constitution;
    }

    public void setIntelligence(int intelligence) {
        this.Intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.Wisdom = wisdom;
    }

    public void setCharisma(int charisma) {
        this.Charisma = charisma;
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
}
