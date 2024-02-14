package AcademicManagement;

public class Student extends Human implements methodSet{
	
	Student[] st = new Student[3]; // 학생 정보 등록

	private double score; //현재까지 학점 (지금까지 들었던 학점 합), ex) 2.8, 4.5만점
	private int academicCredit; //취득 학점 (130점 졸업)
	private char TuitionPayments, collegeGraduation; //등록금 제출 여부 y/n, 졸업 가능 여부 y/n
	
	public Student() {}
	
	
	
	public Student(String name, String adress, String eMail, int age, int phoneNumber, char gender, double score,
			int academicCredit, char tuitionPayments, char collegeGraduation,String password) {
		super(name, adress, eMail, age, phoneNumber, gender,password );
		this.score = score;
		this.academicCredit = academicCredit;
		TuitionPayments = tuitionPayments;
		this.collegeGraduation = collegeGraduation;
	}//end Student
	
	public void studentInfoSet() { //학생정보 초기화
		
		st[0] = new Student("kim", "korea", "kdh", 27, 010, 'm', 3.0, 130, 'y','y',"123123123");
		st[1] = new Student("DO", "korea", "kdh", 27, 010, 'm', 3.0, 130, 'y','y',"456456456");
		st[2] = new Student("HJ", "korea", "kdh", 27, 010, 'm', 3.0, 130, 'y','y',"789789789");
	}
	
	
	
	@Override
	public void InfoCheck(String nameInfo) { //학생 정보 조회
		for(int i = 0; i<st.length; i++) {
			if(nameInfo.equals(st[i].getName())) {
				System.out.println(st[i].toString());
			}
		}
		
		
	}
	@Override
	public boolean login(String name, String password) {
		
		for(int i=0;i<st.length;i++) {
			if(name.equals(st[i].getName()) && password.equals(st[i].getPassword())){
				return true;
			}
		}
		return false;
	}
	
	public boolean passwordCheck(String password) {
		
		for(int i=0;i<st.length;i++) {
			if(password.equals(st[i].getPassword())){
				return true;
			}
		}
		return false;
	}
	
	public void passwordChange(String chPassword) {
		super.setPassword(chPassword);
	}
	
	
	
	
	
	protected Student[] getSt() {
		return st;
	}



	protected void setSt(Student[] st) {
		this.st = st;
	}



	@Override
	public String toString() {
		return super.toString()+", 현재 취득 학점 =" + score + ", 취득해야 할 총 학점 =" + academicCredit + ", 등록금 제출 여부 =" + TuitionPayments
				+ ", 졸업 가능 여부 =" + collegeGraduation + "]";
	}






	//getset
	protected double getScore() {
		return score;
	}

	protected void setScore(double score) {
		this.score = score;
	}

	protected int getAcademicCredit() {
		return academicCredit;
	}

	protected void setAcademicCredit(int academicCredit) {
		this.academicCredit = academicCredit;
	}

	protected char getTuitionPayments() {
		return TuitionPayments;
	}

	protected void setTuitionPayments(char tuitionPayments) {
		TuitionPayments = tuitionPayments;
	}

	protected char getCollegeGraduation() {
		return collegeGraduation;
	}

	protected void setCollegeGraduation(char collegeGraduation) {
		this.collegeGraduation = collegeGraduation;
	}
	//end getset
	

}//end class
