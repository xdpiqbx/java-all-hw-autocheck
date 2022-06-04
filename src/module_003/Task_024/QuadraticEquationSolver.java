package module_003.Task_024;

public class QuadraticEquationSolver {
    public double[] solve(int a, int b, int c){
        double d = b * b - 4 * a * c;
        if(d > 0){
            double root1 = (-b - Math.sqrt(d)) / (2 * a);
            double root2 = (-b + Math.sqrt(d)) / (2 * a);
            return new double[]{root1, root2};
        } else if (d == 0) {
            double root = -((double)b / (2 * (double)a));
            return new double[]{root};
        }
        return new double[]{};
    }
}
