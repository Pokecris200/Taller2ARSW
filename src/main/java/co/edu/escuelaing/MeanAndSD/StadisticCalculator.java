/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.MeanAndSD;

import java.util.LinkedList;
import java.util.List;

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
    
    public static void main ( String args[])
    {
        List<Double> li = new LinkedList<Double>();
        li.add(0.0);
        li.add(10.0);
        li.add(3.5);
        System.out.println(mean(li));
        System.out.println(standardDesviation(li));
    }
    
}
