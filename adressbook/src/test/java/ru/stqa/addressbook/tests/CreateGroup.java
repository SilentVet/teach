package ru.stqa.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.addressbook.model.GroupData;
import ru.stqa.addressbook.TestBase;


public class CreateGroup extends TestBase {

  @Test
  public void testCreateGroup() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().createNewGroup("new");
    app.getGroupHelper().fillGroupForm(new GroupData("111", "111", "111"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
