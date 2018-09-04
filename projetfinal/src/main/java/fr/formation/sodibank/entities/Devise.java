/**
 * 
 */
package fr.formation.sodibank.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Administrateur
 *
 */
public class Devise {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
	@Column
	private String codeIso;
	
	
	@Column
	private TypeMoney money;
	
	
	public Devise() {
		//
	}
	
	
	
	
	public String getCodeIso() {
		return codeIso;
	}




	public void setCodeIso(String codeIso) {
		this.codeIso = codeIso;
	}




	public TypeMoney getMoney() {
		return money;
	}




	public void setMoney(TypeMoney money) {
		this.money = money;
	}
	
	
	




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeIso == null) ? 0 : codeIso.hashCode());
		result = prime * result + ((money == null) ? 0 : money.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Devise))
			return false;
		Devise other = (Devise) obj;
		if (codeIso == null) {
			if (other.codeIso != null)
				return false;
		} else if (!codeIso.equals(other.codeIso))
			return false;
		if (money != other.money)
			return false;
		return true;
	}







	public static enum TypeMoney {
		EUR, USD;

		public String getName() {
		    return name();
		}
	    }







	@Override
	public String toString() {
		return "Devise [money=" + money + "]";
	}
	
	
}
