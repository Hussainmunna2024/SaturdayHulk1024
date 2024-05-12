package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		NYULangone NYU = new NYULangone();
		
		
		NYU.cardioServices();
		NYU.neuroServices();
		NYU.entServices();
		NYU.dentalServices();
		NYU.physioServices();
		NYU.oncologyServices();
		
		
		NYU.emergencyService();
		
		NYU.medicalInsurance();
		NYU.medicalTranning();
		
		NYU.medicalNews();
		NYU.medicalRD();
		
		NYU.covidVaccination();
		NYU.pandamicPolicy();
		
		
		//USMedical us = new USMedical(); - Cannot create object for interface class.Not allowed in java.  
			
		// Top casting:
		// Child Class object can be referred by parent interface reference variable.
		
	    USMedical us= new NYULangone();  // Selenium: webdriver driver = new chromedriver
	    
	    us.cardioServices();
	    us.neuroServices();
	    us.physioServices();
	    us.emergencyService();
	    
	    
	    UKMedical uk = new NYULangone();
	    
	    uk.dentalServices();
	    uk.entServices();
	    uk.emergencyService();
	    
	    
	    
	    BangladeshMedical bng = new NYULangone();
	    
	    bng.oncologyServices();
	    bng.orthopedicServices();
	    bng.gynicServices();
	    bng.emergencyService();
	    
	    // down casting: not allowed at the compile time / in interface .
		

	}

}
