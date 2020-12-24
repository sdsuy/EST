/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santiago.erp_system;

//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Santiago
 */
public class ProductDaoTest {
    
//    public ProductDaoTest() {
//    }
//    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }

    @Test
    public void testColumNames() {
        
        ProductDao dao = new ProductDao();
        String[] columnNames = new String[] { "Id", "prices.amountMax", "prices.amountMin", "prices.availability", "prices.condition", "prices.currency", "prices.dateSeen", "prices.isSale", "prices.merchant", "prices.shipping", "prices.sourceURLs", "asins", "brand", "categories", "dateAdded", "dateUpdated", "ean", "imageURLs", "keys", "manufacturer", "manufacturerNumber", "name", "primaryCategories", "sourceURLs", "upc", "weight", "Column1", "_1", "_2", "_3", "_4" };
        
        int i = 0;
        for(String column: columnNames) {
            System.out.println(column + " | " + dao.getRecords().get(0).get(i));
            assertTrue(dao.getRecords().get(0).get(i).contains(column));
            i++;
        }
//        fail("The test case is a prototype.");
    }
    
}
