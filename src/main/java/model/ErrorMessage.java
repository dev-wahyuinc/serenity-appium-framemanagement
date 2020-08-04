package model;

public enum ErrorMessage {
    PasswordIsToShort("Validation failed: Password is too short (minimum is 6 characters)"),
    EmailInvalidValue("Not a valid value"),
    WrongEmailAndPasswordLogin("Wrong email and(or) password"),
    EmailIsRegistered("This email is already registered.");

    private final String errorMessage;

    ErrorMessage(String message) {
        this.errorMessage = message;
    }

    public String getMessage(){
        return this.errorMessage;
    }
}
