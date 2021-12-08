package edu.bsu.cs222;

public class abilityScoreModifier {
    public static int strMod;
    public static int dexMod;
    public static int conMod;
    public static int intMod;
    public static int wisMod;
    public static int charMod;
    public static int number;

    // put try catch statement for modifier values associated with ability scores
    // change to switch
    public static int modifierIndex(int abilityNum){
        switch (abilityNum) {
            case 1 -> number = -5;
            case 2, 3 -> number = -4;
            case 4, 5 -> number = -3;
            case 6, 7 -> number = -2;
            case 8, 9 -> number = -1;
            case 10, 11 -> number = 0;
            case 12, 13 -> number = 1;
            case 14, 15 -> number = 2;
            case 16, 17 -> number = 3;
            case 18, 19 -> number = 4;
            case 20, 21 -> number = 5;
            case 22, 23 -> number = 6;
            case 24, 25 -> number = 7;
            case 26, 27 -> number = 8;
            case 28, 29 -> number = 9;
            case 30 -> number = 10;
        }

        return number;
    }

    public static void setStrMod(int strMod) { strMod = modifierIndex(main.stringToNumb(characterDetails.getStrength())); }

    public static void setDexMod(int dexMod) {
        dexMod = modifierIndex(main.stringToNumb(characterDetails.getDexterity()));
    }

    public static void setConMod(int conMod) {
        conMod = modifierIndex(main.stringToNumb(characterDetails.getConstitution()));
    }

    public static void setIntMod(int intMod) {
        intMod = modifierIndex(main.stringToNumb(characterDetails.getIntelligence()));
    }

    public static void setWisMod(int wisMod) {
        wisMod = modifierIndex(main.stringToNumb(characterDetails.getWisdom()));
    }

    public static void setCharMod(int charMod) { charMod = modifierIndex(main.stringToNumb(characterDetails.getCharisma())); }

    public static int getStrMod() {
        return strMod;
    }

    public static int getDexMod() {
        return dexMod;
    }

    public static int getConMod() {
        return conMod;
    }

    public static int getIntMod() {
        return intMod;
    }

    public static int getWisMod() {
        return wisMod;
    }

    public static int getCharMod() {
        return charMod;
    }
}
