package edu.bsu.cs222;

public class skills {
    public static int proficiency = 2;

    // strength based
    public static int athletics;
    // dex based
    public static int acrobatics;
    public static int sleightOfHand;
    public static int stealth;
    // intelligence based
    public static int arcana;
    public static int history;
    public static int investigation;
    public static int nature;
    public static int religion;
    // wisdom
    public static int animalHandling;
    public static int insight;
    public static int medicine;
    public static int perception;
    public static int survival;
    // charisma
    public static int deception;
    public static int intimidation;
    public static int performance;
    public static int persuasion;

    //find way to set this in efficient way

    public static int getAcrobatics() { return acrobatics; }

    public static int getAnimalHandling() { return animalHandling; }

    public static int getArcana() { return arcana; }

    public static int getAthletics() { return athletics; }

    public static int getDeception() { return deception; }

    public static int getHistory() { return history; }

    public static int getInsight() { return insight; }

    public static int getIntimidation() { return intimidation; }

    public static int getInvestigation() { return investigation; }

    public static int getMedicine() { return medicine; }

    public static int getNature() { return nature; }

    public static int getPerception() { return perception; }

    public static int getPerformance() { return performance; }

    public static int getPersuasion() { return persuasion; }

    public static int getProficiency() { return proficiency; }

    public static int getReligion() { return religion; }

    public static int getSleightOfHand() { return sleightOfHand; }

    public static int getStealth() { return stealth; }

    public static int getSurvival() { return survival; }

    public static void setAcrobatics(int acrobatics) {
        skills.acrobatics = acrobatics;
    }

    public static void setAnimalHandling(int animalHandling) {
        skills.animalHandling = animalHandling;
    }

    public static void setArcana(int arcana) {
        skills.arcana = arcana;
    }

    public static void setAthletics(int athletics) {
        skills.athletics = athletics;
    }

    public static void setDeception(int deception) {
        skills.deception = deception;
    }

    public static void setHistory(int history) {
        skills.history = history;
    }

    public static void setInsight(int insight) {
        skills.insight = insight;
    }

    public static void setIntimidation(int intimidation) {
        skills.intimidation = intimidation;
    }

    public static void setInvestigation(int investigation) {
        skills.investigation = investigation;
    }

    public static void setMedicine(int medicine) {
        skills.medicine = medicine;
    }

    public static void setNature(int nature) {
        skills.nature = nature;
    }

    public static void setPerception(int perception) {
        skills.perception = perception;
    }

    public static void setPersuasion(int persuasion) {
        skills.persuasion = persuasion;
    }

    public static void setPerformance(int performance) {
        skills.performance = performance;
    }

    public static void setProficiency(int proficiency) {
        skills.proficiency = proficiency;
    }

    public static void setReligion(int religion) {
        skills.religion = religion;
    }

    public static void setSleightOfHand(int sleightOfHand) {
        skills.sleightOfHand = sleightOfHand;
    }

    public static void setStealth(int stealth) {
        skills.stealth = stealth;
    }

    public static void setSurvival(int survival) {
        skills.survival = survival;
    }
}
