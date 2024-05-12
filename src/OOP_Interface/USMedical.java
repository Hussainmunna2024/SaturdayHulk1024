package OOP_Interface;

//Abstract method doesn't have method body

// Interface only allow Abstract method declaration/ method prototype

// You Cannot create an object for interface class. 
 // Cannot have constructor
public interface USMedical extends WHO,USHealth {
	
	int min_fee = 10;  // class level/ global interface variable. By default interface variable are final or static 
	
	public void cardioServices(); // This an abstract method
	
	public void neuroServices();
	
	public void physioServices();
	
	public void emergencyService();
	
	

}
