package address;

public class EmailAddress extends webPage {
	private String userName;
	private String tld;
	
	//Default Constructor
	public EmailAddress() 
	{super();}
	
	//Parameterized Constructor
	public EmailAddress(String userName, String tld) {
		super();
		this.userName = userName;
		this.tld = tld;
	}
	
	//Copy Constructor
	   EmailAddress(EmailAddress emailAddress)
	   {
		   userName = emailAddress.userName;
		   tld = emailAddress.tld;
	   }
	   
	 //Sets the variables
	    public void setUserName(String userName) {
	    	this.userName = userName;
	    }
	    
	    public void setTld(String tld) {
	    	this.tld = tld;
	    }
	    
	  //Retrieves the variables
	    public String getUserName(){
	        return userName;
	    }
	    
	    public String getTld(){
	        return tld;
	    }
	    
	    
	//ToString method
	@Override
	public String toString() {
		return "EmailAddress is" + userName + "@" + getDomaineName() + "." + tld;
	}
	

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((tld == null) ? 0 : tld.hashCode());
		return result;
	}*/

	//ToString method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
    		return true;
    	if (obj == null)
    		return false;    		
    	if (getClass()!=obj.getClass())
    		return false;
    	
    	EmailAddress other = (EmailAddress) obj;
    	if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (tld == null) {
			if (other.tld != null)
				return false;
		} else if (!tld.equals(other.tld))
			return false;
		return true;
	}	

}


