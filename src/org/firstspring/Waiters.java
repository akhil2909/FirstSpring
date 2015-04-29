package org.firstspring;

import java.util.List;

public class Waiters {
	
	private List waiterList;
	
	public void setWaiterList(List waiList){		
		this.waiterList = waiList;		
	}
	
	public void displayWaiterName(){
		System.out.println("List of Waiters : " + waiterList);
	}
	

}
