public class Temperature {
    public static void main(String[] args) {
        double farenheight =212;
        double celsius = 98.5;

        double f_to_c = (farenheight+32)/9;
        double c_to_f= 9*celsius/5+32;

        System.out.println("fereheight value after converting to celcius:"+f_to_c);
        System.out.println("celcius value after converting to farenheight:"+ c_to_f);

    }
}
