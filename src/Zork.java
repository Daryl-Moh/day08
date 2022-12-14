import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



public class Zork {
    public static void main(String[] args) throws IOException {
        
        String fileName = "zork.txt";
        System.out.printf("Processing %s\n", fileName);

        // Read the file 
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        ArrayList data = new ArrayList<>();

        String line = br.readLine();

    
            while(br.readLine() != null) {

                data.add(line);
                
            }
          
    
        for (Integer i=0; i<data.size(); i++) {

            System.out.println(data.get(i));
        }

    }

}

