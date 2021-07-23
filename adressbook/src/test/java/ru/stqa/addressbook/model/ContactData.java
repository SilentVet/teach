package ru.stqa.addressbook.model;

import org.openqa.selenium.By;

import java.util.Objects;

public class ContactData {

    private String firstName;
    private String middleName;
    private String lastName;
    private String nickName;
    private String id;

    public ContactData(String firstName, String middleName, String lastName, String nickName) {
         this.firstName = firstName;
         this.middleName = middleName;
         this.lastName = lastName;
         this.nickName = nickName;
         this.id = null;
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
    public String getId() {return id;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(middleName, that.middleName) && Objects.equals(lastName, that.lastName) && Objects.equals(nickName, that.nickName) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, nickName, id);
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "firstName='" + firstName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

}
