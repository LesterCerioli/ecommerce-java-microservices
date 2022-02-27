package com.mycompany.mscore.domain;

import microsoft.sql.DateTimeOffset;

public class UserAddress {

    private long userId;

    public User User;

    private long addressId;

    private DateTimeOffset lastUsedOn;

    public Address Address;

    public AddressType AddressType;

    public long getUserId() {
        return userId;
    }

    public com.mycompany.mscore.domain.User getUser() {
        return User;
    }

    public long getAddressId() {
        return addressId;
    }

    public DateTimeOffset getLastUsedOn() {
        return lastUsedOn;
    }

    public com.mycompany.mscore.domain.Address getAddress() {
        return Address;
    }

    public com.mycompany.mscore.domain.AddressType getAddressType() {
        return AddressType;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setUser(com.mycompany.mscore.domain.User user) {
        User = user;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public void setLastUsedOn(DateTimeOffset lastUsedOn) {
        this.lastUsedOn = lastUsedOn;
    }

    public void setAddress(com.mycompany.mscore.domain.Address address) {
        Address = address;
    }

    public void setAddressType(com.mycompany.mscore.domain.AddressType addressType) {
        AddressType = addressType;
    }
}
