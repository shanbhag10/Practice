class Main {
  public static void main(String[] args) {
    String s1="abababa";
    String s3="aba";
    String s2="cb";
    
    int count = (s1.length() - s1.replace(s3, "").length()) / s3.length();
    
    //System.out.println(count);
    
   System.out.println(subs(s1,s3));
   
   
   //System.out.println(subs2(s1,s3));
  }
  
  public static int subs(String s1,String s2){
    System.out.println();
    char[] c1=s1.toCharArray();
    char[] c2=s2.toCharArray();
    //Map<String,Character> m=new HashMap<String, Character>();
    
    int total=0;
    int j=0;
    for(int i=0;i<c1.length;i++){
      
      if(c1[i]==c2[j]){
          
          j++;
      }
      else{
        if(c1[i]==c2[0]){
          j=1;
        }
        else
          j=0;
      }
      
      if(j==c2.length){
        total++;
        i-=(c2.length-1);
        j=0;
        
      }
      
      
      }
      return total;
    }



public static int subs2(String str, String subStr)
{
int count = 0;
while (str.indexOf(subStr)>-1){
    str = str.replaceFirst(subStr, "");
    count++;
}
return count ;
}
}
