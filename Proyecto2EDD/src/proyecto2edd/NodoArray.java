
package proyecto2edd;


public class NodoArray {
    private Document element;
    private int index;
    private String name;

    public NodoArray(Document element) {
        this.element = element;
        this.index = 50;
        this.name = element.getName();
    }

    public Document getElement() {
        return element;
    }

    public void setElement(Document element) {
        this.element = element;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
