package com.kh.Test20240207;

import java.util.HashMap;
import java.util.TreeMap;

public class MemberController {
	HashMap map = new HashMap();
	
	public boolean joinMembership(String id, Member m){
		if(map.containsKey(id)) {
			return false;
		}
		else {
			map.put(id, m);

			return true;
		}
	}
	
	public String login(String id, String password) {
		Member m = (Member)map.get(id);
		if(map.containsKey(id)) {
			if(m.getPassword().equals(password)) {
				return m.getName();
			}
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		Member m = (Member)map.get(id);	 //참조변수의 값을 가져와서 같은걸 가리키기 때문에 리플레이스 써서 다시 해줄 필요가 없다.
		if(map.containsKey(id)) {
			if(m.getPassword().equals(oldPw)) {		
				m.setPassword(newPw);
				map.replace(id,m);
				return true;
			}
		}

		return false;
	}
	
	public void changeName(String id, String newName) {
		Member m = (Member)map.get(id);
		m.setName(newName);
	}
	
	public TreeMap sameName(String name) {
		TreeMap tree = new TreeMap();
		for(Object id : map.keySet()) {
			Member m = (Member)map.get(id);
			if(m.getName().equals(name))
				tree.put(id, m.getName());
		}
		
		return tree;
	}
}
