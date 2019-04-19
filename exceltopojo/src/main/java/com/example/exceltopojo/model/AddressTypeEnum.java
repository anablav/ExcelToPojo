package com.example.exceltopojo.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AddressTypeEnum {
    COMPANY("Company"),
    LEGAL("Legal"),
    PUBLIC("Public"),
    BILLING("Billing"),
    LOCATION("Location"),
    SHIPPING("Shipping"),
    MAILING("Mailing"),
    BANK("Bank"),
    RESIDENCE("Residence");

    private final String value;

    private AddressTypeEnum(String v) {
        this.value = v;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    public static AddressTypeEnum fromValue(String v) {
        AddressTypeEnum[] arr$ = values();
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            AddressTypeEnum c = arr$[i$];
            if (c.value.equals(v)) {
                return c;
            }
        }

        throw new IllegalArgumentException(v);
    }
}