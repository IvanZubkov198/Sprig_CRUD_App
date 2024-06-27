package web.service;

import web.entity.User;

import java.util.List;


public interface UserService {
    void saveUser(User user);

    void updateUser(User user);

    List<User> getAllUsers();

    User getUser(long id);

    void deleteUser(long id);

}
