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

public class buyer extends design
{
	
//////////////////////////////////////////////////Buyer Menu/////////////////////////////////////////////////////	
	private static String z,nn;
	
	public void setmail(String b)
	{
		this.z=b;
	}
	
	public void setuname(String n)
	{
		this.nn=n;
	}
	
public void optionb()
{
		raw cmb=new raw();
	cmb.cls();
	
			color ("color 03");
	time();
	
	    System.out.println("\033[0;94m\n\n\t\t\t\t\t\t\t       ============================");
		System.out.println("\t\t\t\t\t\t\t       > WELCOME IN BUYER SECTION <");
		System.out.println("\t\t\t\t\t\t\t       ============================");	
		
		Scanner input= new Scanner(System.in);
	 System.out.println("\n\n\t\t\t\t\t\t                What do you want to do now?\n"); 
		
		System.out.println("\t\t\t\t\t       --------------------                 ----------------------------");
		System.out.println("\t\t\t\t\t       | [1] Show profile |                 " + "| [2] Search/Find a seller |"); 	
		System.out.println("\t\t\t\t\t       --------------------                 ----------------------------\n");
		
		
		System.out.println("\t\t\t\t\t       ------------------                   ------------------------");	
		System.out.println("\t\t\t\t\t       | [3] Post a job |                   " + "| [4] Your posted jobs |");
		System.out.println("\t\t\t\t\t       ------------------                   ------------------------\n");	


        System.out.println("\t\t\t\t\t       ---------------------                --------------------");
        System.out.println("\t\t\t\t\t       | [5] Requested Jobs|                " + "| [6] Accept works |");
		System.out.println("\t\t\t\t\t       ---------------------                --------------------\n");
		
			
		System.out.println("\t\t\t\t\t       --------------------                 -----------------------");
		System.out.println("\t\t\t\t\t       | [7] Project show |                 " + "| [8] Assigned Seller |");
	    System.out.println("\t\t\t\t\t       --------------------                 -----------------------\n");
		
		
		System.out.println("\t\t\t\t\t       ---------------                      -------------");
		System.out.println("\t\t\t\t\t       | [9] Log out |                      " + "| [10] EXIT |"); 
		System.out.println("\t\t\t\t\t       ---------------                      -------------\n");
		
		
	int r=0;
	
	do{
	
	System.out.print("\n\n\n\t\t\t\t\tPlease choose your option: "); 
	r=nextInt();
	if(r>10)
		{
			sounddef();
		
			System.out.println("\u001b[31;1m\n\t\t\t\t\t\tSorry you have entered a wrong number :)");
			System.out.println("\n\t\t\t\t\t\t\tPlease try again. Thank you. :)");
			String m = input.nextLine();
			String mb = input.nextLine();
   

if (mb.trim().isEmpty())
{
	raw cb=new raw();
	cb.cls();
	optionb();
}
		}
}while(r>10);
	

	raw cb1=new raw();
	switch(r)
		{
		case 1: 		
	    cb1.cls();
		profileb();
		break;
			
		case 2: 		
	    cb1.cls();
	    finds();
		break;
			
		case 3: 		
	    cb1.cls();
		post();
		break;
			
		case 4: 		
	    cb1.cls();
		posted();
		break;	
			
		case 5: 		
	    cb1.cls();
		acjob();
		break;	
		
		case 6: 		
	    cb1.cls();
		works();
		break;
		
		case 7: 
	    cb1.cls();
		newjob();
		break;		
		
		case 8: 		
	    cb1.cls();
		assigned();	
		break;
		
		case 9: 		
		cb1.cls();
		log1();
		loadr(100);
		start s2 = new start();
		cb1.cls();
		s2.loginm();	
		break;
		
		case 10: 
		cb1.cls();
		log();
		loadr(100);
		exit();
		break;
			
		default:
		sounddef();
		System.out.println("\u001b[31;1m\n\t\t\t\t\t\tSorry you have entered a wrong input... ;)");
		break;
				
		}

}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void assigned()
{
	
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
	
		color ("color 03");
	time();
	
	  System.out.println("\u001b[36;1m\n\t\t\t\t\t\t               ==============================");
    System.out.println("\t\t\t\t\t\t               *****  Assigned Sellers  *****");
    System.out.println("\t\t\t\t\t\t               ==============================");	

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


 
if (unameb.equals(this.nn))
{
	s=s.replace('~',' ');
unameb=unameb.replace('~',' ');
job1=job1.replace('~',' ');
name1=name1.replace('~',' ');
skills1=skills1.replace('~',' ');
details1=details1.replace('~',' ');
details1=details1.replace('`','\n');
	
System.out.println("\u001b[36;1m\n\n\t\t\t\t\t  [1] Project topic       : "+job1);

    System.out.println("\t\t\t\t\t  [2] Project name        : "+name1);

    System.out.println("\t\t\t\t\t  [3] Project Details     : "+details1);

    System.out.println("\t\t\t\t\t  [4] Project Price($)    : "+price1);

    System.out.println("\t\t\t\t\t  [5] Project Skills      : "+skills1);

    System.out.println("\t\t\t\t\t  [6] Seller Name         : "+s);

    System.out.println("\n\n\t\t\t------------------------------------------------------------\n\n");


}
	}
read4.close();
}
	
	}
	catch(Exception e)
{
	System.out.print(e);
	
}	

System.out.print("\u001b[31;1m\n\n\t\t\t\t\tNo more assigned job found here.. Please press enter to go previous menu...\n");	
	Scanner input= new Scanner(System.in); 
String m1 = input.nextLine();

if (m1.trim().isEmpty())
{
	raw cb21=new raw();
	cb21.cls();
	optionb();
}

} 


//////////////////////////////////////////////1. For showing the Buyer profile//////////////////////////////////////////

