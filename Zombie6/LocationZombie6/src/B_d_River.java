public class B_d_River extends B_a_Battle_Location{
    String location="River";
    public B_d_River(Player player) {
        super(player);

    }

    @Override
    public void print_Location_Greting() {

        System.out.println("You are in the River! How dare you come there alone ? Now you must fight with us !");
        create_Beast_Object(location);
        int randomNum = random.nextInt(3) + 1;
        System.out.println("You encounter " + randomNum + " " + getBeast_object().getBeast_Name());
        System.out.println("Their total specs =" + getBeast_object().toString(randomNum));
        System.out.println("Your specs " + getPlayer().getCharacter_class_bluePrint().toString());
        System.out.println("Before the fight if you want you can back main menu trough enter 1 or you can keep fighting any number");
        int num = getPlayer().scan.nextInt();
        if (num == 1) {
            return;
        }
        boolean resultFight=true;
        int dummyUserHeal;
        int availableHealPlayer = getPlayer().getCharacter_class_bluePrint().getBattle_health();
        int inboundDmg = randomNum * getBeast_object().getBattle_beast_Dmg();


        int appliedDmg = getPlayer().getCharacter_class_bluePrint().getBattle_dmg();
        int beastHeal = randomNum * getBeast_object().getBattle_beast_Heal();

        while (availableHealPlayer > 0 && beastHeal > 0) {


            availableHealPlayer = availableHealPlayer - inboundDmg;
            getPlayer().getCharacter_class_bluePrint().setBattle_health(availableHealPlayer);

            beastHeal = (beastHeal - appliedDmg);
            getBeast_object().setBattle_beast_Heal(beastHeal);

            if (availableHealPlayer < 0) {
                resultFight=false;
                System.out.println("Game over! byyy");
                System.exit(0);
            }

            if (beastHeal < 0) {
                resultFight=true;
                System.out.println("You won beats !!!");
            }else if (availableHealPlayer<10){
                System.out.println("Your heal too low you should renew heal otherwise you gonna die! enter 1 or die");
                int num2 = getPlayer().scan.nextInt();
                if (num2==1){
                    return;
                }
            }

            System.out.println("Your heal = " + availableHealPlayer);
            System.out.println("Beast heal = " + beastHeal);

        }


        if (resultFight==true){
            getPlayer().getCharacter_class_bluePrint().setBattle_gold(getPlayer().getCharacter_class_bluePrint().getBattle_gold()+randomNum*getBeast_object().getBattle_beast_Gold());
        }



        System.out.println("After fight your new heal " + getPlayer().getCharacter_class_bluePrint().getBattle_health());
        System.out.println("Your Gold:"+getPlayer().getCharacter_class_bluePrint().getBattle_gold());



    }
}
