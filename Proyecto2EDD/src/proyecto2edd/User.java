
package proyecto2edd;


public class User {
    private String username;
    private String priorityType;
    private DocumentList documents;

    public User(String username,String priorityType,DocumentList documents) {
        this.username = username;
        this.priorityType = priorityType;
        this.documents = documents;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPriorityType() {
        return priorityType;
    }

    public void setPriorityType(String priorityType) {
        this.priorityType = priorityType;
    }

    public DocumentList getDocuments() {
        return documents;
    }

    public void setDocuments(DocumentList documents) {
        this.documents = documents;
    }

}
