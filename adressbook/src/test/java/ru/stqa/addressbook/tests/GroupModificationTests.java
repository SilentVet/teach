package ru.stqa.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupModificationTests extends TestBase {
    @Test
    public void testGroupModification() {
        app.getNavigationHelper().goToGroupPage();
        if (! app.getGroupHelper().isGroupExist()) {
            app.getGroupHelper().createGroup(new GroupData(1, "123", "123", "123"));
        }
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup(before.size() -1);
        app.getGroupHelper().initGroupModification();
        GroupData groupData = new GroupData(before.get(before.size() -1).getId(), "124", "123", "123");
        app.getGroupHelper().fillGroupForm(groupData);
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();

        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() -1);
        before.add(groupData);
        Comparator<? super GroupData> byId = Comparator.comparingInt(GroupData::getId);
        before.sort(byId);
        after.sort(byId);

        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));


    }
}