public void profileb()
{
			raw cmb2=new raw();
	cmb2.cls();
	

       String mail,uname,name,pass, dob, passport, id, phn,nation;
	   double rat;
	   int pub;
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
	
	 color ("color 03");
	time();
   
  System.out.println("\u001b[34;1m\n\t\t\t\t\t\t             ==================================");
    System.out.println("\t\t\t\t\t\t             *****  Profile Informations  *****");
    System.out.println("\t\t\t\t\t\t             ==================================");		

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
if(mail.equals(this.z))
{
	
	if(id.equals("no")|| id.equals("NO")|| id.equals("No")|| id.equals("nO"))
	{
		id= "\u001b[31;1mSorry you havn't entered any National Id Number...";
	}
	
	if(passport.equals("no")|| passport.equals("NO")|| passport.equals("No")|| passport.equals("nO"))
	{
		passport= "\u001b[31;1mSorry you havn't entered any Passport Number...";
	}


uname=uname.replace('~',' ');
System.out.print("\n\t\t\t\t     [1] Your User name is       : "+uname +"\n");

mail=mail.replace('~',' ');
System.out.print("\t\t\t\t     [2] Your mail address is    : "+mail+ "\n");

pass=pass.replace('~',' ');
System.out.print("\t\t\t\t     [3] Your given password is  : "+pass+ "\n");


name=name.replace('~',' ');
System.out.print("\t\t\t\t     [4] Your Full Name is       : " +name+ "\n");

dob=dob.replace('~',' ');
System.out.print("\t\t\t\t     [5] Your Date of birth is   : "+dob+ " \n");

id=id.replace('~',' ');
System.out.print("\t\t\t\t     [6] Your national id no is  : "+id +" \n");

nation=nation.replace('~',' ');
System.out.print("\u001b[34;1m\t\t\t\t     [7] Your nationality is     : "+nation +" \n");

passport=passport.replace('~',' ');
System.out.print("\t\t\t\t    [or] Your Passport No is     : "+passport + "\n");

phn=phn.replace('~',' ');
System.out.print("\u001b[34;1m\t\t\t\t     [9] Your contact no is      : "+phn +"\n");

System.out.print("\t\t\t\t    [10] Your Rating is          : "+rat +" ("+pub + ")"+"\n");	
}

	}
	read1.close();
}
	}
	catch(Exception e)
{
	System.out.print(e);
	
}

System.out.print("\n\n\n\t\t\t\t         Please press enter to go previous menu...\n");


Scanner input= new Scanner(System.in); 
String m = input.nextLine();

if (m.trim().isEmpty())
{
	raw cb2=new raw();
	cb2.cls();
	optionb();
}


}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




////////////////////////////////////////////2. Find a Seller////////////////////////////////////////////////////////////

