package service;

import dao.ShopDao;
import model.Product;
import model.Products;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Service.
 *
 * @author Veronika Doroshkevich
 * @version 1.0
 */
public class ShopService {

    /**
     * Method for output list of  all products from XML
     *
     * @return - list of products
     */
    public List<Product> findAllProducts() {
        ShopDao shopDao = new ShopDao();
        Products products = shopDao.getProducts();
        return products.getProducts();
    }

    /**
     * Method for output only kettles from XML
     *
     * @param type - type of product
     * @return - list of products by type
     */
    public List<Product> findProductsByType(String type) {
        ShopDao shopDao = new ShopDao();
        Products products = shopDao.getProducts();
        return products.getProducts().stream()
                .filter(product -> product.getType().equals(type))
                .collect(Collectors.toList());

    }

    /**
     * Method for output product with minimal cost from XML
     *
     * @return - product with minimal cost
     */
    public Product findProductsWithMinimalCost() {
        ShopDao shopDao = new ShopDao();
        Products products = shopDao.getProducts();
        return products.getProducts().stream()
                .min(Comparator.comparingInt(Product::getPrice))
                .orElse(null);
    }
}
