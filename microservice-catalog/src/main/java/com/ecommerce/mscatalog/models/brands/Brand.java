package com.ecommerce.mscatalog.models.brands;

public class Brand {

    public String name;

    public String slug;

    public String description;

    public boolean isPublished;

    public boolean isDeleted;

    public void setName(String name) {
        this.name = name;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public String getDescription() {
        return description;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public Brand(String name, String slug, String description, boolean isPublished, boolean isDeleted) {
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.isPublished = isPublished;
        this.isDeleted = isDeleted;
    }
}
