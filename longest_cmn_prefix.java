class Main {
  
  
    public static void main(String[] args){
      
        String[] arr = {"Sarubh","Sarubha","Sarubnh","Saras"};
        
        System.out.println(longestCommonPrefix(arr));
        
        System.out.println(lcp(arr,0));
    }
    

    public static int smallest(String[] strs){
      int min=Integer.MAX_VALUE;
      for(int i=0;i<strs.length;i++){
        if(strs[i].length()<min)
          min=strs[i].length();
      }
      return min;
    }
    
    
    public static String longestCommonPrefix(String[] strs) {
       
       String s="";
       int min=Integer.MAX_VALUE;
      for(int i=0;i<strs.length;i++){
        if(strs[i].length()<min)
          min=strs[i].length();
      }
       int i;
       for(i=0;i<min;i++){
         char c=strs[0].charAt(i);
         boolean b=false;
         for(int j=0;j<strs.length;j++){
           
          if(strs[j].charAt(i)==c)
            b=true;
          else{
            b=false;
            break;
          }
          
         }
         if(b)
            s+=strs[0].charAt(i);
         else
            break;
         }
        return s;
}
}

/*
S a r u b h 
S a r u h
S a r u n h*/
