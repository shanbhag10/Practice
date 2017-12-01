class Solution {
    public static String longestCommonPrefix(String[] strs) {
       
       String s="";
       int min=Integer.MAX_VALUE;
      for(int i=0;i<strs.length;i++){
        if(strs[i].length()<min)
          min=strs[i].length();
      }
       int i;
       for(i=0;i<min;i++){
         char c=strs[1].charAt(i);
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
