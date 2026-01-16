package auth;

import database.DatabaseClient;

public class AuthService {

    private DatabaseClient database;

    public AuthService(DatabaseClient database) {
        this.database = database;
    }

    public boolean login(String username, String password) {
        return database.validateCredentials(username, password);
    }

    public void register(String username, String password, String email) {
        database.createUser(username, password, email);
    }
}
