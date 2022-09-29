package controller;

import model.Product;
import service.ShopService;

import java.util.List;

/**
 * Controller.
 *
 * @author Veronika Doroshkevich
 * @version 1.0
 */
public class ShopController {
    /**
     * Method for output list of  all products from XML
     *
     * @return - list of products
     */
    public List<Product> findAllProducts() {
        ShopService shopService = new ShopService();
        return shopService.findAllProducts();
    }

    /**
     * Method for output only kettles from XML
     *
     * @param type - type of product
     * @return - list of products by type
     */
    public List<Product> findProductsByType(String type) {
        ShopService shopService = new ShopService();
        return shopService.findProductsByType(type);
    }

    /**
     * Method for output product with minimal cost from XML
     *
     * @return - product with minimal cost
     */
    public Product findProductsWithMinimalCost() {
        ShopService shopService = new ShopService();
        return shopService.findProductsWithMinimalCost();
    }
}
