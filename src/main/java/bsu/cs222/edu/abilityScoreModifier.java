package bsu.cs222.edu;

public class abilityScoreModifier {
    public int strMod;
    public int dexMod;
    public int conMod;
    public int intMod;
    public int wisMod;
    public int charMod;
    public int number;

    // put try catch statement for modifier values associated with ability scores
    public int modifierIndex(int abilityNum){
        if (abilityNum == 1){
            number = -5;
        } else if (abilityNum == 2 || abilityNum == 3){
            number = -4;
        } else if (abilityNum == 4 || abilityNum == 5){
            number = -3;
        } else if (abilityNum == 6 || abilityNum == 7){
            number = -2;
        } else if (abilityNum == 8 || abilityNum == 9){
            number = -1;
        } else if (abilityNum == 10 || abilityNum == 11){
            number = 0;
        } else if (abilityNum == 12 || abilityNum == 13){
            number = 1;
        } else if (abilityNum == 14 || abilityNum == 15){
            number = 2;
        } else if (abilityNum == 16 || abilityNum == 17){
            number = 3;
        } else if (abilityNum == 18 || abilityNum == 19){
            number = 4;
        } else if (abilityNum == 20 || abilityNum == 21){
            number = 5;
        } else if (abilityNum == 22 || abilityNum == 23){
            number = 6;
        } else if (abilityNum == 24 || abilityNum == 25){
            number = 7;
        } else if (abilityNum == 26 || abilityNum == 27){
            number = 8;
        } else if (abilityNum == 28 || abilityNum == 29){
            number = 9;
        } else if (abilityNum == 30){
            number = 10;
        } else {
            throw new Error();
        }
        return number;
    }

    public void setStrMod(int strMod) {
        this.strMod = modifierIndex(strMod);
    }

    public void setDexMod(int dexMod) {
        this.dexMod = modifierIndex(dexMod);
    }

    public void setConMod(int conMod) {
        this.conMod = modifierIndex(conMod);
    }

    public void setIntMod(int intMod) {
        this.intMod = modifierIndex(intMod);
    }

    public void setWisMod(int wisMod) {
        this.wisMod = modifierIndex(wisMod);
    }

    public void setCharMod(int charMod) {
        this.charMod = modifierIndex(charMod);
    }

    public int getStrMod() {
        return strMod;
    }

    public int getDexMod() {
        return dexMod;
    }

    public int getConMod() {
        return conMod;
    }

    public int getIntMod() {
        return intMod;
    }

    public int getWisMod() {
        return wisMod;
    }

    public int getCharMod() {
        return charMod;
    }
}
