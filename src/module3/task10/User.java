package module3.task10;

public class User {
    private String id;
    private String name;
    private String email;
    public String getId() {
        return id;
    }

    public User(String id, String name, String email){
        this.email = email;
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayUserInfo(){
        System.out.println(String.format("Id: %s, Name: %s, Email: %s", id, name, email));
    }
}
