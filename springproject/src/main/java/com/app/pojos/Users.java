package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer user_id;
	
	@Column(name = "FirstName",length = 20)
	private String firstname;
	@Column(name = "MiddleName",length = 20)
	private String middlename;
	@Column(name = "LastName",length = 20)
	private String lastname;
	@Column(name = "Email",length = 30,unique = true)
	private String email;
	@Column(name = "Password",length = 10)
	private String password;
	@Column(name = "ContactNo",length = 10)
	private String contactno;
	
	@Column(name="Gender")
	private String gender;

	@Column(name = "BloodGroup")
	private String bloodgroup;
	@Column(name = "date_of_Birth")
	private LocalDate dateofbirth;
	
	@JsonManagedReference
	@OneToOne(orphanRemoval = true,mappedBy = "userdetails",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
	private Description userdescription;

	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="doctors_id",nullable = true)
	private Doctors selecteddoctor;
	
	public Users() {
		System.out.println("in User Constr"+getClass().getName());
	}

	public Doctors getSelecteddoctor() {
		return selecteddoctor;
	}

	public void setSelecteddoctor(Doctors selecteddoctor) {
		this.selecteddoctor = selecteddoctor;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public LocalDate getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public Description getUserdescription() {
		return userdescription;
	}

	public void setUserdescription(Description userdescription) {
		this.userdescription = userdescription;
	}

	
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname="
				+ lastname + ", email=" + email + ", password=" + password + ", contactno=" + contactno + ", gender="
				+ gender + ", bloodgroup=" + bloodgroup + ", dateofbirth=" + dateofbirth + ", userdescription="
				+ userdescription + "]";
	}
	
	
}
