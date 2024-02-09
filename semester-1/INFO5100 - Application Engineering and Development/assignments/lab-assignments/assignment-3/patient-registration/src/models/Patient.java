/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.File;
import java.time.LocalDate;

/**
 *
 * @author tapas
 */
public class Patient {
    private final String fName;
    private final String lName;
    private final String dob;
    private final String email;
    private final String message;
    private final String patientType;
    private final String gender;
    private final File image;

    public Patient(String fName, String lName, String dob, String email,
            String message, String patientType, String gender, File image) {
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.email = email;
        this.message = message;
        this.patientType = patientType;
        this.gender = gender;
        this.image = image;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    public String getPatientType() {
        return patientType;
    }

    public String getGender() {
        return gender;
    }

    public File getImage() {
        return image;
    }
    
    @Override
    public String toString() {
        String str = "Name: "+fName+" "+lName;
        str += "\nPatient Type: "+patientType;
        str += "\nDOB: "+dob;
        str += "\nAge: "+(LocalDate.now().getYear() - Integer.parseInt(dob.split("-")[2]))+" Years";
        str += "\nEmail: "+email;
        str += "\nGender: "+gender;
        str += "\nMessage: "+message;
        return str;
    }
    
}
