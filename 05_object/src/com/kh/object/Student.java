package com.kh.object;
/*
 * 클래스의 구조
 * 
 * 옵션 class 이름 {
 * 		//필드영역
 * 			{사용할 데이터 들을 선언}
 * 
 * 		//생성자 영역
 * 			{데이터를 초기화해주는 특수목적의 메서드의 생성자를 정의하는 영역}
 * 
 * 		//메소드 영역
 * 			{클래스의 기능을 정의하는 영역}
 * 
 * }
 */

//class 앞에 있는 건 접근 제한자.
/*
 * 접근 제한자 종류 : public > protected > default > private
 * 
 * 클래스에 사용 가능한 접근 제한자는 2가지 = default 와 public 이다. 아무것도 안쓰면 default 이다.
 * 
 * 필드나 메소드에서 사용할 수 있는 접근제한자는 위에 총 4개.
 * public = 어디서든 사용 가능하다.(같은패키지나, 다른패키지 모두 접근이 가능하다)
 * protected = 같은 패키지 또는 다른 패키지일 경우 상속구조(부모자식 관계)만 접근 가능하다
 * default = 아무것도 쓰지 않은 것(같은 패키지에서만 접근 가능)
 * private = 오직 해당 클래스에서만 접근 가능한 것.
 * 
 * 위에서 아래로 내려 올 수록 접근할 수 있는 범위가 좁아진다.
 * 
 */
public class Student { //학생을 추상화해서 만든 클래스다.
	//필드영역
	//옵션 자료형 변수명;
	//public은 외부에서 함수로 값을 변경하거나 조회권한이 없는 사람이 값을 쉽게 가져올 수 있음.
	//그걸 방지하기위해 캡슐화를 진행한다.
	private String name;
	private String gender;
	private int age;
	private double height;
	
	//생성자 영역
	//옵션 클라스명(초기화하고자 하는 값을 담은 매개변수){초기화}
	public Student() {
		this("입력안됨",0,0,"입력안됨");
		//밑에 세줄 합친거
//		String name="입력안됨";
//		int age=0;
//		double height=0;
	}
	//매개변수가 있는 생성자 작성 기본생성자를 생성 안해준다.
	public Student(String name, int age, double height,String gender) {
		this.name=name;
		this.age=age;
		this.height=height;
		this.gender=gender;
	}
	
	public Student(String name, int age) {
		this(name, age, 0, "입력 안됨");
		//밑에 코드를 모두 합쳐서 작성한 것. *무조껀 위에 있어야 함 
//		this.name=name;
//		this.age=age;
//		this.height=0;
	}
	
	
	//메소드 영역
	/*
	 * <옵션명>
	 * 옵션 메소드명(매개변수){
	 *		기능코드
	 *}
	 *
	 *매개변수 : 해당 메소드 호출시 전달값(인자)을 받아주기 위한 변수.(해당 메소드 내에서만 사용 가능하다)
	 */
	public void print() {
		System.out.println("안녕하세요. "+ this.age + "살 " + this.name + " 입니다."+ this.gender + " 입니다");
	}
	//동일한 이름의 메소드가 있을 때 매개변수의 개수 또는 자료형에 따라서 메소드를 구분할 수 있다.
	public void print(String gender) {
		System.out.println("안녕하세요. "+ this.age + "살 " + this.name + "이고 성별은"+ this.gender + " 입니다");
	}
	
	//getter, setter
	//getter : 해당 필드에 값을 가지고 오기위한 메소드
	//setter : 해당 필드에 값을 대입시키기 위한 메소드
	
	
	//여기서부터 캡슐화
	//캡슐화 : 추상화를 통해서 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법중 하나로
	//클래스에서 가장 중요한 목적인 데이터의 접근 제한을(정보은닉)을 원칙으로 외부로부터의 데이터의 접근을
	//막고 대신에 "데이터를 간접적으로" 처리(값을 대입, 값을 돌려주거나) 할 메소드들을 클래스 내부에 작성해서
	//관리하는 것. "내 규칙을 따라라"
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age > 0 ? age : 1;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
}
