package AcademicManagement;

public class Human {
	private String name, adress, eMail, password;
	private int age, phoneNumber;
	private char gender;

	public Human() {}
	
	public Human(String name, String adress, String eMail, int age, int phoneNumber, char gender, String password) {
		super();
		this.name = name;
		this.adress = adress;
		this.eMail = eMail;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.password = password;
	}//end Human

	
	

	@Override
	public String toString() {
		return " [이름 =" + name + ", 주소 =" + adress + ", eMail=" + eMail + ", 나이 =" + age + ", 핸드폰 번호 ="
				+ phoneNumber + ", 성별 =" + gender ;
	}

	protected String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}
	//getset
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getAdress() {
		return adress;
	}

	protected void setAdress(String adress) {
		this.adress = adress;
	}

	protected String geteMail() {
		return eMail;
	}

	protected void seteMail(String eMail) {
		this.eMail = eMail;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected int getPhoneNumber() {
		return phoneNumber;
	}

	protected void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	protected char getGender() {
		return gender;
	}

	protected void setGender(char gender) {
		this.gender = gender;
	}
	//end getset
	
	
	
	
	
}//end class
