
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
            rearrangeUp(getSize() -1);
        }
    }
    
    public void rearrangeUp(int index) {
        NodoArray pointer = documents[index];
        int temp = (index-1)/2;
        while (documents[index].getIndex() < documents[temp].getIndex()) {
            documents[index] = documents[temp];
            documents[temp] = pointer;
        }
    }
    
    public void rearrangeDown (int index) {
        NodoArray pointer = documents[index];
        int temp1 = (index*2)+1;
        int temp2 = (index*2)+2;
        if (documents[index].getIndex() > documents[temp1].getIndex()) {
            documents[index] = documents[temp1];
            documents[temp1] = pointer;
        } else if (documents[index].getIndex() > documents[temp2].getIndex()) {
            documents[index] = documents[temp2];
            documents[temp2] = pointer;
        }
    }
    
    public NodoArray deleteRoot() {
        NodoArray nodo = documents [0];
        documents [0] = documents [size -1];
        size--;
        rearrangeDown(0);
        return nodo;
    }
    
    public void print() {
        int i = 0;
        while (i < getSize()) {
            System.out.println("[" + documents[i].getIndex() + "]");
            i++;
        }
    }
}
