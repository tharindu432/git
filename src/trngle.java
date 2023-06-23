public class trngle {
    public static void main(String[] args) {
    trngle t=new trngle();
    double a1= t.area(5,4,7);
    double a2=t.area(5,4);
        System.out.println(a1);
        System.out.println(a2);

    }

    public double area(double height, double base){
        return  0.5*height*base;

    }

    public  double area(double a,double b,double c){
        double s= (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
