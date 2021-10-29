package edu.bsu.cs222;

// node to create new spell
public class spell {
    // add more detail as we continue
    public static String name, index, description, higher_level, range, components, material, casting_time, level, attack_type, damage, area_of_affect;

    public static void setName(String name) {
        spell.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void setIndex(String index) {
        spell.index = index;
    }

    public static String getIndex() {
        return index;
    }

    public static void setDescription(String description) {
        spell.description = description;
    }

    public static String getDescription() {
        return description;
    }

    public static void setHigher_level(String higher_level) {
        spell.higher_level = higher_level;
    }

    public static String getHigher_level() {
        return higher_level;
    }

    public static void setRange(String range) {
        spell.range = range;
    }

    public static String getRange() {
        return range;
    }

    public static void setLevel(String level) {
        spell.level = level;
    }

    public static String getLevel() {
        return level;
    }

    public static void setComponents(String components) {
        spell.components = components;
    }

    public static String getComponents() {
        return components;
    }

    public static void setCasting_time(String casting_time) {
        spell.casting_time = casting_time;
    }

    public static String getCasting_time() {
        return casting_time;
    }

    public static void setAttack_type(String attack_type) {
        spell.attack_type = attack_type;
    }

    public static String getAttack_type() {
        return attack_type;
    }

    public static void setMaterial(String material) {
        spell.material = material;
    }

    public static String getMaterial() {
        return material;
    }

    public static void setDamage(String damage) {
        spell.damage = damage;
    }

    public static String getDamage() {
        return damage;
    }

    public static void setArea_of_affect(String area_of_affect) {
        spell.area_of_affect = area_of_affect;
    }

    public static String getArea_of_affect() {
        return area_of_affect;
    }
}
