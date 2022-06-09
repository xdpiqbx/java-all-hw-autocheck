package module_006.Task_016;

class LevelTest {
    public static void main(String[] args) {
        //Quarke level, name is Test
        System.out.println(new Level("Test"));
    }
}

class Level{
    String levelName = "";
    Level(String levelName){
        this.levelName = levelName;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + this.levelName;
    }
}