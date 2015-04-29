package org.firstspring;

public class Restaurant {
	
	IHotDrink iHotDrink;
	String name;
	
	/*public Restaurant(IHotDrink iHotDrink) {
		// TODO Auto-generated constructor stub
		this.iHotDrink = iHotDrink;
	}*/
	
	
	
	public void setiHotDrink(IHotDrink iHotDrink) {
		this.iHotDrink = iHotDrink;
	}

	
	
	public void setName(String name) {
		this.name = name;
	}



	public void welcomeCustomer(){
		System.out.println("Welcome "+name);
	}


	public void prepareTea(){
		iHotDrink.prepareHotDrink();
	}

}
