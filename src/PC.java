public class PC {
    public void typesofPC(){
        System.out.println("there are two different personal computera named as Desktop and laptop"
        );

    }


}
/* class Desktop extends PC{
    public void typesofDesktop(){
        System.out.println("desktop computers fall ito three main families named as tower,compact and all in one");

    }
} */

/*class Testinheritance{
    public static void main(String[] args) {
        Desktop d=new Desktop();
        d.typesofDesktop();
        d.typesofPC();
        laptop l =new laptop();
        l.typesofPC();
        l.typesofLaptop();
    }
}*/

class laptop extends PC{
    void typesofLaptop(){
        System.out.println("there are different laptop named as notebook,macbook,ultrabook,tablet");

    }

}

class tablet extends laptop{
    void typesoftablet(){
        System.out.println("there are different tablets named as convertible tablets,hybrid tablets and rugged tablets.");

    }
}

class testinheritance{
    public static void main(String[] args) {
        tablet t=new tablet();
        t.typesoftablet();
        t.typesofPC();
        t.typesofLaptop();
    }
}


