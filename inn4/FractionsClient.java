import java.util.Scanner;

public class FractionsClient {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Type '-1' to exit:");

            System.out.print("First fraction numerator: ");
            int numerator = scanner.nextInt();
            if (numerator == -1) {
                break;
            }
            System.out.print("First fraction denominator: ");
            int denominator = scanner.nextInt();
            final Fraction firstFraction = new Fraction(numerator, denominator);

            System.out.println("");

            System.out.print("Second fraction numerator: ");
            numerator = scanner.nextInt();
            System.out.print("Second fraction denominator: ");
            denominator = scanner.nextInt();
            final Fraction secondFraction = new Fraction(numerator, denominator);

            System.out.println("Enter action you want to perform\n 1: Add\n 2: Subtract\n 3: Multiply\n 4: Divide");
            final int action = scanner.nextInt();

            switch (Integer.valueOf(action)) {
                case 1:
                    System.out.println("\nAdding:");
                    System.out.print(firstFraction + " + " + secondFraction + " = ");
                    firstFraction.add(secondFraction);
                    System.out.println(firstFraction + "\n");
                    break;
                case 2:
                    System.out.println("\nSubtracting:");
                    System.out.print(firstFraction + " - " + secondFraction + " = ");
                    firstFraction.subtract(secondFraction);
                    System.out.println(firstFraction + "\n");
                    break;
                case 3:
                    System.out.println("\nMultiplying:");
                    System.out.print(firstFraction + " * " + secondFraction + " = ");
                    firstFraction.multiply(secondFraction);
                    System.out.println(firstFraction + "\n");
                    break;
                case 4:
                    System.out.println("\nDividing:");
                    System.out.print(firstFraction + " / " + secondFraction + " = ");
                    firstFraction.divide(secondFraction);
                    System.out.println(firstFraction + "\n");
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
}