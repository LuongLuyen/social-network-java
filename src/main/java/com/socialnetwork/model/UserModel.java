package com.socialnetwork.model;

public class UserModel extends AbstractModel{
	private String userName;
	private String password;
	private String fullName;
	private String email;
	private String studyAt;
	private String workingAt;
	private String otherInfo;
	private String dateOfbirth;
	private String avatarUrl;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStudyAt() {
		return studyAt;
	}
	public void setStudyAt(String studyAt) {
		this.studyAt = studyAt;
	}
	public String getWorkingAt() {
		return workingAt;
	}
	public void setWorkingAt(String workingAt) {
		this.workingAt = workingAt;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
	public String getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(String dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}
	public String getAvatarUrl() {
		return avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
}
