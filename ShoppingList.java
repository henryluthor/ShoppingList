import java.util.HashSet;
import java.util.Scanner;

public class ShoppingList {
  public static void main2(String[] args){
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

  public static void main(String[] args){
    int response;
    HashSet<String> shoppingList = new HashSet<String>();
    Scanner myScanner = new Scanner(System.in);
    String item;

    do{
      System.out.println("What do you want to do?");
      System.out.println("1 - Add item to shopping list");
      System.out.println("2 - Remove item from shopping list");
      System.out.println("3 - Show shopping list");
      System.out.println("4 - Exit");
      response = myScanner.nextInt();

      switch (response) {
        case 1:
          // Add to list
          System.out.println("Write item to the shopping list: ");
          item = myScanner.nextLine();
          shoppingList.add(item);
          System.out.println(item + " added to the list.");
          break;
        case 2:
          // Remove from list
          System.out.println("Write item you want to remove from the shopping list: ");
          item = myScanner.nextLine();
          shoppingList.remove(item);
          System.out.println("Done. If " + item + " was in the list it has been removed.");
          break;      
        case 3:
          // Show shopping list
          System.out.println("Shopping list:");
          for (String i : shoppingList) {
            System.out.println(i);            
          }
          break;
        case 4:
          myScanner.close();
          return;
        default:
          myScanner.close();
          break;
      }
    }
    while(response != 4);
  }
}