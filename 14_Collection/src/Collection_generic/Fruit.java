package Collection_generic;

import com.kh.Test2402062.Lottery;

public class Fruit extends Farm{
	private String name;

	public Fruit() {
		super();
	}

	public Fruit(String kind,String name) {
		super(kind);
		this.name = name;
	}
	@Override
	public int hashCode() {
		String str = this.getKind() + this.getName();
		return str.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {//현재 객체와 전달받은 객체의 각 필드값들이 모두 일치하면 true /하나라도 일치하지 않으면 false 반환
		//this(현재객체)    <->    obj(전달받은 객체)
		//  Lottery                Object
		if(obj instanceof Farm) {
			Farm other = (Farm)obj;
			
			if(this.getName().equals(((Fruit)other).getName())&&
					this.getKind().equals(other.getKind())) {
			return true;	
		} else 
			return false;
		}
		return false;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return super.getKind()+": " + name;
	}
	
	
}
