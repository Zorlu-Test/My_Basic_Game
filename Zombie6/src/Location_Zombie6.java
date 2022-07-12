public abstract class Location_Zombie6 {
    private Player player;
    private String location_Name;
    private Location_Zombie6 location_Obj;

    public Location_Zombie6() {

    }


    public abstract void print_Location_Greting();


    public Location_Zombie6 create_Location_Obj(int num, Player player) {

        switch (num) {
            case 1:
                location_Obj = new A_b_Safe_House(player);
                break;
            case 2:
                location_Obj = new A_c_Tool_Store(player);
                break;
            case 3:
                location_Obj = new B_b_Forest(player);
                break;
            case 4:
                location_Obj = new B_c_Cave(player);
                break;
            case 5:
                location_Obj = new B_d_River(player);
                break;
            case 6:
                System.exit(0);
                break;
            case 7:
                location_Info();
                location_Obj = new Empty_Object(player);
                break;
            default:
                System.out.println("Wrong number try again!");
                location_Obj = new A_b_Safe_House(player);

        }

        return location_Obj;
    }


    public void location_Info() {
        System.out.println("1-Safe House (Renew heal)");
        System.out.println("2-Tool store (You could buy item)");
        System.out.println("3-Forest you could encounter single ork or gross orks it is absolutely luck!");
        System.out.println("4-Cave you could encounter vampire  or gross vampiries it is absolutely luck!");
        System.out.println("5-River you could encounter evil  or gross evils it is absolutely luck!");
        System.out.println("6-Exit.");
        System.out.println("7-If you want to see Location list");

    }

    public Location_Zombie6(Player player) {
        this.player = player;
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    public Location_Zombie6 getLocation_Obj() {
        return location_Obj;
    }

    public void setLocation_Obj(Location_Zombie6 location_Obj) {
        this.location_Obj = location_Obj;
    }
}
