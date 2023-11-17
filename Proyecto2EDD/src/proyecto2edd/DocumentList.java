
package proyecto2edd;


public class DocumentList {
    private DocumentNodo head;
    private int length;

    public DocumentList() {
        this.head = null;
        this.length = 0;
    }

    public DocumentNodo getHead() {
        return head;
    }

    public void setHead(DocumentNodo head) {
        this.head = head;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public void InsertDocument (Document element) {
        DocumentNodo document = new DocumentNodo(element);
        if (isEmpty()) {
            setHead(document);
        } else {
            DocumentNodo pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(document);
        }
        length++;
    }
    
    
    
    public boolean isEmpty() {
        return getHead() == null;
    }
}
