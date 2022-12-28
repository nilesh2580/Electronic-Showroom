import java.util.InputMismatchException;
import java.util.Scanner;

interface Payment
{
public void getDetails();
}
class Electronix implements Payment 
{
	String Product_Name;
	String Product_Brand;
//	String Product_Colour;
	double Product_Price;
	private String Owner_Name;
	private long Owner_Mobile_Number;
	private String Owner_Emailid;
	private String Owner_AadharNo;
	private String Owner_PanNo;
	
	// Getters And Setters used to set & get the owner details
	
	public String getOwner_Name() {
		return Owner_Name;
	}
	public void setOwner_Name(String owner_Name) {
		Owner_Name = owner_Name;
	}
	public long getOwner_Mobile_Number() {
		return Owner_Mobile_Number;
	}
	public void setOwner_Mobile_Number(long owner_Mobile_Number) {
		Owner_Mobile_Number = owner_Mobile_Number;
	}
	public String getOwner_Emailid() {
		return Owner_Emailid;
	}
	public void setOwner_Emailid(String owner_Emailid) {
		Owner_Emailid = owner_Emailid;
	}
	public String getOwner_AadharNo() {
		return Owner_AadharNo;
	}
	public void setOwner_AadharNo(String owner_AadharNo) {
		Owner_AadharNo = owner_AadharNo;
	}
	public String getOwner_PanNo() {
		return Owner_PanNo;
	}
	public void setOwner_PanNo(String owner_PanNo) {
		Owner_PanNo = owner_PanNo;
	}
	
	// Constructor for local to global Product Details
	public void PDfilling(String Product_Name,String Product_Brand,double Product_Price)
	{
	this.Product_Name=Product_Name;
	this.Product_Brand=Product_Brand;
//	this.Product_Colour=Product_Colour;
	this.Product_Price=Product_Price;
}
	@Override
	public void getDetails() {
	System.out.println("------------------------------------------------");
	System.out.println("-----------------EKDANTA ELECTRONIX-------------");
	System.out.println("   +++ Payment Recipt +++");
	System.out.println("    ---------------    ");
	System.out.println("Product Brand          :" + Product_Brand);
	System.out.println("Product Name           :" + Product_Name);
//	System.out.println("Product Colour         :" + Product_Colour);
	System.out.println("Product Price          :" + Product_Price);
	System.out.println("Owner Name     		   :" + Owner_Name);
	System.out.println("Owner Mobile Number    :" + Owner_Mobile_Number);
	System.out.println("Owner Email Address    :" + Owner_Emailid);
	System.out.println("Owner Aadhar Number    :" + Owner_AadharNo);
	System.out.println("Owner Pan Number       :" + Owner_PanNo);
	System.out.println("------------------------------------------------");
	
	int count=0;
	while(Owner_Mobile_Number!=0) {
		count++;
		Owner_Mobile_Number=Owner_Mobile_Number/10;
	}
	
	if(Product_Name=="Whirlpool") {
		System.out.println("Enter Delivery Address :");
		Scanner s=new Scanner(System.in);
		String adres=s.nextLine();
		System.out.println("Your Product is Delivered to Your Given Address within 2 to 3 working days");
		System.out.println("Delivery Address :"+adres);
	}else if(count!=10) {
		System.out.println("Not a Valid Mobile Number");
		Scanner s=new Scanner(System.in);
		long cnum=s.nextInt();
		System.out.println("Enter Valid Mobile Number:");
	}
		
	}
	public void On()
	{
	System.out.println("Product is ON");
	}

	public void Off()
	{
	System.out.println("Product is OFF");
	}

	public void Working()
	{
	System.out.println("Woow The Product is Nicely Working !!!");
	}
}

//Class Mobiles

class Mobiles extends Electronix
{
	public void Mb()
	{
	//Making Object For Driver(Main) class for Dashboard
		Driver Dr=new Driver();
		
		//Upcasting - Downcasting for keypad
		Electronix Elc1 = new Keypad();
		Keypad Kp = (Keypad) Elc1;

		// Upcasting-Downcasting for Touch
		Electronix Elc2 = new Touch();
		Touch Tch = (Touch) Elc2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Keypad");
		System.out.println("Enter 2 for Touch");
		System.out.println();
		System.out.println("Enter 0 for Main Menu");
		System.out.println(".....................Enter Your Choice :");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
		System.out.println("You Have Choosen Keypad Mobiles");
		Kp.KeypadM();
		break;
		case 2:
		System.out.println("You Have Choosen TouchScreen Mobiles");
		Tch.Tscrm();
		break;
		case 0:
		Dr.main(null);	
		break;
		default:
		System.out.println("Invaild Input ");
		this.Mb();
		}
		}
		
}
class Keypad extends Mobiles {
public void KeypadM() {
	//Making Object For Main & Mobiles Class
	Driver Dr=new Driver();
	Mobiles Mbr=new Mobiles();
	
// Upcasting-Downcasting for Nokia
Electronix Elc3 = new Nokia();
Nokia Nk = (Nokia) Elc3;

	// Upcasting-Downcasting for Samsung
Electronix Elc4 = new Samsung();
Samsung sm = (Samsung) Elc4;

	// Upcasting-Downcasting for Motorola
Electronix Elc5 = new Motorola();
Motorola mt = (Motorola) Elc5;
//Making Obj for Passing Details
Details dd = new Details();

Scanner sc = new Scanner(System.in);
System.out.println("Enter 1 for Nokia");
System.out.println("Enter 2 for Samsung");
System.out.println("Enter 3 for Motorola");
System.out.println();
System.out.println("Enter 0 For Main Menu");
System.out.println("Enter 8 for Back");
System.out.println(".....................Enter Your Choice :");
int opt = sc.nextInt();

switch (opt) {
case 1:
System.out.println("You Have Choosen Nokia Phones");
Nk.Nokia_phones();
break;
case 2:
System.out.println("You Have Choosen Samsung Phones");
sm.Samsung();
break;
case 3:
System.out.println("You Have Choosen Motorola Phones");
mt.moto();
case 0:
Dr.main(null);
break;
case 8:
Mbr.Mb();	
default:
System.out.println("Invaild Input ");
this.KeypadM();
}
}
}

