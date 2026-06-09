package portfolio.personal.model;
/*Experience.java — with fields like company, role, duration, description*/
public class Experience {
    private String company;
    private String role;
    private String duration;
    private String description;

    public Experience(String company, String role, String duration, String description){
        this.company = company;
        this.role = role;
        this.duration = duration;
        this.description = description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
