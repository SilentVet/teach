package ru.stqa.addressbook.model;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "GroupData{" +
                "groupname='" + groupname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupData groupData = (GroupData) o;
        return Objects.equals(groupname, groupData.groupname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupname);
    }
}
