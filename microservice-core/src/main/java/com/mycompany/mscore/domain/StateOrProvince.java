package com.mycompany.mscore.domain;

public class StateOrProvince {

    private String countryId;

    public Country Country;

    private String code;

    private String name;

    private String type;

    public StateOrProvince(long id)
    {
        this.id = id;
    }

    public String getCountryId() {
        return countryId;
    }

    public com.mycompany.mscore.domain.Country getCountry() {
        return Country;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public void setCountry(com.mycompany.mscore.domain.Country country) {
        Country = country;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}
