package module_005.Task_039;

class ControlPanelTest {
    public static void main(String[] args) {
        new ControlPanel().control();
    }
}

class ControlPanel {
    private Altimeter altimeter = new Altimeter();
    private AirGauge airGauge = new AirGauge();

    public void control(){
        System.out.println(altimeter);
        System.out.println(airGauge);
    }
}

class Altimeter{
    @Override
    public String toString() {
        return "Measure height";
    }
}

class AirGauge{
    @Override
    public String toString() {
        return "Measure air pressure";
    }
}
