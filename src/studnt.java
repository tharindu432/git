import java.util.Scanner;

public class studnt {



    public static void main(String[] args) throws Exception {
        int attendance;
        int mid_mark;
        Scanner sn=new Scanner(System.in);
        studnt s=new studnt();
        System.out.println("enter the attendance: ");
        attendance=sn.nextInt();
        System.out.println("enter the mid semester mark: ");
        mid_mark=sn.nextInt();

        s.checkeligibility(attendance,mid_mark);
    }

    public void checkeligibility (int attendance,int mid_mark) throws Exception {
        if(attendance<80 || mid_mark<40){
            throw new Exception("you are not eligible...");
        }
        else {
            System.out.println("congratulations... you are eligible for the final examination");
        }

    }


}