package module_005.Task_007_008;

// was in task 007
public class Engine {
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFuelType(){
        return "A500";
    }
}

// was in task 008
class XFuelEngine extends Engine {
    @Override
    public String getFuelType() {
        return "XFuel";
    }
}