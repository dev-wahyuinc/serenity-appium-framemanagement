package model;

public class Account {
    private String email = "saff133@gmail.com";
    private String password = "testqwe123";
    private String username = "saprol12344";
    private String gender = Gender.Male.toString();
    private String age = "21-23";

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

}
