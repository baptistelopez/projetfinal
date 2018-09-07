package fr.formation.sodibank.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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

    @NotNull(message = "{error.commons.required}")
    @Column(length = 10, nullable = false)
    private String lastname;

    @NotNull(message = "{error.commons.required}")
    @Column(length = 10, nullable = false)
    private String fistname;

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

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private List<Client> clients;

    public User() {
	////
    }

    /**
     * @return the clients
     */
    public List<Client> getClients() {
	return clients;
    }

    /**
     * @param clients
     *            the clients to set
     */
    public void setClients(List<Client> clients) {
	this.clients = clients;
    }

    public Long getId() {
	return id;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
	return lastname;
    }

    /**
     * @param lastname
     *            the lastname to set
     */
    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    /**
     * @return the fistname
     */
    public String getFistname() {
	return fistname;
    }

    /**
     * @param fistname
     *            the fistname to set
     */
    public void setFistname(String fistname) {
	this.fistname = fistname;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
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

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "User [id=" + id + ", username=" + username + ", password="
		+ password + ", role=" + role + ", lastname=" + lastname
		+ ", fistname=" + fistname + ", accountNonExpired="
		+ accountNonExpired + ", accountNonLocked=" + accountNonLocked
		+ ", credentialsNonExpired=" + credentialsNonExpired
		+ ", enabled=" + enabled + "]";
    }

    public static enum Role {
	CUSTOMER, ADMIN, PO, BANKER;

	public String getName() {
	    return name();
	}
    }
}
