package IOHandling;
import java.io.*;

public class LauchFile2 {
    public static void main(String[] args) throws IOException 
    {
        
        // File dir = new File("PWJAVA");
        // System.out.println(dir.isDirectory());
        // dir.mkdir();
        // System.out.println(dir.isDirectory());


        // File file = new File(dir,"abhi.txt");
        // file.createNewFile();
        // System.out.println(file.isFile());

        int count = 0;

        File file = new File("PWJAVA");

        String str[] = file.list();

        for(String name : str)
        {
            count++;
            System.out.println(name);
        }

        System.out.println(count);
    }
}
