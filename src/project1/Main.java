
package project1;
import java.util.*;
import project1.utils.*;

import java.text.ParseException;

import java.text.SimpleDateFormat;




// The code below was completed by both these persons 
// Garfield Grant ID#: 620108615
// Horraine McCalla ID# 620108328



public class Main{
	ArrayList <Events> eventslist= new ArrayList <Events> ();
	ArrayList <Client> clientlist= new ArrayList <Client>();
	ArrayList <EventTypes> typelist= new ArrayList <EventTypes>();
	
Scanner scanner= new Scanner (System.in);
    public void showEvents(String title) {
	// remove the call to notImplemented when you implement
	// this method
	//menu.notImplemented(title);
	
	
	Collections.sort(eventslist);

		System.out.println(eventslist.toString());
    }

    public void showEvents(int daysAway) {
	// remove the call to notImplemented when you implement
	// this method
	//menu.notImplemented("Events " + daysAway + " days away");
	// ToDo:
	// should calculate a title and call another version
	// of this method to achieve its goals
	
	
	String title= "Events"+ daysAway+ " days away";
	showEvents (daysAway, title);
    }

    public void showEvents(int daysAway, String title) {
	// remove the call to notImplemented when you implement
	// this method
	//menu.notImplemented(title);
	// ToDo:
	// filter the events list for entries that match the
	// criteria. Print that list in a sensible format
	
	Date day= DateUtil.dateAfterDate(DateUtil.stringToDate(DateUtil.today()), daysAway+1);
	Date day2= DateUtil.dateBeforeToday(Math.abs(daysAway+1));
	Date day1= DateUtil.stringToDate(DateUtil.today());
	 
	 
	if (daysAway>=1){
		
	for (Events garf: eventslist){
		Date dayz= garf.getstartdate();
		
			if (dayz.after(day1) && dayz.before(day)) {
				System.out.println(garf);
				
			}
	
	
	}
	} else if (daysAway<= -1){
		
		for (Events garf: eventslist){
		
		Date dayz= garf.getstartdate();
		if (dayz.after(day2) && dayz.before(day1)) {
				System.out.println(garf);
				
			}
			
	}
	
	} 
    }

    public void createEvent() {

	// prompt the user for the appropriate fields to create
	// an event object
	
	
	String name, description, startdate,starttime,finishdate,finishtime,location ,clientcode;

	int staffperhundred,patrons;
	String type;
	
	
	System.out.println("Please enter the event's name ");
	name= scanner.nextLine();
	
	System.out.println("Please enter the event's description ");
	description= scanner.nextLine();
	
	System.out.println("Please enter the event's type ");
	type= scanner.nextLine();
	while (true) {
	try {
	System.out.println("Please enter the event's start date ");
	startdate= scanner.nextLine();
	Date obj = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(startdate);
	break;
	}catch (ParseException e){
		System.out.println ("Enter the required format please");
	} } 
	
	while (true ){
	try {
	System.out.println("Please enter the event's start time ");
	starttime= scanner.nextLine();
	Date obj = new SimpleDateFormat ("HH:mm").parse(starttime);
	
	break;
	}catch (ParseException e){
		System.out.println ("Enter the required format please");
	} }
	
	while (true){
	try {
	System.out.println("Please enter the event's finish date ");
	finishdate= scanner.nextLine();
Date obj = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(startdate);
	break;
	}catch (ParseException e){
		System.out.println ("Enter the required format please");
	} }
	
	while (true){
	try {
	System.out.println("Please enter the event's finish time  ");
	finishtime= scanner.nextLine();
	Date obj = new SimpleDateFormat ("HH:mm").parse(starttime);
	break;
	}catch (ParseException e){
		System.out.println ("Enter the required format please");
	} }
	


	System.out.println("Please enter the event's location ");
	location= scanner.nextLine();
	

	


	while (true){
	try {
	System.out.println("Please enter the event's capacity ");
	patrons= Integer.parseInt(scanner.nextLine());
	break;
	}catch (NumberFormatException e){
		System.out.println ("Enter the required format please");
	} }
	

	System.out.println("Please enter the event's client code ");
	clientcode= scanner.nextLine();
	
	
	
	Events event= new Events(name,description,type,startdate,starttime,finishdate, finishtime,location,patrons ,clientcode);
	eventslist.add(event);
	
	
	
    }

