public class SquareRootNewton {
    public static void main(String[] args) {
        int num = 25; // you can change this number
        double sqrt = num / 2.0; // initial guess
        double t;
        double epsilon = 1e-10; // tolerance for convergence

        // Newton-Raphson iteration
        do {
            t = sqrt;
            sqrt = (t + (num / t)) / 2;
        } while (Math.abs(t - sqrt) > epsilon);

        System.out.println("Square root of " + num + " is: " + sqrt);
    }
}
