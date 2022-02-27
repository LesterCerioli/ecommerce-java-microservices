package com.mycompany.mscore.domain;


import com.mycompany.mscore.domain.StateOrProvince;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;








public class Address implements Serializable {


    private String contactName;


    private String phone;


    private String addressLine1;


    private String addressLine2;

    private String city;

    private String zipCode;

    private StateOrProvince state;



    public Address(String contactName, String phone, String addressLine1,
                   String addressLine2, String city, String zipCode)
    {
        this.contactName = contactName;
        this.phone = phone;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.zipCode = zipCode;


    }


    public String getContactName() {
        return contactName;
    }

    public String setContactName() {
        return contactName;
    }

    public String getPhone() {
        return phone;
    }

    public String setPhome() {
        return phone;
    }

    public String getAddressline1() {
        return addressLine1;
    }

    public String setAddressline1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String setAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String setCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String setZipCode() {
        return zipCode;
    }






}





