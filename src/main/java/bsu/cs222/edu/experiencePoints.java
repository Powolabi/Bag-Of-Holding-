package bsu.cs222.edu;

public class experiencePoints {
    public static int xp = 0;

    public static void addXp(int p) {
        experiencePoints.xp += p;
    }

    public static int getXp() {
        return xp;
    }
}
