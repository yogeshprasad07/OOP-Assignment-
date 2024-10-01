import java.util.Scanner;

public class PhysicsSolver {

    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    public static double calculateAcceleration(double force, double mass) {
        return force / mass;
    }

    public static double calculateVelocity(double initialVelocity, double acceleration, double time) {
        return initialVelocity + acceleration * time;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Physics Problem Solver!");

        System.out.print("Enter mass (kg) for Force calculation: ");
        double mass = scanner.nextDouble();
        System.out.print("Enter acceleration (m/s²): ");
        double acceleration = scanner.nextDouble();
        double force = calculateForce(mass, acceleration);
        System.out.printf("Calculated Force: %.2f N%n", force);

        System.out.print("Enter force (N) for Acceleration calculation: ");
        double forceForAcceleration = scanner.nextDouble();
        System.out.print("Enter mass (kg): ");
        double massForAcceleration = scanner.nextDouble();
        double calculatedAcceleration = calculateAcceleration(forceForAcceleration, massForAcceleration);
        System.out.printf("Calculated Acceleration: %.2f m/s²%n", calculatedAcceleration);

        System.out.print("Enter initial velocity (m/s): ");
        double initialVelocity = scanner.nextDouble();
        System.out.print("Enter time (s): ");
        double time = scanner.nextDouble();
        System.out.print("Enter acceleration (m/s²): ");
        double velocityAcceleration = scanner.nextDouble();
        double velocity = calculateVelocity(initialVelocity, velocityAcceleration, time);
        System.out.printf("Calculated Velocity: %.2f m/s%n", velocity);

        scanner.close();
    }
}
