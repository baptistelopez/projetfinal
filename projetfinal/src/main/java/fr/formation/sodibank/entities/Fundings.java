package fr.formation.sodibank.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

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
    private Double amount;

    @NotNull(message = "{error.commons.required}")
    @Column(length = 25, nullable = false)
    private Devise currency;

    @NotNull(message = "{error.commons.required}")
    @Column(length = 10, nullable = false, unique = true)
    private int duration;

    @NotNull(message = "{error.commons.required}")
    @Column(nullable = false, unique = true)
    private LocalDateTime fundingDateWished;

    @NotNull(message = "{error.commons.required}")
    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private FundingType type;

    @NotNull(message = "{error.commons.required}")
    @Column(nullable = false, unique = true)
    private LocalDateTime requestDate;

    @NotNull(message = "{error.commons.required}")
    @Column(nullable = false)
    private Double fundingPerformance;

    @NotNull(message = "{error.commons.required}")
    @Column(nullable = false)
    private Client customerCode;

    public Fundings() {
	//
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (amount == null ? 0 : amount.hashCode());
	result = prime * result + (currency == null ? 0 : currency.hashCode());
	result = prime * result
		+ (customerCode == null ? 0 : customerCode.hashCode());
	result = prime * result + duration;
	result = prime * result + (fundingDateWished == null ? 0
		: fundingDateWished.hashCode());
	result = prime * result + (fundingPerformance == null ? 0
		: fundingPerformance.hashCode());
	result = prime * result + (id == null ? 0 : id.hashCode());
	result = prime * result
		+ (reference == null ? 0 : reference.hashCode());
	result = prime * result
		+ (requestDate == null ? 0 : requestDate.hashCode());
	result = prime * result + (type == null ? 0 : type.hashCode());
	return result;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	Fundings other = (Fundings) obj;
	if (amount == null) {
	    if (other.amount != null) {
		return false;
	    }
	} else if (!amount.equals(other.amount)) {
	    return false;
	}
	if (currency == null) {
	    if (other.currency != null) {
		return false;
	    }
	} else if (!currency.equals(other.currency)) {
	    return false;
	}
	if (customerCode == null) {
	    if (other.customerCode != null) {
		return false;
	    }
	} else if (!customerCode.equals(other.customerCode)) {
	    return false;
	}
	if (duration != other.duration) {
	    return false;
	}
	if (fundingDateWished == null) {
	    if (other.fundingDateWished != null) {
		return false;
	    }
	} else if (!fundingDateWished.equals(other.fundingDateWished)) {
	    return false;
	}
	if (fundingPerformance == null) {
	    if (other.fundingPerformance != null) {
		return false;
	    }
	} else if (!fundingPerformance.equals(other.fundingPerformance)) {
	    return false;
	}
	if (id == null) {
	    if (other.id != null) {
		return false;
	    }
	} else if (!id.equals(other.id)) {
	    return false;
	}
	if (reference == null) {
	    if (other.reference != null) {
		return false;
	    }
	} else if (!reference.equals(other.reference)) {
	    return false;
	}
	if (requestDate == null) {
	    if (other.requestDate != null) {
		return false;
	    }
	} else if (!requestDate.equals(other.requestDate)) {
	    return false;
	}
	if (type != other.type) {
	    return false;
	}
	return true;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Fundings [id=" + id + ", reference=" + reference + ", amount="
		+ amount + ", currency=" + currency + ", duration=" + duration
		+ ", fundingDateWished=" + fundingDateWished + ", type=" + type
		+ ", requestDate=" + requestDate + ", fundingPerformance="
		+ fundingPerformance + ", customerCode=" + customerCode + "]";
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
    public Double getAmount() {
	return amount;
    }

    /**
     * @param amount
     *            the amount to set
     */
    public void setAmount(Double amount) {
	this.amount = amount;
    }

    /**
     * @return the currency
     */
    public Devise getCurrency() {
	return currency;
    }

    /**
     * @param currency
     *            the currency to set
     */
    public void setCurrency(Devise currency) {
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
    public LocalDateTime getFundingDateWished() {
	return fundingDateWished;
    }

    /**
     * @param fundingDateWished
     *            the fundingDateWished to set
     */
    public void setFundingDateWished(LocalDateTime fundingDateWished) {
	this.fundingDateWished = fundingDateWished;
    }

    /**
     * @return the type
     */
    public FundingType getType() {
	return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(FundingType type) {
	this.type = type;
    }

    /**
     * @return the requestDate
     */
    public LocalDateTime getRequestDate() {
	return requestDate;
    }

    /**
     * @param requestDate
     *            the requestDate to set
     */
    public void setRequestDate(LocalDateTime requestDate) {
	this.requestDate = requestDate;
    }

    /**
     * @return the fundingPerformance
     */
    public Double getFundingPerformance() {
	return fundingPerformance;
    }

    /**
     * @param fundingPerformance
     *            the fundingPerformance to set
     */
    public void setFundingPerformance(Double fundingPerformance) {
	this.fundingPerformance = fundingPerformance;
    }

    /**
     * @return the customerCode
     */
    public Client getCustomerCode() {
	return customerCode;
    }

    /**
     * @param customerCode
     *            the customerCode to set
     */
    public void setCustomerCode(Client customerCode) {
	this.customerCode = customerCode;
    }

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
	return serialVersionUID;
    }

    public static enum FundingType {
	SIMPLE, SYNDICATED, REVOLVING, EVOLVE,
    }
}
