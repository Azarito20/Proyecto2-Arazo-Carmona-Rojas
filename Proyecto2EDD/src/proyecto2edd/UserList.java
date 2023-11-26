/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2edd;

public class UserList {
    
    private UserNodo head;
    private int length;

    public UserList(UserNodo head, int length) {
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
    
    public void insertFinal(User element) {
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
    
//     public void DeleteAtIndex(){
//     
//     }

}
