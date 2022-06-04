package module_004.Task_014;

public class TriangleDrawer {
    public String drawTriangle(int side){
        String triangle = "";
        while(side > 0){
            triangle += "*".repeat(side)+"\n";
            side--;
        }
        return triangle;
    }

    public static void main(String[] args) {
        new TriangleDrawer().drawTriangle(10);
    }
}
