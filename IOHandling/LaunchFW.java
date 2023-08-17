package IOHandling;
import java.io.*;

public class LaunchFW {
    public static void main(String[] args) throws IOException {
        
        File dir = new File("PW");
        //dir.mkdir();

        File file = new File(dir,"pw.txt");
        // file.createNewFile();

        FileWriter fw = new FileWriter(file , true);

        fw.write("Java");
        fw.write("\n");
        fw.write(65);
        fw.write("\n");
        fw.write(97);
        fw.write("\n");

        char ch[] = {'j','a','v','a'};
        fw.write(ch);
        fw.write("\n");

        fw.close();
        // fw.flush();

        System.out.println("Open pw.txt to see result");



    }
}
