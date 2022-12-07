package com.AQ.Spring2.DTO;



public class Test {
	
	private  int id;
	private  String name;
	private String address;
	private String email;
	
	Test(){
	  System.out.println("Test class Constructor");
	 }

	Test(int id,String name,String address,String email){
		this.id=id;
		this.name=name;
		this.address=address;
		this.email=email;
		
	}

	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}

	

	public String getAddress() {
		return address;
	}


	public String getEmail() {
		return email;
	}

}

	

