package dao;

import model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDao {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("Bob", 18));
        users.add(new User("Alice", 19));
        users.add(new User("Jane", 22));
    }

    public UserDao() {
    }

    public Optional<User> findUserByName(String name) {
        return users.stream().filter(e -> e.getName().equals(name)).findAny();
    }

    public User createUser (User user) {
        users.add(user);
        return user;
    }
}
