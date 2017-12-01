class dupli {
  public static void main(String[] args) {
   
    int[] a={1,2,2,2,3,3,3,3,4,4,4,6,6,7,7,8,8};
    
    int n=a.length;
    int i=0;
    int j=1;
    
    
    while(j<n){
      if(a[j]>a[i]){
        i++;
        a[i]=a[j];
        //System.out.println(a[i]);
        j++;
      }
      else{
        j++;
      }
      
      
    }
    
    for(int t=0;t<=i;t++){
      System.out.println(a[t]);
    }
  }
}


