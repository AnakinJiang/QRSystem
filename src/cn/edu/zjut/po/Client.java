package cn.edu.zjut.po;

public class Client implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6022958339812034459L;
	private String ID;
	private String name;
	private String password;
	private String confirmPassword;
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
