
package proyecto2edd;


public class DocumentNodo {
    private Document element;
    private DocumentNodo next;

    public DocumentNodo(Document element) {
        this.element = element;
        this.next = null;
    }

    public Document getElement() {
        return element;
    }

    public void setElement(Document element) {
        this.element = element;
    }

    public DocumentNodo getNext() {
        return next;
    }

    public void setNext(DocumentNodo next) {
        this.next = next;
    }
    
}
