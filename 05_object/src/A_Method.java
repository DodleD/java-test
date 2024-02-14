
public class A_Method {
	//main은 누가 부르냐? : 컴퓨터가 부른다(우리가 문자열 넘기면 컴퓨터가 받는다.)
	public static void main(String[] args) {
//		System.out.println("프로그램 시작");
//		double myHeight = 175.9;
//		hiEvreyone(12, 1.25);
//		hiEvreyone(13, myHeight);
//		byEvreyone();
//		
//		
//	}
//	
//	public static void hiEvreyone(int age, double height){ // 인자를 넘겨받기 위해 잠깐 사용하는 변수 = 매개변수) 
//		System.out.println("제 나이는 "+age+" 입니다.");
//		System.out.println("제 키는 "+height+" cm입니다.");
//		}
//	public static void byEvreyone(){
//		System.out.println("다음에 뵙겠습니다.");
		
		//====================================
		
		int result;
		result = adder(4,5);
		System.out.println("4 + 5 =" + result);
		System.out.println("3.5 x 3.5 = " + square(3.5));
		
		}
		         //여기 형 int 같은 건 반환타입, 무조껀 하나만 가져갈 수 있음
		public static int adder(int num1, int num2) {
			int addResult = num1 +num2;
			return addResult;
		}
		
		public static double square(double num) {
			return num * num;
		}
	

}
