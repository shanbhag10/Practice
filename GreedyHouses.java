

public class GreedyHouses{

public static int towers(int[] houses,int d){

    int ctr=1;
    int y=houses[0] + d;
    System.out.println("Tower at - " +y);
    //int[] y=new int[];
    for(int i=1;i<houses.length;i++){

        if(houses[i]>y+d){
            y=houses[i]+d;
            ctr++;
            System.out.println("Tower at - " +y);
        }
    }

    return ctr;
}

public static void main(String[] args){

    int[] h={6,11,12,16,21,23};
    int d=4;

    int g= towers(h,d);

    System.out.println("Total number of towers: "+g);

}
}
