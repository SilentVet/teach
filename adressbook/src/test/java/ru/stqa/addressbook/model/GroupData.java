package ru.stqa.addressbook.model;

public class GroupData {
    private String groupname;
    private String header;
    private String footer;

    public GroupData(String groupname, String header, String footer) {
        this.groupname = groupname;
        this.header = header;
        this.footer = footer;
    }

    public String getGroupname() {
        return groupname;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }
}
