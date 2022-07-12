public class A_b_Safe_House extends A_a_Normal_Map {


    String location="Safe House";
    public A_b_Safe_House() {
        super();


    }
    public A_b_Safe_House(Player player) {
        super(player);



    }

    @Override
    public void print_Location_Greting() {
        System.out.println("Welcome to "+this.location);
        System.out.println("There will be renew your heal");
        System.out.println("Your heal were :"+ getPlayer().getCharacter_class_bluePrint().getBattle_health());
        getPlayer().getCharacter_class_bluePrint().setBattle_health(getPlayer().getCharacter_class_bluePrint().getHealth());
        System.out.println("Now your heal: " + getPlayer().getCharacter_class_bluePrint().getBattle_health());

    }





}
