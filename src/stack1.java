import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack <String> stack=new Stack<String>();
        stack.push("tharindu");
        stack.push("chathu");
        stack.push("nipuni");
        stack.push("donga");
        System.out.println(stack.empty());
       // System.out.println(stack);
        String myfavGame=stack.pop();
        System.out.println(myfavGame);
        System.out.println(stack);
        //peek method
        //we can get the top element by using peek method
        System.out.println(stack.peek());
        //search
        System.out.println(stack.search("nipuni"));



    }
}
