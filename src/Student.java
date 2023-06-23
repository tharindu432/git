import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        String firstname;
        String lastname;
        double weight;
        double height;
        double BMI;
        Student s= new Student();
        Scanner sn=new Scanner(System.in);
        System.out.println("enter the first name: ");
        firstname= sn.nextLine();
        System.out.println("enter the last name: ");
        lastname= sn.nextLine();
        System.out.println("enter the weight: ");
        weight= sn.nextDouble();
        System.out.println("enter the height: ");
        height=sn.nextDouble();

     String fullname= s.getfullname(firstname,lastname);
       BMI= s.getBMI(weight,height);

        System.out.println(fullname);
        System.out.println(BMI);
    }

    public String getfullname(String first,String last){
        return first.concat(" ").concat(last);
    }

    public double getBMI(double w, double h){
        return w/(Math.pow(h,2));
    }
}
