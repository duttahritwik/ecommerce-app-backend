package com.example.ecommerce.app.Ecommerceapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "User")
public class UserMetaData {

    @Id
    @GeneratedValue
    private long id;
    private String userName;
    private String userID;
    private String userEmail;

    public UserMetaData(long id, String userName, String userID, String userEmail) {
        super();
        this.id = id;
        this.userName = userName;
        this.userID = userID;
        this.userEmail = userEmail;
    }

    public UserMetaData() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "UserMetaData{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userID='" + userID + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
