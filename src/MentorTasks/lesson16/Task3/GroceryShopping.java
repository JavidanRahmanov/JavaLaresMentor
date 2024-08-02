package MentorTasks.lesson16.Task3;

import java.util.ArrayList;
import java.util.List;

public class GroceryShopping {
     private List<Product> shoppingList;

    public GroceryShopping() {
        this.shoppingList = new ArrayList<>();
    }

    public List<Product> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<Product> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public void addProduct(Product product){

           shoppingList.add(product);
    }

  public int calculateTotalCost(){
       int totalCost = 0;
        for (Product e: shoppingList){

            totalCost+= e.getCost();

        }
        return totalCost;
   }

  public void printReceipt(){

        for(Product e: shoppingList){

            System.out.println(e);
        }
   }
}