    public void createClient() {
	String name, address,email,number,email1,number1;
	// remove the call to notImplemented when you implement
	// this method
	
	
	// ToDo: Method to create client by prompting the
	// user for the fields required
	while (true) {
	try {
	System.out.println("Please enter the person's full name ");
	name= scanner.nextLine();
	break;}  catch (StringIndexOutOfBoundsException e){
		System.out.println ("Enter the data in required format please");
	} }
	
	while (true){
		try {
	System.out.println("Please enter the person's address ");
	address= scanner.nextLine(); break ; }
	catch (StringIndexOutOfBoundsException e){
		System.out.println ("Enter the data in required format please");
	} }
	
	
	while (true) {
		try{
	System.out.println("Please enter the person's email ");
		email= scanner.nextLine(); break; }
		catch (StringIndexOutOfBoundsException e){
		System.out.println ("Enter the data in required format please");
	} }
	
	while (true){
		try {
	System.out.println("Please enter the person's second email ");
		email1= scanner.nextLine(); break;}
		catch (StringIndexOutOfBoundsException e){
		System.out.println ("Enter the data in required format please");
	}
	}
	while (true){
		try{
	System.out.println("Please enter the person's telephone number ");
		number= scanner.nextLine(); break; }
		catch (StringIndexOutOfBoundsException e){
		System.out.println ("Enter the data in required format please");
	}
	}
	
	while (true){ 
		try {
	System.out.println("Please enter the person's second telephone ");
	number1= scanner.nextLine();
		break ;}
		catch (StringIndexOutOfBoundsException e){
		System.out.println ("Enter the data in required format please");
	} }
	
	Client client = new Client (name,address,email,email1,number,number1);
	clientlist.add(client);
	
	
	
	
	
    }

    public void showAllClients() {
	// remove the call to notImplemented when you implement
	// this method
	//menu.notImplemented("List All Clients");
	// this method should return a numbered list of
	// all clients and prompt the user for a number
	// to edit or delete the corresponding client
	
	Client gg = new Client(); 

	
	
	for (Client g: clientlist){
	System.out.println(g.toString());}
	System.out.println("Please select choice to edit or delete client");
	
	System.out.println("1. To edit client types yes and 2. to delete a client del ");
	Scanner inp = new Scanner(System.in);
	String ans= inp.nextLine();
	
	
	
	if (ans.equalsIgnoreCase("yes")){
			
			System.out.println("please enter client number to edit");
			String a = inp.nextLine();
			int id = Integer.parseInt(a);
			
			for (int i = 0; i < clientlist.size(); i++) {

                        if (clientlist.get(i).getId() == id) {
                           
			System.out.println("please enter client name");
			String name2= inp.nextLine();
			clientlist.get(i).setname(name2); 
			System.out.println("please enter  client address");
			String name3= inp.nextLine();
			clientlist.get(i).setaddress(name3);
			System.out.println("please enter  client email");
			String name4= inp.nextLine();
			clientlist.get(i).setemail(name4);
			
			System.out.println("please enter  client second email");
			String name6= inp.nextLine();
			clientlist.get(i).setemail1(name6);
			
			System.out.println("please enter the client update telephone number");
			String name5= inp.nextLine();
			clientlist.get(i).settele(name5);
			
			System.out.println("please enter the client update telephone second number");
			String name7= inp.nextLine();
			clientlist.get(i).settele1(name7);
						}       
                   
	
			}    
	
			
			
    } else if(ans.equalsIgnoreCase("del")){
		while(true){
		try {
		System.out.println("please enter client number to edit");
			String a = inp.nextLine();
			int id = Integer.parseInt(a);
			
			for (int i = 0; i < clientlist.size(); i++) {

                        if (clientlist.get(i).getId() == id) {  
						
						clientlist.remove(i);
						
						}} 
						
						
						
						break; } catch (NumberFormatException e) {
                    System.out.println("Please ensure that a valid selection "
			+ "or id is entered"); }
			
		
	}	
	}
	

	
	
	
	}
    public void showAllEventTypes() {
	//menu.notImplemented("List All Event Types");
	
	for (EventTypes bas: typelist){
	System.out.println(bas.toString());}
	
	
    }
	
	
    
