package module_006.Task_017;

class Level {
    private String name;
    Point[] points;
    Level(String name, Point[] points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + this.name + ", point count is " + this.points.length;
    }

    static class Point{
        int x = 0;
        int y = 0;
        Point[] points;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}

class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        //Quarke level, name is Test, point count is 3
        System.out.println(new Level("Test", points));
    }
}
