package genericEx.generic_extends_implements2;

public class Childproduct<K,V,C> extends Product<K,V>{
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
}
