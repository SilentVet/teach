package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void newContact() {
        click(By.linkText("add new"));
    }

    public void fillPersonData(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("nickname"), contactData.getNickName());
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }
    public List<ContactData> getContactList() {
        List<ContactData> contact = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.cssSelector("tr.odd"));
        for (WebElement element: elements) {
            String firstname = element.getText();
            ContactData contactData = new ContactData(firstname, null, null, null);
            contact.add(contactData);
        }
        return contact;
    }

    public boolean isСontactExist() {
        return isElementPresent(By.name("selected[]"));
    }
}
