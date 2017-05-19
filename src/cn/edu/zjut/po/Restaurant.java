package cn.edu.zjut.po;

public class Restaurant implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String ID;
	private String name;
	private String password;
	private String confirmPassword;
	private String foodType;
	private Integer A;
	private Integer B;
	private Integer C;
	private Integer D;
	private Integer time;

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

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public Integer getA() {
		return A;
	}

	public void setA(Integer a) {
		A = a;
	}

	public Integer getB() {
		return B;
	}

	public void setB(Integer b) {
		B = b;
	}

	public Integer getC() {
		return C;
	}

	public void setC(Integer c) {
		C = c;
	}

	public Integer getD() {
		return D;
	}

	public void setD(Integer d) {
		D = d;
	}

	/** default constructor */
	public Restaurant() {
	}

	/** minimal constructor */
	public Restaurant(String ID) {
		this.ID = ID;
	}

}