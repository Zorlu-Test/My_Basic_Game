public class Game {

    Player player;
    Location_Zombie6 location;


    public Game() {
        player = new Player();
        //player=new Player("Ensar 2 constructor");
        startGame();


        playerLocations();
    }

    public void startGame() {
        System.out.println("Welcome Avatar Game.");
        System.out.println("Please enter your name");
        player.setPlayer_Name("");
        System.out.println("Thank you " + player.getPlayer_Name());
        System.out.println("Now you should select your Character");
        player.print_Characters();
        // according user input to create object of character
        player.user_Selected_Char();
        // print out User selected charracter
        System.out.println(player.getCharacter_class_bluePrint());
        System.out.println("---------------------");


    }


    public void playerLocations() {
        location = new A_b_Safe_House();
        boolean whileLoop = true;
        location.location_Info();
        while (whileLoop) {

            System.out.println("Please enter a number from list(To see list enter 7)");
            int num = player.scan.nextInt();
            location.create_Location_Obj(num, player).print_Location_Greting();

         int totalGold=   player.getCharacter_class_bluePrint().getBattle_gold();

         if (totalGold>200){
             System.out.println("Well done you you killed all beats and you won the game !");
             System.exit(0);
         }

        }


    }


}
