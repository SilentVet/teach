package ru.stqa.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.addressbook.model.GroupData;

import java.util.List;


public class CreateGroup extends TestBase {

  @Test
  public void testCreateGroup() {
    app.getNavigationHelper().goToGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    app.getGroupHelper().createNewGroup();
    app.getGroupHelper().fillGroupForm(new GroupData("111", "111", "111"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    Assert.assertEquals(after.size(), before.size() + 1 );
  }

}
