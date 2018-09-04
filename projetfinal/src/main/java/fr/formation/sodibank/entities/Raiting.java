package fr.formation.sodibank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Raiting {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
	@Column
	private String code;
	
	@Column
	@ManyToOne
	private Double risk;
	
	
	
	@Column
	@OneToMany
	private Devise devise;
	
	
	public Raiting() {
		//
	}


	public Double getRisk() {
		return risk;
	}


	public void setRisk(Double risk) {
		this.risk = risk;
	}


	public Devise getDevise() {
		return devise;
	}


	public void setDevise(Devise devise) {
		this.devise = devise;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((devise == null) ? 0 : devise.hashCode());
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
		if (devise == null) {
			if (other.devise != null)
				return false;
		} else if (!devise.equals(other.devise))
			return false;
		if (risk == null) {
			if (other.risk != null)
				return false;
		} else if (!risk.equals(other.risk))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Raiting [code=" + code + ", risk=" + risk + ", devise=" + devise + ", getRisk()=" + getRisk()
				+ ", getDevise()=" + getDevise() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
