package fr.formation.sodibank.dto;

public class ClientDTO {

    //
    private Long id;

    private String code;

    private String lastname;

    private String firstname;

    public ClientDTO() {
	//
    }

    public ClientDTO(Long id, String code, String lastname, String firstname) {
	//
	setId(id);
	setCode(code);
	setLastname(lastname);
	setFirstname(firstname);
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getCode() {
	return code;
    }

    public void setCode(String code) {
	this.code = code;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public String getFirstname() {
	return firstname;
    }

    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }
}
