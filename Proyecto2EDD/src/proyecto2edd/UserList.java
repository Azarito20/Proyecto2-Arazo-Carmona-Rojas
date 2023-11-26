/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2edd;

import javax.swing.JOptionPane;

public class UserList {
    
    private UserNodo head;
    private int length;

    public UserList() {
        this.head = null;
        this.length = 0;
    }

    public UserNodo getHead() {
        return head;
    }

    public void setHead(UserNodo head) {
        this.head = head;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public boolean isEmpty(){
        return getHead() == null;
    }
   
    //Para insertar los usuarios en la lista de usuarios
    public void insertUser(User element) {
        UserNodo nodo = new UserNodo(element);
        if (isEmpty()){
            setHead(nodo);
        } else {
            UserNodo pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(nodo);
        }
        length++;
    }
    
    //Para Eliminar los usuarios en la lista de usuarios en base a su nombre  
    public UserNodo deleteAtName(User element) {
        UserNodo nodo = new UserNodo(element);
        if(isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista de usuarios está vacia");
            return null;
        } else{
            UserNodo pointer = getHead();
            while (pointer != nodo) {
                pointer = pointer.getNext();
                }
            UserNodo temp = pointer.getNext();
            pointer.setNext(temp.getNext());
            temp.setNext(null);
            length--;
            return temp;

            }
        }
    
    public void print() {
        UserNodo pointer = getHead();
        while (pointer != null) {
            System.out.print(" [ " + pointer.getUser().getUsername() + ";" + pointer.getUser().getPriorityType() + ";" + pointer.getUser().getDocuments() +" ] ");
            pointer = pointer.getNext();
        }
    }

    
}



