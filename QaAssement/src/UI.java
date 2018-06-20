import java.util.Scanner;
public class UI {
	static int getdays(Scanner in)
	{
		System.out.println("QA Cinema Application" );
	    System.out.println("-----------------------------------------------");
	    System.out.println("1\t Monday");
	    System.out.println("2\t Tuesday");
	    System.out.println("3\t Wednesday");
	    System.out.println("4\t Thursday");
	    System.out.println("5\t Friday");
	    System.out.println("6\t Saturday");
	    System.out.println("7\t Sunday");
	    System.out.println("-----------------------------------------------");
	    System.out.println("Please choose a day:");
	  
	    int choice=in.nextInt();    
	    return choice;
	}
	
public static void main(String[] args) {
	
	
	Scanner in = new Scanner(System.in);
    days selectedday = new days();
    
    switch (getdays(in)) 
    {
    case 1:
        selectedday.name = "Monday"; 
    	booking(in, selectedday);
        break;
    case 2:
    	selectedday.name = "Tuesday";
    	booking(in, selectedday);
        break;
    case 3:
    	selectedday.name = "Wednesday";
    	selectedday.discount = 2.0;
    	booking(in, selectedday);
        break;
    case 4:
    	selectedday.name = "Thursday";
    	booking(in, selectedday);
        break;
    case 5:
    	selectedday.name = "Friday";	
    	booking(in, selectedday);
    	break;
    case 6:
    	selectedday.name = "Saturday";
    	booking(in, selectedday);
        break;          
    case 7:
    	selectedday.name = "Sunday";
    	booking(in, selectedday);
        break;   
    default: System.out.println("Invalid Choice Please Run The Application Again");   
    }
in.close();
}

static void booking(Scanner in, days selectedday)
{
	System.out.println("-----------------------------------------------");
	System.out.println("Booking Tickets For " + selectedday.name); 
	ticket t1 = new ticket();
	ticket t2 = new ticket();
	ticket t3 = new ticket();
	ticket t4 = new ticket();
	

	t1.type = "standard";
	t1.price = 8 - selectedday.discount;
	t2.type = "OAP";
	t2.price = 6 - selectedday.discount;
	t3.type = "Student";
	t3.price = 6 - selectedday.discount;
	t4.type = "Child";
	t4.price = 4 - selectedday.discount;

	sumticket s1 = new sumticket();
	s1.amount = 0;
	
	double Standard_ticketquantity;  
	double Standard_totalprice; 
	System.out.println("Enter in the amount of standard tickets you would like to purchase ");
	Standard_ticketquantity = in.nextDouble();
	s1.amount = s1.amount + Standard_ticketquantity; 
	Standard_totalprice = t1.price * Standard_ticketquantity;
	
	
	double OAP_ticketquantity; 
	double OAP_totalprice; 
	System.out.println("Enter in the amount of OAP tickets you would like to purchase ");
	OAP_ticketquantity = in.nextDouble();
	s1.amount = s1.amount + OAP_ticketquantity; 
	OAP_totalprice = t2.price * OAP_ticketquantity;
	
	
	double Student_ticketquantity;  
	double Student_totalprice; 
	System.out.println("Enter in the amount of student tickets you would like to purchase ");
	Student_ticketquantity = in.nextDouble();
	s1.amount = s1.amount + Student_ticketquantity; 
	Student_totalprice = t3.price * Student_ticketquantity;
	
	
	double child_ticketquantity;
	double child_totalprice; 
	System.out.println("Enter in the amount of child tickets you would like to purchase ");
	child_ticketquantity = in.nextDouble();
	s1.amount = s1.amount + child_ticketquantity; 
	child_totalprice = t4.price * child_ticketquantity;
	 
	
	double sub_total; 
	sub_total = child_totalprice + Standard_totalprice + OAP_totalprice + Student_totalprice;
	System.out.println("-----------------------------------------------");
	System.out.println("Total Price Of Tickets in  £" + sub_total);
	System.out.println("\t Thank Youu For Choosing QA");
	System.out.println("-----------------------------------------------");

}

	
	
}
