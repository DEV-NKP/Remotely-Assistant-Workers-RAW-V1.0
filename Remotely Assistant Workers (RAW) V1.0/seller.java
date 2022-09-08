import java.io.File; 
import java.util.Scanner;
import java.util.Formatter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import raw.*;
import java.nio.file.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class seller extends design
{
	
//////////////////////////////////////////////////Seller Menu/////////////////////////////////////////////////////	
private static String zz,nn;

public void setmail(String ss)
	{
		this.zz=ss;
	}
public void setuname(String n)
	{
		this.nn=n;
	}

public void options()
{
	Scanner input= new Scanner(System.in);

	raw cm8=new raw();
	cm8.cls();	


			color("color 03");
			time();
        
	    System.out.println("\033[0;94m\n\n\n\t\t\t\t\t\t\t       =============================");
		System.out.println("\t\t\t\t\t\t\t       > WELCOME IN SELLER SECTION <");
		System.out.println("\t\t\t\t\t\t\t       =============================\n");
		
		

	    System.out.println("\t\t\t\t\t\t\t\tWhat do you want to do now?\n");


		System.out.println("\t\t\t\t\t\t  --------------------             " + " --------------------------"); 
	    System.out.println("\t\t\t\t\t\t  | [1] Show Profile |             " + " | [2] Search/Find a work |"); 
        System.out.println("\t\t\t\t\t\t  --------------------             " + " --------------------------\n"); 

		System.out.println("\t\t\t\t\t\t  ---------------------            " + " -------------------"); 
		System.out.println("\t\t\t\t\t\t  | [3] Enrolled work |            " + " | [4] Beated work |"); 		
		System.out.println("\t\t\t\t\t\t  ---------------------            " + " -------------------\n"); 

        System.out.println("\t\t\t\t\t\t  -------------------              " + " ------------------"); 
		System.out.println("\t\t\t\t\t\t  | [5] Submit task |              " + " | [6] Find buyer |"); 	
        System.out.println("\t\t\t\t\t\t  -------------------              " + " ------------------\n"); 

		System.out.println("\t\t\t\t\t\t  ---------------                  " + " ------------");
		System.out.println("\t\t\t\t\t\t  | [7] Log out |                  " + " | [8] EXIT |"); 
		System.out.println("\t\t\t\t\t\t  ---------------                  " + " ------------\n");


	
	int r=0;
	
	do{
	
	System.out.print("\n\t\t\t\t\t\t\tPlease choose your option: "); 
	r=nextInt();
	
	if(r>8)
		{
			System.out.println("\u001b[31;1m\n\t\t\t\t\t\t\tSorry you have entered a wrong number :)");
			System.out.println("\n\t\t\t\t\t\t\t     Please try again. Thank you. :)");
			String m = input.nextLine();
			String mb = input.nextLine();
   
   if (mb.trim().isEmpty())
{
	raw cs1=new raw();
	cs1.cls();
	options();
}  
     
   
		}
}
while(r>8);
	
raw cs2=new raw();
	
	switch(r)
		{
		case 1: 
		cs2.cls();
		profiles();
		break;
			
		case 2: 
		cs2.cls();
		findjob();
		break;
			
		case 3: 
		cs2.cls();
		enrol();
		break;
			
		case 4: 
		cs2.cls();
		beat();
		break;	
		
		case 5: 
		cs2.cls();
		submit();
		break;

		case 6: 
		cs2.cls();
		findb();
		break;			
			
		case 7: 
		cs2.cls();
		log1();
        loadr(100);
		cs2.cls();
		start s2 = new start();
		s2.loginm();	
		break;
			
		case 8: 
		cs2.cls();
		log();
		loadr(100);
		exit();
		break;
			
		default:
		sounddef();
		System.out.println("\n\t\t\t\t\t\t\tSorry you have entered a wrong input... ;)");
		break;
				
		}
		
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



//////////////////////////////////////////////1. For showing the Seller profile//////////////////////////////////////////

public void profiles()
{
	
	raw cm9=new raw();
	cm9.cls();	

	

    String mail, uname, name, pass, dob, passport, id, phn, nation, skill;
	double rat;
	int pub;

	File f1= new File("seller");
if(f1.exists())
	{
		
	}
	else
	{
		f1.mkdir();
	}
String p= f1.getAbsolutePath();
				
		
try
{
	File file2 =new File(p+"/register.rw");
	
if (file2.length() == 0) 
{
}	
else{	
	
	Scanner read2= new Scanner(file2);
	
	color ("color 03");
	time();
   System.out.println("\u001b[34;1m\n\n\t\t\t\t\t\t             ==================================");
    System.out.println("\t\t\t\t\t\t             *****  Profile Informations  *****");
    System.out.println("\t\t\t\t\t\t             ==================================");	 


	while(read2.hasNext())
	{
		uname=read2.next();
		mail=read2.next();
		pass=read2.next(); 
		name=read2.next();
		dob=read2.next();
		id=read2.next(); 
		nation=read2.next();
		passport=read2.next(); 
		phn=read2.next();
		skill=read2.next();
rat=read2.nextDouble();
pub=read2.nextInt();
if(mail.equals(this.zz))
{
	


uname=uname.replace('~',' ');
System.out.print("\n\n\t\t\t\t  [1] Your User name is          : "+uname +"\n");

mail=mail.replace('~',' ');
System.out.print("\t\t\t\t  [2] Your mail address is       : "+mail+ "\n");

pass=pass.replace('~',' ');
System.out.print("\t\t\t\t  [3] Your mail address is       : "+pass+ "\n");


name=name.replace('~',' ');
System.out.print("\t\t\t\t  [4] Your Full Name is          : " +name+ "\n");

dob=dob.replace('~',' ');
System.out.print("\t\t\t\t  [5] Your Date of birth is      : "+dob+ " \n");

id=id.replace('~',' ');
System.out.print("\t\t\t\t  [6] Your national id no is     : "+id +" \n");

nation=nation.replace('~',' ');
System.out.print("\t\t\t\t  [7] Your nationality is        : "+nation +" \n");

passport=passport.replace('~',' ');
System.out.print("\t\t\t\t  [8] Your Passport No is        : "+passport + "\n");

phn=phn.replace('~',' ');
System.out.print("\u001b[34;1m\t\t\t\t  [9] Your contact no is         : "+phn +"\n");

skill=skill.replace('~',' ');
System.out.print("\t\t\t\t  [10] Your chosen skills        : "+skill+ "\n");

System.out.print("\t\t\t\t  [11] Your rating is            : "+rat +" ("+pub + ")"+"\n");	

}
	}
	read2.close();
}
}
catch(Exception e)
{
	System.out.print(e);
	
}
System.out.print("\u001b[33;1m\n\t\t\t\t\t\t\t    Do you want to see your account section?(y/any key): ");
Scanner input= new Scanner(System.in); 
String n1 = input.nextLine();
if (n1.trim().isEmpty())
{
	raw cs1=new raw();
	cs1.cls();
	options();
}
if(n1.equals("y")|| n1.equals("Y"))
{
account();
	
}
else
{
	
}
System.out.print("\n\t\t\t\t\t\t\t Press enter to go to the Seller menu...");


String n = input.nextLine();

if (n.trim().isEmpty())
{
	raw cs3=new raw();
	cs3.cls();
	options();
}


}

/////////////////////////////////////////////////////////Account handling////////////////////////////////////////////////////

public void account()
{

	raw ca=new raw();
	ca.cls();	



	String unames, unameb;
double ammount,rammount,tota=0;			
	File f11= new File("seller");
if(f11.exists())
	{
		
	}
	else
	{
		f11.mkdir();
	}
String p1= f11.getAbsolutePath();
				
		
try
{
	File file12 =new File(p1+"/account.rw");
if (file12.length() == 0) 
	
{
	
	sounddef();
	System.out.print("\u001b[31;1m\n\n\n\t\t\t\t\t\t  Sorry. There are no ammount that transfered in your account.\n");		

}	
else{
	Scanner read12= new Scanner(file12);
	
  System.out.println("\033[0;36m\n\t\t\t\t\t\t\t=====================================");
    System.out.println("\t\t\t\t\t\t\t***** Your Account Informations *****");
    System.out.println("\t\t\t\t\t\t\t=====================================");
ArrayList <Double> total= new ArrayList<Double>();


while(read12.hasNext())
{
unames=read12.next();
unameb=read12.next();
ammount=read12.nextDouble();
rammount=read12.nextDouble();
if(unames.equals(this.nn))
{
unames=unames.replace('~',' ');
unameb=unameb.replace('~',' ');
System.out.print("\t\t\t\t\t\t[1] Your User name is          : "+unames +"\n");
System.out.print("\t\t\t\t\t\t[2] Buyer Name                 : "+unameb +"\n");
System.out.print("\t\t\t\t\t\t[3] Ammount Send by Buyer      : "+ammount +"\n");
System.out.print("\t\t\t\t\t\t[4] Ammount Received           : "+rammount +"\n");
total.add(rammount);
System.out.print("\t\t\t\t\t----------------------------------------------\n");

}
else{
	sounddef();
System.out.print("\u001b[31;1m\t\t\t\t\t\t  Sorry. There are no ammount that transfered in your account.\n");		
	
}
	}
	read12.close();
	
		
 for (int i = 0; i < total.size(); i++)
	 {
		tota=tota+total.get(i);
	 }
	 
System.out.print("\u001b[32;1m\t\t\t\t\t\tTotal Ammount Recieved: "+tota);
	
}
}
catch(Exception e)
{
	System.out.print(e);
	
}
System.out.print("\n\t\t\t\t\t\t                Press enter to go to the previous page...");
Scanner input= new Scanner(System.in); 

String n = input.nextLine();

if (n.trim().isEmpty())
{
	raw cs3=new raw();
	cs3.cls();
	profiles();
}	
}
///////////////////////////////////////////////2. Find a project////////////////////////////////////////////////////////

public void findjob()
{

	raw ca1=new raw();
	ca1.cls();	

		
   	String name, job, skills, details, uname, status;
		double price;
		
Scanner input= new Scanner(System.in); 	


System.out.println("\u001b[33;1m\n\n\n\t\t\t\t\t\t---------------------------------------------");
                  System.out.println("\t\t\t\t\t\t|  Please enter the valid information here  |");
                  System.out.println("\t\t\t\t\t\t---------------------------------------------");


System.out.print("\n\n\t\t\t\tWhat types of job you want(search by base of work): ");
String jobf = input.nextLine();

if (jobf.trim().isEmpty())
{
	raw cs3=new raw();
	cs3.cls();
	options();
}

File f= new File("job");
if(f.exists())
	{
		
	}
	else
	{
		f.mkdir();
	}
	
String p= f.getAbsolutePath();

try
{
	File file1 =new File(p+"/job.rw");
	
	
	
	if (file1.length() == 0) 
{
}	
else{

	Scanner read1= new Scanner(file1);
    System.out.println("\u001b[36;1m\n\t\t\t\t\t\t=======================================");
    System.out.println("\t\t\t\t\t\t***** HERE ARE SOME JOBS WE FOUND *****");
    System.out.println("\t\t\t\t\t\t=======================================\n");		

	while(read1.hasNext())
	{
uname=read1.next();		
job=read1.next();
name=read1.next();
skills=read1.next();
details=read1.next();
status=read1.next();
price=read1.nextDouble();
job=job.replace('~',' ');

if(job.equals(jobf))
{
uname=uname.replace('~',' ');

name=name.replace('~',' ');
skills=skills.replace('~',' ');
String n1= this.nn;
n1=n1.replace('~',' ');
details=details.replace('~',' ');
details=details.replace('`','\n');





System.out.print("\u001b[36;1m\n[1] Project name             : "+name+"\n");

  System.out.print("[2] Project Details          : "+details+"\n");

System.out.print("[3] Price of the project($)  : "+price+"\n");

System.out.print("[4] Buyer's user name        : "+uname+"\n");

System.out.print("[5] Skills of the seller     : "+skills+"\n");

System.out.print("[6] Job's Status  : "+status+"\n");

System.out.print("-------------------------------------------------\n\n");

System.out.print("\u001b[32;1m\n\n\t\t\t\t\t\tDo you want to do this job? (y/n): \u001b[36;1m");
String cho = input.nextLine();

if(status.equals("Active"))
{
if(cho.equals("y")||cho.equals("Y"))
{
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	try{
	File file2 =new File(p+"/requested.rw");
	if (file2.length() == 0) 
{
}	
else{
	Scanner read2= new Scanner(file2);
	String unames, unameb, job1, name1, skills1, details1;
	double price1;
	while(read2.hasNext())
	{
unames=read2.next();		
unameb=read2.next();		
job1=read2.next();
name1=read2.next();
skills1=read2.next();
details1=read2.next();
price1=read2.nextDouble();

n1=n1.replace('~',' ');
unames=unames.replace('~',' ');
unameb=unameb.replace('~',' ');
job1=job1.replace('~',' ');
name1=name1.replace('~',' ');
skills1=skills1.replace('~',' ');
details1=details1.replace('~',' ');
details1=details1.replace('`','\n');
if(n1.equals(unames) && details1.equals(details))
{
	sounddef();
System.out.print("\u001b[31;1m\n\n\t\t\t\t\t\t  You have already requested for this job.\n\n");
  System.out.print("\t\t\t\t\t\t      Please press enter to go again.\n\n");
String ch = input.nextLine();
	
	
if (ch.trim().isEmpty())
{
	findjob();
}
}

	}
read2.close();
	}
}
catch(Exception e)
{
	System.out.print(e);
	
}

	
	
	System.out.print("\n\n\t\t\t\t\tThanks for requesting for this job. Your request has sent to the project owner...\n\n");
	File f2= new File("job");
if(f2.exists())
	{
		
	}
	else
	{
		f2.mkdir();
	}
String p2= f2.getAbsolutePath();

try
{
FileWriter j2 = new FileWriter(p2+"/requested.rw", true);
Formatter job2 = new Formatter(j2);
		
		n1=n1.replace(' ','~');
		uname=uname.replace(' ','~');
        job=job.replace(' ','~');
		name=name.replace(' ','~');
		skills=skills.replace(' ','~');
		details=details.replace('\n','`');
		details=details.replace(' ','~');

job2.format("%s %s %s %s %s %s %f\r\n",n1, uname,job, name,skills,details,price);

	job2.close();
	}
	catch(Exception e)
{
	System.out.print(e);
}


	
	
}
}
	
else
{
	System.out.print("\n\t\t\t\t\t\t-------------------------------------------------\n\n");
sounddef();
	System.out.print("\u001b[31;1m\n\t\t\t\t\t\tSorry this job is not available for now.\n");
	System.out.print("\n\t\t\t\t\t\t    Please press enter to continue.\n");
String ch = input.nextLine();
	
	
if (ch.trim().isEmpty())
{
	
}

}


System.out.print("\n\t\t\t\t\t\t---------------------------------------------------\n\n");

}

	}
	read1.close();
}
	}
	catch(Exception e)
{
	System.out.print(e);
	
}
  
System.out.print("\u001b[31;1m\n\t\t\t\t\t\tNo more jobs are available now on this base topic...");
System.out.print("\n\t\t\t\t\t\t  Please press enter to go to the previous menu...\n");

String q = input.nextLine();

if (q.trim().isEmpty())
{
	raw cs3=new raw();
	cs3.cls();
	options();
}
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////3. Enrolled Projects////////////////////////////////////////////////////
public void enrol()
{
	

	raw ca2=new raw();
	ca2.cls();	
	
	color ("color 03");
	time();

System.out.println("\u001b[33;1m\n\n\n\t\t\t\t\t\t             ==================================");
    System.out.println("\t\t\t\t\t\t             ***** Your Enrolled projects *****");
    System.out.println("\t\t\t\t\t\t             ==================================");


Scanner input= new Scanner(System.in); 

File s1= new File("job");
if(s1.exists())
	{
		
	}
	else
	{
		s1.mkdir();
	}
	String p4 = s1.getAbsolutePath();


try{
	File file3 =new File(p4+"/acceptedjob.rw");

if (file3.length() == 0) 
{	
}	
else{
	Scanner read4= new Scanner(file3);
	String s, unameb,job1, name1,skills1,details1;

double price1;

	while(read4.hasNext())
	{

s=read4.next();		
unameb=read4.next();		
job1=read4.next();
name1=read4.next();
skills1=read4.next();
details1=read4.next();
price1=read4.nextDouble();


if (s.equals(this.nn))
{
	s=s.replace('~',' ');
unameb=unameb.replace('~',' ');
job1=job1.replace('~',' ');
name1=name1.replace('~',' ');
skills1=skills1.replace('~',' ');
details1=details1.replace('~',' ');
details1=details1.replace('`','\n');
	
System.out.println("\n\n [1] Project topic       : "+job1);

System.out.println(" [2] Project name        : "+name1);

System.out.println(" [3] Project Details     : "+details1);

System.out.println(" [4] Project Price($)    : "+price1);

System.out.println(" [5] Project Skills      : "+skills1);

System.out.println(" [6] Buyer Name          : "+unameb);

System.out.println("-----------------------------------------------------------------\n\n");


}
	}
read4.close();
}
	
	}
	catch(Exception e)
{
	System.out.print(e);
	
}	
System.out.println("\u001b[31;1m\n\n\t\t\t\t\t\t             Can't find any more enrolled works yet...");

              System.out.println("\n\n\t\t\t\t\t             Please press enter to go previous menu...\n");	
String q = input.nextLine();
if (q.trim().isEmpty())
{
	raw cs3=new raw();
	cs3.cls();
	options();
}
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////4. Beated Jobs///////////////////////////////////////////////////////
public void beat()
{
	
	raw ca3=new raw();
	ca3.cls();	
	
String name, job, skills, details, uname, n1;
		double price;
File fs= new File("job");
if(fs.exists())
	{
		
	}
	else
	{
		fs.mkdir();
	}
	
String p2= fs.getAbsolutePath();

try
{
	File file1 =new File(p2+"/requested.rw");
	
	
	if (file1.length() == 0) 
{
}	
else{
	
	Scanner reads1= new Scanner(file1);
		
		
	color ("color 03");
	time();		
	
  System.out.println("\u001b[33;1m\n\t\t\t\t\t\t\t=========================================");
    System.out.println("\t\t\t\t\t\t\t***** Your previous beated projects *****");
    System.out.println("\t\t\t\t\t\t\t=========================================\n");
		
		
		
		

	while(reads1.hasNext())
	{
		
		
n1=reads1.next();		
uname=reads1.next();		
job=reads1.next();
name=reads1.next();
skills=reads1.next();
details=reads1.next();
price=reads1.nextDouble();
String ns1=this.nn;

if(n1.equals(ns1))
{
n1=n1.replace('~',' ');
uname=uname.replace('~',' ');
job=job.replace('~',' ');
name=name.replace('~',' ');
skills=skills.replace('~',' ');
details=details.replace('~',' ');
details=details.replace('`','\n');


System.out.print("\u001b[33;1m\n\n\t\t\t\t\t[1] Buyer Name       : "+uname+"\n");
System.out.print("\t\t\t\t\t[2] Job              : "+job+"\n");
System.out.print("\t\t\t\t\t[3] Project name     : "+name+"\n");
System.out.print("\t\t\t\t\t[4] Skills           : "+skills+"\n");
System.out.print("\t\t\t\t\t[5] Project Details  : "+details+"\n");
System.out.print("\t\t\t\t\t[6] Price($)         : "+price+"\n");

System.out.print("\u001b[31;1m\t\t\t\t------------------------------------------------------\n\n");

}

	}
	reads1.close();
}
	}
	catch(Exception e)
{
	System.out.print(e);
	
}

sounddef();
System.out.print("\u001b[31;1m\n\n\t\t\t\t\t\t\t Sorry! You haven't beated any more works yet...\n\n");
    System.out.print("\t\t\t\t\t\t\t    Please press enter to go previous menu...\n");
Scanner input= new Scanner(System.in); 
String q = input.nextLine();

if (q.trim().isEmpty())
{
	raw cs2=new raw();
	cs2.cls();
	options();
}

	
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////5. Submit task///////////////////////////////////////////////////////
public void submit()
{

	raw ca4=new raw();
	ca4.cls();	

	
	
	
	Scanner input= new Scanner(System.in); 
	String bname,slink,btopic,namex;
	double jprice,rat;
	int count=0;
	
	
	color ("color 03");
	time();
	
	System.out.println("\u001b[36;1m\n\n\t\t\t\t\t\t\t            -------------------");
	System.out.println("\t\t\t\t\t\t\t             ** Submit Form **");
	System.out.println("\t\t\t\t\t\t\t            -------------------\n\n\n");
	

	
	
	System.out.print("\t\t\t\t\t 1. Enter buyer name                           : ");
bname=input.nextLine();
if (bname.trim().isEmpty())
{
	raw cl=new raw();
	cl.cls();
	options();
}
	bname=bname.replace(' ','~');


	System.out.print("\t\t\t\t\t 2. Enter the base topic of the job            : ");
btopic=input.nextLine();
if (btopic.trim().isEmpty())
{
	raw cl=new raw();
	cl.cls();
	options();
}
btopic=btopic.replace(' ','~');


	System.out.print("\t\t\t\t\t 3. Submit link                                : ");
slink=input.nextLine(); 
if (slink.trim().isEmpty())
{
	raw cl=new raw();
	cl.cls();
	options();
}
slink=slink.replace(' ','~');

    System.out.print("\t\t\t\t\t 4. Project Name                               : ");
namex=input.nextLine(); 
if (namex.trim().isEmpty())
{
	raw cl=new raw();
	cl.cls();
	options();
}
namex=namex.replace(' ','~');

	System.out.print("\t\t\t\t\t 5. Enter the price of the job($)              : ");
jprice=nextDouble();


File s1= new File("job");
if(s1.exists())
	{
		
	}
	else
	{
		s1.mkdir();
	}
	String p4 = s1.getAbsolutePath();


try{
	File file3 =new File(p4+"/acceptedjob.rw");

if (file3.length() == 0) 
{
}	
else{
	Scanner read4= new Scanner(file3);
	String s, unameb,job1, name1,skills1,details1;

double price1;

	while(read4.hasNext())
	{

s=read4.next();		
unameb=read4.next();		
job1=read4.next();
name1=read4.next();
skills1=read4.next();
details1=read4.next();
price1=read4.nextDouble();



 
if (s.equals(this.nn) && bname.equals(unameb) && btopic.equals(job1) && jprice==price1&& namex.equals(name1) )
{
	count=1;

do{
    System.out.print("\t\t\t\t\t 6. Enter Buyer Rating                         : ");
rat=nextDouble();		
if(rat>5)
{
sounddef();
System.out.println("\u001b[31;1m\n\t\t\t\t\t\t   You need to enter buyer rating out of 5");

		}
}while(rat>5);

 String mail,uname,name,pass, dob, passport, id, phn,nation;
	   double rat1;
	   int pub;

	   double ratb;
	   int pubb;	   
	   
	   
File f= new File("buyer");
if(f.exists())
	{
		
	}
	else
	{
		f.mkdir();
	}
String p= f.getAbsolutePath();
				
		
try
{
	File file1 =new File(p+"/register.rw");
	
	
	if (file1.length() == 0) 
{
}	
else{
	Scanner read1= new Scanner(file1);
   

	while(read1.hasNext())
	{
uname=read1.next();
mail=read1.next();
pass=read1.next(); 
name=read1.next();
dob=read1.next();
id=read1.next(); 
nation=read1.next();
passport=read1.next(); 
phn=read1.next();
rat1=read1.nextDouble();
pub=read1.nextInt();
if(uname.equals(bname))
{
	pubb=(pub+1);
	ratb=((rat1+rat)/pubb);
		
try
{
FileWriter s21 = new FileWriter(p+"/tempreg.rw", true);
Formatter form21 = new Formatter(s21);
form21.format("%s %s %s %s %s %s %s %s %s %f %d\r\n",uname, mail, pass, name, dob, id, nation, passport, phn, ratb, pubb );

	

	form21.close();
	
}catch(Exception e)
{
	System.out.print(e);
	
}
	
}
else{
	
try
{
FileWriter s2 = new FileWriter(p+"/tempreg.rw", true);
Formatter form2 = new Formatter(s2);
form2.format("%s %s %s %s %s %s %s %s %s %f %d\r\n",uname, mail, pass, name, dob, id, nation, passport, phn, rat1, pub );

	

	form2.close();
	
}catch(Exception e)
{
	System.out.print(e);
	
}
	
}

	}
	read1.close();
}
	}
	catch(Exception e)
{
	System.out.print(e);
	
}

	
try
{
FileWriter s2 = new FileWriter(p+"/register.rw", false);
Formatter form2 = new Formatter(s2);

	form2.close();
	
}catch(Exception e)
{
	System.out.print(e);
	
}

try
{
	File file1 =new File(p+"/tempreg.rw");
	
	if (file1.length() == 0) 
{
}	
else{
	Scanner read1= new Scanner(file1);
   

	while(read1.hasNext())
	{
uname=read1.next();
mail=read1.next();
pass=read1.next(); 
name=read1.next();
dob=read1.next();
id=read1.next(); 
nation=read1.next();
passport=read1.next(); 
phn=read1.next();
rat1=read1.nextDouble();
pub=read1.nextInt();
	
try
{
FileWriter s2 = new FileWriter(p+"/register.rw", true);
Formatter form2 = new Formatter(s2);
form2.format("%s %s %s %s %s %s %s %s %s %f %d\r\n",uname, mail, pass, name, dob, id, nation, passport, phn, rat1, pub );

	

	form2.close();
	
}catch(Exception e)
{
	System.out.print(e);
	
}
	


	}
	read1.close();
}
	}
	catch(Exception e)
{
	System.out.print(e);
	
}

	
try
{
FileWriter s2 = new FileWriter(p+"/tempreg.rw", false);
Formatter form2 = new Formatter(s2);

	form2.close();
	
}catch(Exception e)
{
	System.out.print(e);
	
}
	

try
{
FileWriter j2 = new FileWriter(s1+"/submittedjob.rw", true);
Formatter job2 = new Formatter(j2);


job2.format("%s %s %s %s %s %f\r\n",this.nn, bname,namex,btopic,slink,jprice);

	job2.close();
	}catch(Exception e)
{
	System.out.print(e);
}




}


if (s.equals(this.nn) && bname.equals(unameb) && btopic.equals(job1) && jprice==price1&& namex.equals(name1))
{
}
else
{		
try
{
FileWriter j3 = new FileWriter(s1+"/tempacc.rw", true);
Formatter job3 = new Formatter(j3);

s=s.replace(' ','~');
unameb=unameb.replace(' ','~');
job1=job1.replace(' ','~');
name1=name1.replace(' ','~');
skills1=skills1.replace(' ','~');
details1=details1.replace(' ','~');
details1=details1.replace('\n','`');



job3.format("%s %s %s %s %s %s %f\r\n",s, unameb,job1, name1,skills1,details1,price1);


	job3.close();
	}catch(Exception e)
{
	System.out.print(e);
}	
		
}

	}	
try
{
FileWriter j2a = new FileWriter(p4+"/acceptedjob.rw", false);
Formatter job2a = new Formatter(j2a);
	job2a.close();
	}catch(Exception e)
{
	System.out.print(e);
}
	
try{
	File filea =new File(p4+"/tempacc.rw");

if (filea.length() == 0) 
{
}	
else{
	

	
	
	Scanner reada= new Scanner(filea);
	String sa, unameba,job1a, name1a,skills1a,details1a;

double price1a;

	while(reada.hasNext())
	{

sa=reada.next();		
unameba=reada.next();		
job1a=reada.next();
name1a=reada.next();
skills1a=reada.next();
details1a=reada.next();
price1a=reada.nextDouble();

try
{
FileWriter j2a = new FileWriter(p4+"/acceptedjob.rw", true);
Formatter job2a = new Formatter(j2a);

job2a.format("%s %s %s %s %s %s %f\r\n",sa, unameba,job1a, name1a,skills1a,details1a,price1a);

	job2a.close();
	}catch(Exception e)
{
	System.out.print(e);
}


	}
reada.close();	
}

	}catch(Exception e)
{
	System.out.print(e);
	
}
try
{
FileWriter j2b = new FileWriter(p4+"/tempacc.rw", false);
Formatter job2b = new Formatter(j2b);
	job2b.close();
	}catch(Exception e)
{
	System.out.print(e);
}


	

read4.close();

}


	}
	catch(Exception e)
{
	System.out.print(e);
	
}

if (count== 0)
{
	sounddef();
	System.out.print("\u001b[31;1m\n\n\n\t\t\t\t\t Sorry cann't found this job. Try again...");
}
System.out.print("\n\n\n\t\t\t\t\t   Please press enter to continue...");

String n11b=input.nextLine();
if (n11b.trim().isEmpty())
{
	raw cb12=new raw();
	cb12.cls();
	options();
}
	
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////6. Find buyer///////////////////////////////////////////////////////
public void findb()
{
	

	raw ca5=new raw();
	ca5.cls();	

	
	
	Scanner input= new Scanner(System.in); 
	
	String nb;
	 String mail,uname,name,pass, dob, passport, id, phn,nation,skill;
	 double rat;
	int pub;
			
File fb= new File("buyer");
if(fb.exists())
	{
		
	}
	else
	{
		fb.mkdir();
	}
String pfb= fb.getAbsolutePath();

	color ("color 03");
	time();

System.out.println("\033[1;33m\n\n\n\t\t\t\t\t\t----------------------------------------");
System.out.println("\t\t\t\t\t\t  Please provide the information below  ");
System.out.println("\t\t\t\t\t\t----------------------------------------\n");
System.out.print("\n\t\t\t\t\t[1]Enter Buyer User Name      : ");
nb=input.nextLine();
if (nb.trim().isEmpty())
{
	raw cb2=new raw();
	cb2.cls();
	options();
}
		
try
{
	File file1 =new File(pfb+"/register.rw");
	
	if (file1.length() == 0) 
{
}	
else{
	Scanner read1= new Scanner(file1);
	
  System.out.println("\u001b[31;1m\n\n\n\t\t\t\t\t\t\t============================");
    System.out.println("\t\t\t\t\t\t\t*****Buyer Informations*****");
    System.out.println("\t\t\t\t\t\t\t============================");

	while(read1.hasNext())
	{
		uname=read1.next();
		mail=read1.next();
		pass=read1.next(); 
		name=read1.next();
		dob=read1.next();
		id=read1.next(); 
		nation=read1.next();
		passport=read1.next(); 
		phn=read1.next();
		rat=read1.nextDouble();
		pub=read1.nextInt();
uname=uname.replace('~',' ');

if(uname.equals(nb))
{
uname=uname.replace('~',' ');
System.out.print("\n\t\t\t\t\t[1] Buyer User name is        : "+uname +"\n");

mail=mail.replace('~',' ');
System.out.print("\t\t\t\t\t[2] Buyer mail address is     : "+mail+ "\n");

pass=pass.replace('~',' ');
System.out.print("\t\t\t\t\t[3] Buyer mail address is     : "+pass+ "\n");


name=name.replace('~',' ');
System.out.print("\t\t\t\t\t[4] Buyer Full Name is        : " +name+ "\n");

dob=dob.replace('~',' ');
System.out.print("\t\t\t\t\t[5] Buyer Date of birth is    : "+dob+ " \n");

id=id.replace('~',' ');
System.out.print("\t\t\t\t\t[6] Buyer national id no is   : "+id +" \n");

nation=nation.replace('~',' ');
System.out.print("\t\t\t\t\t[7] Buyer nationality is      : "+nation +" \n");

passport=passport.replace('~',' ');
System.out.print("\t\t\t\t\t[8] Buyer Passport No is      : "+passport + "\n");

phn=phn.replace('~',' ');
System.out.print("\t\t\t\t\t[9] Buyer contact no is       : "+phn +"\n");

System.out.print("\t\t\t\t\t[10] Buyer rating is          : "+rat +" ("+pub + ")"+"\n");
	
System.out.print("\u001b[33;1m\n\n\t\t\t\t\t\tPlease press enter to go previous menu...\n");
String n = input.nextLine();

if (n.trim().isEmpty())
{
	raw cb2=new raw();
	cb2.cls();
	options();
}
}
	}
	read1.close();
}
	}
	catch(Exception e)
{
	System.out.print(e);
	
}


sounddef();	
System.out.print("\u001b[31;1m\n\n\t\t\t\t               We cann't find any buyer with this name.\n");
            System.out.print("\n\n\t\t\t\t               Please press enter to go previous menu...\n");



String n = input.nextLine();

if (n.trim().isEmpty())
{
	raw cb2=new raw();
	cb2.cls();
	options();
}

}

}
		
		
		
		
		
		
	
	
	
	
