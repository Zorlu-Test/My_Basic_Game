import java.util.Random;

public abstract class B_a_Battle_Location extends Location_Zombie6 {

 private  Beast_Object beast_object;

    Random random= new Random();

    public B_a_Battle_Location(Player player) {
        super(player);
    }


    public Beast_Object getBeast_object() {
        return beast_object;
    }

    public void setBeast_object(Beast_Object beast_object) {
        this.beast_object = beast_object;
    }


    public Beast_Object create_Beast_Object(String location_Name) {


        if (location_Name.equals("Forest")) {
            this.beast_object = new Beast_Object("Ork", 2, 25, 5, 30);
        } else if (location_Name.equals("Cave")) {
            this.beast_object = new Beast_Object("Vampire", 3, 2, 3, 45);
        } else if (location_Name.equals("River")) {
            this.beast_object = new Beast_Object("Evil", 5, 3, 2, 55);

        }

        return beast_object;
    }




}

