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
    
    public static double mean(List<? extends Double> li){
        double result = 0;
        for(Double i:li){
            result += i;
        }
        result /= li.size();
        return result;
    }
    
    public static void main ( String args[])
    {
        List<Integer> li = new LinkedList<Integer>();
        li.add(0);
        li.add(10);
        System.out.println(mean(li));
    }
    
}
