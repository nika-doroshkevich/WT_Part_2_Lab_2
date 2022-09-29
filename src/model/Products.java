package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Entity of products.
 *
 * @author Veronika Doroshkevich
 * @version 1.0
 */
@XmlRootElement(name = "products")
@XmlAccessorType(XmlAccessType.FIELD)
public class Products {
    @XmlElement(name = "product")
    private List<Product> products = null;

    /**
     * Getter for the field products
     *
     * @return - value of field products
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Setter for the field products
     *
     * @param products - list of product
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
