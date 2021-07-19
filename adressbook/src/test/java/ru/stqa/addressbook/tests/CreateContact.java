package ru.stqa.addressbook.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.addressbook.model.ContactData;

import java.util.List;

public class CreateContact extends TestBase  {

    @Test
    public void createContact() {
        app.getContactHelper().newContact();
        if (! app.getContactHelper().isСontactExist()) {
            app.getContactHelper().newContact();
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().fillPersonData(new ContactData("123", "123", "123", "123"));
        app.getContactHelper().submitContactCreation();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() +1);
        }
}

