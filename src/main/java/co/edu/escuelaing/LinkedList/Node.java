/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.LinkedList;

/**
 *
 * @author cristian forero
 */
public class Node {
    private Object element;
    private Node next;
    
    public Node(Object e){
        this.element = e;
        this.next = null;
    }
    
    public Object getElement(){
        return element;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setElement(Object e){
        this.element = e;
    }
    
    public void setNext(Node n){
        this.next = n;
    }
    
}
