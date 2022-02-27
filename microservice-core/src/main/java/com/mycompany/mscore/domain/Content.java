package com.mycompany.mscore.domain;

import microsoft.sql.DateTimeOffset;

public class Content {

    private String name;
    private String slug;
    private String metaTitle;
    private String keyWords;
    private String metaDescription;
    private boolean isPublished;
    private DateTimeOffset publishedOn;
    private Boolean isDeleted;

   public Content(String name, String slug, String metaTitle,
                  String keyWords, String metaDescription,
                  boolean isPublished, DateTimeOffset publishedOn,
                  boolean isDeleted)
   {
       this.name = name;
       this.slug = slug;
       this.metaTitle = metaTitle;
       this.keyWords = keyWords;
       this.metaDescription = metaDescription;
       this.isPublished = isPublished;
       this.publishedOn = publishedOn;
       this.isDeleted = isDeleted;
   }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public DateTimeOffset getPublishedOn() {
        return publishedOn;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }

    public void setPublishedOn(DateTimeOffset publishedOn) {
        this.publishedOn = publishedOn;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
