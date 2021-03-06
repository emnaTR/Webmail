package org.emna.webmail.model;

import java.util.List;
import javax.persistence.*;

/*** Created by formation on 05/12/2016.*/

@Table(name="users")
@Entity
public class User {

    @Id
    private int id;
    @Column(name="last_name")
    private String lastName;
    @Column(name="first_name")
    private String firstName;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
   // @Column(name="photo")
    @Transient
    private byte[] photo;
    @Transient
    //@OneToMany(mappedBy="mails", fetch=FetchType.EAGER)
    private List<Mail> mailsSent;
    @Transient
    //@OneToMany(mappedBy="mails", fetch=FetchType.EAGER)
    private List<Mail> mailsReceived;

    //getters et setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Mail> getMailsSent() {
        return mailsSent;
    }

    public void setMailsSent(List<Mail> mailsSent) {
        this.mailsSent = mailsSent;
    }

    public List<Mail> getMailsReceived() {
        return mailsReceived;
    }

    public void setMailsReceived(List<Mail> mailsReceived) {
        this.mailsReceived = mailsReceived;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
