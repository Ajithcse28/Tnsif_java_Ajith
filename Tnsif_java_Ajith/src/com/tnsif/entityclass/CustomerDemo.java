package com.tnsif.entityclass;

public interface CustomerDemo {
	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setId(101);
		c1.setCname("Raja");
		c1.setCity("villupuram");
		System.out.println(c1);
		
		Customer c2=new Customer();
		c1.setId(102);
		c1.setCname("priya");
		c1.setCity("puducherry");
		System.out.println(c2);
	}

}
