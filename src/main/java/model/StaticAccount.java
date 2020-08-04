package model;

public enum StaticAccount {
    UNREGISTERED("Sapi@rol.com"),
    REGISTERED("sap@rol.com"),
    INVALIDEMAIL("sapo@rol.com");

    private String email;
    final private String password = "testqwe123";

    StaticAccount(String s) {
        email = s;
    }

    public String getEmail() {
        return email;
    }

    public String getValidPassword(){
        return this.password;
    }
}
