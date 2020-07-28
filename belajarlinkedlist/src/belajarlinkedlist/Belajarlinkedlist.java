/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarlinkedlist;

/**
 *
 * @author AtFelix
 */
public class Belajarlinkedlist {
    public Node head;
    public Node tail;
    
    public void add(int nilai){
      Node n = new Node();
      
      if (this.head == null){
          this.head = n;
          this.tail = n;
      }
      else{
          this.tail.setNextNode(n);
          this.tail = n;
      }
    }
    
    public static void main(String[] args){
        Belajarlinkedlist listku = new Belajarlinkedlist();
        listku.add(1);
        listku.add(45);
        listku.add(60);
        listku.add(12);
    }
    
}