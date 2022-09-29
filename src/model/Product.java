package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity of product.
 *
 * @author Veronika Doroshkevich
 * @version 1.0
 */
@XmlRootElement
public class Product {

    int id;
    int price;
    String type;

    /**
     * Getter for the field id
     *
     * @return - value of field id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for the field id
     *
     * @param id - id of product
     */
    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for the field price
     *
     * @return - value of field price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Setter for the field price
     *
     * @param price - price of product
     */
    @XmlElement
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Getter for the field type
     *
     * @return - value of field type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter for the field type
     *
     * @param type - type of product
     */
    @XmlElement
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Convert to string
     *
     * @return - string of object
     */
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}

