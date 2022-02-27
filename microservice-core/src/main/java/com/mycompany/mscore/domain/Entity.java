package com.mycompany.mscore.domain;

import org.hibernate.type.EntityType;

public class Entity {
    private String slug;

    private String name;

    private String entityId;

    private String entityTypeId;

    public EntityType Entitytype;

    public Entity(String slug, String name, String entityId, String entityTypeId) {
        this.slug = slug;
        this.name = name;
        this.entityId = entityId;
        this.entityTypeId = entityTypeId;
    }

    public String getSlug() {
        return slug;
    }

    public String getName() {
        return name;
    }

    public String getEntityId() {
        return entityId;
    }

    public String getEntityTypeId() {
        return entityTypeId;
    }

    public EntityType getEntitytype() {
        return Entitytype;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public void setEntityTypeId(String entityTypeId) {
        this.entityTypeId = entityTypeId;
    }

    public void setEntitytype(EntityType entitytype) {
        Entitytype = entitytype;
    }
}
