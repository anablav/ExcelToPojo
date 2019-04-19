package com.example.exceltopojo.model;

import java.io.Serializable;

public class RiskProfile implements Serializable {
    private String segmentName;
    private Integer processingThreshold;
    private Integer alertPercentThreshold;
    private String creditScore;
    private Boolean sbgHighValueCustomer;
    private Boolean pcsHighValueCustomer;
    private Boolean banControlOn;
    private Boolean settlementOn;
    private String AML_tier;
    private Boolean hasBankruptcy;
    private Boolean disableKeyed;
    private Boolean disableSwiped;
    private Boolean fasterFundingEligible;
    private Boolean holdToAMVIndicator;
    private Integer achFundingDaysEligible;
    private Integer debitCardTxnThreshold;
    private Integer debitCardDailyThreshold;

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public Integer getProcessingThreshold() {
        return processingThreshold;
    }

    public void setProcessingThreshold(Integer processingThreshold) {
        this.processingThreshold = processingThreshold;
    }

    public Integer getAlertPercentThreshold() {
        return alertPercentThreshold;
    }

    public void setAlertPercentThreshold(Integer alertPercentThreshold) {
        this.alertPercentThreshold = alertPercentThreshold;
    }

    public String getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore;
    }

    public Boolean getSbgHighValueCustomer() {
        return sbgHighValueCustomer;
    }

    public void setSbgHighValueCustomer(Boolean sbgHighValueCustomer) {
        this.sbgHighValueCustomer = sbgHighValueCustomer;
    }

    public Boolean getPcsHighValueCustomer() {
        return pcsHighValueCustomer;
    }

    public void setPcsHighValueCustomer(Boolean pcsHighValueCustomer) {
        this.pcsHighValueCustomer = pcsHighValueCustomer;
    }

    public Boolean getBanControlOn() {
        return banControlOn;
    }

    public void setBanControlOn(Boolean banControlOn) {
        this.banControlOn = banControlOn;
    }

    public Boolean getSettlementOn() {
        return settlementOn;
    }

    public void setSettlementOn(Boolean settlementOn) {
        this.settlementOn = settlementOn;
    }

    public String getAML_tier() {
        return AML_tier;
    }

    public void setAML_tier(String AML_tier) {
        this.AML_tier = AML_tier;
    }

    public Boolean getHasBankruptcy() {
        return hasBankruptcy;
    }

    public void setHasBankruptcy(Boolean hasBankruptcy) {
        this.hasBankruptcy = hasBankruptcy;
    }

    public Boolean getDisableKeyed() {
        return disableKeyed;
    }

    public void setDisableKeyed(Boolean disableKeyed) {
        this.disableKeyed = disableKeyed;
    }

    public Boolean getDisableSwiped() {
        return disableSwiped;
    }

    public void setDisableSwiped(Boolean disableSwiped) {
        this.disableSwiped = disableSwiped;
    }

    public Boolean getFasterFundingEligible() {
        return fasterFundingEligible;
    }

    public void setFasterFundingEligible(Boolean fasterFundingEligible) {
        this.fasterFundingEligible = fasterFundingEligible;
    }

    public Boolean getHoldToAMVIndicator() {
        return holdToAMVIndicator;
    }

    public void setHoldToAMVIndicator(Boolean holdToAMVIndicator) {
        this.holdToAMVIndicator = holdToAMVIndicator;
    }

    public Integer getAchFundingDaysEligible() {
        return achFundingDaysEligible;
    }

    public void setAchFundingDaysEligible(Integer achFundingDaysEligible) {
        this.achFundingDaysEligible = achFundingDaysEligible;
    }

    public Integer getDebitCardTxnThreshold() {
        return debitCardTxnThreshold;
    }

    public void setDebitCardTxnThreshold(Integer debitCardTxnThreshold) {
        this.debitCardTxnThreshold = debitCardTxnThreshold;
    }

    public Integer getDebitCardDailyThreshold() {
        return debitCardDailyThreshold;
    }

    public void setDebitCardDailyThreshold(Integer debitCardDailyThreshold) {
        this.debitCardDailyThreshold = debitCardDailyThreshold;
    }

    public Boolean getDebitCardEnabled() {
        return debitCardEnabled;
    }

    public void setDebitCardEnabled(Boolean debitCardEnabled) {
        this.debitCardEnabled = debitCardEnabled;
    }

    private Boolean debitCardEnabled;


}