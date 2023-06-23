public class Cast {
    public static void main(String[] args) {
        int x=5;
        double y=10.5;

        double x_to_double= x;

        long x_to_long= x;

        long x_to_float= x;

        float two_to_float= x_to_long;

        System.out.println(x_to_double);
        System.out.println(x_to_long);
        System.out.println(x_to_float);
        System.out.println(two_to_float);

        int y_to_int=(int)y;
        long y_to_long= (long) y;

        System.out.println(y_to_int);
        System.out.println(y_to_long);




    }


}
