/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author INT670
 */
public class JavaCollectionLab {

    /**
     * @param args the command line arguments
     */
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader rd = new BufferedReader(new FileReader("C:/swe690_dev/Sale.txt"));
        String line = "";
        int i = 0;
        System.out.println("==============================Map=====================================");
        
        HashMap<String, String> hMap = new HashMap<>(30);
        
        //hMap.put(i, line);
         
         long time = System.nanoTime(); 
        while ((line = rd.readLine()) != null) {
            hMap.put(Integer.toString(i), line);
            i++;
        }
      
         
        for(HashMap.Entry m:hMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        
        long endtime = System.nanoTime(); 
        long curtime = endtime-time;
        System.out.println(curtime);
        //System.out.println(endtime);
        
        // 1 second = 1_000_000_000 nano seconds
        double elapsedTimeInSecond = (double) curtime / 1_000_000_000;

        System.out.println(elapsedTimeInSecond + " seconds");

        // TimeUnit
        long converttime = TimeUnit.SECONDS.convert(curtime, TimeUnit.NANOSECONDS);

        System.out.println(converttime + " seconds");

        
        
        System.out.println("=================================Linked Map============================================");
        
        LinkedHashMap<String, String> lMap = new LinkedHashMap<>(30);
        
         long timelMap = System.nanoTime(); 
        while ((line = rd.readLine()) != null) {
            lMap.put(Integer.toString(i), line);
            i++;
        }
        
        for(HashMap.Entry m:lMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        } 
        
        
         long endtimelMap = System.nanoTime(); 
        long curtimelMap = endtimelMap-timelMap;
        System.out.println(curtimelMap);
        //System.out.println(endtime);
        
        // 1 second = 1_000_000_000 nano seconds
        double elapsedTimeInSecondlMap = (double) curtimelMap / 1_000_000_000;

        System.out.println(elapsedTimeInSecondlMap + " seconds");

        // TimeUnit
        long convertcurtimelMap = TimeUnit.SECONDS.convert(curtimelMap, TimeUnit.NANOSECONDS);

        System.out.println(convertcurtimelMap + " seconds");
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("==============================Tree Map=============================================");
        
        TreeMap<String, String> tMap = new TreeMap<>();
         long timetMap = System.nanoTime(); 
        while ((line = rd.readLine()) != null) {
            tMap.put(Integer.toString(i), line);
            i++;
        }
        
        for(HashMap.Entry m:tMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
         long endtimetMap = System.nanoTime(); 
        long curtimetMap = endtimetMap-timetMap;
        System.out.println(curtimetMap);
        //System.out.println(endtime);
        
        // 1 second = 1_000_000_000 nano seconds
        double elapsedTimeInSecondtMap = (double) curtimetMap / 1_000_000_000;

        System.out.println(elapsedTimeInSecondtMap + " seconds");

        // TimeUnit
        long converttimetMap = TimeUnit.SECONDS.convert(curtimetMap, TimeUnit.NANOSECONDS);

        System.out.println(converttimetMap + " seconds");
    }
    
    
}
