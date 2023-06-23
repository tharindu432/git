public class shapes {
    public static void main(String[] args) {
        shapes1[] s=new shapes1[2];
rectangle r=new rectangle(4,7);
circule c=new circule(7);
 s[0]=r;
 s[1]=c;
 for (int i=0;i<2;i++){
     System.out.println(s[i].getarea());
     System.out.println(s[i].getcircumference());
 }

    }
}
interface  shapes1{
    double getarea();
    double getcircumference();
}

class rectangle implements shapes1{

    double length;
    double width;
    rectangle(double length,double width){
        this.width=width;
        this.length=length;

    }

    @Override
    public double getarea(){
       return this.length* this.width;
    }
    @Override
    public  double getcircumference(){
return 2*(length+width);
    }
}

class  circule implements shapes1{
    double radius;

    circule(double radius){
        this.radius=radius;
    }
    @Override
    public double getarea(){
return Math.PI*radius*radius;
    }
    @Override
    public double getcircumference(){
return  2*Math.PI *radius;
    }

}