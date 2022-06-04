package module_003.Task_015;

public class SaveStarShip {
    public int calculateDistance(int distance){
        if (distance > 0){
            return distance;
        }else{
            return Math.abs(distance);
            // return distance * -1;
        }
    }
    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));
    }
}
