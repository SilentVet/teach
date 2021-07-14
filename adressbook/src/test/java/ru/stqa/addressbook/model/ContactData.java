package ru.stqa.addressbook.model;

import org.openqa.selenium.By;

public class ContactData {

    private String firstName;
    private String middleName;
    private String lastName;
    private String nickName;

    public ContactData(String firstName, String middleName, String lastName, String nickName) {
         this.firstName = firstName;
         this.middleName = middleName;
         this.lastName = lastName;
         this.nickName = nickName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getNickName() {
        return nickName;
    }
    }
