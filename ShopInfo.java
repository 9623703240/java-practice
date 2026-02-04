package bill;

public class ShopInfo {
	
	public Customer create() {
		
		Product p1=new Product(101,"Laptop",20000,2);
		Product p2=new Product(201, "Mobile", 12230, 3);
		Product prodarr[]=new Product[2];
		prodarr[0]=p1;
		prodarr[1]=p2;
		Address add=new Address("pune","Mh",423301);
		Customer cust=new Customer(101,"Parth","9838",prodarr,add);
		return cust;
	}
	
	public void display(Customer cust)
	{
		
		System.out.println("--------------CUSTOMER DETAILS-----------------------------");
		System.out.println("Customer Id :"+cust.getCustId());
		System.out.println("Customer Name :"+cust.getCustName());
		System.out.println("Customer Mob :"+cust.getMob());
		System.out.println("----------------ADDRESS DETAILS-------------------------------");
		System.out.println("Customer City :"+cust.getAdd().getCity());
		System.out.println("Customer State :"+cust.getAdd().getState());
		System.out.println("------------------PRODUCT DETAILS-----------------------------------");
		Product arr[]=cust.getProd();
		for(Product p :arr)
		{
			System.out.println(p.getProdId()+"\t"+p.getProdName()+"\t"+p.getProdPrice()+"\t"+p.getProdQty());
		}
	}

}
