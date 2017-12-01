import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
  
    while(true){
      System.out.println("String 1");
    String str1=s.nextLine();
     System.out.println("String 2");
    String str2=s.nextLine();
    
    int g=replace(str1,str2);
    //System.out.println(g);
    
    int h=remove(str1,str2);
    //System.out.println(h);
    
    int k=remove(str2,str1);
    //System.out.println(k);
    int l=0;
    if(str1.equals(str2)){
      l=1;
    }
    
    if(g+h+k+l==1)
      System.out.println("true");
    else
      System.out.println("false");
    }
    
  }
  
  
  
  public static int remove(String s1, String s2){
    
    if(s1.length()-1!=s2.length()){
      return 0;
    }
    else {
    
      char[] c1=s1.toCharArray();
      char[] c2=s2.toCharArray();
      int ctr=0;
      int j=0;
      for(int i=0;i<c1.length;i++){
        if(j<c2.length){
        if(c1[i]==c2[j]){
          j++;
        }
        
        else{
          ctr++;
        }
        }
      }
      if(ctr>1)
        return 0;
    }
    return 1;
  }
  
  
  public static int replace(String s1, String s2){
    if(s1.length()!=s2.length()){
      return 0;
    }
    else {
      char[] c1=s1.toCharArray();
      char[] c2=s2.toCharArray();
      int ctr=0;
      for(int i=0;i<c1.length;i++){
        if(c1[i]!=c2[i]){
          ctr++;
        }
        
      }
      if(ctr>1)
        return 0;
    }
    return 1;
  }
}
