package module_005.Task_001_002_003;

public class SpaceShip {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // if (name.isBlank() || name.length() > 100) {
        if (name.strip().equals("") || name.length() > 100){
            return;
        }
        this.name = name;
    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        ship.setName("Walker");
        System.out.println(ship.getName()); //Should be Walker

        ship.setName("");
        System.out.println(ship.getName()); //Should be Walker, empty value ignored

        ship.setName("Voyager ".repeat(100));
        System.out.println(ship.getName()); //Should be Walker, too long value ignored
    }
}
