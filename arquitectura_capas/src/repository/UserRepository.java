package repository;

import model.User;

import java.util.HashMap;
import java.util.Map;


public class UserRepository {
    private Map<String, User> userDatabase = new HashMap<>();
    
    public User getUserById(String id) {
        return userDatabase.get(id);
    }

    public void saveUser(User user) {
        userDatabase.put(user.getId(), user);
    }


}
