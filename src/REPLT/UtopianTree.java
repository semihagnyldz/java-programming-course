package REPLT;

public class UtopianTree {
    public static void main(String[] args) {
        /*
        The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year.
Show 10 years of growth of the Utopian Tree.
Output:

year 1 - growth 1 cm
tree size: 1cm
year 2 - growth 1 cm
tree size: 2cm
year 3  - growth 1 cm
tree size:3cm

year 4 - growth 2 cm
tree size: 5cm
for( int i = 0; i<3; i++ ){
        treeHeight = treeHeight + 1;
        System.out.println("year " + (i+1) + " - growth 1 cm");
        System.out.println("tree size: " + treeHeight + "cm");
         */
        int treeSize=0;
        int grows=0;
        for(int i=1; i<=3; i++){
            grows=grows+1;
            System.out.println("year "+i+" - growth 1 cm");
            System.out.println("tree size: "+grows+"cm");
        }
        for(int i=4; i<=6; i++){
            grows+=2;
            System.out.println("year "+i+" - growth 2 cm");
            System.out.println("tree size: "+grows+"cm");
        }

    }
}
