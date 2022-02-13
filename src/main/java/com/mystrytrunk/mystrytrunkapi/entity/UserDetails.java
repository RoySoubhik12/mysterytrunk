package com.mystrytrunk.mystrytrunkapi.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Table(name = "userdetails")
@SequenceGenerator(name="seq", initialValue=1)
@Component
public class UserDetails {

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public boolean isEmailVerificationStatus() {
		return emailVerificationStatus;
	}

	public void setEmailVerificationStatus(boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}

	public boolean isPhoneVerificationStatus() {
		return phoneVerificationStatus;
	}

	public void setPhoneVerificationStatus(boolean phoneVerificationStatus) {
		this.phoneVerificationStatus = phoneVerificationStatus;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public UserLogin getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}

	public UserDetails(int userid, String name, String email, String phoneNumber, Date createdDate,
			Date lastUpdatedDate, Integer pin, boolean emailVerificationStatus, boolean phoneVerificationStatus,
			String gender, Date dateOfBirth, UserLogin userLogin) {
		super();
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.createdDate = createdDate;
		this.lastUpdatedDate = lastUpdatedDate;
		this.pin = pin;
		this.emailVerificationStatus = emailVerificationStatus;
		this.phoneVerificationStatus = phoneVerificationStatus;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		System.out.println((userLogin));
		this.userLogin = userLogin;
	}

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "user_id")
	private int userid;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "created_date")
	private Date createdDate;
	@Column(name = "last_updated_date")
	private Date lastUpdatedDate;
	@Column(name = "pin")
	private Integer pin;
	@Column(name = "email_verification_status")
	private boolean emailVerificationStatus;
	@Column(name = "phone_verification_status")
	private boolean phoneVerificationStatus;
	@Column(name = "gender")
	private String gender;
	@Column(name = "date_of_birth")
	private Date dateOfBirth;

	 @OneToOne(fetch = FetchType.LAZY,
	            cascade =  CascadeType.ALL,
	            mappedBy = "userDetails")
	private UserLogin userLogin;

}
