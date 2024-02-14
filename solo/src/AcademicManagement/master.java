package AcademicManagement;

public class master extends Human implements methodSet{
	
	master[] m = new master[1];
	private String password = "0000"; //관리자 비번
	
	public master() {
		
	}
	
	public master(String password) {
		super();
		this.password=password;
	}
	
	
	
	
	
	@Override
	public void InfoCheck(String nameInfo) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public boolean login(String name, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	




	
	
	
	
	
}//end class
