package service;

import dao.UserDao;
import model.User;

import java.util.Optional;

public class UserServiceImpl implements UserService{
    private final UserDao userDao = new UserDao();

    @Override
    public User create(String name, int age) {
        User user = new User(name, age);
        return userDao.createUser(user);
    }

    @Override
    public Optional<User> findUserByName(String name) {
        return userDao.findUserByName(name);
    }
}
