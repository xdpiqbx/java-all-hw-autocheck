package module_006.Task_011;

class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}

class RectangleArea{
    private int [] coords;
    public RectangleArea(int[] coords){
        this.coords = coords;
    }
    public int getArea(){
        return 0;
    }
}