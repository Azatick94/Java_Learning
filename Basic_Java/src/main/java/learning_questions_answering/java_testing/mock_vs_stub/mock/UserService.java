package learning_questions_answering.java_testing.mock_vs_stub.mock;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(String userId) {
        return userRepository.getUserById(userId);
    }
}
