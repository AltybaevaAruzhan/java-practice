import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

import java.util.Random;
public class BMI_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height(cm): ");
        double height = scanner.nextDouble();
        double BMI = weight*10000/(height*height);
        System.out.printf("\nYour BMI is %.2f\n", BMI);
        if(BMI<18.5){
            System.out.println("Underweight");
        }else if(BMI<=24.9){
            System.out.println("Normal");
        } else if(BMI<=29.9){
            System.out.println("Overweight");
        } else{
            System.out.println("Obese");
        }
    }

}
