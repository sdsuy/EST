/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santiago.erp_system;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago
 */
public class ProductDao {
    
    private static final String SEPARADOR = ",";
    private static final String DIRECOTRIO = "D:\\IFSul\\EST\\Products.csv";
    
    private static List<List<String>> records = new ArrayList<>();
    
    public ProductDao() {
        try {
            this.read();
        } catch (IOException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void read() throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(DIRECOTRIO))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(SEPARADOR);
                records.add(Arrays.asList(values));
            }
        }
    }

    public static List<List<String>> getRecords() {
        return records;
    }
    
}
