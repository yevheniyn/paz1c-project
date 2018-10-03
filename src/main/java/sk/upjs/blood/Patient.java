package sk.upjs.blood;

public class Patient {
/*
class darca ten ma viac identifikatorov 
aby sa mohol kontaktovat v prioade nudze, 
tel cislo, adresa
a class krvna banka, co je zoznam darcov pre pacientov
 */
	
	String name;
	String surname;
	String mobileNumber;
	String email;
	
	int age;
	boolean man;
	double weight;
	
	Enum<Bloodtype> bloodType;
/*	boolean isIll;
	
	boolean drugUser;
	boolean paidSexServices;
	boolean homosexual;
	boolean steroidUser;
	//biach
	boolean promiscuous;
	boolean menstruation;
	
	//pacient = len pacient
	//pacient = pacient-donor
	*/
}