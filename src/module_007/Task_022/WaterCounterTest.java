package module_007.Task_022;

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}

class WaterCounter{
    public double count(String text){
        char [] symbols = text.toCharArray();
        int spaceCounter = 0;
        for (char symbol:symbols) {
            if (symbol == ' '){
                spaceCounter++;
            }
        }
        return (double)spaceCounter / (double)symbols.length;
    }
}