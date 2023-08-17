package IOHandling;
import java.io.*;

public class LaunchFR {
    public static void main(String[] args) throws IOException {
        
        File dir = new File("PW");
        File file = new File(dir,"pw.txt");

        FileReader fr = new FileReader(file);

        char ch[] = new char[(int)file.length()];

        fr.read(ch);

        for(char name : ch)
        {
            System.out.print(name);
        }
        // int i = fr.read();

        // // System.out.println((char)i);

        // while (i!=-1) 
        // {
        //     System.out.print(i+"---> ");
        //     System.out.println((char)i);
        //     i = fr.read();
        // }
    }
}
