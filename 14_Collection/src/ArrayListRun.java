import java.util.ArrayList;
import java.util.List;

public class ArrayListRun {

	
	/*
	 * 컬렉션은?
	 * 자료구조 개념이 내장되어있는 클래스로 자바에서 제공하는 "자료구조를" 담당하는 "프레임워크"이다
	 * 
	 * -자료구조 : 방대한 데이터를 보다 효율적으로 관리(추가, 삭제, 조회, 정렬, 수정)할 수 있도록 도와주는 개념
	 * -프레임워크 : 이미 만들어져있는 틀(뼈대)
	 * 
	 * *배열의 단점과 컬렉션의 장점
	 * > 배열의 단점
	 * 		1.배열은 크기를 지정해야한다.그러나 한 번 크기를 지정하면 변경할 수 없다.
	 * 		새로운 값을 추가하너가 삭제하거나 하려면 번거로운 과정을 거쳐야한다.
	 * 		

	 * 		2. 한 공간에 한 타입의 데이터들만 저장이 가능하다.
	 * 
	 * 
	 * > 컬렉션의 장점
	 * 1. 크기 지정해줄 필요가 없다. 만일 지정했다고 해도 더 많은 데이터들이 들어오게 되면 알아서 사이즈를 늘려줍니다.
	 * 
	 * 2. 중간에 값을 추가한다거나 삭제하는 경우 값을 땡겨주는 작업(알고리즘)을 직접 기술할 필요 없음.
	 *    	단지 메소드 호출만으로 알아서 내부적으로 진행이 된다.
	 *    
	 * 3. 한 공간에 여러타입의 데이터들을 저장할 수 있다(단, 객체만 가능)
	 *    한 타입만 담도록 제한할 수도 있음(제네릭 사용)
	 *    
	 * *방대한 데이터들을 단지 보관만 해두고 조회만 할 경우 배열을 많이 사용한다.
	 * 
	 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		System.out.println(list);
		
		// E --> Element : 리스트에 담긴 요소
		
		//1. add(E e) 데이터 추가 메소드
		list.add(new music("비의 랩소디","임재현"));
		list.add(new music("attension","chari"));
		list.add(new music("wtwt","dgdg"));
		list.add("끝"); //지정된 크기보다 더 넣어도 오류가 발생되지 않는다.
		System.out.println(list) ; //list의 특징 : 순서 유지하면서 담김
		//여러타입 보관도 가능하다
		
		//2.add(int index, E e) : 직접 인덱스를 지정해서 해당 인섹스 위치에 데이터를 추가시켜주는 메소드
		list.add(1,new music("진심이 담긴 노래", "케이시"));
		System.out.println(list);
		//중간위치에 데이터 추가시 복잡한 알고리즘 구현 안함
		
		// 3.remove(int index) : 해당 인덱스 위치의 데이터를 삭제시켜주는 메소드
		list.remove(1);
		
		System.out.println(list);
		
		//4. set(int index, E e) :
		list.set(0, new music("모래 알갱이","임영웅"));
		System.out.println(list);
		
		//5. size() : 리스트의 사이즈를 반환해주는 메소드
		
		System.out.println(list.size());
		
		//6. get(int index) : 해당 인덱스의 객체를 반환시켜주는 메소드
		music m = (music)list.get(0); //값을 꺼내서 다운캐스팅
		System.out.println(m);
		String s  = (String)list.get(3); //값을 꺼내서 스트링형변환
		System.out.println(s);
		
		//7. sublist(int index1, int index2) : List -> 추출해서 새로운 List로 변환
		
		List sub = list.subList(0, 2); //List는 인터페이스, ArrayList는 그걸 참조하는 녀석
		
		System.out.println(sub);
		
		//8.addAll(Collection c) : 컬렉션을 통채로 뒤에 추가시켜주는 메소드
		list.addAll(sub);
		System.out.println(list);
		
		//9.isEmpty() : boolean 의 리턴 값 -> 컬렉션이 비어있는지 묻는 메소드
		System.out.println(list.isEmpty());
		
		System.out.println("=========================");
		//반복문을 이용해서 출력
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		System.out.println("=========================");
		for(Object l : list) {
			System.out.println(l);
		}
		
	}
	
	
	
	
	
	
	
}
