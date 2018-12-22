package org.fbertos.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "USER_", uniqueConstraints = { @UniqueConstraint(columnNames = { "USER_NAME" }) })
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "USER_NAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ACCOUNT_EXPIRED")
    private boolean accountExpired;

    @Column(name = "ACCOUNT_LOCKED")
    private boolean accountLocked;

    @Column(name = "CREDENTIALS_EXPIRED")
    private boolean credentialsExpired;

    @Column(name = "ENABLED")
    private boolean enabled;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isAccountExpired() {
		return accountExpired;
	}

	public void setAccountExpired(boolean accountExpired) {
		this.accountExpired = accountExpired;
	}

	public boolean isAccountLocked() {
		return accountLocked;
	}

	public void setAccountLocked(boolean accountLocked) {
		this.accountLocked = accountLocked;
	}

	public boolean isCredentialsExpired() {
		return credentialsExpired;
	}

	public void setCredentialsExpired(boolean credentialsExpired) {
		this.credentialsExpired = credentialsExpired;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getPassword() {
		return this.password;
	}

	public String getUsername() {
		return this.username;
	}

	public boolean isEnabled() {
		return this.enabled;
	}

	public boolean isAccountNonExpired() {
		return !this.accountExpired;
	}

	public boolean isAccountNonLocked() {
		return !this.accountLocked;
	}

	public boolean isCredentialsNonExpired() {
		return !this.credentialsExpired;
	}
}