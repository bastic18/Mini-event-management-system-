
package project1;
import java.util.*;
import project1.utils.*;


public class Client{
private String name,  address, email_address, email_address1, telephone_number,telephone_number1;
private int id;
private static int trackid=0;

public Client(){
System.out.println("no client data ");
}


public Client(String name, String address, String e_adress, String email_address1, String tele, String telephone_number1){
this.name=name;
this.address=address;
this.email_address=e_adress;
this.email_address1= email_address1;
this.telephone_number=tele;
this.telephone_number1=telephone_number1;

this.id = getNextId() ;


}


public int getNextId(){
		this.trackid++;
		return trackid;
		
	}
   
		public int getId(){
		return id; }

public String getname(){
	return this.name;
}
public String getaddress(){
	return this.address;
}
public String getemail(){
	return this.email_address;
}

public String getemail1(){
	return this.email_address1;
}


public String gettelenumber(){
	return this.telephone_number;
}


public String gettelenumber1(){
	return this.telephone_number1;
}

public void setname(String name){
	this.name= name;
}
public void setaddress(String adr){
	this.address= adr;
}
public void settele(String num){
	this.telephone_number= num;
	
} 

public void settele1(String num){
	this.telephone_number1= num;
	
} 
public void setemail (String eml){
	this.email_address= eml; 
}


public void setemail1 (String eml){
	this.email_address1= eml; 
}

public void updatetele(String tele){
	this.telephone_number+= " "+ tele;
}
public void updateemail(String email){
	this.email_address+= " " + email; 
	
}

    public String toString(){
        String output = "*************************************************************************\n"+
                "*********************************************************************************\n" +
                "*********************************************************************\n"+
				"Client number: " + id + "\n" +
                "Client Name: " + getname() + "\n" +
                "Address:   " + getaddress()+ "\n" +
                "Email Address:  " + getemail()+ "\n" +
				"Email Address2: " + getemail1()+ "\n" +
                "Telephone:     " + gettelenumber()+ "\n" +
				"Telephone2:     " + gettelenumber1()+ "\n" +
                "*********************************************************************\n";

        return output;
    }





}