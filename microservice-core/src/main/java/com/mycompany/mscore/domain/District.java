package com.mycompany.mscore.domain;

public class District {

    public StateOrProvince StateOrprovince;

    private String name;

    private  String type;

    private String location;

    public District(String name, String type,
                    String location)
    {
        this.name = name;
        this.type = type;
        this.location= location;
    }

    public StateOrProvince getStateOrprovince() {
        return StateOrprovince;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public void setStateOrprovince(StateOrProvince stateOrprovince) {
        StateOrprovince = stateOrprovince;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
