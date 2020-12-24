/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santiago.erp_system;

import java.util.List;

/**
 *
 * @author Santiago
 */
public class ERPSystem {
    public static void main(String[] args) {
        System.out.println("Bienvenido a ERP System");
        ProductDao dao = new ProductDao();
        for(List<String> record: dao.getRecords()) {
//            for(String cell: record) {
//                System.out.print(cell);
//            }
//            System.out.print("\n");
            System.out.println(record.get(0));
        }
    }
}
