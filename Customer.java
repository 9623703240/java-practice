package bill;

public class Customer {
	
	private int custId;
	private String custName;
	private String mob;
	private Product prod[];
	private Address add;
	
	public Customer(int custId, String custName, String mob, Product[] prod, Address add) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.mob = mob;
		this.prod = prod;
		this.add = add;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public Product[] getProd() {
		return prod;
	}

	public void setProd(Product[] prod) {
		this.prod = prod;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	
}	
	
		