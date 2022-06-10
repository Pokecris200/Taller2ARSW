/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.MeanAndSD;

import co.edu.escuelaing.LinkedList.MyLList;
import java.io.File;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author cristian forero
 */
public class StadisticCalculator {
    
    /**
     * Method that calculates the mean of a set of values
     * @param li a list with the values 
     * @return the mean of the values
     */
    public static double mean(List<? extends Double> li){
        double result = 0;
        for(Double i:li){
            result += i;
        }
        result /= li.size();
        return result;
    }
    
    /**
     * Method that calculates the Standard Desviation of a set of values
     * @param li li a list with the values
     * @return the Standard Desviation of the values
     */
    public static double standardDesviation(List<? extends Double> li){
        double m = mean(li);
        double result = 0;
        double delta;
        for(Double i:li){
            delta = Math.pow((i-m), 2);
            result += delta;
        }
        result /= (li.size() -1);
        result = Math.sqrt(result);
        return result;
    }
    
    public static void main( String args[])throws Exception
    {
        List<Double> li = new MyLList<Double>();
        File file = new File( args[0] );
        Scanner scan = new Scanner(file);
        
        while(scan.hasNextLine()) 
        {
            String line = scan.nextLine();
            if(line != "")
            {
                li.add(Double.parseDouble(line.trim()));
            }
        }
        System.out.println(mean(li));
        System.out.println(standardDesviation(li));
    }
    
}
