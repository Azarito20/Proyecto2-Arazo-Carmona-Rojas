
package proyecto2edd;


public class Document {
    private String name;
    private String pages;
    private String type;

    public Document(String name, String pages, String type) {
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

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
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