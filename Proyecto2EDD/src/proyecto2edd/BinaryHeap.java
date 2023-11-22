
package proyecto2edd;


public class BinaryHeap {
    private NodoArray[] documents;
    private int size;

    public BinaryHeap() {
        this.documents = new NodoArray[0];
        this.size = 0;
    }

    public NodoArray[] getDocuments() {
        return documents;
    }

    public void setDocuments(NodoArray[] documents) {
        this.documents = documents;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void insertNodo(Object element) {
        NodoArray nodo = new NodoArray(element);
        NodoArray[] newArray = new NodoArray[getSize() + 1];
        for (int i=0; i < getSize(); i++) {
            newArray[i] = getDocuments()[i];
        }
        newArray[getSize()] = nodo;
        setDocuments(newArray);
        nodo.setIndex(nodo.getIndex() + getSize());
        size++;
        if ( getSize() -1 != 0) {
            rearrange(nodo, getSize() -1);
        }
    }
    
    public void rearrange(Object element, int index) {
        NodoArray nodo = new NodoArray(element);
        
    }
}
