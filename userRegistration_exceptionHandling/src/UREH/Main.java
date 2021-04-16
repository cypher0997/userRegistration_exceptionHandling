package UREH;

public class Main {
    public static void main(String args[]) throws userException {
        userRegistration object = new userRegistration();
        object.isValidFirstName();
        object.isValidLastName();
        object.isValidemail();
        object.isValidMobileNumber();
        object.isValidPassword();
    }
}
