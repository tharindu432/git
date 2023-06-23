import java.util.InputMismatchException;
import java.util.Scanner;

public class uncheckedexception {
    public static void main(String[] args) {
        int num1=12;
        int num2=0;

        Scanner sn=new Scanner(System.in);
        System.out.println("enter the number 2 value: ");
        try {
            num2= sn.nextInt();
        } catch (InputMismatchException E){
            System.out.println("Invalid value for num2");
            return;
        }

        try {
            double answer = num1 / num2;
            System.out.println("answer is"+" " + answer);
        }catch (ArithmeticException E){
            System.out.println("error occured! ca not divided by zero");
        }

    }

}
