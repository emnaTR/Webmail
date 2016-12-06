package org.emna.webmail.service;

import org.emna.webmail.model.User;

import java.util.List;

public interface UserService {
    //CRUD: Create Read Update Delete
    //Create User
    public void create(User user);
    //Read User
    public User getById(int id);
    public List<User> getAll();

    //update User
    // public User update(int id);

    //delete User
    public void delete(int id);
}
