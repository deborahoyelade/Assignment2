package Main;

import patientVaccine.Patient;
import patientVaccine.Vaccine;
import address.telecomAddress;
import address.webPage;
import address.EmailAddress;
import address.civicAddress;

import java.util.Scanner;

public class VaccinatedP {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			VaccinatedP[] MN = new VaccinatedP [15];
			Patient a = new Patient ("John", 4018, "john@gmail.com", 535142);
			Vaccine v = new Vaccine ("Moderna", "2021-04-31", "2021-05-31", "haa", "haa");
			
			MN [0]=a;
			MN [1]=v;
			
			System.out.println(a.toString());
			System.out.println(v.toString());
			
	}

}
