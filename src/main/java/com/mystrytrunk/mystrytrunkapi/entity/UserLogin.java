package com.mystrytrunk.mystrytrunkapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Table(name="userlogin")
@SequenceGenerator(name="seq", initialValue=1)
@Component
public class UserLogin {
	
	public int getLoginid() {
		return loginid;
	}

	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public UserLogin(int loginid, String email, String phoneNumber, String password, UserDetails userDetails) {
		super();
		this.loginid = loginid;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.userDetails = userDetails;
	}

	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="login_id")
	private int loginid;
	
		
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phoneNumber;
	
	@Column(name="password")
	private String password;
	
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userdetails.user_id", nullable = false, referencedColumnName = "user_id")
    private UserDetails userDetails;

}
