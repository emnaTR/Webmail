package org.emna.webmail.dao;

import org.emna.webmail.model.Mail;

import java.util.List;

public interface MailDao {
    //CRUD: Create Read Update Delete
    //Create Mail
    public void create(Mail mail);
    //Read Mail
    public Mail getById(int id);
    public List<Mail> getAll();

    //update Mail
    // public User update(int id);

    //delete Mail
    public void delete(int id);
}
