package service;

import model.User;

import java.util.Optional;

public interface UserService {
    User create (String name, int age);
    Optional<User> findUserByName(String name);
}
