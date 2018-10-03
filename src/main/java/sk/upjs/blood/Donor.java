package sk.upjs.blood;

public class Donor {
	String name;
	String surname;
	String mobileNumber;
	String email;

	double age;
	boolean man;
	double weight;

	Enum<Bloodtype> bloodType;
	boolean isIll;

	boolean drugUser;
	boolean paidSexServices;
	boolean steroidUser;
	boolean promiscuous;
	boolean menstruation;
	boolean homosexual;

	public Donor(String name, String surname, String mobileNumber, String email, int age, boolean man, double weight,
			Enum<Bloodtype> bloodType, boolean isIll, boolean drugUser, boolean paidSexServices, boolean steroidUser,
			boolean promiscuous, boolean menstruation, boolean homosexual) {
		this.name = name;
		this.surname = surname;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.age = age;
		this.man = man;
		this.weight = weight;
		this.bloodType = bloodType;
		this.isIll = isIll;
		this.drugUser = drugUser;
		this.paidSexServices = paidSexServices;
		this.steroidUser = steroidUser;
		this.promiscuous = promiscuous;
		
			//je muz a moze byt gay
		//else
			//je zena a moze mat kramy
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public boolean isMan() {
		return man;
	}

	public void setMan(boolean man) {
		this.man = man;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Enum<Bloodtype> getBloodType() {
		return bloodType;
	}

	public void setBloodType(Enum<Bloodtype> bloodType) {
		this.bloodType = bloodType;
	}

	public boolean isIll() {
		return isIll;
	}

	public void setIll(boolean isIll) {
		this.isIll = isIll;
	}

	public boolean isDrugUser() {
		return drugUser;
	}

	public void setDrugUser(boolean drugUser) {
		this.drugUser = drugUser;
	}

	public boolean isPaidSexServices() {
		return paidSexServices;
	}

	public void setPaidSexServices(boolean paidSexServices) {
		this.paidSexServices = paidSexServices;
	}

	public boolean isSteroidUser() {
		return steroidUser;
	}

	public void setSteroidUser(boolean steroidUser) {
		this.steroidUser = steroidUser;
	}

	public boolean isPromiscuous() {
		return promiscuous;
	}

	public void setPromiscuous(boolean promiscuous) {
		this.promiscuous = promiscuous;
	}

	public boolean isMenstruation() {
		return menstruation;
	}

	public void setMenstruation(boolean menstruation) {
		this.menstruation = menstruation;
	}

	public boolean isHomosexual() {
		return homosexual;
	}

	public void setHomosexual(boolean homosexual) {
		//snaha skratit kod
		//potrebuje opravu
		if(man) {
		this.homosexual = homosexual;
		}
		else {
			homosexual=false;
		}
	}

//	Donor d = new Donor("1", "1", "1", "1", 1, true, 1, Bloodtype.A, false, false, false, false, false, false);

}
