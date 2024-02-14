package Movie;

public class login {
	//필드영역
	private String name;
	private String phoneNumber;
	private String age;
	private String[] customerInfo = {"김도헌","01051666235","29"};
	private String[] copyarr = new String[3];
	//생성자
	public login(String name, String phoneNumber, String age) {
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.age=age;
	}
	
	//메소드
	
	//생성자로 들어온 정보를 비교하기 편하게(?) 하기위해 배열로 넣어버림 Q1
	public void copy() {
		for(int i = 0 ; i<copyarr.length ; i++) {
			if(i==0)
				copyarr[i]=this.name;
			else if(i==1)
				copyarr[i]=this.phoneNumber;
			else if(i==2)
				copyarr[i]=this.age;
		}
	}
	
	
	
	public void checkInfo() {
		for(int i = 0; i<copyarr.length; i++) {
			if(!(copyarr[i].equals(customerInfo[i]))) {
	
				System.out.println("예악이 확인되지 않습니다. 다시 입력해주세요");
				return ;
			} 
				
		} 
		System.out.println(this.name+"님 예악이 확인됐습니다.");
		System.out.println();
		
	}
	
	
	
	
	
	
	
	
	
	
	//getter
	public String getName() {
		return this.name;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getAge() {
		return this.age;
	}
	

	//setter
	public void setName(String name) {
		this.name=name;
	}
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public void setage(String age) {
		this.age=age;
	}
	
	
}
