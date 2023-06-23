public class Doctor {
    double bsal;
    double hrate;


    public double getmonthlypayment(double value){
        return this.bsal+ this.hrate*value;
    }
}

class specialist extends Doctor{
    double channelcharge,allowance;
    @Override
    public  double getmonthlypayment(double value){
        return super.bsal+this.allowance+this.channelcharge*value;
    }
}

class test{
    public static void main(String[] args) {
        specialist s=new specialist();
       double ssal= s.getmonthlypayment(5);
        Doctor d=new specialist();

    }
}
