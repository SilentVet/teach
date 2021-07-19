package ru.stqa.addressbook.tests;
import org.testng.annotations.*;
import ru.stqa.addressbook.model.ContactData;
import ru.stqa.addressbook.model.GroupData;


public class DeleteGroup extends TestBase {

        @Test
        public void testDeleteGroup() {
            app.getNavigationHelper().goToGroupPage();
            if (! app.getGroupHelper().isGroupExist()) {
                app.getGroupHelper().createGroup(new GroupData("123", "123", "123"));
            }
            app.getGroupHelper().selectGroup();
            app.getGroupHelper().deleteGroup();
            app.getNavigationHelper().goToGroupPage();
        }
    }
