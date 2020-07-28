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
public class Node {
	private int nilai=0;

	private Node nextNode = null;

	public void setNilai(int n){
		this.nilai = n;
	}
	public void setNextNode(Node n){
		this.nextNode = n;
	}
        public Node getNextNode(){
            return this.nextNode;
        }
}