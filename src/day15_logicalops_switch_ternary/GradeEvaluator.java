package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        String grade= "h";
        if (grade.equals("A") || grade.equals("B") || grade.equals("C")){
            System.out.println("passed!");
        } else if(grade.equals("D")){
            System.out.println("retake it!");
        }else if (grade.equals("E")){
            System.out.println("FAIL");
        }else{
            System.out.println("Invalid grade");
            /*
            this below also works:
            char grade;
            if(grade=='A' || grade== 'B' || grade=='C'){
            System.out.println("passed!");
            }else if(grade=='D'){
            System.out.println("retake it!");
            }else if(grade=='E'){
            System.out.println("FAIL");
            } else{
            System.out.println("invalid grade");

             */
        }
    }
}
