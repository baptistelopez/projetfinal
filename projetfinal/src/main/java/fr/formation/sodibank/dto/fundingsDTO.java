package fr.formation.sodibank.dto;

import java.util.Date;

import fr.formation.sodibank.entities.FundingsType;

public class fundingsDTO {

    private Long id;

    private String reference;

    private Float amount;

    private String currency;

    private int duration;

    private Date fundingDateWished;

    private FundingsType fundingsType;

    private Date requestDate;

    private float fundingPerformance;

    public fundingsDTO() {
    }

    public fundingsDTO(Long id, String reference, Float amount, String currency,
	    int duration, Date fundingDateWished, FundingsType fundingsType,
	    Date requestDate, float fundingPerformance) {
	setId(id);
	setReference(reference);
	setAmount(amount);
	setCurrency(currency);
	setDuration(duration);
	setFundingDateWished(fundingDateWished);
	setFundingsType(fundingsType);
	setRequestDate(requestDate);
	setFundingPerformance(fundingPerformance);
    }

    /**
     * @return the id
     */
    public Long getId() {
	return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Long id) {
	this.id = id;
    }

    /**
     * @return the reference
     */
    public String getReference() {
	return reference;
    }

    /**
     * @param reference
     *            the reference to set
     */
    public void setReference(String reference) {
	this.reference = reference;
    }

    /**
     * @return the amount
     */
    public Float getAmount() {
	return amount;
    }

    /**
     * @param amount
     *            the amount to set
     */
    public void setAmount(Float amount) {
	this.amount = amount;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
	return currency;
    }

    /**
     * @param currency
     *            the currency to set
     */
    public void setCurrency(String currency) {
	this.currency = currency;
    }

    /**
     * @return the duration
     */
    public int getDuration() {
	return duration;
    }

    /**
     * @param duration
     *            the duration to set
     */
    public void setDuration(int duration) {
	this.duration = duration;
    }

    /**
     * @return the fundingDateWished
     */
    public Date getFundingDateWished() {
	return fundingDateWished;
    }

    /**
     * @param fundingDateWished
     *            the fundingDateWished to set
     */
    public void setFundingDateWished(Date fundingDateWished) {
	this.fundingDateWished = fundingDateWished;
    }

    /**
     * @return the fundingsType
     */
    public FundingsType getFundingsType() {
	return fundingsType;
    }

    /**
     * @param fundingsType
     *            the fundingsType to set
     */
    public void setFundingsType(FundingsType fundingsType) {
	this.fundingsType = fundingsType;
    }

    /**
     * @return the requestDate
     */
    public Date getRequestDate() {
	return requestDate;
    }

    /**
     * @param requestDate
     *            the requestDate to set
     */
    public void setRequestDate(Date requestDate) {
	this.requestDate = requestDate;
    }

    /**
     * @return the fundingPerformance
     */
    public float getFundingPerformance() {
	return fundingPerformance;
    }

    /**
     * @param fundingPerformance
     *            the fundingPerformance to set
     */
    public void setFundingPerformance(float fundingPerformance) {
	this.fundingPerformance = fundingPerformance;
    }
}
