public class abstractclass {
    public static void main(String[] args) {
        circle c= new circle();
      double x1= c.getarea(7);

       double x2= c.getperimeter(7);
        square s=new square();
        s.getarea(5);
        s.getperimeter(5);

        System.out.println();
    }
}

abstract class shape{
    public abstract double getarea(double value);
    public abstract double getperimeter(double value);


}
 class circle extends shape{
    @Override
     public  double getarea(double value){
        double area=Math.PI*value*value;
        return area;
    }

    @Override
     public double getperimeter(double value){
        double peri =2*Math.PI*value;
        return peri;
    }

}

class square extends shape {
 @Override
    public double getarea(double value){
     double area= value*value;
     return area;
 }

 @Override
    public  double getperimeter(double value){
     double peri= 4*value;
     return peri;
 }





}