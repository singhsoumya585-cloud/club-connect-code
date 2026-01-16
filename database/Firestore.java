
package database;

import java.util.HashMap;
import java.util.Map;

public class Firestore implements DatabaseClient {

    private Map<String, String> users = new HashMap<>();

    @Override
    public boolean validateCredentials(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }

    @Override
    public void createUser(String username, String password, String email) {
        users.put(username, password);
    }
}
