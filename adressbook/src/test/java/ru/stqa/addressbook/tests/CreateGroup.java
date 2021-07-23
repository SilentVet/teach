package ru.stqa.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;


public class CreateGroup extends TestBase {

  @Test
  public void testCreateGroup() {
    app.getNavigationHelper().goToGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    GroupData groupData = new GroupData(0, "111", "111", "123");
    app.getGroupHelper().createNewGroup();
    app.getGroupHelper().fillGroupForm(groupData);
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1 );

    before.add(groupData);
    Comparator<? super GroupData> byId = Comparator.comparingInt(GroupData::getId);
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
  }

}
