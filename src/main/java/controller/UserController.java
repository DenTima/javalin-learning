package controller;

import dao.UserDao;
import dto.UserRequest;
import io.javalin.http.Handler;
import model.User;
import service.UserService;
import service.UserServiceImpl;
import java.util.Objects;

public class UserController {
    public static Handler findBookByName = u -> {
        UserDao userDao = new UserDao();
        String name = Objects.requireNonNull(u.pathParam("name"));
        User user = userDao.findUserByName(name).get();
        if (user == null) {
            u.html("Not found");
        } else {
            u.json(user);
        }
    };

    public static Handler createUser = u -> {
        UserRequest user = u.bodyAsClass(UserRequest.class);
        UserService userService = new UserServiceImpl();
        userService.create(user.name, user.age);
        u.status(201);
    };
}
