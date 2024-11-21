package com.javaex.vo;

public class UserVo {

	private int userNo;
	private String id;
	private String pw;

	public UserVo() {
		super();
	}

	public UserVo(int userNo, String id, String pw) {
		super();
		this.userNo = userNo;
		this.id = id;
		this.pw = pw;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "UserVo [userNo=" + userNo + ", id=" + id + ", pw=" + pw + "]";
	}

}
