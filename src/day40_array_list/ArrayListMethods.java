package day40_array_list;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList= new ArrayList<>();
        System.out.println("is Empty: "+shoppingList.isEmpty());
        if(shoppingList.isEmpty()){
            System.out.println("list is empty, keep coding java");
        }
        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        if(shoppingList.isEmpty()){
            System.out.println("list is empty, keep coding java");
        }else{
            System.out.println("this is not empty, code java and go to mall");
        }
        int count = shoppingList.size();
        System.out.println("items to buy: "+count);
        System.out.println("is shoes in my list?: "+shoppingList.contains("shoes"));
    }
}
