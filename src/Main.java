import controller.ShopController;
import model.Product;

import java.util.List;

/**
 * Main class.
 *
 * @author Veronika Doroshkevich
 * @version 1.0
 */
public class Main {

    /**
     * Programs entry point
     * @param args params
     */
    public static void main(String[] args) {
        ShopController shopController = new ShopController();

        // Find all products
        List<Product> allProducts = shopController.findAllProducts();
        System.out.println("All products:");
        printProducts(allProducts);

        // Find products by type
        List<Product> kettles = shopController.findProductsByType("Kettle");
        System.out.println("All kettles:");
        printProducts(kettles);

        // Find product with minimal cost
        Product product = shopController.findProductsWithMinimalCost();
        System.out.println("Product with minimal cost:");
        System.out.println(product.toString());
    }

    /**
     * Method for printing products
     * @param products - list of products
     */
    private static void printProducts(List<Product> products) {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}
