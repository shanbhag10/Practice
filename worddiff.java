import java.util.*;
import java.io.*;


public class worddiff{

    public static void main(String[] args) throws IOException{

        Scanner s=new Scanner(new File("myfile.txt"));

        //String[] words = s.split(" ");
    
         
        
        List<String> lines = new ArrayList<String>();
        while (s.hasNextLine()) {
            lines.add(s.nextLine());
        }

        String[] arr = lines.toArray(new String[0]);

    

    
        System.out.println(arr[0]);
    }


}