package com.matrimony.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "interest")
public class UserInterest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long interestId;
	private String sourceUser;
	private String targetUser;
	
	private long tragetUserId;

	private String status;
	@ManyToOne
	User user;
	public long getInterestId() {
		return interestId;
	}
	public void setInterestId(int interestId) {
		this.interestId = interestId;
	}
	public String getSourceUser() {
		return sourceUser;
	}
	public void setSourceUser(String sourceUser) {
		this.sourceUser = sourceUser;
	}
	public String getTargetUser() {
		return targetUser;
	}
	public void setTargetUser(String targetUser) {
		this.targetUser = targetUser;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public User getUser() { return user; } public void setUser(User user) {
		this.user = user; }
	public long getTragetUserId() {
		return tragetUserId;
	}
	public void setTragetUserId(long tragetUserId) {
		this.tragetUserId = tragetUserId;
	}



}
