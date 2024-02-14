package test8;

public class User implements Cloneable{
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;

	public User() {

	}

	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return id + " " + password + " " + name + " " + age + " " + gender
				+ " " + phone;
	}
	
	public boolean equals(Object obj) {
		boolean isEquals = false;
		
		if(obj instanceof User) {
			User tmpUser = ((User)obj);
			if (this.getName().equals(tmpUser.getName()) && this.getId().equals(tmpUser.getId()) &&
					this.password.equals(tmpUser.password)&& this.age==tmpUser.age && this.gender == tmpUser.gender &&
					this.getPhone().equals(tmpUser.getPhone())) {
				isEquals=true;
			}
		}
		
		
		return isEquals;
		
		
			
		
	}

	public Object clone() throws CloneNotSupportedException{
		 return (Object)super.clone();
//		 User newUser = new User(this.id, this.password, this.name, this.age, this.gender, this.phone);
		 //이런식으로 하나 만들어서 반환해도 됨
		 
		 
	}
	
	
	
	
	

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected char getGender() {
		return gender;
	}

	protected void setGender(char gender) {
		this.gender = gender;
	}

	protected String getPhone() {
		return phone;
	}

	protected void setPhone(String phone) {
		this.phone = phone;
	}

}
