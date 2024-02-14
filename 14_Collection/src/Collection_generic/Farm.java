package Collection_generic;

public class Farm {
	private String kind;

	public Farm() {
		super();
	}
	
	public Farm(String kind) {
		super();
		this.kind = kind;
	}
	
	public int hashCode() {
		return 0;
	}
	
	public boolean equals() {
		return false;
	}

	protected String getKind() {
		return kind;
	}

	protected void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Farm [kind=" + kind + "]";
	}

	
	
}
