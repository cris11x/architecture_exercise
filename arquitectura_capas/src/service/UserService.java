package service;
import model.User;
import repository.UserRepository;

public class UserService {
	private UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    public User getUserById(String id) {
        return userRepository.getUserById(id);
    }

    public void saveUser(User user) {
        userRepository.saveUser(user);
    }


}
