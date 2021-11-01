package address;

import address.civicAddress.province;

public class civicAddress {
	private String street;
	private province province;
	private String postalCode;
	
	public enum province{
		AB, BC, MB, NB, NL, NT, NS, NU, ON, PE, QC, SK,YT
	}

	
	//Default Constructor
	public void CivicAddress() {
	}

	//Parameterized Constructor
	public void CivicAddress(String street, address.civicAddress.province province, String postalCode) {
		this.street = street;
		this.province = province;
		this.postalCode = postalCode;
	}

	//Copy Constructor
	   civicAddress(civicAddress CivicAddress)
	   {
		   street = CivicAddress.street;
		   province = CivicAddress.province;
		   postalCode = CivicAddress.postalCode;
	   }
	   
	 //Sets the variables
	    public void setStreet(String street) {
	    	this.street = street;
	    }
	    
	    public void setProvince(enum province) {
	    	this.province = province;
	    }
	    
	    public void setPostalCode(String postalCode) {
	    	this.postalCode = postalCode;
	    }
	    
	  //Retrieves the variables
		public String getStreet(){
		    return street;
		}
		
		public province getProvince(){
		    return province;
		}
		
		public String getPostalCode(){
		    return postalCode;
		}
	    
	   
	//ToStrings
	@Override
	public String toString() {
		return "CivicAddress [streetAddress=" + getStreetAddress()+ "City = " + getCity() + "province=" + getProvince() + ", postalCode=" + getPostalCode()
				+ "]";
	}
 
	
}
