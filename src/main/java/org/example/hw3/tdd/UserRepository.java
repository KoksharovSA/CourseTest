package org.example.hw3.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public List<User> getData() {
        return data;
    }

    // Тут можно хранить аутентифицированных пользователей
    private List<User> data = new ArrayList<>();

    public void addUser(User user) {
       data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void removeUserWithoutAdmin(){
        this.data.stream().forEach(user -> {
            if (!user.isAdmin) {
                user.isAuthenticate = false;
            }
        });
    }
}