//Class for Nokia
class Nokia extends Keypad {
public void Nokia_phones() {
	//Making Obj for Passing Details
	Details d = new Details();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("-----------------------------------------");
	System.out.println("1.	Nokia 5310 Dual Sim");
	System.out.println("-----------------------------------------");
	System.out.println("Nokia 5310 Info");
	System.out.println("-----------------");
	System.out.println("RAM: 1GB");
	System.out.println("Special features: Dual SIM, FM Radio, Music Player");
	System.out.println("Colour: ‎White/Red");
	System.out.println("Phone Standby Time (with data): ‎720 Hours");
	System.out.println("Whats in the box: Handset, Battery, Quick start guide, Micro USB charger");
	System.out.println("-----------------------------------------");
	System.out.println("2.	Nokia 105");
	System.out.println("-----------------------------------------");
	System.out.println("Nokia 105 Info");
	System.out.println("-----------------");
	System.out.println("RAM: 0.03GB");
	System.out.println("Special features: Single SIM, FM Radio, Music Player");
	System.out.println("Colour: ‎White/Blue");
	System.out.println("Phone Standby Time (with data): ‎720 Hours");
	System.out.println("Whats in the box: ‎Phone, Battery, Charger, UG");
	System.out.println("-----------------------------------------");
	System.out.println("3.	Nokia 3310");
	System.out.println("-----------------------------------------");
	System.out.println("Nokia 3310 Info");
	System.out.println("-----------------");
	System.out.println("RAM: 16MB");
	System.out.println("Special features: Single SIM, FM Radio, Video Player, Music Player");
	System.out.println("Colour: ‎Grey");
	System.out.println("Phone Standby Time (with data): ‎720 Hours");
	System.out.println("Whats in the box: Handset, Micro-USB Charger, WH-108 Headset and Quick Guide");
	System.out.println("-----------------------------------------");
	System.out.println("4.	Nokia 6310");
	System.out.println("-----------------------------------------");
	System.out.println("Nokia 6310 Info");
	System.out.println("-----------------");
	System.out.println("RAM: 8MB");
	System.out.println("Special features: Rear Camera, Dual_Sim, Radio");
	System.out.println("Colour: ‎Black");
	System.out.println("onnectivity technologies: ‎Gsm 2G");
	System.out.println("Whats in the box: ‎Nokia 6310, Battery, Charger, Quick start guide");
	System.out.println(">>>>>>>>>>>><<<<<<<<<<<<");
	System.out.println("Press 1 to Buy Nokia 5310");
	System.out.println("Press 2 to Buy Nokia 105");
	System.out.println("Press 3 to Buy Nokia 3310");
	System.out.println("Press 4 to Buy Nokia 6310");
	System.out.println("........Enter Your Choice : ");
	System.out.println("");
	int opt = sc.nextInt();
	switch (opt) {
	case 1:
	d.Final_Details("Nokia", "5310 Dual Sim", 3549);
	break;
	case 2:
	d.Final_Details("Nokia", "105 Single Sim", 1349);
	break;
	case 3:
	d.Final_Details("Nokia", "3310 Dual Sim", 3699);
	break;
	case 4:
	d.Final_Details("Nokia", "6310 Single Sim", 3299);
	default:
	System.out.println("Invalid Input :");
	}

}
}
class Samsung extends Keypad
{
	public void Samsung()
	{
		Details d1=new Details();
		System.out.println("-----------------------------------------");
		System.out.println("1.	Samsung 315");
		System.out.println("-----------------------------------------");
		System.out.println("Samsung 315 Info");
		System.out.println("-----------------");
		System.out.println("RAM: 4MB");
		System.out.println("Special features: MP3");
		System.out.println("Colour: ‎Blue");
		System.out.println("Phone Standby Time (with data): ‎720 Hours");
		System.out.println("Whats in the box: Handset, Battery, Quick start guide, Micro USB charger");
		System.out.println("-----------------------------------------");
		System.out.println("2.	Samsung Guru 1215");
		System.out.println("-----------------------------------------");
		System.out.println("Samsung Guru 1215 Info");
		System.out.println("-----------------");
		System.out.println("RAM: 4MB");
		System.out.println("Special features: MP3");
		System.out.println("Colour: ‎Blue");
		System.out.println("Phone Standby Time (with data): ‎720 Hours");
		System.out.println("Whats in the box: Handset, Battery, Quick start guide, Micro USB charger");
		System.out.println("-----------------------------------------");
		System.out.println("3.	Samsung Guru 1205");
		System.out.println("-----------------------------------------");
		System.out.println("Samsung Guru 1205 Info");
		System.out.println("-----------------");
		System.out.println("RAM: 4MB");
		System.out.println("Special features: MP3");
		System.out.println("Colour: ‎Blue");
		System.out.println("Phone Standby Time (with data): ‎720 Hours");
		System.out.println("Whats in the box: Handset, Battery, Quick start guide, Micro USB charger");
		System.out.println(">>>>>>>>>>>><<<<<<<<<<<<");
		System.out.println("Press 1 to Buy Samsung 315");
		System.out.println("Press 2 to Buy Samsung Guru 1215");
		System.out.println("Press 3 to Buy Samsung Guru 1205");
		System.out.println("........Enter Your Choice : ");
		Scanner sc = new Scanner(System.in);
		int op=sc.nextInt();
		
		switch(op) {
		case 1:
			d1.Final_Details("Samsung Guru", "315 Music Guru", 2099);
			break;
		case 2:
			d1.Final_Details("Samsung Guru", "1215", 2099);
			break;
		case 3:
			d1.Final_Details("Samsung Guru", "1205 ", 1049);
			break;
			default:
			System.out.println("Invalid Input :");
				
			
		}
	}
}
class Motorola extends Keypad
{
	public void moto()
	{
		//Making Obj for Passing Details
		Details d1=new Details();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Motorolo A20");
		System.out.println("Press 2 for Motorolo A10");
		System.out.println("Press 3 for Motorolo A21");

		int op=sc.nextInt();
		
		switch(op) {
		case 1:
			System.out.println();
			System.out.println("Thank You For Choosing Motorola A20 ");
			System.out.println("Motorola A20 Info");
			System.out.println("RAM: 4MB");
			System.out.println("Special features: MP3");
			System.out.println("Colour: ‎Blue");
			System.out.println("Phone Standby Time (with data): ‎720 Hours");
			System.out.println("Whats in the box: Handset, Battery, Quick start guide, Micro USB charger");
			System.out.println();
			d1.Final_Details("Motorola", "A20", 1056);
			break;
		case 2:
			System.out.println();
			System.out.println("Thank You For Choosing Motorola A10 ");
			System.out.println("Motorola A10 Info");
			System.out.println("RAM: 4MB");
			System.out.println("Special features: MP3");
			System.out.println("Colour: ‎Blue");
			System.out.println("Phone Standby Time (with data): ‎720 Hours");
			System.out.println("Whats in the box: Handset, Battery, Quick start guide, Micro USB charger");
			System.out.println();
			d1.Final_Details("Motorola", "A10", 1016);			
			break;
		case 3:
			System.out.println();
			System.out.println("Thank You For Choosing Motorola A21 ");
			System.out.println("Motorola A21 Info");
			System.out.println("RAM: 4MB");
			System.out.println("Special features: MP3");
			System.out.println("Colour: ‎Blue");
			System.out.println("Phone Standby Time (with data): ‎720 Hours");
			System.out.println("Whats in the box: Handset, Battery, Quick start guide, Micro USB charger");
			System.out.println();
			d1.Final_Details("Motorola", "A21", 1281);
			break;
			default:
			System.out.println("Invalid Input :");
		}

	}
}
class Touch extends Mobiles
{
	public void Tscrm()
	{
		//Making Object For Main & Mobiles Class
		Driver Dr=new Driver();
		Mobiles Mbr=new Mobiles();
		// Upcasting-Downcasting for Nokia
		Electronix Elc3 = new NokiaT();
		NokiaT Nk = (NokiaT) Elc3;

			// Upcasting-Downcasting for Samsung
		Electronix Elc4 = new SamsungT();
		SamsungT sm = (SamsungT) Elc4;

			// Upcasting-Downcasting for Motorola
		Electronix Elc5 = new MotorolaT();
		MotorolaT mt = (MotorolaT) Elc5;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Nokia");
		System.out.println("Enter 2 for Samsung");
		System.out.println("Enter 3 for Motorola");
		System.out.println();
		System.out.println("Enter 0 For Main Menu");
		System.out.println("Enter 8 for Back");
		System.out.println(".....................Enter Your Choice :");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
		System.out.println("You Have Choosen Nokia Phones");
		Nk.Nokia_phones();
		break;
		case 2:
		System.out.println("You Have Choosen Samsung Phones");
		sm.Samsung();
		break;
		case 3:
		System.out.println("You Have Choosen Motorola Phones");
		mt.moto();
		break;
		case 0:
		Dr.main(null);
		break;
		case 8:
		Mbr.Mb();
		default:
		System.out.println("Invaild Input ");
//		this.KeypadM();
		}
		}
		}

		//Class for Nokia
		class NokiaT extends Touch {
		public void Nokia_phones() {
			//Making Obj for Passing Details
			Details d = new Details();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 for Nokia 5310 Dual Sim");
			System.out.println("Enter 2 for Nokia 105");
			System.out.println("Enter 3 for Nokia 3310");
			System.out.println("Enter 4 for Nokia 6310");
			System.out.println("Enter Your Choice :");
			int opt = sc.nextInt();

			switch (opt) {
			case 1:
			System.out.println();
			System.out.println("Thank You For Choosing Nokia 5310");
			System.out.println("Nokia 5310 Info");
			System.out.println("RAM: 1GB");
			System.out.println("Special features: Dual SIM, FM Radio, Music Player");
			System.out.println("Colour: ‎White/Red");
			System.out.println("Phone Standby Time (with data): ‎720 Hours");
			System.out.println("Whats in the box: Handset, Battery, Quick start guide, Micro USB charger");
			System.out.println();
			d.Final_Details("Nokia", "5310 Dual Sim", 3549);
			break;
			case 2:
			System.out.println();
			System.out.println("Thank You For Choosing Nokia 105");
			System.out.println("Nokia 105 Info");
			System.out.println("RAM: 0.03GB");
			System.out.println("Special features: Single SIM, FM Radio, Music Player");
			System.out.println("Colour: ‎White/Blue");
			System.out.println("Phone Standby Time (with data): ‎720 Hours");
			System.out.println("Whats in the box: ‎Phone, Battery, Charger, UG");
			System.out.println();
			d.Final_Details("Nokia", "105 Single Sim", 1349);
			break;
			case 3:
			System.out.println();
			System.out.println("Thank You For Choosing Nokia 3310");
			System.out.println("Nokia 3310 Info");
			System.out.println("RAM: 16MB");
			System.out.println("Special features: Single SIM, FM Radio, Video Player, Music Player");
			System.out.println("Colour: ‎Grey");
			System.out.println("Phone Standby Time (with data): ‎720 Hours");
			System.out.println("Whats in the box: Handset, Micro-USB Charger, WH-108 Headset and Quick Guide");
			System.out.println();
			d.Final_Details("Nokia", "3310 Dual Sim", 3699);
			break;
			case 4:
			System.out.println();
			System.out.println("Thank You For Choosing Nokia 6310");
			System.out.println("Nokia 6310 Info");
			System.out.println("RAM: 8MB");
			System.out.println("Special features: Rear Camera, Dual_Sim, Radio");
			System.out.println("Colour: ‎Black");
			System.out.println("onnectivity technologies: ‎Gsm 2G");
			System.out.println("Whats in the box: ‎Nokia 6310, Battery, Charger, Quick start guide");
			System.out.println();
			d.Final_Details("Nokia", "6310 Single Sim", 3299);
			default:
			System.out.println("Invalid Input :");
			}

		}
	}
