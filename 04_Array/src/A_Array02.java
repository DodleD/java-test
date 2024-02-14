
public class A_Array02 {

	public static void main(String[] args) {
		int i = 30;
		int[] iArr= new int[5];
		
		double[] d = new double[3];
		
		
		System.out.println(iArr);
		System.out.println(d);
		
		System.out.println("==========");
		
		for(int j = 0; j<iArr.length ; j++) // length() <- 소괄호가 없음.
			System.out.println(iArr[j]);
			
		for(int j = 0; j<iArr.length ; j++)
			System.out.println(d[j]);
		
		System.out.println(iArr.hashCode()); // 10진수 형태의 주소 값.
		
		//같은 참조변수를 두 번 선언하면 원래 있던 주소 값이 끊기고 새로운 주소 값이 차지한다.
		//원래 있던건 그냥 둥둥 힙 영역에 떠다니다가 가비지 컬렉터가 쓸어간다.

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//heap 공간에는 빈공간이 있을 수 없다. 따라서 JMV가 기본 값으로 초기화를 진행시킨다.
		
		
		//int, char 이런 친구들은 일반 변수
		//배열로 선언된건 주소 값을 가지고 있는 레퍼런스 변수(참조 변수)
	}

}
