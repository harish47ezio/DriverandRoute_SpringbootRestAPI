package com.amdocs.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name ="Driver")
public class Driver {
	
	@Id
	@Column(name="DRNO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer drno;
	
	@Column(name = "FIRSTNAME")
	private String firstName;
	
	@Column(name = "LASTNAME")
	private String lastName;

	@Column(name = "PHNO")
	private long phno;
	
	@Column(name = "LNO")
	private long lno;
	
	@OneToMany(mappedBy="drivers",cascade = CascadeType.ALL)
	private Set<Route> rnno=new HashSet<Route>();

	public Integer getDrno() {
		return drno;
	}

	public void setDrno(Integer drno) {
		this.drno = drno;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public long getLno() {
		return lno;
	}

	public void setLno(long lno) {
		this.lno = lno;
	}

	public Driver(Integer drno, String firstName, String lastName, long phno, long lno) {
		super();
		this.drno = drno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phno = phno;
		this.lno = lno;
	}
	
	public Driver() {
		// TODO Auto-generated constructor stub
	}
}
