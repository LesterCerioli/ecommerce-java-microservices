package com.mycompany.mscore.domain;

import microsoft.sql.DateTimeOffset;

public class User {

    private String firstName;

    private String middleName;

    private String lastName;

    private long vendorId;

    private boolean isDeleted;

    private DateTimeOffset createdOn;

    private DateTimeOffset latestUpdatedOn;

    //public List<UserAddress> userAddresses;

    public UserAddress DefaultBillingAddress;

    private long defaultBillingAddressId;

    private String refreshTokenHash;

    private String culture;

    private String extensionData;

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getVendorId() {
        return vendorId;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public DateTimeOffset getCreatedOn() {
        return createdOn;
    }

    public DateTimeOffset getLatestUpdatedOn() {
        return latestUpdatedOn;
    }

    public long getDefaultBillingAddressId() {
        return defaultBillingAddressId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setVendorId(long vendorId) {
        this.vendorId = vendorId;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public void setCreatedOn(DateTimeOffset createdOn) {
        this.createdOn = createdOn;
    }

    public void setLatestUpdatedOn(DateTimeOffset latestUpdatedOn) {
        this.latestUpdatedOn = latestUpdatedOn;
    }

    public void setDefaultBillingAddressId(long defaultBillingAddressId) {
        this.defaultBillingAddressId = defaultBillingAddressId;
    }

    public String getRefreshTokenHash() {
        return refreshTokenHash;
    }

    public String getCulture() {
        return culture;
    }

    public String getExtensionData() {
        return extensionData;
    }

    public void setRefreshTokenHash(String refreshTokenHash) {
        this.refreshTokenHash = refreshTokenHash;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public void setExtensionData(String extensionData) {
        this.extensionData = extensionData;
    }
}
