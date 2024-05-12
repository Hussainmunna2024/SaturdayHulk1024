package OOP_Interface;

public class  NYULangone extends Hospital implements USMedical, UKMedical,BangladeshMedical{
	
	// USA

	@Override
	public void cardioServices() {
		System.out.println("NYULangone - cardioServices");
	
		}

	@Override
	public void neuroServices() {
		System.out.println("NYULangone - neuroServices");
		
		
	}

	@Override
	public void physioServices() {
		System.out.println("NYULangone - physioServices");
		
	}
    //UK
	@Override
	public void entServices() {
		System.out.println("NYULangone - entServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("NYULangone - dentalServices");
		
	}
  // Bangladesh
	@Override
	public void oncologyServices() {
		System.out.println("NYULangone - oncologyServices");
		
	}

	@Override
	public void gynicServices() {
		System.out.println("NYULangone - gynicServices");
		
	}

	@Override
	public void orthopedicServices() {
		System.out.println("NYULangone - orthopedicServices");
		
	}
// This is common method for three interface- In class have implements this method just one time.
	@Override
	public void emergencyService() {
		System.out.println("NYULangone - emergencyServices");
		
		
	}
	
	// Individual method
	
	public void medicalTranning() {
		System.out.println("NYULangone -  medicalTranning");
		
	}
	public void medicalInsurance() {
		System.out.println("NYULangone -  medicalInsurance");
		
	}

	// WHO
	@Override
	public void covidVaccination() {
		System.out.println("WHO -  covidVaccination");
		
		
	}

	@Override
	public void pandamicPolicy() {
		System.out.println("WHO -  pandamicPolicy");
	
		
	}

	@Override
	public void childCareServices() {
		System.out.println("NYULangone -  childCareServices");
		
	}

	

}

