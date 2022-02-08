import java.util.Scanner;

public class Wk4Q1Instance {
    
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter your weight in pounds: ");
            double weight = sc.nextDouble();

            System.out.println("Please enter your height in inches: ");
            double height = sc.nextDouble();

            Wk4Q1Class bmi = new Wk4Q1Class(weight, height);

            System.out.println("BMI is " + bmi.calculateBMI());
            bmi.BMIInterpretation();

            sc.close();
    }
}
