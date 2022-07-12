public class Character_Class_BluePrint {

    private String char_Name;
    private int health, armor, dmg, gold;
    private int battle_health, battle_armor, battle_dmg, battle_gold;

    public Character_Class_BluePrint(String char_Name, int health, int armor, int dmg, int gold) {

        this.char_Name = char_Name;
        this.health = health;
        this.armor = armor;
        this.dmg = dmg;
        this.gold = gold;

        setBattle_armor(this.armor);
        setBattle_dmg(this.dmg);
        setBattle_gold(this.gold);
        setBattle_health(this.health);

    }

    public Character_Class_BluePrint(int battle_health, int battle_armor, int battle_dmg, int battle_gold) {
        this.battle_health = battle_health;
        this.battle_armor = battle_armor;
        this.battle_dmg = battle_dmg;
        this.battle_gold = battle_gold;
    }


    //-------------------Methods---------------------------------\\

    @Override
    public String toString() {
        return "Character_Class_BluePrint{" +
                "char_Name='" + char_Name + '\'' +
                ", health=" + health +
                ", armor=" + armor +
                ", dmg=" + dmg +
                ", gold=" + gold +
                ", battle_health=" + battle_health +
                ", battle_armor=" + battle_armor +
                ", battle_dmg=" + battle_dmg +
                ", battle_gold=" + battle_gold +
                '}';
    }


//-------------------Getters & Setters---------------------------------\\

    public String getChar_Name() {
        return char_Name;
    }

    public void setChar_Name(String char_Name) {
        this.char_Name = char_Name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getBattle_health() {
        return battle_health;
    }

    public void setBattle_health(int battle_health) {
        this.battle_health = battle_health;
    }

    public int getBattle_armor() {
        return battle_armor;
    }

    public void setBattle_armor(int battle_armor) {
        this.battle_armor = battle_armor;
    }

    public int getBattle_dmg() {
        return battle_dmg;
    }

    public void setBattle_dmg(int battle_dmg) {
        this.battle_dmg = battle_dmg;
    }

    public int getBattle_gold() {
        return battle_gold;
    }

    public void setBattle_gold(int battle_gold) {
        this.battle_gold = battle_gold;
    }
}
