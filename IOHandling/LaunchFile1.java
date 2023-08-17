package IOHandling;

import java.io.File;

public class LaunchFile1 {
    public static void main(String[] args) throws Exception
    {
        
        // File file = new File("pw.txt");
        // System.out.println(file.exists()); // false

        // Creating new File
        // file.createNewFile();
        // System.out.println(file.exists()); // true

        File file1 = new File("Abhi");
        System.out.println(file1.exists());

        // Creating a Directory
        file1.mkdir();
        System.out.println(file1.exists());


    }
}