class SamsungT extends Touch
{
	public void Samsung()
	{
		//Making Obj for Passing Details
		Details d1=new Details();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Samsung 315");
		System.out.println("Press 2 for Samsung 1215");
		System.out.println("Press 3 for Samsung 1205");
//		System.out.println("Press 4 for Samsung");
//		System.out.println("Press 5 for Samsung");
		System.out.println("Enter Your Choice :");
		int op=sc.nextInt();
		
		switch(op) {
		case 1:
			System.out.println();
			System.out.println("Thank You For Choosing Samsung Guru Music 2 315 ");
			System.out.println("Samsung Guru Music 2 315 Info");
			System.out.println("RAM: 4MB");
			System.out.println("Special features: MP3");
			System.out.println("Colour: ‎Blue");
			System.out.println("Phone Standby Time (with data): ‎720 Hours");
			System.out.println("Whats in the box: Handset, Battery, Quick start guide, Micro USB charger");
			System.out.println();
			d1.Final_Details("Samsung Guru", "315 Music Guru", 2099);
			break;
		case 2:
			System.out.println();
			System.out.println("Thank You For Choosing Samsung Guru 1215 ");
			System.out.println("Samsung Guru 1215 Info");
			System.out.println("RAM: 4MB");
			System.out.println("Special features: MP3");
			System.out.println("Colour: ‎Blue");
			System.out.println("Phone Standby Time (with data): ‎720 Hours");
			System.out.println("Whats in the box: Handset, Battery, Quick start guide, Micro USB charger");
			System.out.println();
			d1.Final_Details("Samsung Guru", "1215", 2099);
			break;
		case 3:
			System.out.println();
			System.out.println("Thank You For Choosing Samsung Guru 1205 ");
			System.out.println("Samsung Guru 1205 Info");
			System.out.println("RAM: 4MB");
			System.out.println("Special features: MP3");
			System.out.println("Colour: ‎Blue");
			System.out.println("Phone Standby Time (with data): ‎720 Hours");
			System.out.println("Whats in the box: Handset, Battery, Quick start guide, Micro USB charger");
			System.out.println();
			d1.Final_Details("Samsung Guru", "1205 ", 1049);
			break;
			default:
			System.out.println("Invalid Input :");
				
			
		}
	}
}
class MotorolaT extends Touch
{
	public void moto()
	{
		//Making Obj for Passing Details
		Details d1=new Details();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Motorolo A20");
		System.out.println("Press 2 for Motorolo A10");
		System.out.println("Press 3 for Motorolo A21");
//		System.out.println("Press 4 for Motorolo");
//		System.out.println("Press 5 for Motorolo");
		System.out.println("Enter Your Choice :");
		int op=sc.nextInt();
		
		switch(op) {
		case 1:
			System.out.println();
			System.out.println("Thank You For Choosing Motorola A20 ");
			System.out.println("Motorola A20 Info");
			System.out.println("RAM: 4MB");
			System.out.println("Special features: MP3");
			System.out.println("Colour: ‎Blue");
			System.out.println("Phone Standby Time (with data): ‎720 Hours");
			System.out.println("Whats in the box: Handset, Battery, Quick start guide, Micro USB charger");
			System.out.println();
			d1.Final_Details("Motorola", "A20", 1056);
			break;
		case 2:
			System.out.println();
			System.out.println("Thank You For Choosing Motorola A10 ");
			System.out.println("Motorola A10 Info");
			System.out.println("RAM: 4MB");
			System.out.println("Special features: MP3");
			System.out.println("Colour: ‎Blue");
			System.out.println("Phone Standby Time (with data): ‎720 Hours");
			System.out.println("Whats in the box: Handset, Battery, Quick start guide, Micro USB charger");
			System.out.println();
			d1.Final_Details("Motorola", "A10", 1016);			
			break;
		case 3:
			System.out.println();
			System.out.println("Thank You For Choosing Motorola A21 ");
			System.out.println("Motorola A21 Info");
			System.out.println("RAM: 4MB");
			System.out.println("Special features: MP3");
			System.out.println("Colour: ‎Blue");
			System.out.println("Phone Standby Time (with data): ‎720 Hours");
			System.out.println("Whats in the box: Handset, Battery, Quick start guide, Micro USB charger");
			System.out.println();
			d1.Final_Details("Motorola", "A21", 1281);
			break;
			default:
			System.out.println("Invalid Input :");
		}

	}
}

