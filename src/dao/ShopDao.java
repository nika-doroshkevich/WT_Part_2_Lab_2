package dao;

import model.Products;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Class for a data access object.
 *
 * @author Veronika Doroshkevich
 * @version 1.0
 */
public class ShopDao {

    /**
     * Method for getting products from XML
     *
     * @return products
     */
    public Products getProducts() {
        JAXBContext jaxbContext = null;
        Unmarshaller jaxbUnmarshaller = null;
        Products products = null;
        try {
            jaxbContext = JAXBContext.newInstance(Products.class);
            jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            products = (Products) jaxbUnmarshaller.unmarshal(new File("D:\\3_year\\5_semester\\WT\\MyLabs\\Lab2\\products.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return products;
    }
}
