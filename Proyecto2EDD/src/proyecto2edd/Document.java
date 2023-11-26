
package proyecto2edd;


public class Document {
    private String name;
    private int pages;
    private String type;

    public Document(String name, int pages, String type) {
        this.name = name;
        this.pages = pages;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
////////