class Cameras extends Electronix
{
	public void Camera()
	{
		Driver Dr=new Driver();
		//upcasting-Downcasting for DSLR
		Electronix Elc6 = new DSLR();
		DSLR ds=(DSLR) Elc6;
		
		//upcasting-Downcasting for Mirrorless
		Electronix Elca = new Mirrorless();
		Mirrorless ml=(Mirrorless) Elca;
		
		//upcasting-Downcasting for Action_Camera
		Electronix Elcb = new actionCamera();
		actionCamera ac=(actionCamera) Elcb;
		
		System.out.println("Press 1 for DSLR");
		System.out.println("Press 2 for MIRRORLESS");
		System.out.println("Press 3 for ACTION");
		System.out.println();
		System.out.println("Enter 0 For Main Menu");
		System.out.println(".....................Enter Your Choice :");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		
		switch(opt) {
		case 1:
			System.out.println("You Have Choosen DSLR Cameras");
			ds.dslr();
			break;
		case 2:
			System.out.println("You Have Choosen Mirrorless Cameras");
			ml.ml();
			break;
		case 3:
			System.out.println("You Have Choosen Action Cameras");
			ac.acam();
			break;
		case 0:
			Dr.main(null);
			break;
		default:
			System.out.println("Invalid Choice");
		}
		
	}
}

