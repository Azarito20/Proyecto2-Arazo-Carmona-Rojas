/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2edd;

public class UserNodo {
    private User element;
    private UserNodo next;

    public UserNodo(User element) {
        this.element = element;
        this.next = null;
    }

    public User getUser() {
        return element;
    }

    public void setUser(User element) {
        this.element = element;
    }

    public UserNodo getNext() {
        return next;
    }

    public void setNext(UserNodo next) {
        this.next = next;
    }
    
    
}
