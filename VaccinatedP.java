package Main;

import patientVaccine.Patient;
import patientVaccine.Vaccine;
import address.telecomAddress;
import address.webPage;
import address.EmailAddress;
import address.civicAddress;
import address.domaine;

import java.util.Scanner;

public class VaccinatedP {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			VaccinatedP[] MN = new VaccinatedP [15];
			Patient a = new Patient ("John", 4018, "john@gmail.com", 535142);
			Vaccine v = new Vaccine ("Moderna", "2021-04-31", "2021-05-31", "haa", "haa");
			EmailAddress e = new EmailAddress("cocoNUT", "com"); 
			
			MN [0]=a;
			MN [1]=v;
			MN [2]=e;
			
			
			System.out.println(a.toString());
			System.out.println(v.toString());
			System.out.println(e.toString());
			
	}

}
