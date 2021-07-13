package ru.stqa.addressbook.tests;
import org.testng.annotations.*;
import ru.stqa.addressbook.TestBase;


public class DeleteGroup extends TestBase {

        @Test
        public void testDeleteGroup() {
            app.getNavigationHelper().goToGroupPage();
            app.getGroupHelper().selectGroup();
            app.getGroupHelper().deleteGroup();
            app.getNavigationHelper().goToGroupPage();
        }
    }
