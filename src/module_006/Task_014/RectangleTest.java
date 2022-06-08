package module_006.Task_014;

class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(3, 7);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));
    }
}

class Rectangle{
    int a;
    int b;
    int area;
    boolean isVertical;
    boolean isHorizontal;
    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
        this.area = a * b;
        this.isVertical = a >= b;
        this.isHorizontal = a <= b;
    }
    public boolean canPlaceInto(Rectangle anotherRect){
        if (this.area > anotherRect.area){
            return false;
        }
        boolean bothVertical = this.isVertical && anotherRect.isVertical;
        boolean bothHorizontal = this.isHorizontal && anotherRect.isHorizontal;
        if(bothVertical || bothHorizontal){
            return this.a <= anotherRect.a && this.b <= anotherRect.b;
        }
        return this.a <= anotherRect.b && this.b <= anotherRect.a;
    }
}