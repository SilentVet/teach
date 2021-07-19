package ru.stqa.addressbook.tests;
import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.addressbook.model.ContactData;
import ru.stqa.addressbook.model.GroupData;

import java.util.List;


public class DeleteGroup extends TestBase {

        @Test
        public void testDeleteGroup() {
            app.getNavigationHelper().goToGroupPage();
            if (! app.getGroupHelper().isGroupExist()) {
                app.getGroupHelper().createGroup(new GroupData ("124", "124", "124"));
            }
            List<GroupData> before = app.getGroupHelper().getGroupList();
            app.getNavigationHelper().goToGroupPage();
            app.getGroupHelper().selectGroup(before.size() -1);
            app.getGroupHelper().deleteGroup();
            app.getNavigationHelper().goToGroupPage();
            List<GroupData> after = app.getGroupHelper().getGroupList();

            before.remove(before.size() -1);
            Assert.assertEquals(before, after);
        }
    }
