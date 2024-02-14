import java.util.ArrayList;

public class GerericListRun {
	public static void main(String[] args) {
		ArrayList<music> list = new ArrayList<>();
		//<music>으로 제네릭 설정 -> E -> music
		
		list.add(new music("aa","bbbb"));
		list.add(new music("Cc","dddd"));
		
//		list.add("끝"); 못들어간다. 뮤직만 들어갈 수 있다.
		
		for(music m : list) {
			System.out.println(m);
		}
		
		/*
		 * 제네릭<>을 사용하는 이유
		 * 1. 명시된 타입의 객체만 저장하도록 제한을 둘 수 있음
		 * 2. 컬렉션에 저장된 객체를 열어서 사용할 때 매번 형변환하는 절차를 없애기 위해서
		 */
		
		
	}
}
