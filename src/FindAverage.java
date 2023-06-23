public class FindAverage {
        double x;
        double y;   //x=7,y=9,z=10
        double z;

        public double get_avg(double a,double b,double c ){
                return (a+b+c)/3;


        }

        public static void main(String[] args) {
                FindAverage fd=new FindAverage();
                System.out.println(fd.get_avg(7,9,10));
        }




    }






