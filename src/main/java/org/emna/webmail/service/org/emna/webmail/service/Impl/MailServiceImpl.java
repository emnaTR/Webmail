package org.emna.webmail.service.org.emna.webmail.service.Impl;

import org.emna.webmail.dao.MailDao;
import org.emna.webmail.model.Mail;
import org.emna.webmail.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mailService")
public class MailServiceImpl implements MailService {

    @Autowired
    private MailDao maildao;
    //CRUD: Create Read Update Delete
    //Create Mail
    public void create(Mail mail)
    {
        //il faut récuperer l id_sender
       // maildao.create(mail);
    }
    //Read Mail
    public Mail getById(int id)
    {
       return maildao.getById(id);
    }
    public List<Mail> getAll()
    {
       return maildao.getAll();
    }

    //update Mail
    // public User update(int id);

    //delete Mail
    public void delete(int id){
        maildao.delete(id);
    }
}
