package project1;
import java.util.*;




public class EventTypes{

private String code, description;
private double basefee=0.0, stafffee=0.0, final_charge=0.0, cost_per_staff=620;
private int staffperhundred=0;
private  int x;


// constructor that creates a empty event 
public EventTypes(){
	//does nothing
}


// constructor that creates a event type with its criteria 
public EventTypes(String code, String description,double basefee,double stafffee){
	this.code=code;
	this.description=description ;
	this.basefee=basefee;
	this.stafffee=stafffee;
	
}

// This method enable the user to get the number of staff per hundred  patrons
public int getnumberstaff(){

	if(getname().equalsIgnoreCase("P01")){
		
		return this.staffperhundred=2;
		

            }else if(getname().equalsIgnoreCase("P03")){
				
				 this.staffperhundred=2;
				
				

            }else if(getname().equalsIgnoreCase("P04")){
				
				 this.staffperhundred=2;
				 
				
               
            } else if(getname().equalsIgnoreCase("W01")){
				
				 this.staffperhundred=4;
				 
				

            }else if(getname().equalsIgnoreCase("W02")){
				
			 this.staffperhundred=5;
			 
				
               
            }else if(code.equalsIgnoreCase("C01")){
				
				 this.staffperhundred=3;
				 
				

            }else if(getname().equalsIgnoreCase("C02")){
				
				 this.staffperhundred=3;
				
				
               
            }  
	this.x=staffperhundred;
	return x;
}


// gets staff number and return it as a integer
public int getstaffnum(){
	return this.x;
}

//get the basefee and return it as a double
public double getbasefee(){
	 return this.basefee;
	 
	}
	
	
	// get the staff fee and return it as double 
public double getstafffee(){
	return this.stafffee;}
	
	// get the eventtype name and return it as a string
public String getname(){
	return this.code;}
	
	// get the event type description and return it as a description
	public String getdescription(){
	return this.description;}
	
	// prints out the event type class in this structured format
	public String toString(){
        String output = "*************************************************************************\n"+
                "*********************************************************************************\n" +
                "*********************************************************************\n"+
                "Event Name: " + getname() + "\n" +
                "descriptions: " + getdescription()+ "\n" +
                "Staff fee:    " + getstafffee()+ "\n" +
				"base fee: " + getbasefee()+ "\n" +
				"Staffnum: " + getnumberstaff() +"\n" +
                "*********************************************************************\n";

        return output;
    }



	
	
	
}