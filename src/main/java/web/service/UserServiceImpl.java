package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.entity.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUser(long id) {
        return userDAO.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        if (getUser(id) != null) {
            userDAO.deleteUser(id);
        }
    }
}
