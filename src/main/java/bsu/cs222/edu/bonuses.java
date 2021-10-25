package bsu.cs222.edu;

public class bonuses {
    private bonuses Strength;
    private bonuses Dexterity;
    private bonuses Constitution;
    private bonuses Intelligence;
    private bonuses Wisdom;
    private bonuses Charisma;

    public void setStrengthBonus(bonuses strength) {
        Strength = strength;
    }

    public void setDexterityBonus(bonuses dexterity) {
        Dexterity = dexterity;
    }

    public void setConstitutionBonus(bonuses constitution) {
        Constitution = constitution;
    }

    public void setIntelligenceBonus(bonuses intelligence) {
        Intelligence = intelligence;
    }

    public void setWisdomBonus(bonuses wisdom) {
        Wisdom = wisdom;
    }

    public void setCharismaBonus(bonuses charisma) {
        Charisma = charisma;
    }

    public bonuses getStrengthBonus(){
        return Strength;
    }

    public bonuses getDexterityBonus() {
        return Dexterity;
    }

    public bonuses getConstitutionBonus() {
        return Constitution;
    }

    public bonuses getIntelligenceBonus() {
        return Intelligence;
    }

    public bonuses getWisdomBonus() {
        return Wisdom;
    }

    public bonuses getCharismaBonus() {
        return Charisma;
    }
}
