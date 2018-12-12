package com.needyou.NeedU.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id  //primar'y key
	@Column(name="id")	
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private long userId;
	
	@Column(name = "enabled")
	private boolean enabled;
	 
	@Column(name="user_name")
	private String userName;

	@Column(name="launch_date")
	private String launchDate;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="location")
	private String location;
	
	@Column(name="total_helps")
	private String totalHelps;
	
	@Column(name="total_requests")
	private String totalRequests;
	
	@Column(name="total_needs_points")
	private String totalNeedsPoints;
	
	
//	@OneToOne(fetch = FetchType.LAZY,
//            cascade =  CascadeType.ALL,
//            mappedBy = "user")
//    private Need need;
	
	
	
	

	public User() {
        super();
        this.enabled=false;
    }

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTotalHelps() {
		return totalHelps;
	}

	public void setTotalHelps(String totalHelps) {
		this.totalHelps = totalHelps;
	}

	public String getTotalRequests() {
		return totalRequests;
	}

	public void setTotalRequests(String totalRequests) {
		this.totalRequests = totalRequests;
	}

	public String getTotalNeedsPoints() {
		return totalNeedsPoints;
	}

	public void setTotalNeedsPoints(String totalNeedsPoints) {
		this.totalNeedsPoints = totalNeedsPoints;
	}

	
	
	
}
