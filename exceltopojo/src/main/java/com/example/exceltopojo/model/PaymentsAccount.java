package com.example.exceltopojo.model;

import java.util.List;

public class PaymentsAccount extends CDMEntity {
    private AccountStatusEnum status;
    private AccountStatusEnum moneyOutStatus;
    private AccountStatusEnum lendingStatus;
    private String realmId;
    private String linkedUserAuthId;
    private String accountNumber;
    private Boolean isDepositDisabled;
    private Boolean nachaControlOn;
    private PrimaryBusiness businessInfo;
    private List<AdditionalLocation> additionalLocations;
    private RiskProfile riskProfile;

    public AccountStatusEnum getStatus() {
        return status;
    }

    public void setStatus(AccountStatusEnum status) {
        this.status = status;
    }

    public AccountStatusEnum getMoneyOutStatus() {
        return moneyOutStatus;
    }

    public void setMoneyOutStatus(AccountStatusEnum moneyOutStatus) {
        this.moneyOutStatus = moneyOutStatus;
    }

    public AccountStatusEnum getLendingStatus() {
        return lendingStatus;
    }

    public void setLendingStatus(AccountStatusEnum lendingStatus) {
        this.lendingStatus = lendingStatus;
    }

    public String getRealmId() {
        return realmId;
    }

    public void setRealmId(String realmId) {
        this.realmId = realmId;
    }

    public String getLinkedUserAuthId() {
        return linkedUserAuthId;
    }

    public void setLinkedUserAuthId(String linkedUserAuthId) {
        this.linkedUserAuthId = linkedUserAuthId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Boolean getDepositDisabled() {
        return isDepositDisabled;
    }

    public void setDepositDisabled(Boolean depositDisabled) {
        isDepositDisabled = depositDisabled;
    }

    public Boolean getNachaControlOn() {
        return nachaControlOn;
    }

    public void setNachaControlOn(Boolean nachaControlOn) {
        this.nachaControlOn = nachaControlOn;
    }

    public PrimaryBusiness getBusinessInfo() {
        return businessInfo;
    }

    public void setBusinessInfo(PrimaryBusiness businessInfo) {
        this.businessInfo = businessInfo;
    }

    public List<AdditionalLocation> getAdditionalLocations() {
        return additionalLocations;
    }

    public void setAdditionalLocations(List<AdditionalLocation> additionalLocations) {
        this.additionalLocations = additionalLocations;
    }

    public RiskProfile getRiskProfile() {
        return riskProfile;
    }

    public void setRiskProfile(RiskProfile riskProfile) {
        this.riskProfile = riskProfile;
    }
}