import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    Scanner scan = new Scanner(System.in);
    private String player_Name;
    private Character_Class_BluePrint character_class_bluePrint;

    private int userChoice;


    public Player() {

    }


    //-------------------Constructors---------------------------------\\


    //-------------------Methods---------------------------------\\

    public ArrayList<Character_Class_BluePrint> gamer_Char_Objects() {
        ArrayList<Character_Class_BluePrint> player_Chars = new ArrayList<>();
        player_Chars.add(new Character_Class_BluePrint("Water Bender", 30, 25, 20, 35));
        player_Chars.add(new Character_Class_BluePrint("Fire Bender", 20, 45, 35, 55));
        player_Chars.add(new Character_Class_BluePrint("Air Bender", 25, 20, 35, 25));
        player_Chars.add(new Character_Class_BluePrint("Earth Bender", 35, 30, 35, 45));
        return player_Chars;
    }

    public void print_Characters() {
        for (int i = 0; i < gamer_Char_Objects().size(); i++) {
            System.out.println(i+1+"- "+gamer_Char_Objects().get(i));
        }
    }

    public Character_Class_BluePrint user_Selected_Char() {

        boolean askIf = true;
        int m = 0;
        while (askIf) {
            m = scan.nextInt()-1;
            setUserChoice(m);
            if (0 <= userChoice && userChoice < gamer_Char_Objects().size()) {
                this.character_class_bluePrint = gamer_Char_Objects().get(userChoice);
                askIf = false;
            } else {
                System.out.println("Enter valid number!");
                System.out.print("Number :");
            }
        }
        return this.character_class_bluePrint;
    }




    //-------------------Getters & Setters---------------------------------\\
    public String getPlayer_Name() {
        return player_Name;
    }

    public void setPlayer_Name(String player_Name) {
        this.player_Name = scan.nextLine();
    }

    public Character_Class_BluePrint getCharacter_class_bluePrint() {
        return character_class_bluePrint;
    }

    public void setCharacter_class_bluePrint(Character_Class_BluePrint character_class_bluePrint) {
        this.character_class_bluePrint = character_class_bluePrint;
    }

    public int getUserChoice() {
        return userChoice;
    }

    public void setUserChoice(int userChoice) {
        this.userChoice = userChoice;
    }





}
