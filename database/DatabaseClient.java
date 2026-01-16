package database;

public interface DatabaseClient {

    boolean validateCredentials(String username, String password);

    void createUser(String username, String password, String email);
}

