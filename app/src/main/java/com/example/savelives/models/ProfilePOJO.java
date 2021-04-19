package com.example.savelives.models;

public class ProfilePOJO {
    boolean expandable;

    public ProfilePOJO() {
        this.expandable = false;
    }

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }
}
