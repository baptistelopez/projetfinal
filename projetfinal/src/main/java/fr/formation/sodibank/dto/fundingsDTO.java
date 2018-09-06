package fr.formation.sodibank.dto;

import java.time.LocalDate;

public class fundingsDTO {

    private Long id;

    private Float amount;

    private LocalDate requestDate;

    public fundingsDTO() {
    }

    public fundingsDTO(Long id, Float amount, LocalDate requestDate) {
	setId(id);
	setAmount(amount);
	setRequestDate(requestDate);
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Float getAmount() {
	return amount;
    }

    public void setAmount(Float amount) {
	this.amount = amount;
    }

    public LocalDate getRequestDate() {
	return requestDate;
    }

    public void setRequestDate(LocalDate requesDate) {
	requestDate = requestDate;
    }
}
