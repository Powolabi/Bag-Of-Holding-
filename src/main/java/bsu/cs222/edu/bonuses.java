package bsu.cs222.edu;

public class bonuses {
    private int Strength;
    private int Dexterity;
    private int Constitution;
    private int Intelligence;
    private int Wisdom;
    private int Charisma;

    public void setStrengthBonus(int strength) {
        Strength = strength;
    }

    public void setDexterityBonus(int dexterity) {
        Dexterity = dexterity;
    }

    public void setConstitutionBonus(int constitution) {
        Constitution = constitution;
    }

    public void setIntelligenceBonus(int intelligence) {
        Intelligence = intelligence;
    }

    public void setWisdomBonus(int wisdom) {
        Wisdom = wisdom;
    }

    public void setCharismaBonus(int charisma) {
        Charisma = charisma;
    }

    public int getStrengthBonus(){
        return Strength;
    }

    public int getDexterityBonus() {
        return Dexterity;
    }

    public int getConstitutionBonus() {
        return Constitution;
    }

    public int getIntelligenceBonus() {
        return Intelligence;
    }

    public int getWisdomBonus() {
        return Wisdom;
    }

    public int getCharismaBonus() {
        return Charisma;
    }
}
