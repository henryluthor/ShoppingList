import java.util.HashSet;
import java.util.Scanner;

public class ShoppingList {
  public static void main(String[] args){
    String response = "Y";
    HashSet<String> shoppingList = new HashSet<String>();
    Scanner myScanner = new Scanner(System.in);

    while (response.toUpperCase().equals("Y")) {
      System.out.println("Do you wish to add item to the shopping list? (Y/N): ");
      response = myScanner.nextLine();
      if(response.toUpperCase().equals("Y")){
        System.out.println("Write item to the shopping list: ");
        String item = myScanner.nextLine();
        shoppingList.add(item);
      }
      else{
        myScanner.close();
        System.out.println("Shopping list: ");
        for(String i: shoppingList){
          System.out.println(i);
        }
      }
    }
    
  }
}