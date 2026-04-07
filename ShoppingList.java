import java.util.HashSet;
import java.util.Scanner;

public class ShoppingList {

  public static void ShoppingListV1(){
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


  public static void ShoppingListV2(){
    int response;
    HashSet<String> shoppingList = new HashSet<String>();
    Scanner myScanner = new Scanner(System.in);
    String item;

    do{
      System.out.println("What do you want to do?");
      System.out.println("1 - Add item to shopping list");
      System.out.println("2 - Remove item from shopping list");
      System.out.println("3 - Show shopping list");
      System.out.println("4 - Clear shopping list");
      System.out.println("5 - Exit");

      try{
        // response = myScanner.nextInt();
        // myScanner.nextLine(); // necessary buffer cleanup after reading int
        response = Integer.parseInt(myScanner.nextLine()); // Avoids buffer cleanup problem, reads line break automatically

        switch (response) {
          case 1:
            // Add to list
            System.out.println("Write item to the shopping list: ");
            // using toLowerCase to avoid duplicates, because although HashSet already does not allow duplicates it is also case sensitive
            // so "Bread" and "bread" would be considered different
            item = myScanner.nextLine().toLowerCase().trim();
            // .add() returns false if item already exist
            if(shoppingList.add(item)){
              System.out.println(item + " added.");
            }
            else{
              System.out.println(item + " is already in the list.");
            }
            break;
          case 2:
            // Remove from list
            System.out.println("Write item you want to remove from the shopping list: ");
            item = myScanner.nextLine().toLowerCase().trim();
            if(shoppingList.remove(item)){
              System.out.println(item + " removed.");
            }
            else{
              System.out.println(item + " was not found.");
            }
            break;      
          case 3:
            // Show shopping list
            System.out.println("Shopping list:");
            if(shoppingList.isEmpty()){
              System.out.println("The shopping list is empty.");
            }
            else{
              for (String i : shoppingList) {
                System.out.println(i);            
              }
              // System.out.println("Shopping list: " + shoppingList);
            }            
            break;
          case 4:
            // Clear the shopping list
            shoppingList.clear();
            System.out.println("The shopping list have been cleared.");
            break;
          case 5:
            // Exit
            System.out.println("Goodbye!");
            break;
          default:
            System.out.println("Invalid option");
            break;
        }
      }
      catch(NumberFormatException ex){
        // If user enters a character instead of a number for main manu it enter this exception
        System.out.println("Error: Please enter a valid NUMBER.");
        response = 0; // Setting response to 0 so the loop continues
      }
      
      System.out.println("");      
      
    }
    while(response != 5);

    myScanner.close();
  }


  public static void main(String[] args){
    // ShoppingListV1();
    ShoppingListV2();
  }
}