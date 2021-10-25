package bsu.cs222.edu;

public class bonuses {
    private bonuses Strength;
    private bonuses Dexterity;
    private bonuses Constitution;
    private bonuses Intelligence;
    private bonuses Wisdom;
    private bonuses Charisma;

    public void setStrength(bonuses strength) {
        Strength = strength;
    }

    public void setDexterity(bonuses dexterity) {
        Dexterity = dexterity;
    }

    public void setConstitution(bonuses constitution) {
        Constitution = constitution;
    }

    public void setIntelligence(bonuses intelligence) {
        Intelligence = intelligence;
    }

    public void setWisdom(bonuses wisdom) {
        Wisdom = wisdom;
    }

    public void setCharisma(bonuses charisma) {
        Charisma = charisma;
    }

    public bonuses getStrength(){
        return Strength;
    }

    public bonuses getDexterity() {
        return Dexterity;
    }

    public bonuses getConstitution() {
        return Constitution;
    }

    public bonuses getIntelligence() {
        return Intelligence;
    }

    public bonuses getWisdom() {
        return Wisdom;
    }

    public bonuses getCharisma() {
        return Charisma;
    }
}
