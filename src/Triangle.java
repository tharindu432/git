 class Triangle {
        double height;   ///global variable
        double base;
        double hypotenuse;

        public double getArea(double h,double b){//local variable
              return b*h/2;
        }



         public static void main(String[] args) {
                 Triangle t=new Triangle();  // name of the constructor shold be same as the class name
                 System.out.println(t.getArea(5,8));




         }




}



