package AcademicManagement;

public class professor extends Human implements methodSet{

	professor[] pf = new professor[2];
	private int classDate; //1~5 랜덤 수 발생, 랜덤값에 대입해서 월~화 중  2일 수업 확정
	

	public professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public professor(String name, String adress, String eMail, int age, int phoneNumber, char gender, String password) {
		super(name, adress, eMail, age, phoneNumber, gender, password);
		
	}

	@Override
	public void InfoCheck(String nameInfo) { //학생 정보 조회
		for(int i = 0; i<pf.length; i++) {
			if(nameInfo.equals(pf[i].getName())) {
				System.out.println(pf[i].toString());
			}
		}
	}

	@Override
	public boolean login(String name, String password) {
		
		for(int i=0;i<pf.length;i++) {
			if(name.equals(pf[i].getName()) && password.equals(pf[i].getPassword())){
				return true;
			}
		}
		return false;
	}

	
	
	
	public void proSet() {
		pf[0] = new professor("aaaa", "kyunggi","kdh03077@naver.com", 45,0101111111,'m',"123123123");
	}

	
	
	
	
	
	@Override
	public String toString() {
		return super.toString();
	}

	protected professor[] getPf() {
		return pf;
	}

	protected void setPf(professor[] pf) {
		this.pf = pf;
	}

	protected int getClassDate() {
		return classDate;
	}

	protected void setClassDate(int classDate) {
		this.classDate = classDate;
	}
	
	
	
}//end class
