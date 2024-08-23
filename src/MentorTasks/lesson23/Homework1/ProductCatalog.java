package MentorTasks.lesson23.Homework1;


import java.util.HashSet;


public class ProductCatalog {

    HashSet<Product> uniqueProducts = new HashSet<>();

    public void addProduct(Product product){
        uniqueProducts.add(product);
    }
    public void removeProduct(String productName) throws ProductNotFoundException {

        boolean isFound = false;
        for (Product product: uniqueProducts){
            if(product.getName().equals(productName)) {
                uniqueProducts.remove(product);
                isFound = true;
            }
        }
        if(!isFound){
            throw new ProductNotFoundException("Product not found!");
        }
    }
   public boolean containsProduct(String productName) throws ProductNotFoundException {
        for (Product product: uniqueProducts){
            if(product.getName().equals(productName)) {
                System.out.println("Producut is found: " +product);
                return true;
            }
        }
       throw new ProductNotFoundException("Product not found!");
    }

    public void printCatalog() throws ProductNotFoundException {
        if(uniqueProducts.isEmpty()){
            throw new ProductNotFoundException("Product not found!");
        }
        for (Product product: uniqueProducts){
            System.out.println(product);
        }
    }
}
