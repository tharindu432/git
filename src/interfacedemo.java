public class interfacedemo {

}
interface test1{
    final int x=7;
    public void m1();
    void m2();
    void m3();
}
class ABC implements test1,test2{
    @Override
    public void m1(){
        System.out.println("test1");
    }

    @Override
  public   void m2(){
        System.out.println("test2");
    }

    @Override
   public void m3(){
        System.out.println("test3");
    }
    @Override
    public void m4(){
        System.out.println("test4");
    }

}

interface test2{
    int y=9;
    void m4();
}