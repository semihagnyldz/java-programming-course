package day18_conditions_practice_strings_intro;

public class CarLeasing {
    public static void main(String[] args) {
        String car= "mercedes";
        String model= "E";
        if(car.equals("mercedes")){
            if(model.equals("E")){
                System.out.println("leasing price is 500");
            }else if(model.equals("A")){
                System.out.println("leasing price is: 450");
            }

        }else{ // we can write also else if (car.equals("tesla"){
            if (car.equals("tesla")){
                if(model.equals("b")){
                    System.out.println("leasing price is 570");
                }else if(model.equals("C")){
                    System.out.println("the leasing price is 670");
                }
            }

        }

    }
}
