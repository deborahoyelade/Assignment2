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

public class Vaccine extends VaccinatedP {
		private String vaccinetype;
	    private String firstD;
	    private int year1;
	    private int month1;
	    private int day1;
	    private String secondD;
	    private int year2;
	    private int month2;
	    private int day2;
	    private String firstClinic;
	    private String secondClinic;
	    
	  //Default Constructor
	    public Vaccine()
	    {}
	   
	  //Parameterized Constructor 
	   public Vaccine (String vaccinetype, String firstD, String secondD, String firstClinic, String secondClinic){
		    this.vaccinetype=vaccinetype;
	        this.firstD=firstD;
	        this.secondD = secondD;
	        this.firstClinic = firstClinic;
	        this.secondClinic = secondClinic;
	    }
	   
	 //Copy Constructor
	   Vaccine(Vaccine vaccine)
	   {
		   
	     vaccinetype = vaccine.vaccinetype;
	     firstD = vaccine.firstD;
	     secondD = vaccine.secondD;
	     firstClinic = vaccine.firstClinic;
	     secondClinic = vaccine.secondClinic;
	   }
	   
	    
	  //Sets the variables
	    public void setVaccineType(String vaccinetype) {
	    	this.vaccinetype = vaccinetype;
	    }
	    
	    public void setFirstD(String firstD) {
	    	Date1(year1, month1, day1);
	    }
	    
	    public void setDay1(int day1) {
	    	this.day1 = day1;
	    }
	    
	    public void setMonth1(int month1) {
	    	this.month1 = month1;
	    }
	    
	    public void setYear1(int year1) {
	    	this.year1 = year1;
	    }
	    
	    public void setSecondD(String secondD) {
	    	Date2(year2, month2, day2);
	    }
	    
	    public void setDay2(int day2) {
	    	this.day2 = day2;
	    }
	    
	    public void setMonth2(int month2) {
	    	this.month2 = month2;
	    }
	    
	    public void setYear2(int year2) {
	    	this.year2 = year2;
	    }
	    
	    public void setFirstClinic(String firstClinic) {
	    	this.firstClinic = firstClinic;
	    }
	    
	    public void setSecondClinic(String secondClinic) {
	    	this.secondClinic = secondClinic;
	    }
	    
	    
	  //Retrieves the variables
	    public String getVaccineType(){
	        return vaccinetype;
	    }
	    
	    public String getFirstD(){
	        return firstD;
	    }
	    
	    public int getDay1() {
	    	return day1;
	    }
	    
	    public int getMonth1() {
	    	return month1;
	    }
	    
	    public int getYear1() {
	    	return year1;
	    } 
	    
	    public String getSecondD(){
	        return secondD;
	    }
	    
	    public int getDay2() {
	    	return day2;
	    }
	    
	    public int getMonth2() {
	    	return month2;
	    }
	    
	    public int getYear2() {
	    	return year2;
	    }
	    
	    public String getFirstClinic(){
	        return firstClinic;
	    }
	    
	    public String getSecondClinic(){
	        return secondClinic;
	    }
	    
	    // Dates of Vaccine
	    public void Date1(int year, int month, int day) {
	    	year1= year;
			month1 = month;
			day1 = day;
			firstD= year + "-" + month + "-" + day;
	    }
	    
	    public void Date2(int y, int m, int d) {
	    	year2= y;
			month2 = m;
			day2 = d;
			secondD= y + "-" + m + "-" + d;
	    }
	    
	  //Equald Method
	    @Override
	    public boolean equals(Object obj) {
	    	if (this == obj)
	    		return true;
	    	if (obj == null)
	    		return false;
	    	if (getClass()!=obj.getClass())
	    		return false;
	    	Vaccine other = (Vaccine) obj;
	    	if (vaccinetype == null) {
	    		if (other.vaccinetype != null) {
	    			return false;
	    		} else if (!vaccinetype .equals(other.vaccinetype))
	    			return false;
	    		if (firstD != other.firstD)
	    			return false;
	    		if (secondD != other.secondD)
	    			return false;
	    		if (firstClinic != other.firstClinic)
	    			return false;
	    		if (secondClinic != other.secondClinic)
    			return false;
	    	}
			return true;
	    }
	    
	  //ToString method
	   @Override 
		public String toString(){
	        return "Vaccine Type:" + getVaccineType() + "   Dose 1:" + getFirstD() + "   Dose 2:" + getSecondD() + "   Clinic address for Dose 1:" + getFirstClinic() + "   Clinic address for Dose 2:" + getSecondClinic();
	    }
  }

