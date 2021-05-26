import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class app {
    public static void main(String[] args)
    {
        // Using Console to input data from user
        String _str ;
        String stop = "stop";
        List<String> list = new ArrayList<String>();
        // 
        do {
            // Using Console to input data from user
            _str = System.console().readLine();
            System.out.println("You entered string " + _str);  
            if (! _str.equalsIgnoreCase(stop)) {
                list.add(_str);
            }          
        } while (! _str.equalsIgnoreCase(stop));
        System.out.println(list);
        
        // 
        try {
            FileWriter writer = new FileWriter("output.txt");
            for (String string : list) {
                writer.write(string+"\n");
            }
            writer.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
    }
}