public void finds()
{
	
			raw cmb1=new raw();
	cmb1.cls();
	
	Scanner input= new Scanner(System.in); 
	
	String uname1;
	 String mail,uname,name,pass, dob, passport, id, phn,nation,skill;
	 double rat;
	 int pub;
		
File f= new File("seller");
if(f.exists())
	{
		
	}
	else
	{
		f.mkdir();
	}
String p= f.getAbsolutePath();
color ("color 06");
System.out.println("\t\t\t\t\t\t------------------------------------------");
System.out.println("\t\t\t\t\t\t|  Please provide the information below  |");
System.out.println("\t\t\t\t\t\t------------------------------------------\n");
System.out.print("\n\t\t\t\t\t[1]Enter Seller User Name   : ");
uname1=input.nextLine();
if (uname1.trim().isEmpty())
{
	raw cb2=new raw();
	cb2.cls();
	optionb();
}
	
	
try
{
	File file1 =new File(p+"/register.rw");
	
	
	if (file1.length() == 0) 
{
}	
else{
	

	Scanner read1= new Scanner(file1);
	
  System.out.println("\n\t\t\t\t\t\t     =============================");
    System.out.println("\t\t\t\t\t\t     *****Seller Informations*****");
    System.out.println("\t\t\t\t\t\t     =============================");

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
		skill=read1.next();
		rat=read1.nextDouble();
pub=read1.nextInt();
uname=uname.replace('~',' ');

if(uname.equals(uname1))
{

//uname=uname.replace('~',' ');
System.out.print("\n\t\t\t\t\t    [1] Your User name is       : "+uname+ "\n");

mail=mail.replace('~',' ');
System.out.print("\t\t\t\t\t    [2] Your mail address is    : "+mail +"\n");

name=name.replace('~',' ');
System.out.print("\t\t\t\t\t    [3] Your Full Name is       : " +name+ "\n");

dob=dob.replace('~',' ');
System.out.print("\t\t\t\t\t    [4] Your Date of birth is   : "+dob +" \n");

id=id.replace('~',' ');
System.out.print("\t\t\t\t\t    [5] Your national id no is  : "+id +" \n");

nation=nation.replace('~',' ');
System.out.print("\t\t\t\t\t    [6] Your nationality is     : "+nation+ " \n");

passport=passport.replace('~',' ');
System.out.print("\t\t\t\t\t    [7] Your Passport No is     : "+passport + "\n");

phn=phn.replace('~',' ');
System.out.print("\t\t\t\t\t    [8] Your contact no is      : "+phn+ "\n");

skill=skill.replace('~',' ');
System.out.print("\t\t\t\t\t    [9] Seller Skills are       : "+skill +"\n");
	
System.out.print("\t\t\t\t\t   [10] Seller rating is        : "+rat +" ("+pub + ")"+"\n");	

	System.out.print("\n\n\t\t\t\t           Please press enter to go previous menu...\n");



String n = input.nextLine();

if (n.trim().isEmpty())
{
	raw cb2=new raw();
	cb2.cls();
	optionb();
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
System.out.print("\u001b[31;1m\n\n\t\t\t\t           We cann't find any seller with this name.\n");
System.out.print("\n\n\t\t\t\t           Please press enter to go previous menu...\n");



String n = input.nextLine();

if (n.trim().isEmpty())
{
	raw cb2=new raw();
	cb2.cls();
	optionb();
}

}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////3. Post a job as a buyer////////////////////////////////////////////////////

public void post()
{
			raw cmb3=new raw();
	cmb3.cls();
	
        String name, job, skills, details, status;
		double price;

		
File f= new File("job");
if(f.exists())
	{
		
	}
	else
	{
		f.mkdir();
	}
	
String p= f.getAbsolutePath();

    Scanner input= new Scanner(System.in); 
	
	color ("color 03");
	time();
	
  System.out.println("\u001b[36;1m\n\t\t\t\t\t\t             ================================");
    System.out.println("\t\t\t\t\t\t             ***** Your Project Details *****");
    System.out.println("\t\t\t\t\t\t             ================================");

try
{
FileWriter j1 = new FileWriter(p+"/job.rw", true);
Formatter job1 = new Formatter(j1);

System.out.print("\n\n\n [1] Project Name                               : ");
name = input.nextLine();
if (name.trim().isEmpty())
{
	raw cb2=new raw();
	cb2.cls();
	optionb();
}
name=name.replace(' ','~');




  System.out.print(" [2] Base/topic of the work                     : ");
job = input.nextLine();
if (job.trim().isEmpty())
{
		raw cb2=new raw();
	cb2.cls();
	optionb();
}
job=job.replace(' ','~');



System.out.print(" [3] Enter the skills related with the project  : ");
skills = input.nextLine();
if (skills.trim().isEmpty())
{
		raw cb2=new raw();
	cb2.cls();
	optionb();
}
skills=skills.replace(' ','~');



System.out.print(" [4] Fix your price($)                          : ");
price = nextDouble();	

System.out.print(" [5] Describe your project details(Please enter(~END)command when your description is done): ");

        StringBuilder psg  = new StringBuilder();

        while (input.hasNextLine()) 
		{
            String line = input.nextLine();
           
			if (!line.equals("~END")) 
			{ 
                psg.append(line+'`' /*+ System.lineSeparator()*/);
				
            } 
			else 
			{
                break;
            }
        }
		
		details = psg.toString();

details=details.replace(' ','~');
String uname=this.nn;
uname=uname.replace(' ','~');

status="Active";

job1.format("%s %s %s %s %s %s %f \r\n",uname, job,name,skills,details,status,price);

	

	job1.close();
	
}catch(Exception e)
{
	System.out.print(e);
	
}

    load(30);
    
	System.out.print("\u001b[32;1m\n\n\n\n\t\t\t\t\t\t        Your job has been posted... Thank you");
	System.out.print("\n\t\t\t\t\t\t\t       Press enter to go buyer menu...");
String q = input.nextLine();

if (q.trim().isEmpty())
{
		raw cb2=new raw();
	cb2.cls();
	
	optionb();
}		
				
		
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////4. Your posted jobs/////////////////////////////////////////////////////////

public void posted()
{		
			raw cmb4=new raw();
	cmb4.cls();
	
   	String name, job, skills, details, status,uname;
		double price;
File f= new File("job");
if(f.exists())
	{
		
	}
	else
	{
		f.mkdir();
	}
	
		color ("color 03");
	time();
	
	System.out.println("\u001b[32;1m\n\n\n\t\t\t\t\t\t                ==========================");
	System.out.println("\t\t\t\t\t\t                **** All Posted jobs *****");
	System.out.println("\t\t\t\t\t\t                ==========================\n");
	
	
String p= f.getAbsolutePath();

try
{
	File file1 =new File(p+"/job.rw");
if (file1.length() == 0) 
{
	sounddef();
	System.out.println("\u001b[31;1m\n\t\t\t\t\t                  There are no jobs are posted yet...");
}	
else{
	Scanner read1= new Scanner(file1);
		

	while(read1.hasNext())
	{
		

uname=read1.next();		
job=read1.next();
name=read1.next();
skills=read1.next();
details=read1.next();
status=read1.next();
price=read1.nextDouble();

String k=this.nn;
k=k.replace('~',' ');
uname=uname.replace('~',' ');
job=job.replace('~',' ');
name=name.replace('~',' ');
skills=skills.replace('~',' ');
details=details.replace('~',' ');
details=details.replace('`','\n');

if (uname.equals(k))
{
  System.out.println("\u001b[32;1m\n\n =====================================");
    System.out.println(" >   Your previous posted projects   <");
    System.out.println(" =====================================\n");


System.out.print("\u001b[32;1m\n\n\n[1] Job name            : "+name+"\n");
  System.out.print("[2] Job's Base topic    : "+job+"\n");
  System.out.print("[3] Job Details         : "+details+"\n");
System.out.print("[4] Job Price($)        : "+price+"\n");
System.out.print("[5] Job Status          : "+status+"\n");
System.out.print("---------------------------------------------------------------------\n\n");

}
	}
	read1.close();
}
	}catch(Exception e)
{
	System.out.print(e);
	
}
 
sounddef(); 
System.out.print("\u001b[31;1m\n\n\n\t\t\t\t\t\t            No more jobs are found in our database...\n");

System.out.print("\n\t\t\t\t\t\t         Please press enter to go to the previous menu...\n");
Scanner input= new Scanner(System.in); 
String q = input.nextLine();

if (q.trim().isEmpty())
{
	
	raw cb2=new raw();
	cb2.cls();
	optionb();
}

}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////5. Accepted jobs////////////////////////////////////////////////////////
public void acjob()
{
			raw cmb5=new raw();
	cmb5.cls();
	
	   	String name, job, skills, details, uname, status;
		double price;
		String s;
		 int count=0;
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
	
	time();
	System.out.println("\u001b[34;1m\n\n\n\t\t\t\t\t\t            ====================================");
    System.out.println("\t\t\t\t\t\t            | All requested jobs by the seller |");
    System.out.println("\t\t\t\t\t\t            ====================================\n");
	
String uname1=this.nn;

	while(read1.hasNext())
	{
uname=read1.next();		
job=read1.next();
name=read1.next();
skills=read1.next();
details=read1.next();
status=read1.next();
price=read1.nextDouble();




if(uname.equals(uname1))
{
	try{
	File file2 =new File(p+"/requested.rw");
			
if (file2.length() == 0) 
{
/*uname=uname.replace('~',' ');
job=job.replace('~',' ');
name=name.replace('~',' ');
skills=skills.replace('~',' ');
details=details.replace('~',' ');
details=details.replace('`','\n');
	
System.out.print("\n\n\n [1] Project name     : "+name+"\n");

  System.out.print(" [2] Project Details  : "+details+"\n");

  System.out.print(" [3] Price($)         : "+price+"\n");

  System.out.print(" [4] Requested Sellers: "+"No Seller found here"+"\n");


  System.out.print(" --------------------------------------------------------\n\n");
	
*/


}	
else{	
	Scanner read2= new Scanner(file2);
	String unames, unameb, job1, name1, skills1, details1;
	 
double price1;
	while(read2.hasNext())
	{/////while start for requested job search
		
unames=read2.next();		
unameb=read2.next();		
job1=read2.next();
name1=read2.next();
skills1=read2.next();
details1=read2.next();
price1=read2.nextDouble();

unames=unames.replace('~',' ');
unameb=unameb.replace('~',' ');
job1=job1.replace('~',' ');
name1=name1.replace('~',' ');
skills1=skills1.replace('~',' ');
details1=details1.replace('~',' ');
details1=details1.replace('`','\n');

uname=uname.replace('~',' ');
job=job.replace('~',' ');
name=name.replace('~',' ');
skills=skills.replace('~',' ');
details=details.replace('~',' ');
details=details.replace('`','\n');


if(unameb.equals(uname) && details1.equals(details))
{
	
ArrayList <String> sellern= new ArrayList<String>();

try{
	File files =new File(p+"/requested.rw");
    Scanner reads= new Scanner(files);

	String unamesa, unameba, job1a, name1a, skills1a, details1a;
	 
double price1a;

	while(reads.hasNext())
	{
unamesa=reads.next();		
unameba=reads.next();		
job1a=reads.next();
name1a=reads.next();
skills1a=reads.next();
details1a=reads.next();
price1a=reads.nextDouble();

//unamesa=unamesa.replace('~',' ');
unameba=unameba.replace('~',' ');
job1a=job1a.replace('~',' ');
name1a=name1a.replace('~',' ');
skills1a=skills1a.replace('~',' ');
details1a=details1a.replace('~',' ');
details1a=details1a.replace('`','\n');

if(unameba.equals(uname) && details1a.equals(details))
{


sellern.add(unamesa);
}
	}
reads.close();
}
catch(Exception e)
{
	System.out.print(e);
	
}

System.out.print("\u001b[34;1m\n\n\n [1] Project name         : "+name+"\n");

System.out.print(" [2] Project Details      : "+details+"\n");

System.out.print(" [3] Price($)             : "+price1+"\n");

System.out.print(" [4] Requested Sellers"+" ("+sellern.size()+") "+": \n"/*+sellern+"\n"*/);
//	System.out.print("Seller Name           :       Seller Rating(how many buyer submit his/her rating)\n"); 

 for (int i = 0; i < sellern.size(); i++)
	 { 
  
File fs= new File("seller");
if(fs.exists())
	{
		
	}
	else
	{
		fs.mkdir();
	}
String ps= fs.getAbsolutePath();
    String smail, suname, sname, spass, sdob, spassport, sid, sphn, snation, sskill;
	double srat;
	int spub;

try
{
	File file1s =new File(ps+"/register.rw");
	
	Scanner read1s= new Scanner(file1s);
	
	while(read1s.hasNext())
	{
		suname=read1s.next();
		smail=read1s.next();
		spass=read1s.next(); 
		sname=read1s.next();
		sdob=read1s.next();
		sid=read1s.next(); 
		snation=read1s.next();
		spassport=read1s.next(); 
		sphn=read1s.next();
		sskill=read1s.next();
		srat=read1s.nextDouble();
        spub=read1s.nextInt();


if(suname.equals(sellern.get(i)))
{
	String v = sellern.get(i);
	v=v.replace('~',' ');
	System.out.print((i+1)+". "+v+" : " +srat+"("+spub+")"+"\n"); 
		System.out.print("\n\n\n\t\t\t\t\t   Do you want to accept this seller for this work?(y/n) : "); 
		System.out.print("\n\n\t\t\tIf you enter any other key then you can see next seller details(If more sellers are requested for this job)..."); 
		Scanner input= new Scanner(System.in); 
		String acc = input.nextLine();

if (acc.trim().isEmpty())
{
	raw cb2=new raw();
	cb2.cls();
	optionb();
}	
if (acc.equals("y")|| acc.equals("Y"))
{
	
	count=1;
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
FileWriter j2 = new FileWriter(p2+"/acceptedjob.rw", true);
Formatter job2 = new Formatter(j2);

 s=sellern.get(i);
s=s.replace(' ','~');
unameb=unameb.replace(' ','~');
job1=job1.replace(' ','~');
name1=name1.replace(' ','~');
skills1=skills1.replace(' ','~');
details1=details1.replace(' ','~');
details1=details1.replace('\n','`');



job2.format("%s %s %s %s %s %s %f\r\n",s, unameb,job1, name1,skills1,details1,price1);

	job2.close();
	}catch(Exception e)
{
	System.out.print(e);
}


try{
	File file3 =new File(p+"/requested.rw");

if (file3.length() == 0) 
{
}	
else{
	Scanner read4= new Scanner(file3);
	String unamebs1,unameb1, jobb1, nameb1, skillsb1, detailsb1;

double priceb1;

	while(read4.hasNext())
	{

unamebs1=read4.next();		
unameb1=read4.next();		
jobb1=read4.next();
nameb1=read4.next();
skillsb1=read4.next();
detailsb1=read4.next();
priceb1=read4.nextDouble();

uname=uname.replace(' ','~');
detailsb1=detailsb1.replace(' ','~');
detailsb1=detailsb1.replace('\n','`');
 s=sellern.get(i);
 s=s.replace(' ','~');
 
if (unameb1.equals(this.nn) && detailsb1.equals(details1))
{
	
}
else{
	
File f4= new File("job");
if(f4.exists())
	{
		
	}
	else
	{
		f4.mkdir();
	}
	String p4 = f4.getAbsolutePath();	
try
{
FileWriter j4 = new FileWriter(p4+"/pending.rw", true);
Formatter job4 = new Formatter(j4);

		unamebs1=unamebs1.replace(' ','~');
		unameb1=unameb1.replace(' ','~');
        jobb1=jobb1.replace(' ','~');
		nameb1=nameb1.replace(' ','~');
		skillsb1=skillsb1.replace(' ','~');
		detailsb1=detailsb1.replace('\n','`');
		detailsb1=detailsb1.replace(' ','~');

job4.format("%s %s %s %s %s %s %f \r\n",unamebs1,unameb1, jobb1,nameb1,skillsb1,detailsb1,priceb1);
job4.close();


	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}

	}
	read4.close();
 


}

}
catch(Exception e)
{
	System.out.println(e);
}


File f5= new File("job");
if(f5.exists())
	{
		
	}
	else
	{
		f5.mkdir();
	}
	String p5 = f5.getAbsolutePath();	
try
{
FileWriter j5 = new FileWriter(p5+"/requested.rw", false);
Formatter job5 = new Formatter(j5);
job5.flush();
        job5.close();
        j5.close();
}
catch(Exception e)
{
	System.out.println(e);
}


try{
	File file5 =new File(p5+"/pending.rw");

if (file5.length() == 0) 
{
}	
else{
	Scanner read5= new Scanner(file5);
	String unamebs2,unameb2, jobb2, nameb2, skillsb2, detailsb2;

double priceb2;

	while(read5.hasNext())
	{

unamebs2=read5.next();		
unameb2=read5.next();		
jobb2=read5.next();
nameb2=read5.next();
skillsb2=read5.next();
detailsb2=read5.next();
priceb2=read5.nextDouble();


try
{
	
	
FileWriter r1 = new FileWriter(p5+"/requested.rw", true);
Formatter r2 = new Formatter(r1);

r2.format("%s %s %s %s %s %s %f \r\n",unamebs2,unameb2, jobb2,nameb2,skillsb2,detailsb2,priceb2);
r2.close();


	}
	catch(Exception e)
	{
		System.out.println(e);
	}



	}
	read5.close();
 
}

}
catch(Exception e)
{
	System.out.println(e);
}


try
{
FileWriter j5= new FileWriter(p5+"/pending.rw", false);
Formatter job5= new Formatter(j5);
job5.flush();
        job5.close();
        j5.close();
}
catch(Exception e)
{
	System.out.println(e);
}


try{
	File fileb1 = new File(p+"/job.rw");

if (fileb1.length() == 0) 
{
}	
else{
	Scanner readb4 = new Scanner(fileb1);
	String unamess,jobss, namess, skillsss, detailsss, statusss;

double pricess;

	while(readb4.hasNext())
	{

unamess=readb4.next();		
jobss=readb4.next();		
namess=readb4.next();
skillsss=readb4.next();
detailsss=readb4.next();
statusss=readb4.next();
pricess=readb4.nextDouble();

 s=sellern.get(i);
 s=s.replace(' ','~');

if (unamess.equals(this.nn) && detailsss.equals(details1))
{

	
	File fbs4= new File("job");
if(fbs4.exists())
	{
		
	}
	else
	{
		fbs4.mkdir();
	}
	String ps4 = fbs4.getAbsolutePath();	
try
{
FileWriter jbs4 = new FileWriter(ps4+"/temp.rw", true);
Formatter jobbs4 = new Formatter(jbs4);

		unamess=unamess.replace(' ','~');
		jobss=jobss.replace(' ','~');
        namess=namess.replace(' ','~');
		skillsss=skillsss.replace(' ','~');
		detailsss=detailsss.replace('\n','`');
		detailsss=detailsss.replace(' ','~');
		
		statusss = "Pending";

jobbs4.format("%s %s %s %s %s %s %f \r\n",unamess, jobss,namess,skillsss,detailsss,statusss,pricess);
jobbs4.close();


	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	
	
}
else{

File fb4= new File("job");
if(fb4.exists())
	{
		
	}
	else
	{
		fb4.mkdir();
	}
	String p4 = fb4.getAbsolutePath();	
try
{
FileWriter jb4 = new FileWriter(p4+"/temp.rw", true);
Formatter jobb4 = new Formatter(jb4);

		unamess=unamess.replace(' ','~');
		jobss=jobss.replace(' ','~');
        namess=namess.replace(' ','~');
		skillsss=skillsss.replace(' ','~');
		detailsss=detailsss.replace('\n','`');
		detailsss=detailsss.replace(' ','~');

jobb4.format("%s %s %s %s %s %s %f \r\n",unamess, jobss,namess,skillsss,detailsss,statusss,pricess);
jobb4.close();


	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}

	}
	readb4.close();
 


}

}
catch(Exception e)
{
	System.out.println(e);
}



try
{
FileWriter jd5= new FileWriter(p5+"/job.rw", false);
Formatter jobd5= new Formatter(jd5);
jobd5.flush();
        jobd5.close();
        jd5.close();
}
catch(Exception e)
{
	System.out.println(e);
}


try{
	File filet5 =new File(p5+"/temp.rw");

if (filet5.length() == 0) 
{
}	
else{
	Scanner readt5= new Scanner(filet5);
	String unamess1,jobss1, namess1, skillsss1, detailsss1, statusss1;

double pricess1;

	while(readt5.hasNext())
	{

unamess1=readt5.next();		
jobss1=readt5.next();		
namess1=readt5.next();
skillsss1=readt5.next();
detailsss1=readt5.next();
statusss1=readt5.next();
pricess1=readt5.nextDouble();

try
{
	
	
FileWriter rt1 = new FileWriter(p5+"/job.rw", true);
Formatter rt2 = new Formatter(rt1);



rt2.format("%s %s %s %s %s %s %f \r\n",unamess1,jobss1, namess1,skillsss1,detailsss1,statusss1,pricess1);
rt2.close();


	}
	catch(Exception e)
	{
		System.out.println(e);
	}



	}
	readt5.close();
 
}

}
catch(Exception e)
{
	System.out.println(e);
}

try
{
FileWriter jdt5= new FileWriter(p5+"/temp.rw", false);
Formatter jobdt5= new Formatter(jdt5);
jobdt5.flush();
        jobdt5.close();
        jdt5.close();
}
catch(Exception e)
{
	System.out.println(e);
}

System.out.print("\u001b[32;1m\n\n\t\t\t\t\t    Thank you :) your accepted request is submited. \n");
    System.out.print("\t\t\t\t\t       Please press enter to go previous menu...\n");
String q = input.nextLine();

if (q.trim().isEmpty())
{
	raw cb2=new raw();
	cb2.cls();
	optionb();
}	

}	
}

	}
	read1s.close();
	}catch(Exception e)
{
	System.out.print(e);	
}

	   } 
	
System.out.print("\t\t\t\tPlease press enter to go next...\n");
Scanner input= new Scanner(System.in); 
String q = input.nextLine();

if (q.trim().isEmpty())
{

}	

System.out.print("\t\t\t\t-------------------------------------------------\n\n");

break;
}

}

read2.close();
	}
	
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
sounddef();
System.out.print("\u001b[31;1m\n\n\n\t\t\t\tNo more sellers are found who are requesting for this job...\n");
System.out.print("\n\t\t\t\t\t     Please press enter to go previous menu...\n");
Scanner input= new Scanner(System.in); 
String q = input.nextLine();

if (q.trim().isEmpty())
{
	raw cb2=new raw();
	cb2.cls();
	optionb();
}	
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////6. Accepted works////////////////////////////////////////////////////////
public void works()
{
			raw cmb6=new raw();
	cmb6.cls();
	int count=0;
	double rat=0;
	Scanner input= new Scanner(System.in); 
	String sname2="", bname2="",namex2="",btopic2="",slink2="";
	String sname="", bname="",namex="",btopic="",slink="";
	double price=0, rprice=0,savea=0,price2=0;
	File fw= new File("job");
if(fw.exists())
	{
		
	}
	else
	{
		fw.mkdir();
	}
String pw= fw.getAbsolutePath();
   
try
{
		color ("color 03");
	time();
System.out.println("\u001b[32;1m\n\n\n\t\t\t\t\t\t         --------------------------------------");
	  System.out.println("\t\t\t\t\t\t         |  All completed jobs by the seller  |");
	  System.out.println("\t\t\t\t\t\t         --------------------------------------");
	 
	
	File filew =new File(pw+"/submittedjob.rw");
	
	
	
	if (filew.length() == 0) 
{
	sounddef();
	  System.out.print("\u001b[31;1m\n\n\t\t\t\t\t\t          There are no Submitted jobs here \n");/////////////////////////
	
}	
else{

	Scanner readw= new Scanner(filew);
	
	while(readw.hasNext())
	{
	sname=readw.next();
	bname=readw.next();
	namex=readw.next();
	btopic=readw.next();
	slink=readw.next();
	price=readw.nextDouble();
	

if(count==0)
{
	if(bname.equals(this.nn))
	{
		

sname=sname.replace('~',' ');
bname=bname.replace('~',' ');
namex=namex.replace('~',' ');
btopic=btopic.replace('~',' ');
slink=slink.replace('~',' ');
	
	
	System.out.println("\u001b[32;1m\n\n\n\t\t\t\t\t [1] Name of the seller                : " + sname +"\n");
	System.out.println("\t\t\t\t\t [2] Name of the buyer                 : " + bname +"\n");
	System.out.println("\t\t\t\t\t [3] Name of the project               : " + namex +"\n");
	System.out.println("\t\t\t\t\t [4] Name of the topic                 : " + btopic +"\n");
	System.out.println("\t\t\t\t\t [5] Submit Link                       : " + slink +"\n");
	System.out.println("\t\t\t\t\t [6] Price assigned for the project($) : " + price +"\n");
		sname=sname.replace(' ','~');
bname=bname.replace(' ','~');
namex=namex.replace(' ','~');
btopic=btopic.replace(' ','~');
slink=slink.replace(' ','~');
    System.out.print("\t\t\t\t  If you want to take the work then press y otherwise press any key to decline the work: ");
String n1b=input.nextLine();

if (n1b.trim().isEmpty())
{
	raw cb12=new raw();
	cb12.cls();
	optionb();
}
	

if (n1b.equals("y")||n1b.equals("Y"))
{
    sname2=sname;
	bname2=bname;
	namex2=namex;
	btopic2=btopic;
	slink2=slink;
	price2=price;
		
	do{
    System.out.print("\n\n\n\t\t\t\t\t [7] Enter Seller Rating               : ");
 rat=nextDouble();	
if(rat>5)
{
sounddef();
System.out.println("\u001b[31;1m\n\n\t\t\t\t\t\t  You need to enter buyer rating out of 5.");

		}
}
while(rat>5);

 String mail,uname,name,pass, dob, passport, id, phn,nation,skill;
	   double rat1;
	   int pub;

	   double ratb;
	   int pubb;	   
	   
	   
File f= new File("seller");
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
skill=read1.next();
rat1=read1.nextDouble();
pub=read1.nextInt();
if(uname.equals(sname2))
{
	pubb=(pub+1);
	ratb=((rat1+rat)/pubb);
		
try
{
FileWriter s21 = new FileWriter(p+"/tempreg.rw", true);
Formatter form21 = new Formatter(s21);
form21.format("%s %s %s %s %s %s %s %s %s %s %f %d\r\n",uname, mail, pass, name, dob, id, nation, passport, phn,skill,ratb, pubb );

	

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
form2.format("%s %s %s %s %s %s %s %s %s %s %f %d\r\n",uname, mail, pass, name, dob, id, nation, passport, phn, skill, rat1, pub );

	

	form2.close();
	
}catch(Exception e)
{
	System.out.print(e);
	
}
	
}

	}
	read1.close();
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
skill=read1.next();
rat1=read1.nextDouble();
pub=read1.nextInt();
	
try
{
FileWriter s2 = new FileWriter(p+"/register.rw", true);
Formatter form2 = new Formatter(s2);
form2.format("%s %s %s %s %s %s %s %s %s %s %f %d\r\n",uname, mail, pass, name, dob, id, nation, passport, phn,skill, rat1, pub );

	

	form2.close();
	
}catch(Exception e)
{
	System.out.print(e);
	
}
	


	}
	read1.close();
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

	   
File fa= new File("seller");
if(fa.exists())
	{
		
	}
	else
	{
		fa.mkdir();
	}
String pa= fa.getAbsolutePath();	
try
{
FileWriter sa = new FileWriter(pa+"/account.rw", true);
Formatter forma = new Formatter(sa);
sname2=sname2.replace(' ','~');
bname2=bname2.replace(' ','~');
savea=(price2*0.1);
rprice=(price2-savea);


	   
File fas= new File("admin");
if(fas.exists())
	{
		
	}
	else
	{
		fas.mkdir();
	}
String pas= fas.getAbsolutePath();	
try
{
FileWriter sas = new FileWriter(pas+"/account.rw", true);
Formatter formas = new Formatter(sas);
sname2=sname2.replace(' ','~');
bname2=bname2.replace(' ','~');
//savea=(price*0.1);
//rprice=(price-save);

formas.format("%s %s %f %f\r\n",sname2,bname2, price2, savea);

	formas.close();
	
}catch(Exception e)
{
	System.out.print(e);
	
}	


forma.format("%s %s %f %f\r\n",sname2,bname2, price2, rprice);

	forma.close();
	
}catch(Exception e)
{
	System.out.print(e);
	
}	
	

File pp1= new File("buyer");
if(pp1.exists())
	{
		
	}
	else
	{
		pp1.mkdir();
	}
String jj1= pp1.getAbsolutePath();
try
{
	
	
FileWriter rtt11 = new FileWriter(jj1+"/work.rw", true);
Formatter rtt21 = new Formatter(rtt11);



rtt21.format("%s %s %s %s %s %f \r\n",sname2,bname2, namex2,btopic2,slink2,price2);
rtt21.close();


	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	
	
try{
	
	File ff= new File("job");
if(ff.exists())
	{
		
	}
	else
	{
		ff.mkdir();
	}
String p2= fw.getAbsolutePath();
	File filebw = new File(p2+"/job.rw");

if (filebw.length() == 0) 
{
}	
else{
	Scanner readbw = new Scanner(filebw);
	String unamess, jobss,namess,skillsss,detailsss,statusss;

double pricess;

	while(readbw.hasNext())
	{

unamess=readbw.next();		
jobss=readbw.next();		
namess=readbw.next();
skillsss=readbw.next();
detailsss=readbw.next();
statusss=readbw.next();
pricess=readbw.nextDouble();


if (unamess.equals(bname2)  && jobss.equals(btopic2) && namess.equals(namex2) && pricess==price2)
{
	
	File fbs4= new File("job");
if(fbs4.exists())
	{
		
	}
	else
	{
		fbs4.mkdir();
	}
	String ps4 = fbs4.getAbsolutePath();	
try
{
FileWriter jbs4 = new FileWriter(ps4+"/temp.rw", true);
Formatter jobbs4 = new Formatter(jbs4);

		unamess=unamess.replace(' ','~');
		jobss=jobss.replace(' ','~');
        namess=namess.replace(' ','~');
		skillsss=skillsss.replace(' ','~');
		detailsss=detailsss.replace('\n','`');
		detailsss=detailsss.replace(' ','~');
		
		statusss = "Completed";

jobbs4.format("%s %s %s %s %s %s %f \r\n",unamess, jobss,namess,skillsss,detailsss,statusss,pricess);
jobbs4.close();


	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	
}
else{

File fb4= new File("job");
if(fb4.exists())
	{
		
	}
	else
	{
		fb4.mkdir();
	}
	String p4 = fb4.getAbsolutePath();	
try
{
FileWriter jb4 = new FileWriter(p4+"/temp.rw", true);
Formatter jobb4 = new Formatter(jb4);

		unamess=unamess.replace(' ','~');
		jobss=jobss.replace(' ','~');
        namess=namess.replace(' ','~');
		skillsss=skillsss.replace(' ','~');
		detailsss=detailsss.replace('\n','`');
		detailsss=detailsss.replace(' ','~');

jobb4.format("%s %s %s %s %s %s %f \r\n",unamess, jobss,namess,skillsss,detailsss,statusss,pricess);
jobb4.close();


	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}

	}
	readbw.close();
 


}

}
catch(Exception e)
{
	System.out.println(e);
}


File f4= new File("job");
if(f4.exists())
	{
		
	}
	else
	{
		f4.mkdir();
	}
	String p5 = f4.getAbsolutePath();	
try
{
FileWriter jd5= new FileWriter(p5+"/job.rw", false);
Formatter jobd5= new Formatter(jd5);
jobd5.flush();
        jobd5.close();
        jd5.close();
}
catch(Exception e)
{
	System.out.println(e);
}


try{
	File filet5 =new File(p5+"/temp.rw");

if (filet5.length() == 0) 
{
}	
else{
	Scanner readt5= new Scanner(filet5);
	String unamess1,jobss1, namess1, skillsss1, detailsss1, statusss1;

double pricess1;

	while(readt5.hasNext())
	{

unamess1=readt5.next();		
jobss1=readt5.next();		
namess1=readt5.next();
skillsss1=readt5.next();
detailsss1=readt5.next();
statusss1=readt5.next();
pricess1=readt5.nextDouble();

try
{
	
	
FileWriter rt1 = new FileWriter(p5+"/job.rw", true);
Formatter rt2 = new Formatter(rt1);



rt2.format("%s %s %s %s %s %s %f \r\n",unamess1,jobss1, namess1,skillsss1,detailsss1,statusss1,pricess1);
rt2.close();


	}
	catch(Exception e)
	{
		System.out.println(e);
	}



	}
	readt5.close();
 
}

}
catch(Exception e)
{
	System.out.println(e);
}



try
{
FileWriter jdt5= new FileWriter(p5+"/temp.rw", false);
Formatter jobdt5= new Formatter(jdt5);
jobdt5.flush();
        jobdt5.close();
        jdt5.close();
}
catch(Exception e)
{
	System.out.println(e);
}
	
	
	count=1;


} 
if (!(n1b.equals("y")) && !(n1b.equals("Y")))
{
	sounddef();
	
		File fw1= new File("job");
if(fw1.exists())
	{
		
	}
	else
	{
		fw1.mkdir();
	}
String jj= fw1.getAbsolutePath();
		
		try
{
FileWriter jdtt5= new FileWriter(jj+"/completework.rw", false);
Formatter jobdtt5= new Formatter(jdtt5);
jobdtt5.flush();
        jobdtt5.close();
        jdtt5.close();
}
catch(Exception e)
{
	System.out.println(e);
}	

    System.out.println("\u001b[31;1m\n\n\t\t\t\t\t\t           Press enter to back to the buyer menu...");
  
String m9 = input.nextLine();

if (m9.trim().isEmpty())
{
	raw cb22=new raw();
	cb22.cls();
	optionb();
}

}	
	
	}
	}	

	

	if(bname.equals(bname2) && sname.equals(sname2) && slink.equals(slink2) && namex.equals(namex2) && btopic.equals(btopic2) && price==price2)
	{
		
	}
	else
	{
		
File fw1= new File("job");
if(fw1.exists())
	{
		
	}
	else
	{
		fw1.mkdir();
	}
String pw1= fw1.getAbsolutePath();
try
{
	
	
FileWriter rtw1 = new FileWriter(pw1+"/completework.rw", true);
Formatter rtw2 = new Formatter(rtw1);

sname=sname.replace(' ','~');
bname=bname.replace(' ','~');
namex=namex.replace(' ','~');
btopic=btopic.replace(' ','~');
slink=slink.replace(' ','~');

rtw2.format("%s %s %s %s %s %f \r\n",sname,bname, namex,btopic,slink,price);
rtw2.close();


	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
		
		
	}
	
	}
		readw.close();
}
}
catch(Exception e)
{
	System.out.print(e);
	
}
	

	
	if(count==1)
		
	{
	

	File pp= new File("job");
if(pp.exists())
	{
		
	}
	else
	{
		pp.mkdir();
	}
String jj= pp.getAbsolutePath();
	try
{
FileWriter jdt5= new FileWriter(jj+"/submittedjob.rw", false);
Formatter jobdt5= new Formatter(jdt5);
jobdt5.flush();
        jobdt5.close();
        jdt5.close();
}
catch(Exception e)
{
	System.out.println(e);
}
		
	
	
	try{
	File filett5 =new File(jj+"/completework.rw");

if (filett5.length() == 0) 
{
}	
else{
	Scanner readtt5= new Scanner(filett5);
	String sname1, bname1,namex1,btopic1,slink1;
	double price1;

	while(readtt5.hasNext())
	{

sname1=readtt5.next();		
bname1=readtt5.next();		
namex1=readtt5.next();
btopic1=readtt5.next();
slink1=readtt5.next();
price1=readtt5.nextDouble();

try
{
	
	
FileWriter rtt1 = new FileWriter(jj+"/submittedjob.rw", true);
Formatter rtt2 = new Formatter(rtt1);



rtt2.format("%s %s %s %s %s %f \r\n",sname1,bname1, namex1,btopic1,slink1,price1);
rtt2.close();


	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	


	}
	readtt5.close();
 
}

}
catch(Exception e)
{
	System.out.println(e);
}
	
	
	
		try
{
FileWriter jdtt5= new FileWriter(jj+"/completework.rw", false);
Formatter jobdtt5= new Formatter(jdtt5);
jobdtt5.flush();
        jobdtt5.close();
        jdtt5.close();
}
catch(Exception e)
{
	System.out.println(e);
}	


  System.out.println("\u001b[31;1m\n\n\t\t\t\t\t\t Money has been tranfered successfully in the seller account...");
  System.out.println("\u001b[31;1m\n\n\t\t\t\t\t\t        Thank you for using RAW... Hope for the best...");
	
	
	}
	
	
if (count == 0)
{
	sounddef();
	
			File fw1= new File("job");
if(fw1.exists())
	{
		
	}
	else
	{
		fw1.mkdir();
	}
String jj= fw1.getAbsolutePath();
		
		try
{
FileWriter jdtt5= new FileWriter(jj+"/completework.rw", false);
Formatter jobdtt5= new Formatter(jdtt5);
jobdtt5.flush();
        jobdtt5.close();
        jdtt5.close();
}
catch(Exception e)
{
	System.out.println(e);
}	
	System.out.println("\u001b[31;1m\n\n\t\t\t\t\t\t        No more jobs are available in this section...");
}
sounddef();
    System.out.println("\u001b[31;1m\n\n\t\t\t\t\t\t           Press enter to back to the buyer menu...");
  
String m = input.nextLine();

if (m.trim().isEmpty())
{
	raw cb2=new raw();
	cb2.cls();
	optionb();
}


}


/////////////////////////////////////////////////////////9. show project//////////////////////////////////////////////

public void newjob()
{
			raw cmb8=new raw();
	cmb8.cls();
	
	   	String sname1, bname1, namex1, btopic1, slink1;
		double price1;


try{
		color ("color 03");
	time();
	
  System.out.println("\u001b[36;1m\n\n\n\t\t\t\t\t\t\t\t==============================");
		System.out.println("\t\t\t\t\t\t\t\t> Showing the submitted jobs <");
		System.out.println("\t\t\t\t\t\t\t\t==============================\n\n");
	
	
	File f1= new File("buyer");
if(f1.exists())
	{
		
	}
	else
	{
		f1.mkdir();
	}
String p= f1.getAbsolutePath();
	
	File file1 = new File(p+"/work.rw");

if (file1.length() == 0) 
{
}	
else{
	Scanner read1 = new Scanner(file1);

	while(read1.hasNext())
	{

sname1=read1.next();		
bname1=read1.next();		
namex1=read1.next();
btopic1=read1.next();
slink1=read1.next();
price1=read1.nextDouble();



if (bname1.equals(this.nn))
{
	sname1=sname1.replace('~',' ');
bname1=bname1.replace('~',' ');
namex1=namex1.replace('~',' ');
btopic1=btopic1.replace('~',' ');
slink1=slink1.replace('~',' ');
System.out.print("\u001b[36;1m\n\n\n\t\t\t\t\t[1] Name of the seller                : " + sname1 +"\n");
      System.out.print("\t\t\t\t\t[2] Name of the buyer                 : " + bname1 +"\n");
	System.out.print("\t\t\t\t\t[3] Name of the project               : " + namex1 +"\n");
	System.out.print("\t\t\t\t\t[4] Name of the topic                 : " + btopic1 +"\n");
	System.out.print("\t\t\t\t\t[5] Submit Link                       : " + slink1 +"\n");
	System.out.print("\t\t\t\t\t[6] Price assigned for the project($) : " + price1 +"\n");
	System.out.print("\t\t\t--------------------------------------------------------------------------------------------");
}
	}
	read1.close();
}
}
catch(Exception e)
{
	System.out.print(e);
}

System.out.print("\n\n\n\t\t\t\t\t\t  Please press enter to go previous menu...\n");


Scanner input= new Scanner(System.in); 
String m = input.nextLine();

if (m.trim().isEmpty())
{
	raw cb2=new raw();
	cb2.cls();
	optionb();
}

}

}
