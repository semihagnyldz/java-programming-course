package day13_conditional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry= false;
        if(isHungry==true){
            //or we can do: if(isHungry) bc ishungry is already boolean yani comparison. if in icine compariosn yaziyoruz hep.
            System.out.println("I am hungry, I will go get sth to eat");
        }else{
            System.out.println("I am not hungry, I will keep coding java");
        }
        double price= 130.44;
        //double budget= 200.0;
        boolean isAfforable= price<=200.0; //budget is 200
        if(isAfforable){
            System.out.println("I can afford it, lets buy");
        }else{
            System.out.println("Too expensive, lets keep coding java");
        }

        //boolean isSomething= true or false diyebilirsin OR
        //boolean isSomething= price<=100 de diyebilirsin.
        //if statement is also called flow control

        boolean isRemoteJob= true;
        //if it NOT remoteJob print "Sorry I am not interested"
        if(isRemoteJob!=true){ //so this condition is false now. //you can also write if(!isRemoteJob) or if(isRemoteJob==false)
            //negative check, put !.
            System.out.println("Sorry I am not interested");
        }else{
            System.out.println("Sure I am interested , what is the interview process?");
        }

    }
}
