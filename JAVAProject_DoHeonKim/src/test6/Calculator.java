package test6;

public class Calculator {
	
	
	public double getSum(int data) {
		int sum=0;
		if(data<2 || data>5) {
			 try {
				throw new Exception("InvalidException");
			 }catch(Exception i) {
				 System.out.println("입력 값에 오류가 있습니다.");
			}
		}
		else{
				for(int i = 1; i<=data; i++) 
					sum+=i;
			}
	
		return sum;
		}
}
