package fr.formation.sodibank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Raiting {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
	@Column(nullable = false)
	private String code;
	
	@Column(nullable = false)
	@NotNull(message = "{error.commons.required}")
	private Double risk;
	
	
	
	public Raiting() {
		//
	}


	public Double getRisk() {
		return risk;
	}


	public void setRisk(Double risk) {
		this.risk = risk;
	}


	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((risk == null) ? 0 : risk.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Raiting))
			return false;
		Raiting other = (Raiting) obj;
		
		if (risk == null) {
			if (other.risk != null)
				return false;
		} else if (!risk.equals(other.risk))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Raiting [code=" + code + ", risk=" + risk + ",  getRisk()=" + getRisk()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
