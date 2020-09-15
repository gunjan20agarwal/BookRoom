package com.books.bookroom.model;
// Generated 15 Sep, 2020 4:34:00 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UserDetails generated by hbm2java
 */
@Entity
@Table(name = "user_details", catalog = "bookroom")
public class UserDetails implements java.io.Serializable {

	private int userId;
	private String username;
	private String password;
	private String email;
	private String contactNo;
	private String gender;
	private String age;
	private String noOfBookIssued;
	private String activePlanId;
	private String privileges;

	public UserDetails() {
	}

	public UserDetails(int userId) {
		this.userId = userId;
	}

	public UserDetails(int userId, String username, String password, String email, String contactNo, String gender,
			String age, String noOfBookIssued, String activePlanId, String privileges) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.contactNo = contactNo;
		this.gender = gender;
		this.age = age;
		this.noOfBookIssued = noOfBookIssued;
		this.activePlanId = activePlanId;
		this.privileges = privileges;
	}

	@Id

	@Column(name = "User_ID", unique = true, nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "username", length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "contactNo", length = 45)
	public String getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	@Column(name = "gender", length = 45)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "age", length = 45)
	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Column(name = "NoOfBookIssued", length = 45)
	public String getNoOfBookIssued() {
		return this.noOfBookIssued;
	}

	public void setNoOfBookIssued(String noOfBookIssued) {
		this.noOfBookIssued = noOfBookIssued;
	}

	@Column(name = "ActivePlanID", length = 45)
	public String getActivePlanId() {
		return this.activePlanId;
	}

	public void setActivePlanId(String activePlanId) {
		this.activePlanId = activePlanId;
	}

	@Column(name = "Privileges", length = 45)
	public String getPrivileges() {
		return this.privileges;
	}

	public void setPrivileges(String privileges) {
		this.privileges = privileges;
	}

}
