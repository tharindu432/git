public class LiList {
   private  ListNode head;
   private static class ListNode{
       private int data;
       private ListNode next;

       public ListNode(int data){
           this.data=data;
           this.next=null;
       }
   }

    public static void main(String[] args) {
        LiList lil=new LiList();
        lil.head=new ListNode(10);
        ListNode second=new ListNode(1);

    }
}







