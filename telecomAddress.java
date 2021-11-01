package address;

public class telecomAddress {
	private int npa;
	private int number;
	
	//Default Constructor
		public telecomAddress() 
		{super();}
		
	//Parameterized Constructor
	public telecomAddress(int npa , int number) {
		super();
		this.npa = npa;
		this.number = number;
	}

	//Copy Constructor
	telecomAddress(telecomAddress TelecomAddress)
		{
		npa = TelecomAddress.npa;
		number = TelecomAddress.number;
		}
	
	//Sets the variables
    public void setNpa(int npa) {
    	this.npa = npa;
    }
    
    public void setNumber(int number) {
    	this.number = number;
    }
    
  //Retrieves the variables
    public int getNpa(){
        return npa;
    }
    
    public int getNumber(){
        return number;
    }
    
  //toString Method
  	@Override
  	public String toString() {
  		return "The telecom Address is 1-" + getNpa() + "" + getNumber();
  	}
  	
  //Equals Method
  	@Override
  	public boolean equals(Object obj) {
  		if (obj == null)
  			return true;
  		else if (getClass() != obj.getClass())
  			return false;
  		else {
  			telecomAddress  other = (telecomAddress) obj;
  			return (npa == (other.npa) &&
  				(number == (other.number)));
  		}
  	}
  	
}
  	
