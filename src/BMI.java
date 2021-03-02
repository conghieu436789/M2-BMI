import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight is: ");
        weight = Scanner.nextDouble();
        System.out.println("Your height is: ");
        height = Scanner.nextDouble();
        bmi = weight /Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18)
            System.out.printf("%-20.1f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.1f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.1f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.1f%s", bmi, "Obese");
    }
}
