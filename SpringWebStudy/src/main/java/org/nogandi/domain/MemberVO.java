package org.nogandi.domain;

public class MemberVO {

	private String userId;
	private String userPw;
	private String userName;
	private String email;
	private String regDate;
	private String updatgeDate;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getUpdatgeDate() {
		return updatgeDate;
	}
	public void setUpdatgeDate(String updatgeDate) {
		this.updatgeDate = updatgeDate;
	}
	@Override
	public String toString() {
		return "MemberVO [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", email=" + email
				+ ", regDate=" + regDate + ", updatgeDate=" + updatgeDate + "]";
	}
	
	
}
