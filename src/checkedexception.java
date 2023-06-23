import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class checkedexception {
    public static void main(String[] args)  {
        FileInputStream file1;
        try {
             file1 = new FileInputStream("C://L2S1// coursera- html,css,js/myfile.txt");
        } catch (FileNotFoundException e){
            System.out.println("file not found!");
            return;
        }
        int c;
        try{
   while ((c=file1.read())!=-1) {
       System.out.print(( char) c);
   }
   file1.close();
   } catch (IOException K){
            System.out.println("file can not be read...");
        }
        }
}
