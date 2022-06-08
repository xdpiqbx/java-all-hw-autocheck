package module_006.Task_012;

class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}

class CircleIntersector{
    int x1, y1, r1, x2, y2, r2;
    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2){
        this.x1 = x1;
        this.y1 = y1;
        this.r1 = r1;
        this.x2 = x2;
        this.y2 = y2;
        this.r2 = r2;
    }
    private double getLineLen(){
        double intermediateResult = Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2);
        return Math.sqrt(intermediateResult);
    }

    @Override
    public String toString() {
        return getLineLen() <= this.r1 + this.r2 ? "intersects" : "not intersects";
    }
}