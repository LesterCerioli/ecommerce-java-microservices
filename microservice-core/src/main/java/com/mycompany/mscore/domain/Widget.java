package com.mycompany.mscore.domain;

import microsoft.sql.DateTimeOffset;

public class Widget {

    private String name;

    private String viewComponentName;

    private String createUrl;

    private String editUrl;

    private DateTimeOffset createdOn;

    private boolean isPublishedOn;

    public String getName() {
        return name;
    }

    public String getViewComponentName() {
        return viewComponentName;
    }

    public String getCreateUrl() {
        return createUrl;
    }

    public String getEditUrl() {
        return editUrl;
    }

    public DateTimeOffset getCreatedOn() {
        return createdOn;
    }

    public boolean isPublishedOn() {
        return isPublishedOn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setViewComponentName(String viewComponentName) {
        this.viewComponentName = viewComponentName;
    }

    public void setCreateUrl(String createUrl) {
        this.createUrl = createUrl;
    }

    public void setEditUrl(String editUrl) {
        this.editUrl = editUrl;
    }

    public void setCreatedOn(DateTimeOffset createdOn) {
        this.createdOn = createdOn;
    }

    public void setPublishedOn(boolean publishedOn) {
        isPublishedOn = publishedOn;
    }
}
