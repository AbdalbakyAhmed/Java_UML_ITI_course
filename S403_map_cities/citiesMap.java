import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.*;


public class citiesMap {
    public static void main(String[] args) throws IOException {
            String pathToCsv = "/media/disk3/ITI_AI_materials/03_Java_UML_course/Java_UML_ITI_course/s403_map_cities/Cities.csv"; 
            List<String> list = new ArrayList<String>();
            BufferedReader br;
            br = new BufferedReader(new FileReader(pathToCsv));
            String line = br.readLine();
            // if (line != null) {
            //     System.out.println(line);
            // }
            do {
                line = br.readLine();
                if (line != null) {
                    String[] att = line.split(",");
                    for  (String part : att) {
                        System.out.print(part+" ");
                    }
                    System.out.println("");
                }
            } while(line!=null); 
            
        }
    
}



// import java.io.FileReader;
// import java.io.IOException;
// import java.nio.charset.StandardCharsets;
// import java.io.BufferedReader;
// import java.io.FileNotFoundException;


// public class citiesMap {
//     public static void main(String[] args) throws IOException {
//             BufferedReader br;
//             br = new BufferedReader(new FileReader("/media/disk3/ITI_AI_materials/03_Java_UML_course/Java_UML_ITI_course/s403_map_cities/Cities.csv"));
//             String line = br.readLine();
//             // if (line != null) {
//             //     System.out.println(line);
//             // }
//             do {
//                 line = br.readLine();
//                 if (line != null) {
//                     String[] att = line.split(",");
//                     for  (String part : att) {
//                         System.out.print(part+" ");
//                     }
//                     System.out.println("");
//                 }
//             } while(line!=null); 
//         }
    
// }
