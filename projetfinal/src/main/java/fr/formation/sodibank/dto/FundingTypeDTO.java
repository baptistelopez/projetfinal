package fr.formation.sodibank.dto;

/**
 * @author Frank MARSHALL
 */
public class FundingTypeDTO {
    //

    private Long id;

    private String name;

    public FundingTypeDTO() {
	//
    }

    public FundingTypeDTO(Long id, String name) {
	setId(id);
	setName(name);
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public String toString() {
	return "FundingTypeDTO [id=" + id + ", name=" + name + "]";
    }
}
