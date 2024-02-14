import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		/*
		 * 객체 배열
		 * 객체를 저장하는 배열로 일반적인 배열과 다르게
		 * 배열의 각 요소가 객체로 이루어져 있으며 만들고 메모리공간을
		 * 할당해야함.
		 * Human[] arr = new Human[5];
		 */
//		Human[] arr = new Human[5];
//		
//		for(int i = 0; i<arr.length;i++) {
//			
//			arr[i]=new Human("김도헌",i+100);
//		}
//		
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i].getName()+" "+arr[i].getAge() );
//		}
//
//		Human[] arr2 = {new Human("rrr",100)};
//		//이렇게 선언 및 초기화해도 된다.
		
		
		//============================================
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("제목을 입력해주세요 : ");
		String name=sc.next();
		
		System.out.println("장르를 입력해주세요  : ");
		String genre = sc.next();
		
		System.out.println("저자를 입력해주세요 : ");
		String author = sc.next();
		
		System.out.println("책 번호를 입력해주세요 : ");
		int number = sc.nextInt();
		
 		Book userBook = new Book(name,genre,author,number);
		
		
		
		
		
		
	}

}
