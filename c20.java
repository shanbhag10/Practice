import java.util.*;
import java.io.*;

public class c20{

    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        String str=s.nextLine();

        System.out.println(c20(str));
        System.out.println();
        System.out.println(s20(str));
    }

    public static String s20(String str){

        String[] ss=str.split(" ");
        String result=ss[0];
        for(int i=1;i<ss.length;i++){
            result+="%20"+ss[i];
        }

        return result;
    }

    public static String c20(String str){
        char[] c=str.toCharArray();
        char[] d=new char[c.length+10];

        for(int i=0;i<c.length;i++){
            d[i]=c[i];
        }

        for(int i=c.length;i<d.length;i++){
            d[i]='_';
        }


        for(int i=0;i<d.length;i++){
            if(d[i]==' '){
                d[i]='%';
                for(int j=d.length-1;j>i;j--){
                    d[j]=d[j-2];
                }
                d[i+1]='2';
                d[i+2]='0';
            }
        }
        String result=new String(d);
        return result;
    }

}