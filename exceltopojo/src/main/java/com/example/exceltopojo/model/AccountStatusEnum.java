package com.example.exceltopojo.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountStatusEnum {
    PENDING("Pending"),
    ACTIVE("Active"),
    SUSPENDED("Suspended"),
    CLOSED("Closed"),
    DENIED("Denied"),
    ACTIVE_NO_BANK("ActiveNoBank");

    private final String value;

    private AccountStatusEnum(String v) {
        this.value = v;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    public static AccountStatusEnum fromValue(String v) {
        AccountStatusEnum[] arr$ = values();
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            AccountStatusEnum c = arr$[i$];
            if (c.value.equals(v)) {
                return c;
            }
        }

        throw new IllegalArgumentException(v);
    }
}