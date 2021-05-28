package day05_primitives_concatanation;

public class UsingVariables {
    public static void main(String[] args){
        int n1= 55;
        int n2= n1;
        int n3= n2;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        int inthirasZipCode= 22182;
        int parvinsZipCode= inthirasZipCode;
        System.out.println(parvinsZipCode);

        inthirasZipCode= 12700;
        System.out.println(inthirasZipCode);
        System.out.println(parvinsZipCode);

        parvinsZipCode= 34890;
        System.out.println(parvinsZipCode);
    }
}
