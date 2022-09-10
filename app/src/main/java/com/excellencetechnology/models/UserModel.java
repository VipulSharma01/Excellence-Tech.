package com.excellencetechnology.models;

import android.widget.ImageView;

public class UserModel {

    String Name, Email, Mobile, Gender, Qualification, City, College, Password, ID, profilePic;

    public UserModel(String name, String email, String mobile, String gender, String qualification, String city) {
        Name = name;
        Email = email;
        Mobile = mobile;
        Gender = gender;
        Qualification = qualification;
        City = city;
    }

    public UserModel(String name, String email, String id, String profileImage) {
        Name = name;
        Email = email;
        ID = id;
        profilePic = profileImage;
    }

    public UserModel() {}

    public UserModel(String email, String password) {
        Email = email;
        Password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
