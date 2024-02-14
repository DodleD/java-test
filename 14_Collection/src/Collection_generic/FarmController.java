package Collection_generic;

import java.util.ArrayList;
import java.util.HashMap;

public class FarmController {
	HashMap<Farm, Integer> hMap = new HashMap<>();
	ArrayList<Farm> list = new ArrayList<>();
	
	public boolean addNewKind(Farm f, int amount) {	
		if(hMap.equals(f)){
			return false;
		}
		else {
			hMap.put(f, amount);
			System.out.println(hMap);
			return true;
		}
	}
	
	public boolean removeKind(Farm f) {
		if(hMap.remove(f) != null) {
			System.out.println(hMap);
			return true;
		}else {
			System.out.println(hMap);
			return false;
		}
	}
	
	public boolean changeAmount(Farm f, int amount) {
		if(hMap.containsKey(f)) {
			hMap.put(f, amount);
			System.out.println(hMap);
			return true;
		}else
			return false;
		
		
	}
	
	public HashMap<Farm, Integer> printFarm(){
		return hMap;
	}
	
	public boolean buyFarm(Farm f) {
		if(hMap.containsKey(f)&&hMap.get(f)!=0) {
			list.add(f);
			hMap.replace(f, hMap.get(f)-1);
			return true;
		}else {
			return false;
		}
	}	
	
	public boolean removeFarm(Farm f) {
		if(list.contains(f)) {
			list.remove(f);
			hMap.replace(f, hMap.get(f)+1);
			return true;
		}else {
			return false;
		}
	}
	
	public ArrayList<Farm> printBuyFarm() {
		return list; //문제대로하면 수량표기가 되지 않는다. 리스트라서 수정이 쉽지않다.
	}
	
}
