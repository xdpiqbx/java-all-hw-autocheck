package module_003.Task_016;

import java.util.*;

public class SaveStarShip {
    public int calculateDistance(int distance) {
        if (distance < 0) {
            return distance * -1;
        }

        return distance;
    }
    public String[] getPlanets(String galaxy){
        if(galaxy.equals("Miaru")){
            return new String[]{"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")){
            return new String[]{"Earth", "Mars", "Jupiter"};
        }else if(galaxy.equals("DangerBanger")){
            return new String[]{"Fobius", "Demius"};
        }
        return new String[]{};
    }

    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));
    }
}
