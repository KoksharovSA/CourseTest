package org.example.hw3.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class UserRepositoryTest {
    static UserRepository userRepository = new UserRepository();
    @BeforeAll
    public static void setUserRepository(){
        userRepository.addUser(new User("a","a", false));
        userRepository.addUser(new User("b","b", false));
        userRepository.addUser(new User("c","c", true));
        userRepository.addUser(new User("d","d", true));
        userRepository.getData().stream().forEach(user -> user.authenticate(user.name, user.password));
        userRepository.removeUserWithoutAdmin();
    }

    @Test
    @DisplayName("Тест разлогинивания не админов")
    public void removeUserWithoutAdmin(){
        for (User item: userRepository.getData()) {
            if (item.isAdmin){
                assertThat(true).isEqualTo(item.isAuthenticate);
            } else {
                assertThat(false).isEqualTo(item.isAuthenticate);
            }
        }
    }
}