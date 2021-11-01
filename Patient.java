/**
 * 
 * Comp249
 * Assignment #: 2
 * Due date: October 31st 2021
 * Section E
 * This program is class of consumer with a name, health card number, email, phone number
 * 
 * @author Deborah Oyelade and Shambavi Sandralingam
 *
 */


package patientVaccine;

import Main.VaccinatedP;

public class Patient extends VaccinatedP {
	private String name;
    private long healthcardnum;
    private String email;
    private long phonenum;
    
    //Default Constructor
    public Patient() 
    {super(); }
    
    //Parameterized Constructor
    public Patient (String name, long healthcardnum, String email, long phonenum){
    	super();
    	this.name=name;
        this.healthcardnum=healthcardnum;
        this.email = email;
        this.phonenum = phonenum;
    }
    
    //Copy Constructor
	   Patient(Patient patient)
	   {
	     name = patient.name;
	     healthcardnum = patient.healthcardnum;
	     email = patient.email;
	     phonenum = patient.phonenum;
	   }
	   
    
    //Sets the variables
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setHealthcardnum(long healthcardnum) {
    	this.healthcardnum = healthcardnum;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
    
    public void setPhonenum(long phonenum) {
    	this.phonenum = phonenum;
    }
    
    
    //Retrieves the variables
    public String getName(){
        return name;
    }
    
    public long getHealthcardnum(){
        return healthcardnum;
    }
    
    public String getEmail(){
        return email;
    }
    
    public long getPhonenum(){
        return phonenum;
    }
    
    //Equals Method 
    @Override
    public boolean equals(Object obj) {
    	if (this == obj)
    		return true;
    	if (obj == null)
    		return false;
    	if (getClass()!=obj.getClass())
    		return false;
    	Patient other = (Patient) obj;
    	if (name == null) {
    		if (other.name != null) {
    			return false;
    		} else if (!name .equals(other.name))
    			return false;
    		if (email != other.email)
    			return false;
    		if (healthcardnum != other.healthcardnum)
    			return false;
    		if (phonenum != other.phonenum)
    			return false;
    	}
		return true;
    }
    
    
    //ToString method 
    @Override 
	public String toString(){
        return "Name:" + getName() + "   Healthcard Number:" + getHealthcardnum() + "   Email:" + getEmail() + "   Phone Number:" + getPhonenum();
    }
    
}