public class Account {
private String acc_no;
private String name;
private String email;
private String id;
private double amount;

public void setaccno(String acc_no){// setter method
  this.acc_no=acc_no;
}

public void setName(String name){
    this.name= name;
}

public void setEmail(String email){
    this.email=email;
}
public void setId(String id){
    this.id=id;
}
public void setAmount(double amount) throws Exception{
    if(amount>=0) {
        this.amount = amount;
    }
    else {
throw new Exception("value can not be less than zero");
    }
}

public double getamount(){//getter method
    return this.amount;
}

}

class bank{
    public static void main(String[] args)throws Exception {
        Account acc=new Account();
        acc.setaccno("56763421");
        acc.setName("tharindu chathuranga");
        acc.setAmount(45000.00);
        acc.setEmail("tharinduchaturanga432@gmail.com");
        acc.setId("19653568v");

        System.out.println("Amount is: "+acc.getamount());

    }
}
