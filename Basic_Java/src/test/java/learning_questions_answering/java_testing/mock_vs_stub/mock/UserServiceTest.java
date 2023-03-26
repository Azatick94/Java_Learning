package learning_questions_answering.java_testing.mock_vs_stub.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetUserById() {
        User expectedUser = new User("10", "Boris");
        // when we call getUserById from userRepository, we mock this behavior and should return expectedUser object
        Mockito.when(userRepository.getUserById("10")).thenReturn(expectedUser);

        // now we call getUserById method from userService
        User actualUser = userService.getUserById("10");

        assertEquals(expectedUser, actualUser);
        // check that getUserById method was called from userRepository
        // check that userService in his implementation called getUserById from userRepository
        Mockito.verify(userRepository).getUserById("10");

    }



}
