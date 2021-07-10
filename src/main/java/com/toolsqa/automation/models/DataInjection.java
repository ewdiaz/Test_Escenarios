package com.toolsqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {
    Faker faker = new Faker(new Locale("en_US"));
    private String sheetname, filepath, firstname, lastname, email, phone, birth_day, subject, picture,
            address, city, state, extensionName, extensionLastName, extensionEmail, extensionPhone,extensionAddress,extensionSubmit;

    public String getFirstname()     {
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }
    public String getExtensionName(){
        return extensionName;
    }
    public String getExtensionLastName(){
        return extensionLastName;
    }
    public String getExtensionEmail(){
        return extensionEmail;
    };
    public String getExtensionPhone(){
        return extensionPhone;
    }
    public String getExtensionAddress(){
        return extensionAddress;
    }
    public String getSheetname(){
        return sheetname;
    }
    public String getFilepath(){
        return filepath;
    }
    public String getBirth_day(){
        return birth_day;
    }
    public String getSubject(){
        return subject;
    }
    public String getPicture(){
        //File file = new File(this.picture);
        //String path = file.getAbsolutePath();
        return this.picture;
    }
    public String getAddress(){
        return address;
    }

    public String getState(){
        return this.state;
    }
    public String getCity(){
        return this.city;
    }
    public String getExtensionSubmit(){
        return extensionSubmit;
    }

    public DataInjection(){
        this.firstname = faker.name().firstName();
        this.lastname = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.phone = Integer.toString(faker.number().numberBetween(1000000000,1999999999));
        this.birth_day = faker.date().birthday().toString();
        this.subject = "Arts";
        this.address = faker.address().streetAddress();
        this.filepath = "resources/Data.xlsx";
        this.sheetname = "Data";
        this.picture ="C:\\1354565908787.jpg";
        this.state = "NCR";
        this.city = "Noida";
        this.extensionSubmit = "Thanks for submitting the form";
    }
}
