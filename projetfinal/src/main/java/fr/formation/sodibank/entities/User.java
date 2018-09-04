package fr.formation.sodibank.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class User implements Serializable {
	
	private static final long serialVersionUID = 1800900843909976847L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "{error.commons.required}")
    @Column(length = 255, nullable = false, unique = true)
    private String username;

    @NotNull(message = "{error.commons.required}")
    @Column(length = 100, nullable = false)
    private String password;

    @NotNull(message = "{error.commons.required}")
    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private Role role = Role.CUSTOMER;

    @Convert(converter = BooleanConverter.class)
    @Column(length = 1, nullable = false)
    public boolean accountNonExpired = true;

    @Convert(converter = BooleanConverter.class)
    @Column(length = 1, nullable = false)
    public boolean accountNonLocked = true;

    @Convert(converter = BooleanConverter.class)
    @Column(length = 1, nullable = false)
    public boolean credentialsNonExpired = true;

    @Convert(converter = BooleanConverter.class)
    @Column(length = 1, nullable = false)
    public boolean enabled = true;

    public User() {
	//
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getEmail() {
	return username;
    }

    public void setEmail(String username) {
	this.username = username;
    }

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
	this.password = password;
    }

    public Role getRole() {
	return role;
    }

    public void setRole(Role role) {
	this.role = role;
    }

    public boolean isAccountNonExpired() {
	return accountNonExpired;
    }

    public void setAccountNonExpired(boolean flag) {
	accountNonExpired = flag;
    }

    public boolean isAccountNonLocked() {
	return accountNonLocked;
    }

    public void setAccountNonLocked(boolean flag) {
	accountNonLocked = flag;
    }

    public boolean isCredentialsNonExpired() {
	return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(boolean flag) {
	credentialsNonExpired = flag;
    }

    public boolean isEnabled() {
	return enabled;
    }

    public void setEnabled(boolean flag) {
	enabled = flag;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (!(obj instanceof User)) {
	    return false;
	}
	User other = (User) obj;
	return username.equals(other.username);
    }

    @Override
    public int hashCode() {
	return Objects.hash(username);
    }

    @Override
    public String toString() {
	return "{id=" + id + ", username=" + username
		+ ", password=[SECRET], role=" + role + ", accountNonExpired="
		+ accountNonExpired + ", accountNonLocked=" + accountNonLocked
		+ ", credentialsNonExpired=" + credentialsNonExpired
		+ ", enabled=" + enabled + "}";
    }

    public static enum Role {
	CUSTOMER, ADMIN, PO, BANKER ;
    }
}
