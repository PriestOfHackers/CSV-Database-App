/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webtonicassessment;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

/**
 *
 * @author Paseka
 */
public class CSVFileLoader {
    
    
    public static void main(String[] args){
    
    String path ="C:\\Users\\Paseka\\Documents\\Sample.csv";
    String line = "";
    
    try {
        BufferedReader br = new BufferedReader(new FileReader(path));
        
        while((line = br.readLine()) != null){
            String[] values = line.split(",");
            System.out.println(values[0]); 
        }
    }catch(FileNotFoundException e){
        e.printStackTrace();
    }catch(IOException e){
        e.printStackTrace();
    }
    }
}
