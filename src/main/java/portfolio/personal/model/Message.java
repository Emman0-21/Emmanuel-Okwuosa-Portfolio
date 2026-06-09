package portfolio.personal.model;

public class Message {
    private String name;
    private  String subject;
    private String message;
    private String email;

    public Message(){}

    public Message(String name, String subject, String message, String email){
        this.name = name;
        this.message = message;
        this.subject = subject;
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getEmail() {
        return email;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
