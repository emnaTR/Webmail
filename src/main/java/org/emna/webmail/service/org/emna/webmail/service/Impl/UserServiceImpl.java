package org.emna.webmail.service.org.emna.webmail.service.Impl;

import org.emna.webmail.dao.UserDao;
import org.emna.webmail.model.User;
import org.emna.webmail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userdao;
    //CRUD: Create Read Update Delete
    //Create User
    public void create(User user)
    {
        userdao.create(user);
    }
    //Read User
    public User getById(int id)
    {
        return userdao.getById(id);
    }
    public List<User> getAll()
    {
        return userdao.getAll();
    }

    //update User
    // public User update(int id);

    //delete User
    public void delete(int id){
        userdao.delete(id);
    }
}
