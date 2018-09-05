package fr.formation.sodibank.entities;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Fundings implements Serializable {
	
	private static final long serialVersionUID = 1800900843909976847L;

   
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	
	
	@Column(length = 10, nullable = false, unique = true)
    private String ref;

    @NotNull(message = "{error.commons.required}")
    @Column(length = 10, nullable = false, unique = true)
    private float amount;

    @NotNull(message = "{error.commons.required}")
    @Column(length = 25, nullable = false)
    private String currency;
    
    @NotNull(message = "{error.commons.required}")
    @Column(length = 10, nullable = false, unique = true)
    private int duration;
    
    @NotNull(message = "{error.commons.required}")
    @Column(nullable = false, unique = true)
    private Date actualBeginDateWished;

    @NotNull(message = "{error.commons.required}")
    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private FundingType fundingType = FundingType.SIMPLE;

    @NotNull(message = "{error.commons.required}")
    @Column(nullable = false, unique = true)
    private Date requestDate;
    
    @NotNull(message = "{error.commons.required}")
    @Column(length = 7, nullable = false, unique = true)
    private float customerRating;
    
    @NotNull(message = "{error.commons.required}")
    @Column(length = 7, nullable = false, unique = true)
    private float customersCountryRating;
    
    @NotNull(message = "{error.commons.required}")
    @Column(length = 5, nullable = false, unique = true)
    private float riskRatio;
    
    @NotNull(message = "{error.commons.required}")
    @Column(length = 7, nullable = false, unique = true)
    private float returnRatio;

    public Fundings() {
	//
    }

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getActualBeginDateWished() {
		return actualBeginDateWished;
	}

	public void setActualBeginDateWished(Date actualBeginDateWished) {
		this.actualBeginDateWished = actualBeginDateWished;
	}

	public FundingType getFundingType() {
		return fundingType;
	}

	public void setFundingType(FundingType fundingType) {
		this.fundingType = fundingType;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getCustomerRating() {
		return customerRating;
	}

	public void setCustomerRating(float customerRating) {
		this.customerRating = customerRating;
	}

	public float getCustomersCountryRating() {
		return customersCountryRating;
	}

	public void setCustomersCountryRating(float customersCountryRating) {
		this.customersCountryRating = customersCountryRating;
	}

	public float getRiskRatio() {
		return riskRatio;
	}

	public void setRiskRatio(float riskRatio) {
		this.riskRatio = riskRatio;
	}

	public float getReturnRatio() {
		return returnRatio;
	}

	public void setReturnRatio(float returnRatio) {
		this.returnRatio = returnRatio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actualBeginDateWished == null) ? 0 : actualBeginDateWished.hashCode());
		result = prime * result + Float.floatToIntBits(amount);
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + Float.floatToIntBits(customerRating);
		result = prime * result + Float.floatToIntBits(customersCountryRating);
		result = prime * result + duration;
		result = prime * result + ((fundingType == null) ? 0 : fundingType.hashCode());
		result = prime * result + ((ref == null) ? 0 : ref.hashCode());
		result = prime * result + ((requestDate == null) ? 0 : requestDate.hashCode());
		result = prime * result + Float.floatToIntBits(returnRatio);
		result = prime * result + Float.floatToIntBits(riskRatio);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Fundings)) {
			return false;
		}
		Fundings other = (Fundings) obj;
		if (actualBeginDateWished == null) {
			if (other.actualBeginDateWished != null) {
				return false;
			}
		} else if (!actualBeginDateWished.equals(other.actualBeginDateWished)) {
			return false;
		}
		if (Float.floatToIntBits(amount) != Float.floatToIntBits(other.amount)) {
			return false;
		}
		if (currency == null) {
			if (other.currency != null) {
				return false;
			}
		} else if (!currency.equals(other.currency)) {
			return false;
		}
		if (Float.floatToIntBits(customerRating) != Float.floatToIntBits(other.customerRating)) {
			return false;
		}
		if (Float.floatToIntBits(customersCountryRating) != Float.floatToIntBits(other.customersCountryRating)) {
			return false;
		}
		if (duration != other.duration) {
			return false;
		}
		if (fundingType != other.fundingType) {
			return false;
		}
		if (ref == null) {
			if (other.ref != null) {
				return false;
			}
		} else if (!ref.equals(other.ref)) {
			return false;
		}
		if (requestDate == null) {
			if (other.requestDate != null) {
				return false;
			}
		} else if (!requestDate.equals(other.requestDate)) {
			return false;
		}
		if (Float.floatToIntBits(returnRatio) != Float.floatToIntBits(other.returnRatio)) {
			return false;
		}
		if (Float.floatToIntBits(riskRatio) != Float.floatToIntBits(other.riskRatio)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Fundings {ref=" + ref + ", amount=" + amount + ", currency=" + currency + ", duration=" + duration
				+ ", actualBeginDateWished=" + actualBeginDateWished + ", fundingType=" + fundingType + ", requestDate="
				+ requestDate + ", customerRating=" + customerRating + ", customersCountryRating="
				+ customersCountryRating + ", riskRatio=" + riskRatio + ", returnRatio=" + returnRatio + "}";
	}

	public static enum FundingType {
	SIMPLE, SYNDICATED, REVOLVING ;
	}
}