class Laptops extends Electronix
{
	public void Laptop()
	{
		//Making Obj for Passing Details
		Driver Dr=new Driver();
		
		//upcasting-Downcasting for Lenovo
		Electronix Elc6 = new Lenovo();
		Lenovo ln=(Lenovo) Elc6;
		
		//upcasting-Downcasting for Dell
		Electronix Elca = new Dell();
		Dell dl=(Dell) Elca;
		
		System.out.println("Press 1 for Lenovo");
		System.out.println("Press 2 for Dell");
		System.out.println();
		System.out.println("Enter 0 For Main Menu");
		
		System.out.println(".....................Enter Your Choice");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		
		switch(opt) {
		case 1:
			System.out.println("You Have Choosen Lenovo Laptops");
			ln.Lenovo();
			break;
		case 2:
			System.out.println("You Have Choosen Dell Laptops");
			dl.Dell();
			break;
		case 0:
			Dr.main(null);
			break;	
		default:
			System.out.println("invalid choice");
			
		}
		
	}
}
class Fridges extends Electronix
{
	public void Fridges()
	{
		//Making Obj for Passing Details
		Driver Dr=new Driver();
		
		//upcasting-Downcasting for whirlpool
	Electronix ref99=new Whirlpool();
	Whirlpool wp=(Whirlpool)ref99;
	
	System.out.println("1. Whirlpool");
	
	System.out.println("Enter 1 For Whilpool");
	System.out.println();
	System.out.println("Enter 0 for Main Menu");
	Scanner sc=new Scanner(System.in);
	System.out.println("..................Enter Your Choice :");
	int of=sc.nextInt();
	
	switch(of) {
	case 1:
		System.out.println("You Have Choosen Whirlpool Fridges");
		wp.whirlpool();
		break;
	case 0:
		Dr.main(null);
		break;	
	default:
		System.out.println("invalid choice");
		
	}
	}
	
}
class Whirlpool extends Fridges
{
	public void whirlpool()
	{
		//Making Object For Main & Fridges Class
		Driver Dr=new Driver();
		Fridges fdg=new Fridges();
		
		//Making Obj for Passing Details
		Details d1=new Details();
		
		System.out.println("-----------------------------------------");
		System.out.println("1.	Whirlpool WP500");
		System.out.println("-----------------------------------------");
		System.out.println("Whirlpool WP500 Info");
		System.out.println("-----------------");
		System.out.println("Sorry Details is Not Loaded");
		System.out.println();
		System.out.println();
		System.out.println("Press 1 to Buy Whirlpool WP500");
		System.out.println();
		System.out.println("Enter 0 For Main Menu");
		System.out.println("Enter 8 for Back");
		System.out.println();
		System.out.print("..................Enter Your Choice :");
		Scanner sc=new Scanner(System.in);
		int chd=sc.nextInt();
		switch(chd) {
		case 1:
			d1.Final_Details("Whirlpool", "WP500", 56000);
			break;
		case 0:
			Dr.main(null);
			break;
		case 8:
			fdg.Fridges();
			break;
		default:
			System.out.println("invalid choice");
		}
	}
}
class DSLR extends Cameras
{
	public void dslr()
	{
		//Making Object For Main & Cameras Class
		Driver Dr=new Driver();
		Cameras cm=new Cameras();
		
		//upcasting-Downcasting for Nikon
		Electronix Elcc = new Nikon();
		Nikon n=(Nikon) Elcc;
		
		//upcasting-Downcasting for Canon
		Electronix Elcd1 = new Canon();
		Canon cn=(Canon) Elcd1;
		
		//upcasting-Downcasting for Sony
		Electronix Elcd2 = new Sony();
		Sony sn=(Sony) Elcd2;
		
		System.out.println("Press 1 for Nikon");
		System.out.println("Press 2 for Canon");
		System.out.println("Press 3 for Sony");
		System.out.println();
		System.out.println("Enter 0 For Main Menu");
		System.out.println("Enter 8 for Back");

		System.out.println(".....................Enter Your Choice :");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		
		switch(opt) {
		case 1:
			System.out.println("You Have Choosen Nikon");
			n.Nikondslr();
			break;
		case 2:
			System.out.println("You Have Choosen Canon");
			cn.canondslr();
			break;
		case 3:
			System.out.println("You Have Choosen Sony");
			sn.sonydslr();
		case 0:
			Dr.main(null);
			break;
		case 8:
			cm.Camera();
			break;
		default:
			System.out.println("invalid choice");
		}
	}
}
class Mirrorless extends Cameras
{
	public void ml()
	{
		//Making Object For Main & Cameras Class
		Driver Dr=new Driver();
		Cameras cm=new Cameras();
		
		//upcasting-Downcasting for Nikon
		Electronix Elcd = new Nikon();
		Nikon n=(Nikon) Elcd;
		
		//upcasting-Downcasting for Canon
		Electronix Elce = new Canon();
		Canon cn=(Canon) Elce;
		
		System.out.println("Press 1 for Nikon");
		System.out.println("Press 2 for Canon");
		System.out.println("Press 3 for Sony");
		System.out.println("Enter 0 For Main Menu");
		System.out.println();
		System.out.println("Enter 8 for Back");
		System.out.println(".....................Enter Your Choice :");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		
		switch(opt) {
		case 1:
			System.out.println("You Have Choosen Nikon");
			n.Nikonml();
			break;
		case 2:
			System.out.println("You Have Choosen Canon");
			cn.canonml();
			break;
		case 0:
			Dr.main(null);
			break;
		case 8:
			cm.Camera();
			break;
		default:
			System.out.println("invalid choice");
			
		}
	}
}

class actionCamera extends Cameras
{
	public void acam()
	{
		//Making Object For Main & Cameras Class
		Driver Dr=new Driver();
		Cameras cm=new Cameras();
		
		//upcasting-Downcasting for Nikon
		Electronix Elce = new Nikon();
		Nikon n=(Nikon) Elce;
		
		//upcasting-Downcasting for Canon
		Electronix Elcf = new Canon();
		Canon cn=(Canon) Elcf;
		
		System.out.println("Press 1 for Nikon");
		System.out.println("Press 2 for Canon");
		System.out.println("Press 3 for Sony");
		System.out.println();
		System.out.println("Enter 0 For Main Menu");
		System.out.println("Enter 8 for Back");
		System.out.println(".....................Enter Your Choice :");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		
		switch(opt) {
		case 1:
			System.out.println("You Have Choosen Nikon");
			n.Nikonac();
			break;
		case 2:
			System.out.println("You Have Choosen Canon");
			cn.canonac();
			break;
		case 0:
			Dr.main(null);
			break;
		case 8:
			cm.Camera();
			break;
		default:
			System.out.println("invalid choice");
			
		}
	}
}

