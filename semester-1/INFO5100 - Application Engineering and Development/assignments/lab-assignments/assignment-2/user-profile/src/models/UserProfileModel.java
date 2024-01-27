/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.File;

/**
 *
 * @author tapaswi
 */
public class UserProfileModel {
    String firstName;
    String lastName;
    double age;
    String mobileNumber;
    String email;
    File profilePicture;

    public UserProfileModel(){ }
    public UserProfileModel(String firstName, String lastName, double age,
            String mobileNumber, String email, File profilePicture) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.profilePicture = profilePicture;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAge() {
        return age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public File getProfilePicture() {
        return profilePicture;
    }

    @Override
    public String toString() {
        String str = "Name: "+firstName+" "+lastName;
        str += "\nAge: "+age;
        str += "\nMobile Number: "+mobileNumber;
        str += "\nEmail: "+email;
        return str;
    }
    
    
}
