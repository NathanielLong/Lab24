package co.grandcircus.Lab24;

import org.springframework.stereotype.Component;

public class UsersInfo {

	private Integer id;
	private String firstname;
	private String lastname;
	private String mail;
	private Integer phone;
	private String password;

	public UsersInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersInfo(String firstname, String lastname, String mail, Integer phone, String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.mail = mail;
		this.phone = phone;
		this.password = password;
	}

	public UsersInfo(Integer id, String firstname, String lastname, String mail, Integer phone, String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mail = mail;
		this.phone = phone;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UsersInfo [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", mail=" + mail
				+ ", phone=" + phone + ", password=" + password + "]";
	}
	
	

	

}
