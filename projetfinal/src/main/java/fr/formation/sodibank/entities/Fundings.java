package fr.formation.sodibank.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Fundings implements Serializable {

    private static final long serialVersionUID = 1800900843909976847L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false, unique = true)
    private String reference;

    @NotNull(message = "{error.commons.required}")
    @Column(length = 10, nullable = false, unique = true)
    private Float amount;

    @NotNull(message = "{error.commons.required}")
    @Column(length = 25, nullable = false)
    private String currency;

    @NotNull(message = "{error.commons.required}")
    @Column(length = 10, nullable = false, unique = true)
    private int duration;

    @NotNull(message = "{error.commons.required}")
    @Column(nullable = false, unique = true)
    private LocalDate fundingDateWished;

    @NotNull(message = "{error.commons.required}")
    @ManyToOne
    @JoinColumn(nullable = false)
    private FundingsType fundingsType;

    @NotNull(message = "{error.commons.required}")
    @Column(nullable = false, unique = true)
    private LocalDate requestDate;

    @NotNull(message = "{error.commons.required}")
    @Column(nullable = false)
    private Float fundingPerformance;

    public Fundings() {
	//
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
    public LocalDate getFundingDateWished() {
	return fundingDateWished;
    }

    /**
     * @param fundingDateWished
     *            the fundingDateWished to set
     */
    public void setFundingDateWished(LocalDate fundingDateWished) {
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
    public LocalDate getRequestDate() {
	return requestDate;
    }

    /**
     * @param requestDate
     *            the requestDate to set
     */
    public void setRequestDate(LocalDate requestDate) {
	this.requestDate = requestDate;
    }

    /**
     * @return the fundingPerformance
     */
    public Float getFundingPerformance() {
	return fundingPerformance;
    }

    /**
     * @param fundingPerformance
     *            the fundingPerformance to set
     */
    public void setFundingPerformance(Float fundingPerformance) {
	this.fundingPerformance = fundingPerformance;
    }

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
	return serialVersionUID;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Fundings [id=" + id + ", reference=" + reference + ", amount="
		+ amount + ", currency=" + currency + ", duration=" + duration
		+ ", fundingDateWished=" + fundingDateWished + ", fundingsType="
		+ fundingsType + ", requestDate=" + requestDate
		+ ", fundingPerformance=" + fundingPerformance + "]";
    }
}
