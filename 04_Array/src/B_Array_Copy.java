import java.util.Arrays;

public class B_Array_Copy {

	public static void main(String[] args) {
//		int[] origin= {1,2,3,4,5};
//		
//		System.out.println("==원본 배열 출력==");
//		for(int i = 0; i <origin.length; i++) {
//			System.out.print(origin[i] + " ");
//		}
//		System.out.println();
//		
//		int[] copy = origin;
//		System.out.println("==복사본 배열 출력 ==");
//		for(int i = 0; i<copy.length; i++) {
//			System.out.print(copy[i] + " ");
//		}
//		System.out.println();
//		
//		copy[2] = 99;
//		
//		System.out.println("=====복사본 배열 값 변경 후===");
//		
//		System.out.println("==원본 배열 출력==");
//		for(int i = 0; i <origin.length; i++) {
//			System.out.print(origin[i] + " ");
//		}
//		System.out.println();
//		
//		System.out.println("==복사본 배열 출력 ==");
//		for(int i = 0; i<copy.length; i++) {
//			System.out.print(copy[i] + " ");
//		}
//		System.out.println();
		
		
		//얇은복사의 문제점을 해결하기 위한 방법 : 깊은 복사.
		//for문 써서 새로운 배열에 반복문을 통해 원본배열의 값들은 새로운 배열에 대입하는 방법
//		int[] origin = {1,2,3,4,5};
//		
//		int[] copy = new int[5];
//		
//		for(int i = 0 ; i<origin.length; i++)
//			copy[i]=origin[i];
//		
//		for(int i = 0 ; i<origin.length; i++)
//			System.out.print(origin[i]+" ");
//		System.out.println();
//		for(int i = 0 ; i<origin.length; i++)
//			System.out.print(copy[i]+" ");
//		System.out.println(); 
//		copy[2] = 99;
//		for(int i = 0 ; i<origin.length; i++)
//			System.out.print(copy[i]+" ");
		
		
		//for문을 쓰지 않고 자바 시스템만 사용해서 배열 복사
		// 주소 값이 서로 다르다(깊은 복사), 각자 다른 배열을 참고하고 있음
//		int[] origin = {1,2,3,4,5};
//		int[] copy = new int[10];
//		//System.arraycopy(원본 배열, 복사 시작할 인덱스, 복사본 배열, 복사본 배열의 시작인덱스, 복사할 갯수)
//		System.arraycopy(origin, 2, copy, 0, 3);
//		
//		for(int i = 0; i <copy.length; i++) {
//			System.out.print(copy[i] + " ");
//		}
		
		
		//Arrays클래스에서 제공하는 copyOf()메서드 이용
//		int[] origin = {1,2,3,4,5};
//		
//		//복사본 배열 = Arrays.copyOf(원본배열명, 복사할 길이)
//		int[] copy = Arrays.copyOf(origin, 10);
//		
//		for(int i = 0 ; i<copy.length ;i ++)
//			System.out.print(copy[i]+" ");
		
		//clone() 메소드 활용
		int[] origin = {1,2,3,4,5};
		int[] copy = origin.clone();
		
		for(int i = 0 ; i<copy.length ;i ++)
			System.out.print(copy[i]+" ");
	}        

}
