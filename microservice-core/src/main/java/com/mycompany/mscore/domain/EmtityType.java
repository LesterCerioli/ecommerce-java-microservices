package com.mycompany.mscore.domain;

public class EmtityType {

    private String name;

    private boolean isMenuable;

    private String areaName;

    private String routingController;

    private String routingAction;

    public EmtityType(String name, boolean isMenuable, String areaName, String routingController, String routingAction) {
        this.name = name;
        this.isMenuable = isMenuable;
        this.areaName = areaName;
        this.routingController = routingController;
        this.routingAction = routingAction;
    }

    public String getName() {
        return name;
    }

    public boolean isMenuable() {
        return isMenuable;
    }

    public String getAreaName() {
        return areaName;
    }

    public String getRoutingController() {
        return routingController;
    }

    public String getRoutingAction() {
        return routingAction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMenuable(boolean menuable) {
        isMenuable = menuable;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setRoutingController(String routingController) {
        this.routingController = routingController;
    }

    public void setRoutingAction(String routingAction) {
        this.routingAction = routingAction;
    }
}
