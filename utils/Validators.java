package utils;


public class Validators {

   
    public static boolean validateUsername(String username) {
        return username != null && username.length() > 3;
    }

    public static boolean validateEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

  
    public static boolean validatePassword(String password) {
        return password != null && password.length() >= 6;
    }
}
