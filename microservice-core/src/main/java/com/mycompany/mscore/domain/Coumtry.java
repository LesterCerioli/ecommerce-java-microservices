package com.mycompany.mscore.domain;

public class Country {

    private String name;

    private String code3;

    private boolean isBillingEnabled;

    private boolean isShippingEnabled;

    private boolean isCityEnabled;

    private boolean isZipCodeEnabled;

    private boolean isDistrictEnabled;

    public Country(String name, String code3, boolean isBillingEnabled,
            boolean isShippingEnabled, boolean isCityEnabled,
            boolean isZipCodeEnabled, boolean isDistrictEnabled)
    {
        this.name = name;
        this.code3 = code3;
        this.isBillingEnabled = isBillingEnabled;
        this.isShippingEnabled = isShippingEnabled;
        this.isCityEnabled = isCityEnabled;
        this.isZipCodeEnabled = isZipCodeEnabled;

    }

    public String getName() {
        return name;
    }

    public String setName() {
        return name;
    }

    public String getCode3() {
        return code3;
    }

    public String setCode3() {
        return code3;
    }

    public boolean getIsBillingEnabled() {
        return isBillingEnabled;
    }

    public boolean setIsBillingEnabled() {
        return isBillingEnabled;
    }

    public boolean getIsShippingEnabled() {
        return isShippingEnabled;
    }

    public boolean setIsShippingEnabled() {
        return isShippingEnabled;
    }

    public boolean getIsCityEnabled() {
        return isCityEnabled;
    }

    public boolean setIsCityEnabled() {
        return isCityEnabled;
    }

    public boolean getIsZipCodeEnabled() {
        return isZipCodeEnabled;
    }

    public boolean setIsZipCodeEnabled() {
        return isZipCodeEnabled;
    }



}
