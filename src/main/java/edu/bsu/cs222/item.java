package edu.bsu.cs222;

public class item {
    public static String name, weight, index, quantity, equipment_type, gear_category, category;

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

    public static void setCategory(String category) {
        item.category = category;
    }

    public static String getCategory() {
        return category;
    }
}
