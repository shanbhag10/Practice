import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
  
    while(true){
      System.out.println("String :");
    String str=s.nextLine();
    
    System.out.println(compress(str));
    }
  }
    
  public static String compress(String str){
    
    char[] c=str.toCharArray();
    int n=1;
    for(int i=0;i<c.length-1;i++){
      if(c[i]!=c[i+1]){
        n++;
      }
    }
    
    //System.out.println(n);
    
    int[] ct=new int[n];
    char[] l=new char[n];
    int j=0;
    for(int i=0;i<c.length-1;i++){
      if(c[i]==c[i+1]){
        l[j]=c[i];
        ct[j]++;
      }
      else{
        l[j]=c[i];
        j++;
      }
    } 
    String res="";
      for(int i=0;i<n;i++){
        res+=l[i];
        res+=(ct[i]+1);
      }
    
    return res;
  }

}