class Nikon extends Cameras
{
	public void Nikondslr()
	{
		Driver Dr=new Driver();
		Cameras cm=new Cameras();
		
		Details d1=new Details();
		
		System.out.println("-----------------------------------------");
		System.out.println("1.	Nikon D5200");
		System.out.println("-----------------------------------------");
		System.out.println("Nikon D5200 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("2.	Nikon D3500");
		System.out.println("-----------------------------------------");
		System.out.println("Nikon D3500 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("3.	Nikon D4201");
		System.out.println("-----------------------------------------");
		System.out.println("Nikon D4201 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println(">>>>>>>>>>>><<<<<<<<<<<<");
		System.out.println("Press 1 to Buy Nikon D5200");
		System.out.println("Press 2 to Buy Nikon D3500");
		System.out.println("Press 3 to Buy Nikon D4201");
		System.out.println();
		System.out.println("Enter 0 For Main Menu");
		System.out.println("Enter 8 for Back");
		System.out.println(".....................Enter Your Choice : ");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			d1.Final_Details("Nikon", "D5200", 37381);
			break;
		case 2:
			d1.Final_Details("Nikon", "D3500", 26681);
			break;
		case 3:
			d1.Final_Details("Nikon", "D4201", 32681);
			break;
		case 0:
			Dr.main(null);
			break;
		case 8:
			cm.Camera();
			break;
		default:
			System.out.println("Invalid choice");
		}
		
	}
	public void Nikonml()
	{
		Driver Dr=new Driver();
		Cameras cm=new Cameras();
		
		Details d1=new Details();
		
		System.out.println("-----------------------------------------");
		System.out.println("1.	Nikon M8268");
		System.out.println("-----------------------------------------");
		System.out.println("Nikon M8268 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("2.	Nikon M5263");
		System.out.println("-----------------------------------------");
		System.out.println("Nikon M5263 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("3.	Nikon M2401");
		System.out.println("-----------------------------------------");
		System.out.println("Nikon M2401 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println(">>>>>>>>>>>><<<<<<<<<<<<");
		System.out.println("Press 1 to Buy Nikon M8268");
		System.out.println("Press 2 to Buy Nikon M5263");
		System.out.println("Press 3 to Buy Nikon M2401");
		System.out.println();
		System.out.println("Enter 0 For Main Menu");
		System.out.println("Enter 8 for Back");
		System.out.println(".....................Enter Your Choice : ");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			d1.Final_Details("Nikon", "M8268", 40000);
			break;
		case 2:
			d1.Final_Details("Nikon", "M5263", 26681);
			break;
		case 3:
			d1.Final_Details("Nikon", "M2401", 32681);
			break;
		case 0:
			Dr.main(null);
			break;
		case 8:
			cm.Camera();
			break;	
		}
		
	}
	public void Nikonac()
	{
		Driver Dr=new Driver();
		Cameras cm=new Cameras();
		
		Details d1=new Details();
		
		System.out.println("-----------------------------------------");
		System.out.println("1.	Nikon AC301");
		System.out.println("-----------------------------------------");
		System.out.println("Nikon AC301 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("2.	Nikon AC402");
		System.out.println("-----------------------------------------");
		System.out.println("Nikon AC402 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("3.	Nikon AC612");
		System.out.println("-----------------------------------------");
		System.out.println("Nikon AC612 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println(">>>>>>>>>>>><<<<<<<<<<<<");
		System.out.println("Press 1 to Buy Nikon AC301");
		System.out.println("Press 2 to Buy Nikon AC402");
		System.out.println("Press 3 to Buy Nikon AC612");
		System.out.println();
		System.out.println("Enter 0 For Main Menu");
		System.out.println("Enter 8 for Back");
		System.out.println(".....................Enter Your Choice : ");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			d1.Final_Details("Nikon", "AC301", 40000);
			break;
		case 2:
			d1.Final_Details("Nikon", "AC402", 26681);
			break;
		case 3:
			d1.Final_Details("Nikon", "AC612", 32681);
			break;
		case 0:
			Dr.main(null);
			break;
		case 8:
			cm.Camera();
			break;	
		}
		
	}
}
class Canon extends DSLR
{
	public void canondslr()
	{
		Driver Dr=new Driver();
		Cameras cm=new Cameras();
		
		Details d1=new Details();
		System.out.println("-----------------------------------------");
		System.out.println("1.	Canon C4201");
		System.out.println("-----------------------------------------");
		System.out.println("Canon C4201 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("2.	Canon C3301");
		System.out.println("-----------------------------------------");
		System.out.println("Canon C3301 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("3.	Canon C5632");
		System.out.println("-----------------------------------------");
		System.out.println("Canon C5632 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println(">>>>>>>>>>>><<<<<<<<<<<<");
		System.out.println("Press 1 to Buy Canon C4201");
		System.out.println("Press 2 to Buy Canon C3301");
		System.out.println("Press 3 to Buy Canon C5632");
		System.out.println();
		System.out.println("Enter 0 For Main Menu");
		System.out.println("Enter 8 for Back");
		System.out.println(".....................Enter Your Choice : ");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			d1.Final_Details("Canon", "C4201", 37381);
			break;
		case 2:
			d1.Final_Details("Canon", "C3301", 37381);
			break;
		case 3:
			d1.Final_Details("Canon", "C5632", 37381);
			break;
		case 0:
			Dr.main(null);
			break;
		case 8:
			cm.Camera();
			break;	
		default:
				System.out.println("Invalid Choice");
				
		}

	}
	
	public void canonml()
	{
		Driver Dr=new Driver();
		Cameras cm=new Cameras();
		
		Details d1=new Details();
		
		System.out.println("-----------------------------------------");
		System.out.println("1.	Canon ML320");
		System.out.println("-----------------------------------------");
		System.out.println("Canon ML320 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("2.	Canon ML452");
		System.out.println("-----------------------------------------");
		System.out.println("Canon ML452 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("3.	Canon ML696");
		System.out.println("-----------------------------------------");
		System.out.println("Canon ML696 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println(">>>>>>>>>>>><<<<<<<<<<<<");
		System.out.println("Press 1 to Buy Canon ML320");
		System.out.println("Press 2 to Buy Canon ML452");
		System.out.println("Press 3 to Buy Canon ML696");
		System.out.println();
		System.out.println("Enter 0 For Main Menu");
		System.out.println("Enter 8 for Back");
		System.out.println(".....................Enter Your Choice : ");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			d1.Final_Details("Canon", "ML320", 37381);
			break;
		case 2:
			d1.Final_Details("Canon", "ML452", 37381);
			break;
		case 3:
			d1.Final_Details("Canon", "ML696", 37381);
			break;
		case 0:
			Dr.main(null);
			break;
		case 8:
			cm.Camera();
			break;	
		default:
				System.out.println("Invalid Choice");
				
		}

	}
	
	public void canonac()
	{
		Driver Dr=new Driver();
		Cameras cm=new Cameras();
		
		Details d1=new Details();
		System.out.println("-----------------------------------------");
		System.out.println("1.	Canon AC320");
		System.out.println("-----------------------------------------");
		System.out.println("Canon AC320 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("2.	Canon AC452");
		System.out.println("-----------------------------------------");
		System.out.println("Canon AC452 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("3.	Canon AC696");
		System.out.println("-----------------------------------------");
		System.out.println("Canon AC696 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println(">>>>>>>>>>>><<<<<<<<<<<<");
		System.out.println("Press 1 to Buy Canon AC320");
		System.out.println("Press 2 to Buy Canon AC452");
		System.out.println("Press 3 to Buy Canon AC696");
		System.out.println();
		System.out.println("Enter 0 For Main Menu");
		System.out.println("Enter 8 for Back");
		System.out.println(".....................Enter Your Choice : ");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			d1.Final_Details("Canon", "AC320", 37381);
			break;
		case 2:
			d1.Final_Details("Canon", "AC452", 37381);
			break;
		case 3:
			d1.Final_Details("Canon", "AC696", 37381);
			break;
		case 0:
			Dr.main(null);
			break;
		case 8:
			cm.Camera();
			break;	
		default:
				System.out.println("Invalid Choice");
				
		}

	}
}
class Sony extends Cameras
{
	public void sonydslr()
	{
		Driver Dr=new Driver();
		Cameras cm=new Cameras();
		
		Details d1=new Details();
		System.out.println("-----------------------------------------");
		System.out.println("1.	Sony DS412");
		System.out.println("-----------------------------------------");
		System.out.println("Sony DS412 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("2.	Sony DS631");
		System.out.println("-----------------------------------------");
		System.out.println("Sony DS631 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("3.	Sony DS501");
		System.out.println("-----------------------------------------");
		System.out.println("Sony DS501 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println(">>>>>>>>>>>><<<<<<<<<<<<");
		System.out.println("Press 1 to Buy Sony DS412");
		System.out.println("Press 2 to Buy Sony DS631");
		System.out.println("Press 3 to Buy Sony DS501");
		System.out.println();
		System.out.println("Enter 0 For Main Menu");
		System.out.println("Enter 8 for Back");
		System.out.println(".....................Enter Your Choice : ");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			d1.Final_Details("Sony", "DS412", 37381);
			break;
		case 2:
			d1.Final_Details("Sony", "DS631", 37381);
			break;
		case 3:
			d1.Final_Details("Sony", "DS501", 37381);
			break;
		case 0:
			Dr.main(null);
			break;
		case 8:
			cm.Camera();
			break;	
		default:
				System.out.println("Invalid Choice");
				
		}

	}
}
class Lenovo extends Laptops
{
	
	public void Lenovo()
	{
		Driver Dr=new Driver();
		Laptops lpt=new Laptops();
		
		Details d1=new Details();
		System.out.println("-----------------------------------------");
		System.out.println("1.	Lenovo 1200");
		System.out.println("-----------------------------------------");
		System.out.println("Lenovo 1200 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("2.	Lenovo 5442");
		System.out.println("-----------------------------------------");
		System.out.println("Lenovo 5442 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("3.	Lenovo 9811");
		System.out.println("-----------------------------------------");
		System.out.println("Lenovo 9811 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println(">>>>>>>>>>>><<<<<<<<<<<<");
		System.out.println("Press 1 to Buy Lenovo 6881");
		System.out.println("Press 2 to Buy Lenovo 5442");
		System.out.println("Press 3 to Buy Lenovo 9811");
		System.out.println();
		System.out.println("Enter 0 For Main Menu");
		System.out.println("Enter 8 for Back");
		System.out.println(".....................Enter Your Choice : ");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			d1.Final_Details("Lenovo", "6881", 37381);
			break;
		case 2:
			d1.Final_Details("Lenovo", "5442", 37381);
			break;
		case 3:
			d1.Final_Details("Lenovo", "9811", 37381);
			break;
		case 0:
			Dr.main(null);
			break;
		case 8:
			lpt.Laptop();
			break;
		default:
				System.out.println("Invalid Choice");
				
		}

	}
}
class Dell extends Laptops
{
	public void Dell()
	{
		Driver Dr=new Driver();
		Laptops lpt=new Laptops();
		
		Details d1=new Details();
		System.out.println("-----------------------------------------");
		System.out.println("1.	Dell 1200");
		System.out.println("-----------------------------------------");
		System.out.println("Dell 1200 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("2.	Dell 5442");
		System.out.println("-----------------------------------------");
		System.out.println("Dell 5442 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println("-----------------------------------------");
		System.out.println("3.	Dell 9811");
		System.out.println("-----------------------------------------");
		System.out.println("Dell 9811 Info");
		System.out.println("-----------------");
		System.out.println("Model: 1590");
		System.out.println("Model Year	‎18");
		System.out.println("Batteries	‎1 Lithium Ion batteries required.");
		System.out.println("Hardware Interface	‎Bluetooth");
		System.out.println("Mounting Hardware	‎Camera Body & Lens");
		System.out.println("Max Resolution	‎24.2 MP");
		System.out.println("Min Focal Length	‎18 Millimeters");
		System.out.println("Includes External Memory	‎No");
		
		System.out.println(">>>>>>>>>>>><<<<<<<<<<<<");
		System.out.println("Press 1 to Buy Dell 6881");
		System.out.println("Press 2 to Buy Dell 5442");
		System.out.println("Press 3 to Buy Dell 9811");
		System.out.println();
		System.out.println("Enter 0 For Main Menu");
		System.out.println("Enter 8 for Back");
		System.out.print(".....................Enter Your Choice : ");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			d1.Final_Details("Dell", "6881", 37381);
			break;
		case 2:
			d1.Final_Details("Dell", "5442", 37381);
			break;
		case 3:
			d1.Final_Details("Dell", "9811", 37381);
			break;
		case 0:
			Dr.main(null);
			break;
		case 8:
			lpt.Laptop();
			break;	
		default:
				System.out.println("Invalid Choice");
				
		}

	}
}
class Details
{
	Driver Dr=new Driver();
//private static final String Veh = null;

public void Final_Details(String E_Brand, String E_Name, double E_Price)
{
Electronix Ec = new Electronix();

System.out.println("Choose Payment Option\n");
System.out.println("To Pay With Cheque Press 1");
System.out.println("To Pay With NEFT Press 1");
System.out.println("To Pay With EMI Press 3");
System.out.println("Enter Your Choice :");
Scanner sc = new Scanner(System.in);
int opt = sc.nextInt();

switch (opt) {
case 1:
System.out.println("You Have Choosen Payment Through Cheque");
break;

case 2:
System.out.println("You Have Choosen Payment option NEFT");
break;

case 3:
System.out.println("You Have Choosen Payment option EMI");
break;
default:
System.out.println("Sorry You Choosen Invalid Payment Option");
Dr.main(null);
break;
}

//System.out.println("Which Colour Do You Want??\n");
//sc.nextLine();
//String colour = sc.nextLine();
//System.out.println();

System.out.println("Enter Your Name\n");
String oname = sc.nextLine();
sc.nextLine();
Ec.setOwner_Name(oname);
System.out.println();

System.out.println("Enter Your Mobile Number\n");
Long omobno = sc.nextLong();
Ec.setOwner_Mobile_Number(omobno);
System.out.println();

System.out.println("Enter Your Email Id Number\n");
sc.nextLine();
String oemail = sc.nextLine();

Ec.setOwner_Emailid(oemail);
System.out.println();

System.out.println("Enter Your Aadhar Card Number\n");
String oaadharno = sc.nextLine();
Ec.setOwner_AadharNo(oaadharno);
System.out.println();

System.out.println("Enter Your Pan Card Number\n");
String opanno = sc.nextLine();
Ec.setOwner_PanNo(opanno);
System.out.println();

Ec.PDfilling(E_Brand, E_Name, E_Price);
Ec.getDetails();
	
System.out.println("");
System.out.println("------------------------------------------------");
System.out.println("Thank You For Purchasing a Product From Our Shop...!!!");
System.out.println("Have a Good Day: "+oname);
System.out.println("");

Ec.On();
Ec.Off();
Ec.Working();

}
}
//class Shops
//{
//	static String Sname1="NAVI-MUMBAI";
//	public static void nm()
//	{
//		System.out.println("Nirmiti Garden");
//		System.out.println("Shop A-402, Balaji Shankar Marg");
//		System.out.println("Pincode:410206, Nerul Navi-Mumbai");
//	}
//}
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Upcasting-Downcasting for Mobiles
		Electronix ref1 = new Mobiles();
		Mobiles ref2 = (Mobiles) ref1;
		System.out.println("Press 1 For Mobiles");

		// Upcasting-Downcasting for Cameras
		Electronix ref3 = new Cameras();
		Cameras ref4 = (Cameras) ref3;
		System.out.println("Press 2 For Cameras");

		// Upcasting-Downcasting for Laptops
		Electronix ref5 = new Laptops();
		Laptops ref6 = (Laptops) ref5;
		System.out.println("Press 3 For Laptops");

		Electronix ref88 = new Fridges();
		Fridges fd = (Fridges) ref88;
		System.out.println("Press 4 For Fridges");
		
		System.out.println("Enter Your Choice :");
		Scanner sc = new Scanner(System.in);
		int a = 0;

		try {
		a = sc.nextInt();
		} catch (InputMismatchException ie)
		{
		System.out.println("The Enter The Valid Input");
		System.out.println();
		}

		switch (a) {
		case 1:
		System.out.println("You Have Choosen Mobiles Product");
		ref2.Mb();
		break;
		case 2:
		System.out.println("You Have Choosen Cameras");
		ref4.Camera();
		break;
		case 3:
		System.out.println("You Have Choosen Laptops");
		ref6.Laptop();
		break;
		case 4:
		System.out.println("You Have Choosen Fridges");
		fd.Fridges();
		break;
		default:
		System.out.println("Invaild Input :)");
		System.out.println();
		main(args);
		break;
		}
		}
	/*	static {
	 		String Name="Nilesh";
	 		int pwd=123;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Name :");
			String nme = sc.next();
			System.out.println("Enter Your PIN :");
			int pin = sc.nextInt();
			if(nme==Name && pin==pwd) {
				main(null);
			}else {
				System.out.println("Error");
			}
		}	*/

//		public static void dash()
		static{
		System.out.println("Welcome To Ekdanta Electronix  ");
		System.out.println("May I Help U???");
		System.out.println("Which Product Should You Buy??");
		System.out.println("--------------------------------------------");
		}
	}