    public void createEventType() {
	//menu.notImplemented("New Event Type");
	
	
	double basefee,stafffee;
	String name, description;
	
	System.out.println("Please enter the event type name ");
	name= scanner.nextLine();
	System.out.println("Please enter the event type description");
	description= scanner.nextLine();
	while (true){
		try {
	System.out.println("Please enter the event type basefee ");
	basefee= Double.parseDouble(scanner.nextLine());
		break; }  
		catch (NumberFormatException e){
		System.out.println ("Enter the required format please");
	}
	
	}
	
	while (true){
		try {
	System.out.println("Please enter the event's stafffee ");
	stafffee= Double.parseDouble(scanner.nextLine());
		break; } catch (NumberFormatException e){
		System.out.println ("Enter the required format please");
	}
	
	}
		EventTypes etypes= new EventTypes (name,description,basefee,stafffee);
	typelist.add(etypes);
	
	
	
    }


  // ------------------ Do not edit anything below this line ----------
    
    Menu menu;
    Scanner keyboard;
    
    public Main(Scanner keyb) {
	menu = new Menu(keyb);
	setupMenus();
    }
    public Main() {
	keyboard = new Scanner(System.in);
	menu = new Menu(keyboard);
	setupMenus();
    }

    public void clientManager() {
	boolean cmrunning = true;
	String userInput;
	while (cmrunning) {
	    	menu.showMenu("c", "KMN Event Manager - Client Manager");
        	userInput = menu.getUserInput();
        	switch (userInput) {
        	case "a":
        	    showAllClients();
        	    break;
        	case "n":
        	    createClient();
        	    break;
        	case "x":
        	    cmrunning = false;
        	    break;
        	}
	}
    }

    public void eventTypeManager() {
	boolean etmrunning = true;
	String userInput;
	while (etmrunning) {
	    	menu.showMenu("t", "KMN Event Manager - Types of Events");
        	userInput = menu.getUserInput();
        	switch (userInput) {

        	case "a":
        	    showAllEventTypes();
        	    break;
        	case "n":
        	    createEventType();
        	    break;
        	case "x":
        	    etmrunning = false;
        	    break;
        	}
	}
    }

    public static void main(String[] args) throws ParseException{
        // create instance of main
        Scanner keyb = new Scanner(System.in);
        Main me = new Main(keyb);
        boolean running = true;
        
        String userInput;
        
        while (running) {
            me.showMainMenu();
            userInput = me.menu.getUserInput();
            switch(userInput) {
            case "q":
        	running = false;
        	break;
            case "n": case "c": case "t":
        	me.showSubMenu(userInput);
        	break;
            case "w":
        	me.showEvents(7, "Coming Week");
        	break;
            case "o":
        	me.showEvents(-365, "Last Year");
        	break;
            case "a":
        	me.showEvents("All time");
        	break;
            default:
        	break;
            }
        }
        me.menu.clearScreen();
        System.out.println(String.format("%n%nClosing Event Manager.. .%n"));
        keyb.close();
    }

    public void showMainMenu() {
	// displays the main menu
	menu.showMenu("main", "KMN Event Manager");
    }

    public void showSubMenu(String letter) throws ParseException {
	if (letter.equals("n"))
	    createEvent();
	else if (letter.equals("c"))
	    clientManager();
	else
	    eventTypeManager();
    }

    public void setupMenus() {
	// Main Menu: Key = main
	menu.createMenu("main");
	menu.addMenuItem("main", "View Events in the coming week", 1, "w");
	menu.addMenuItem("main", "New Event", 1, "n");
	menu.addMenuItem("main", "View All Events", 1, "a");
	menu.addMenuItem("main", "View Last Year's Events", 1, "o");
	menu.addBlankMenuItem("main");
	menu.addMenuItem("main", "Client Management", 1, "c");
	menu.addMenuItem("main", "Event Type Management", 1, "t");
	menu.addBlankMenuItem("main");
	menu.addMenuItem("main", "Quit.", 1, "q");

	// Client Management Menu: Key = c
	menu.createMenu("c");
	
	menu.addMenuItem("c", "Show All Clients", 2, "a");
	menu.addMenuItem("c", "New Client", 2, "n");
	menu.addBlankMenuItem("c");
	menu.addMenuItem("c", "<- Back to main menu", 1, "x");
	
	// event type manager menu: Key = t
	menu.createMenu("t");
	
	menu.addMenuItem("t", "List Event Types", 2, "a");
	menu.addMenuItem("t", "New Event Type", 2, "n");
	menu.addBlankMenuItem("t");
	menu.addMenuItem("t", "<- Back to main menu", 1, "x");
    }
}