import java.util.*;
import java.io.*;

public class palinperm{

    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        String str=s.nextLine();

        HashMap<Character, Integer> m= new HashMap<Character,Integer>();

        char[] c=str.toCharArray();

        for(int i=0;i<c.length;i++){
            if(m.containsKey(c[i])){
                m.put(c[i],m.get(c[i])+1);
            }
            else
                m.put(c[i],1);
        }
        boolean u=true;
        int j=0;
        for (Integer value : m.values()) {
            
            
            if(value%2!=0){
                if(j<1){
                    j++;
                }
                else
                {
                    u=false;
                    break;
                }
                    
            }
        }

        System.out.println(u);
        
    }
}
        

