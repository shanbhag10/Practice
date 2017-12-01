import java.io.*;
import java.util.*;

public class Mapping{
    
    public static void main(String[] args){
    Map<String,Integer> M = new HashMap<String,Integer>();

    M.put("Saurabh",4);
    M.put("Maddy",7);
    M.put("Varun",69);
    M.put("Manghat",10);

    System.out.println(M.entrySet());

    M.remove("Varun");
    M.replace("Maddy",M.get("Maddy")+4);

    System.out.println(M.entrySet());

    if(M.containsValue(11)){
        System.out.print();
    }
}

}

Map<Integer, Integer> map = new HashMap<Integer, Integer>();

// Iterating over keys only
for (Integer key : map.keySet()) {
    System.out.println("Key = " + key);
}

// Iterating over values only
for (Integer value : map.values()) {
    System.out.println("Value = " + value);
}