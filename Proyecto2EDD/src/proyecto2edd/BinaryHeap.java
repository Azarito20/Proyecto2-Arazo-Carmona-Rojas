
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
            rearrangeUp(nodo, getSize() -1);
        }
    }
    
    public void rearrangeUp(Object element, int index) {
        NodoArray nodo = new NodoArray(element);
        int pointer = index;
        int temp = (index-1)/2;
        while (nodo.getIndex() < getDocuments()[temp].getIndex()) {
            getDocuments()[pointer] = getDocuments()[temp];
            getDocuments()[temp] = nodo;
        }
    }
    
    public void rearrangeDown (Object element, int index) {
        NodoArray nodo = new NodoArray(element);
        int pointer = index;
        int temp1 = (index*2)+1;
        int temp2 = (index*2)+1;
        if (nodo.getIndex() > getDocuments()[temp1].getIndex()) {
            getDocuments()[pointer] = getDocuments()[temp1];
            getDocuments()[temp1] = nodo;
        } else if (nodo.getIndex() > getDocuments()[temp2].getIndex()) {
            getDocuments()[pointer] = getDocuments()[temp2];
            getDocuments()[temp2] = nodo;
        }
    }
    
    public NodoArray deleteRoot() {
        NodoArray nodo = getDocuments()[0];
        NodoArray root = getDocuments()[1];
        
        return nodo;
    }
}
