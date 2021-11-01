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

package address;

public class webPage {
	    String domaineName;
	    String ressourceName;
	
	//Default Constructor
	public webPage() 
	{ super(); }
	
	//Parameterized Constructor
	webPage (String domaineName, String ressourceName){
		super();
		this.domaineName=domaineName;
	    this.ressourceName = ressourceName;
	}
	
	//Copy Constructor
	webPage(webPage WebPage)
	{
	  domaineName = WebPage.domaineName;
	  ressourceName = WebPage.ressourceName;
	}
	
	//Sets the variables
	public void setDomaineName(String domaineName) {
		this.domaineName = domaineName;
	}
	
	public void setRessourceName(String ressourceName) {
		this.ressourceName = ressourceName;
	}
	
	//Retrieves the variables
	public String getDomaineName(){
	    return this.domaineName;
	}
	
	public String getRessourceName(){
	    return this.ressourceName;
	}
	
	//Equals Method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		webPage  other = (webPage) obj; 
		if (ressourceName == null) {
    		if (other.ressourceName != null) {
    			return false;
    		} else if (!ressourceName .equals(other.ressourceName))
    			return false;
		} else if (!ressourceName.equals(other.ressourceName))
			return false;
		if (domaineName != other.domaineName) 
			return false;
		
		return true;
	}
	
	//toString Method
	@Override
	public String toString() {
		return "WebAddress is: www." +  getDomaineName() + "/" + getRessourceName();
	}

}