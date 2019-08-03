/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Panisara.Pro
 */
public class hashMapSale {

    public static void main(String[] args) throws IOException {

        Hashtable< Integer, String> hash = new Hashtable< Integer, String>();
        BufferedReader rd = new BufferedReader(new FileReader("C:/swe690_dev/Sale.txt"));
        String line;

        int i = 0;
        while ((line = rd.readLine()) != null) {
            hash.put(i, line);
            i++;
        }
        for (int j = 0; j < hash.size(); j++) {
            System.out.println(hash.get(j));
        }

    }
}
