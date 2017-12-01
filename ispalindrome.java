class Main{
  
    public static void main(String[] arg){
      int h=1011101;
      System.out.println(reverse(h));
      System.out.println(isPalindrome(h));
      
    }
  
  
    public static boolean isPalindrome(int x) {
      
      if(x == reverse(x))
          return true;
          
      return false;
        
    }
    
    
    public static int reverse(int x){
      int g=x%10;
      while(x>0){
        x=x/10;
        g=g*10+x%10;
      }
      return g/10;
    }
}
