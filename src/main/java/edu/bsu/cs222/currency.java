package edu.bsu.cs222;

public class currency {
    public static int copper = 0;
    public static int silver = 0;
    public static int gold = 0;
    public static int platinum = 0;

    // add currency conversion

    public static void addCopper(int copperAdded){ copper += copperAdded; }

    public static void addSilver(int silverAdded){
        silver += silverAdded;
    }

    public static void addGold(int goldAdded){
        gold += goldAdded;
    }

    public static void addPlatinum(int platinumAdded){
        platinum += platinumAdded;
    }

    public static void subtractCopper(int copperSubtracted){ copper -= copperSubtracted; }

    public static void subtractSilver(int silverSubtracted){
        silver -= silverSubtracted;
    }

    public static void subtractGold(int goldSubtracted){
        silver -= goldSubtracted;
    }

    public static void subtractPlatinum(int platinumSubtracted){
        platinum -= platinumSubtracted;
    }
}
