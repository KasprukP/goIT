package ExercisesJava;

public class QuadraticEquationSolver {
    public double[] solve(int a, int b, int c) {

        double result = b * b - 4.0 * a * c;

        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            return new double[]{r1, r2};
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            return new double[]{r1};
        } else {
            return new double[]{};
        }
    }
}