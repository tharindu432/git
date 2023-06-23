import java.util.Scanner;

public class myexception {
    public static void main(String[] args) {
        int input1;
        int input2;

        Scanner sn=new Scanner(System.in);
        System.out.println("enter the first input: ");
        input1= sn.nextInt();
        System.out.println("enter the second input: ");
        input2= sn.nextInt();

        myexception m= new myexception();
        try {
            m.calculate(input1,input2);
        } catch (ArithmeticException A){
            System.out.println("error....number divided by zero...");

        }
        catch (ArrayIndexOutOfBoundsException AQ){
            System.out.println("another error occured...");
        }




    }
    void calculate(int input1, int input2)throws ArithmeticException,ArrayIndexOutOfBoundsException {
        int[] arr={1,2,3,4,5};
        int i;

        i=input1/input2;
        System.out.println(arr[i]);



    }
}
