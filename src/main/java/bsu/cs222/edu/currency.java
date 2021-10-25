package bsu.cs222.edu;

public class currency {
    public int copper = 0;
    public int silver = 0;
    public int gold = 0;
    public int platinum = 0;

    // add currency conversion

    public void addCopper(int copperAdded){
        this.copper += copperAdded;
    }

    public void addSilver(int silverAdded){
        this.silver += silverAdded;
    }

    public void addGold(int goldAdded){
        this.gold += goldAdded;
    }

    public void addPlatinum(int platinumAdded){
        this.platinum += platinumAdded;
    }

    public void subtractCopper(int copperSubtracted){
        this.copper -= copperSubtracted;
    }

    public void subtractSilver(int silverSubtracted){
        this.silver -= silverSubtracted;
    }

    public void subtractGold(int goldSubtracted){
        this.silver -= goldSubtracted;
    }

    public void subtractPlatinum(int platinumSubtracted){
        this.platinum -= platinumSubtracted;
    }
}
