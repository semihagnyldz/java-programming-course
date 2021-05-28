package day30_arrays;

public class Must_Review_ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.67};
        String[] country = {"Brazil", "China", "Turkey", "France", "Germany", "Sweden", "Cuba", "Portugal", "Albania"};
        System.out.println("----- prices less than 100 -----");
        for (double eachPrice : prices) {
            if (eachPrice > 100.0) {
                System.out.print(eachPrice + " ");
            }

        }
        System.out.println();
        System.out.println("----prices between 10 and 70 inclusive----");
        for (double price: prices){ // prices is many price in it...but we are looking for specific double price.
            if (price>10 && price<70){
                System.out.print(price+" ");
            }
        }
        System.out.println();


        System.out.println("----count of the prices that are more than 50-----");
        int count=0; //bu loop un disinda durcak
        for(double countPrice: prices){
            if(countPrice>50){

                count++;

            }
        }
        System.out.println(count); // loop un diisnda durcak, yoksa her iteration da count u yazar. count u keep edip sonda print etmesini istiosan loop un disina yazicaksin

        System.out.println("----countries with name lenghts more than 7-inclusive");
        for(String nameMoreThanSeven: country){
            if(nameMoreThanSeven.length()>=7 && nameMoreThanSeven.endsWith("l")){
                System.out.println(nameMoreThanSeven);
            }
        }
    }

}
