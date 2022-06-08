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
    private double getLineLen(int [] dotsCoords){
        double intermediateResult = Math.pow(dotsCoords[2] - dotsCoords[0], 2) + Math.pow(dotsCoords[3] - dotsCoords[1], 2);
        return Math.sqrt(intermediateResult);
    }

    private double getSide(int [] dotsCoords){
        return dotsCoords[2] - dotsCoords[0];
    }

    public int getArea(){
        double diagonal = getLineLen(this.coords);
        double bottomSide = getSide(this.coords);
        double area = bottomSide * Math.sqrt(Math.pow(diagonal, 2) - Math.pow(bottomSide, 2));
        return Math.abs((int)Math.round(area));
    }
}