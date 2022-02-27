package com.mycompany.mscore.domain;

import microsoft.sql.DateTimeOffset;

public class CustomerGroup {

    private String name;

    private String description;

    private boolean isActive;

    private boolean isDeleted;

    private DateTimeOffset createdOn;

    private DateTimeOffset latestUpdatedOn;

    public CustomerGroup(String name, String description,
                         boolean isActive, boolean isDeleted,
                         DateTimeOffset createdOn, DateTimeOffset latestUpdatedOn)
    {
        this.name = name;
        this.description = description;
        this.isActive = isActive;
        this.isDeleted = isDeleted;
        this.createdOn = createdOn;
        this.latestUpdatedOn = latestUpdatedOn;



    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public DateTimeOffset getCreatedOn() {
        return createdOn;
    }

    public DateTimeOffset getLatestUpdatedOn() {
        return latestUpdatedOn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public void setCreatedOn(DateTimeOffset createdOn) {
        this.createdOn = createdOn;
    }

    public void setLatestUpdatedOn(DateTimeOffset latestUpdatedOn) {
        this.latestUpdatedOn = latestUpdatedOn;
    }
}
