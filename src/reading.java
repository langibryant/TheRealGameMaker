import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.io.*;


public class reading {

    String home = System.getProperty("user.home") + "/database.txt";


    public void write(String toWrite){
        try(FileWriter fw = new FileWriter(home, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(toWrite);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read(){
        try {
            FileReader in = new FileReader(home);
            BufferedReader br = new BufferedReader(in);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException i){
            i.printStackTrace();
        }
    }


}
