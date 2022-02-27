package com.mycompany.mscore.domain;

import microsoft.sql.DateTimeOffset;

public class Vendor {

    private String name;

    private String slug;

    private String description;

    private String email;

    private DateTimeOffset createdOn;

    private DateTimeOffset latestUpdatedOn;

    private boolean isActive;

    private boolean isDeleted;

    public IList<User> Users;

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public String getDescription() {
        return description;
    }

    public String getEmail() {
        return email;
    }

    public DateTimeOffset getCreatedOn() {
        return createdOn;
    }

    public DateTimeOffset getLatestUpdatedOn() {
        return latestUpdatedOn;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public IList<User> getUsers() {
        return Users;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCreatedOn(DateTimeOffset createdOn) {
        this.createdOn = createdOn;
    }

    public void setLatestUpdatedOn(DateTimeOffset latestUpdatedOn) {
        this.latestUpdatedOn = latestUpdatedOn;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public void setUsers(IList<User> users) {
        Users = users;
    }
}
