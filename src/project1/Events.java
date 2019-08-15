
package project1;
import java.util.*;
import project1.utils.*;
import java.util.Date;
import java.text.SimpleDateFormat;



public class Events implements Comparable <Events>{
	
	
	EventTypes a= new EventTypes();
public Events(){
	
}
	
private String name,description, location,clientcode;

private Date startdate, finishdate, finishtime, starttime;
private String startdate1, finishdate1, finishtime1, starttime1;
private int patrons;
private long timeinsec;
private String type;
private double basefees, finalbasefee,staffcost, finalstaffcost;
private int staffperhundred1=0;
private  int bas;
private static int reference_number;
private static int x=0;
public static int count(){
	 x++;
	 return x;
}
public Events(String name,String description, String type, String startdate, String starttime, String finishdate,String finishtime, String location, int patrons, String clientcode){
this.reference_number=count();
this.name= name;
this.description=description;
this.type=type;
this.startdate=DateUtil.stringToDate(startdate); 
this.starttime= DateUtil.stringToTime(starttime);
this.startdate1=startdate;
this.finishdate1=finishdate;
this.finishtime= DateUtil.stringToTime(finishtime);
this.finishdate= DateUtil.stringToDate(finishdate);
this.location=location;
this.patrons=patrons;
this.clientcode=clientcode;
this.timeinsec= DateUtil.stringDatetoSeconds(startdate);


}

public int compareTo(Events other){
	
	int compareInt= this.getstartdate().compareTo(other.getstartdate());
	if (compareInt<0) return -1;
	if (compareInt>0) return 1;
	return compareInt;
}


public int getref(){
	return this.reference_number;
}
public String getclientcode (){
	return this.clientcode;
	
}
public String getname(){
	
	return this.name;
}
public String getdescription(){
	return this.description;
	
}
public String geteventype(){
	return this.type;
}

public Date getstartdate(){
	return this.startdate;
}

public Date getstarttime(){
	return this.starttime;
}

public Date getfinishdate(){
	return this.finishdate;
}
public Date getfinishtime(){
	return this.finishtime;
} 
public String getlocation(){
	return this.location;
}
public String getstartdate1(){return this.startdate1;}

public String getstarttime1(){return this.starttime1;}

public String getfinishtime1(){return this.finishtime1;}
public String getfinishdate1(){return this.finishdate1;}

public int getpatron(){
	return this.patrons;
}

int y,z,totalnum,num1;

// gets the totalnumber of staff fee base on the number of patrons 
public int getallmembers(){
	
	y=getnumberstaff1();
	
	z=patrons/100;
	if (z==0){
		return y;
	} else{
	
	num1=y*z;
	while (num1<80){
		try {
	if (num1>0 && num1<10){
		 totalnum=y*z;
		return totalnum;
	} else if (num1>=10 && num1<=19){
		totalnum=(y*z)+1;
		return totalnum;
	} else if (num1>=20 && num1<=29){
		totalnum=(y*z)+2;
		return totalnum;
	} else if (num1>=30 && num1<=39){
		totalnum=(y*z)+3;
		return totalnum;
	} else if (num1>=40 && z<=49){
		totalnum=(y*z)+4;
		return totalnum;
	}  else if (num1>=50 && num1<=59){
		 totalnum=(y*z)+5;
		return totalnum;
	} else if (num1>=60 && num1<=69){
		totalnum=(y*z)+6;
		return totalnum;
	}  else if (num1>=70 && num1<=79){
		totalnum=(y*z)+7 ;
		return totalnum;
	}
		} catch(NumberFormatException exception) {
			System.out.println("Max number patrons reach!!!!");
		}
	}
	return 0;
}
}

// calculates the hours difference between two date parameters
public int gethours(Date date1,Date date2){
	SimpleDateFormat format = new SimpleDateFormat(" HH:mm:ss");
	Date h1= null;
	Date h2= null;
	try{
		//h1= format.parse(date1);
		//h2=format.parse(date2);
		
		long hourdiff=date2.getTime()-date1.getTime();
		long hdiff= hourdiff/ (60*60*1000)%24;
		int hours= (int) hdiff;
		return hours;
	} catch(Exception e){
		e.printStackTrace();
	}
	return 0;
	
}

// gets the total charge for a event the client as selected based on the selected criteria
public double totalcharge(){
	double tottal= getbasefees() + ( getallmembers()* getstaffeecost() * gethourtobepaid());
	return tottal;
}

// gets the hours to be charged for 
public int gethourtobepaid(){
int cm= gethours(getstarttime(),getfinishtime());
return Math.abs(cm);
}

// get the base fee base on the event type entered
public double getbasefees(){

	if(geteventype().equalsIgnoreCase("P01")){
		
		return this.basefees=5000;
	
            }else if(geteventype().equalsIgnoreCase("P03")){
				
				 this.basefees=8000;
				
            }else if(geteventype().equalsIgnoreCase("P04")){
				
				 this.basefees=20000;
				 			
            } else if(geteventype().equalsIgnoreCase("W01")){
				
				 this.basefees=12000;
				 
            }else if(geteventype().equalsIgnoreCase("W02")){
				
			 this.basefees=24260;
			        
            }else if(geteventype().equalsIgnoreCase("C01")){
				
				 this.basefees=25000;
				 
            }else if(geteventype().equalsIgnoreCase("C02")){
				
				 this.basefees=	50000;
				        
            }  
	this.finalbasefee=staffperhundred1;
	return finalbasefee;
}


public int getnumberstaff1(){

	if(geteventype().equalsIgnoreCase("P01")){
		
		return this.staffperhundred1=2;
		
            }else if(geteventype().equalsIgnoreCase("P03")){
				
				 this.staffperhundred1=2;
				
            }else if(geteventype().equalsIgnoreCase("P04")){
				
				 this.staffperhundred1=2;
				           
            } else if(geteventype().equalsIgnoreCase("W01")){
				
				 this.staffperhundred1=4;
				 
            }else if(geteventype().equalsIgnoreCase("W02")){
				
			 this.staffperhundred1=5;
			             
            }else if(geteventype().equalsIgnoreCase("C01")){
				
				 this.staffperhundred1=3;
				 
            }else if(geteventype().equalsIgnoreCase("C02")){
				
				 this.staffperhundred1=3;
				       
            }  
	this.bas=staffperhundred1;
	return bas;
}


// this method gets the staff fee 
public double getstaffeecost(){

	if(geteventype().equalsIgnoreCase("P01")){
		
		return this.staffcost=1500;
		
            }else if(geteventype().equalsIgnoreCase("P03")){
				
				 this.staffcost=1500;
				
            }else if(geteventype().equalsIgnoreCase("P04")){
				
				 this.staffcost=1500;
				        
            } else if(geteventype().equalsIgnoreCase("W01")){
				
				 this.staffcost=2000;
				 
            }else if(geteventype().equalsIgnoreCase("W02")){
				
			 this.staffcost=2000;
			            
            }else if(geteventype().equalsIgnoreCase("C01")){
				
				 this.staffcost=2500;
				 
            }else if(geteventype().equalsIgnoreCase("C02")){
				
				 this.staffcost=2500;
				
            }  
	this.finalstaffcost=staffcost;
	return finalstaffcost;
}

// this function prints out events class in this format 
 public String toString(){
        String output = "*************************************************************************\n"+
                "*********************************************************************************\n" +
                "*********************************************************************\n"+
                "Event Name: " + getname() + "\n" +
                "descriptions: " + getdescription()+ "\n" +
                "Event Type:    " + geteventype()+ "\n" +
                
				"Start date and time: " + getstartdate()+ "\n" +
				"Start time: " + getstarttime()+ "\n" +
				"finish date and time:  " + getfinishdate()+  "\n" +
				" finish time: " + getfinishtime()+ "\n" +
				"location: " + getlocation()+ "\n" +
				"capacity: " + getpatron()+ "\n" +
				"hours : " + gethourtobepaid()+ "\n" +
				"reference_number: " + reference_number + "\n" +
				"client_code: " + getclientcode()+ "\n" +
				"Total COST: " +"$" + totalcharge()+ "\n" +
                "*********************************************************************\n";

        return output;
    }



}