import java.util.*;

class Main {
  public static void main(String[] args) {
    
    System.out.print("Number?");
    Scanner s=new Scanner(System.in);
    int n = s.nextInt();
    s.nextLine();
    HashMap<String,int[]> m=new HashMap<String,int[]>();
    for(int i=0;i<n;i++){
      String name=s.nextLine();
      int marks=s.nextInt();
      s.nextLine();
      
      if(m.containsKey(name)){
         int[] a=m.get(name);
         a[0]=a[0]+marks;
         a[1]++;
         m.put(name,a);
      }
      else{
         int[] a=new int[2];
         a[0]=marks;
         a[1]=1;
         m.put(name,a);
      }
    }
    
    double best=0.0;
for (int[] a : m.values()) {
  
    double avg=a[0]/a[1];
    //System.out.println(avg);
    if(avg>best){
      best=avg;
      
    }
    
}

      System.out.println(best);
    
    }
    
    
  }
