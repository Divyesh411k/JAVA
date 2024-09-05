class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException() {
        super("Invalid login credentials.");
    }

    public InvalidCredentialsException(String message) {
        super(message);
    }
}

class Authenticator {
    private String validUsername = "admin";
    private String validPassword = "password123";

    public void login(String username, String password) throws InvalidCredentialsException {
        if (!validUsername.equals(username) || !validPassword.equals(password)) {
            throw new InvalidCredentialsException("Invalid username or password.");
        } else {
            System.out.println("Login successful.");
        }
    }
}

public class q5 {
    public static void main(String[] args) {
        Authenticator authenticator = new Authenticator();

        try {
          
            authenticator.login("user123", "wrongpassword");
        } catch (InvalidCredentialsException e) {
            System.out.println("Login failed: " + e.getMessage());
        }

        try {
            authenticator.login("admin", "password123");
        } catch (InvalidCredentialsException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}
