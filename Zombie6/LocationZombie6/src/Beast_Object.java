public class Beast_Object {


    private String beast_Name;
    private int beast_Dmg, beast_Heal, beast_Armor, beast_Gold;

    private int battle_beast_Dmg, battle_beast_Heal, battle_beast_Armor, battle_beast_Gold;


    public Beast_Object(String beast_Name, int beast_Dmg, int beast_Heal, int beast_Armor, int beast_Gold) {
        this.beast_Name = beast_Name;
        this.beast_Dmg = beast_Dmg;
        this.beast_Heal = beast_Heal;
        this.beast_Armor = beast_Armor;
        this.beast_Gold = beast_Gold;

        setBattle_beast_Armor( this.beast_Armor);
        setBattle_beast_Dmg(this.beast_Dmg);
        setBattle_beast_Gold(this.beast_Gold);
        setBattle_beast_Heal(this.beast_Heal);
    }




    public String getBeast_Name() {
        return beast_Name;
    }

    public void setBeast_Name(String beast_Name) {
        this.beast_Name = beast_Name;
    }

    public int getBeast_Dmg() {
        return beast_Dmg;
    }

    public void setBeast_Dmg(int beast_Dmg) {
        this.beast_Dmg = beast_Dmg;
    }

    public int getBeast_Heal() {
        return beast_Heal;
    }

    public void setBeast_Heal(int beast_Heal) {
        this.beast_Heal = beast_Heal;
    }

    public int getBeast_Armor() {
        return beast_Armor;
    }

    public void setBeast_Armor(int beast_Armor) {
        this.beast_Armor = beast_Armor;
    }

    public int getBeast_Gold() {
        return beast_Gold;
    }

    public void setBeast_Gold(int beast_Gold) {
        this.beast_Gold = beast_Gold;
    }

    public int getBattle_beast_Dmg() {
        return battle_beast_Dmg;
    }

    public void setBattle_beast_Dmg(int battle_beast_Dmg) {
        this.battle_beast_Dmg = battle_beast_Dmg;
    }

    public int getBattle_beast_Heal() {
        return battle_beast_Heal;
    }

    public void setBattle_beast_Heal(int battle_beast_Heal) {
        this.battle_beast_Heal = battle_beast_Heal;
    }

    public int getBattle_beast_Armor() {
        return battle_beast_Armor;
    }

    public void setBattle_beast_Armor(int battle_beast_Armor) {
        this.battle_beast_Armor = battle_beast_Armor;
    }

    public int getBattle_beast_Gold() {
        return battle_beast_Gold;
    }

    public void setBattle_beast_Gold(int battle_beast_Gold) {
        this.battle_beast_Gold = battle_beast_Gold;
    }

    public String toString(int randomNum) {
        return "Beast_Object{" +
                ", beast_Name='" + beast_Name + '\'' +
                ", beast_Dmg=" + (randomNum*beast_Dmg) +
                ", beast_Heal=" + (randomNum*beast_Heal) +
                ", beast_Armor=" + (randomNum*beast_Armor) +
                ", beast_Gold=" + (randomNum*beast_Gold) +
                '}';
    }




}
