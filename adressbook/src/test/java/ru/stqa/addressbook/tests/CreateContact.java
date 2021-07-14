package ru.stqa.addressbook.tests;
import org.testng.annotations.Test;
import ru.stqa.addressbook.model.ContactData;

public class CreateContact extends TestBase  {

    @Test
    public void createContact() {
        app.getContactHelper().newContact();
        app.getContactHelper().fillPersonData(new ContactData("123", "123", "123", "123"));
        app.getContactHelper().submitContactCreation();
        }


}

