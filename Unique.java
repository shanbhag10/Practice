import java.util.*;
import java.io.*;

public class Unique{

    public static void main(String[] args){


        Scanner s=new Scanner(System.in);
        String str=s.nextLine();

        System.out.println(uniqueMaps(str));

        System.out.println(uniqueArr(str));

    }


    public static Boolean uniqueArr(String str){

        char[] c=str.toCharArray();

        for(int i=1;i<c.length;i++){
            for(int j=0;j<i;j++){
                if(c[i]==c[j]){
                    return false;
                    
                }
            }
        }
        return true;

    }

    public static Boolean uniqueMaps(String str){
        char[] c=str.toCharArray();

        HashMap<Character,Integer> m=new HashMap<Character,Integer>();
        Boolean b=true;
        for(char f:c){
            if(m.containsKey(f)){
                b=false;
                break;
            }
            else
                m.put(f,0);


        }
        return b;
    }
    
}