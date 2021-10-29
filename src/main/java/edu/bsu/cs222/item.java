package edu.bsu.cs222;

public class item {
    public static String name, weight, index, quantity, equipment_type, gear_category;
    public static String vehicle=null, weapon=null, tool=null;

    public static void setName(String name) {
        item.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void setWeight(String weight) {
        item.weight = weight;
    }

    public static String getWeight() {
        return weight;
    }

    public static void setIndex(String index) {
        item.index = index;
    }

    public static String getIndex() {
        return index;
    }

    public static void setQuantity(String quantity) {
        item.quantity = quantity;
    }

    public static String getQuantity() {
        return quantity;
    }

    public static void setEquipment_type(String equipment_type) {
        item.equipment_type = equipment_type;
    }

    public static String getEquipment_type() {
        return equipment_type;
    }

    public static String getGear_category() {
        return gear_category;
    }

    public static void setGear_category(String gear_category) {
        item.gear_category = gear_category;
    }

    public static void setVehicle(String vehicle) {
        item.vehicle = vehicle;
    }

    public static String getVehicle() {
        return vehicle;
    }

    public static void setWeapon(String weapon) {
        item.weapon = weapon;
    }

    public static String getWeapon() {
        return weapon;
    }

    public static void setTool(String tool) {
        item.tool = tool;
    }

    public static String getTool() {
        return tool;
    }
}
