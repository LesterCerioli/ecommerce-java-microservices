package com.mycompany.mscore.domain;

import microsoft.sql.DateTimeOffset;

public class WidgetInstance {

    private String name;

    private DateTimeOffset createdOn;

    private DateTimeOffset latestUpdatedOn;

    private DateTimeOffset publishStart;

    private DateTimeOffset publishEnd;

    private String widgetId;

    public Widget Widget;

    private long widgetZoneId;

    public WidgetZone WidgetZone;

    private int displayOrder;

    private String data;

    private String htmlData;

    public boolean IsPublished()
    {
        get
        {
            return PublishStart.HasValue && PublishStart.Value < DateTimeOffset.Now && (!PublishEnd.HasValue || PublishEnd.Value > DateTimeOffset.Now);
        }
    }

    public String getName() {
        return name;
    }

    public DateTimeOffset getCreatedOn() {
        return createdOn;
    }

    public DateTimeOffset getLatestUpdatedOn() {
        return latestUpdatedOn;
    }

    public DateTimeOffset getPublishStart() {
        return publishStart;
    }

    public DateTimeOffset getPublishEnd() {
        return publishEnd;
    }

    public String getWidgetId() {
        return widgetId;
    }

    public com.mycompany.mscore.domain.Widget getWidget() {
        return Widget;
    }

    public long getWidgetZoneId() {
        return widgetZoneId;
    }

    public com.mycompany.mscore.domain.WidgetZone getWidgetZone() {
        return WidgetZone;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public String getData() {
        return data;
    }

    public String getHtmlData() {
        return htmlData;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreatedOn(DateTimeOffset createdOn) {
        this.createdOn = createdOn;
    }

    public void setLatestUpdatedOn(DateTimeOffset latestUpdatedOn) {
        this.latestUpdatedOn = latestUpdatedOn;
    }

    public void setPublishStart(DateTimeOffset publishStart) {
        this.publishStart = publishStart;
    }

    public void setPublishEnd(DateTimeOffset publishEnd) {
        this.publishEnd = publishEnd;
    }

    public void setWidgetId(String widgetId) {
        this.widgetId = widgetId;
    }

    public void setWidget(com.mycompany.mscore.domain.Widget widget) {
        Widget = widget;
    }

    public void setWidgetZoneId(long widgetZoneId) {
        this.widgetZoneId = widgetZoneId;
    }

    public void setWidgetZone(com.mycompany.mscore.domain.WidgetZone widgetZone) {
        WidgetZone = widgetZone;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHtmlData(String htmlData) {
        this.htmlData = htmlData;
    }
}
