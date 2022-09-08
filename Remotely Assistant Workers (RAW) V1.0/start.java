/*###################################################################################################################
##***************************************************************************************************************##
##********************************** MUST BE READ THIS TEXT FILE BEFORE RUN RAW *********************************##
##***************************************************************************************************************##
###################################################################################################################

=>NOTE: PLEASE ENSURE THAT YOUR CONSOLE BOX IS FULL SCREEN AND FONT SIZE '19' WITH FONT STYLE 'CONSOLAS'.

=>NOTE: Make sure that you create a folder "raw" and move "raw.java" in that folderbecause it is a package in our project.

=>NOTE: Run "start.java" file only in cmd.

=>NOTE: AUTHORITY PASSWORD IS : passwordadmin

=>It's not possible to change our adminstrator/authority password without program developer.

=> Some requirement for user password:
-> 1 Capital word.
-> 1 Small word.
-> 1 Number.
-> 1 Special character.
-> Password length must be 8 to 16.

=> Some requirement for user Gmail:
-> must be use a valid gmail address.
-> Can't create same type(seller, buyer) of account with a same mail.


=> User Name must be unique. you can not use a name that already use before.


                                        ***We Are Always Ready For Your Help.***

                                            ***YOUR SECURITY OUR PRIORITY***



                                       "THANK YOU FOR BEING WITH US."    -TEAM DELTA

                                             all right reserved by @team delta




*/
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
import java.io.*;

public class start extends design
{
	start()
	{}
	
	public static void main(String [] args)
	{
		raw cl=new raw();
		cl.cls();
		cover();
		Scanner input= new Scanner(System.in);
System.out.println("\n\t\t\t\t\t\t\t  Please press enter to continue...");

String mst1 = input.nextLine();
if (mst1.trim().isEmpty())
{
	raw c2=new raw();
	c2.cls();	
}
	rawd();
	load(30);
	
	System.out.println("\n\n\n\t\t\t\t\t                 Please press enter to discover the project...");
    System.out.println("\n\t\t\t\t\t                        Thank you for being with us...");
 	
	String mst4 = input.nextLine();
if (mst4.trim().isEmpty())
{
	raw c4=new raw();
	c4.cls();	
}
	
    bird();
	System.out.println("\033[0;96m");
	loady(50);
	
	sounddef();
	System.out.println("\033[0;96m\n\n\n\t\t\t\t\t\t\t     Please press enter to continue...");

String mst3 = input.nextLine();
if (mst3.trim().isEmpty())
{
	raw c4=new raw();
	c4.cls();	
}
	start a = new start();
	a.first();

	}
	
//////////////////////////////////////////////////////Main page////////////////////////////////////////////////
	
	
	public void first()
		{
			Scanner input= new Scanner(System.in);

	raw cm=new raw();
	cm.cls();	

			
			
			color("color 03");
			time();
  System.out.println("\033[0;91m\n\n\n\t\t\t\t\t\t\t\t===========================");
		System.out.println("\t\t\t\t\t\t\t\t> Welcome in project: RAW <");
		System.out.println("\t\t\t\t\t\t\t\t===========================");	
		
	System.out.println("\u001b[33;1m\n\t\t\t\t\t\t\t\tWhat do you want to do now?\n"); 
	
	
	    
	    System.out.println("\t\t\t\t\t\t\t------------\t\t\t-------------");
		System.out.println("\t\t\t\t\t\t\t| 1. Login |\t\t\t"+"| 2. Signup |"); 
		System.out.println("\t\t\t\t\t\t\t------------\t\t\t-------------");
		
		System.out.println("\t\t\t\t\t\t\t-----------------------\t        ----------");
		System.out.println("\t\t\t\t\t\t\t| 3. Authority Access |\t        "+"| 4.EXIT |"); 
		System.out.println("\t\t\t\t\t\t\t-----------------------\t        ----------\n");
		int r=0;
	do{
	
	System.out.print("\n\n\t\t\t\t\t\t\t\tChose your option: \u001b[0m"); 
	r=nextInt();
	if(r>4)
		{
			raw cl=new raw();
			
			sounddef();
		    System.out.println("\u001b[0m\033[0;91m\n\t\t\t\t\t\tSorry you have entered a wrong number. Please try again :)");
			String mst = input.nextLine();
if (mst.trim().isEmpty())
{
	cl.cls();
	first();
}


		}
}
while(r>4);
raw c2=new raw();
		switch(r)
		{
		case 1: 
			
			System.out.println("\u001b[36;1m\n\n\t\t\t\t\t\t         Hold tight. Taking you to the login menu... :)");
			load(20);			
			System.out.println("\u001b[36;1m\n\n\t\t\t\t\t\t              Please press enter to continue...:)");	
		String m = input.nextLine();
		
if (m.trim().isEmpty())
{
	c2.cls();
	loginm();
}
		loginm();		
			break;
			
		case 2:
		
		System.out.println("\u001b[36;1m\n\n\t\t\t\t\t\t        Hold tight. Taking you to the signup menu... :)");
		
			load(20);
		System.out.println("\u001b[36;1m\n\n\t\t\t\t\t\t               Please press enter to continue...:)");	
		String ma = input.nextLine();
		
if (ma.trim().isEmpty())
{
	c2.cls();		
    signupm();
}
signupm();
	

		break;
		case 3:
		  author();
		break;
		
		
		case 4:
		c2.cls();
		log();
		loadr(100);
		  exit();
		break;
		default:
		
		sounddef();
			System.out.println("\u001b[0m\033[0;91m\n\t\t\t\t\t\t\tSorry you have entered a wrong value.... :)");
		break;
			
		}
			
		}
////////////////////////////authority///////////////////////////////////

public void author()
{
	Scanner input= new Scanner(System.in);

	raw cm1=new raw();
	cm1.cls();	

			color("color 03");
			time();	
System.out.println("\u001b[36;1m\n\t\t\t\t\t\t\t\t  =======================");
 System.out.println("\t\t\t\t\t\t\t\t     Authority Log In   ");
 System.out.println("\t\t\t\t\t\t\t\t  =======================");	

String pass= passmask.readpass("\n\n\n\t\t\t\t\t\tEnter Authority Password: ");	

if (pass.trim().isEmpty())
{
	raw cn1=new raw();
	cn1.cls();
	first();
}
	if(pass.equals("passwordadmin"))
	{
			   
		load(20);
		
		System.out.print("\n\n\n\t\t\t\t\t\t            Please press enter to continue");
		
		String mat = input.nextLine();
		
if (mat.trim().isEmpty())
{
	raw cn2=new raw();
	cn2.cls();		
}
					 			   
File fas= new File("admin");
if(fas.exists())
	{
		
	}
	else
	{
		fas.mkdir();
	}
String pas= fas.getAbsolutePath();	
	
String unames,unameb;
double ammount,rammount,tota=0;			
try
{
	File file12 =new File(pas+"/account.rw");
if (file12.length() == 0) 
{
	
	sounddef();
		raw clr=new raw();
	clr.cls();	
	
	
	  System.out.println("\u001b[36;1m\n\n\n\t\t\t\t\t\t\t=====================================");
    System.out.println("\t\t\t\t\t\t\t***** Your Account Informations *****");
    System.out.println("\t\t\t\t\t\t\t=====================================");
System.out.print("\u001b[31;1m\n\n\n\n\n\t\t\t\t\t\t      Sorry. There are no ammount that transfered in your account.\n");		


String aut = input.nextLine();

if (aut.trim().isEmpty())
{
	raw autt=new raw();
	autt.cls();	
	first();
}

}	
else{
	Scanner read12= new Scanner(file12);
	
	
		raw autt1=new raw();
	autt1.cls();	
	
	color ("color 03");
	time();
  System.out.println("\u001b[36;1m\n\t\t\t\t\t\t\t=====================================");
    System.out.println("\t\t\t\t\t\t\t***** Your Account Informations *****");
    System.out.println("\t\t\t\t\t\t\t=====================================");

ArrayList <Double> total= new ArrayList<Double>();

while(read12.hasNext())
{
unames=read12.next();
unameb=read12.next();
ammount=read12.nextDouble();
rammount=read12.nextDouble();

unames=unames.replace('~',' ');
unameb=unameb.replace('~',' ');
System.out.print("\n\n\n\n\t\t\t\t\t\t  [1] Seller name is             : "+unames +"\n");
System.out.print("\t\t\t\t\t\t  [2] Buyer Name                 : "+unameb +"\n");
System.out.print("\t\t\t\t\t\t  [3] Ammount Send by Buyer      : "+ammount +"\n");
System.out.print("\t\t\t\t\t\t  [4] Ammount Received           : "+rammount +"\n");
total.add(rammount);
System.out.print("\t\t\t\t\t----------------------------------------------------------------------------\n");
	}
	read12.close();
	
	
 for (int i = 0; i < total.size(); i++)
	 {
		tota=tota+total.get(i);
	 }
	 
System.out.print("\u001b[31;1m\n\n\n\n\t\t\t\t\t\t          Total Ammount Recieved: "+tota);
System.out.print("\u001b[31;1m\n\n\n\n\t\t\t\t\t\t     Please press enter to go to the main menu... ");
String t1=input.nextLine();
if (t1.trim().isEmpty())
{
	raw cn12=new raw();
	cn12.cls();
	first();
}
	 
}
}
catch(Exception e)
{
	System.out.print(e);
	
}
		
		
	}
	
	else{
		
		sounddef();
		System.out.println("\u001b[31;1m\n\n\n\t\t\t\t\t\tSorry authority password is wrong... Press Enter to Try again...");	
String pass1=input.nextLine();
if (pass1.trim().isEmpty())
{
	raw cn11=new raw();
	cn11.cls();
	author();
}
	
		
	}
}


//////////////////////////////////////////////////////Signupm/////////////////////////////////////////////////////////	
public void signupm()
{
	Scanner input= new Scanner(System.in);

	raw cm2=new raw();
	cm2.cls();	

	color("color 03");
	time();
System.out.println("\n\t\t\t\t\t\t\t\t\t=============");
  System.out.println("\t\t\t\t\t\t\t\t\t   Sign Up   ");
  System.out.println("\t\t\t\t\t\t\t\t\t=============");	


System.out.println("\n\t\t\t\t\t\t\t   Please select your option which you prefer\n"); 


System.out.println("\t\t\t\t\t\t  ---------------------------     " + " -------------------------"); 
System.out.println("\t\t\t\t\t\t  | [1] Sign up as a seller |     " + " | [2] Signup as a buyer |"); 
System.out.println("\t\t\t\t\t\t  ---------------------------     " + " -------------------------\n"); 


System.out.println("\t\t\t\t\t\t  -------------------------       " + " ------------"); 
System.out.println("\t\t\t\t\t\t  | [3] Back to main menu |       " + " | [4] EXIT |"); 
System.out.println("\t\t\t\t\t\t  -------------------------       " + " ------------"); 


int r=0;
do{
	
System.out.print("\n\n\t\t\t\t\t\t\t   Choose your option : "); 
r=nextInt();

if(r>4)
{
	
	sounddef();
System.out.println("\u001b[0m\033[0;91m\n\t\t\t\t\t\tSorry you have entered a wrong number. Please try again... :)");

System.out.println("\u001b[0m\033[0;91m\n\t\t\t\t\t\t\t  Please press enter to continue...");

String m = input.nextLine();
String mst1 = input.nextLine();
if (mst1.trim().isEmpty())
{
	raw cl=new raw();
	cl.cls();
	signupm();
}


}

}
while(r>4);
raw c2=new raw();
		switch(r)
		{
		case 1: 
		c2.cls();
		signups();
		break;
			
		case 2: 
		c2.cls();
	    signupb();
		break;
	
		case 3: 
		c2.cls();
	    first();
		break;
		
		case 4: 
	    c2.cls();
		log();
		loadr(100);
		exit();
		break;
	
		default:
		
		sounddef();
			System.out.println("\u001b[0m\033[0;91m\n\t\t\t\t\t\t\tSorry you have entered a wrong number. Please try again... :)");
		break;
			
		}
		
		}
	
	/////////////////////////////////////////////////Loginm////////////////////////////////////////////////////////////
	public void loginm()
		{
			
	Scanner input= new Scanner(System.in);

	raw cm3=new raw();
	cm3.cls();	

			
			
			color("color 03");
			time();
	  System.out.println("\n\n\n\t\t\t\t\t\t\t\t      ================");
		System.out.println("\t\t\t\t\t\t\t\t         Login menu   ");
		System.out.println("\t\t\t\t\t\t\t\t      ================\n");	
		
		
	System.out.println("\n\t\t\t\t\t\t\tPlease select your options which you prefer\n"); 
	

	System.out.println("\t\t\t\t\t\t    -------------------------       " + " ------------------------"); 
	System.out.println("\t\t\t\t\t\t    | [1] Login as a Seller |       " + " | [2] Login as a Buyer |"); 
	System.out.println("\t\t\t\t\t\t    -------------------------       " + " ------------------------\n"); 

    System.out.println("\t\t\t\t\t\t    -------------------------       " + " ------------");
	System.out.println("\t\t\t\t\t\t    | [3] Back to main menu |       " + " | [4] EXIT |");
    System.out.println("\t\t\t\t\t\t    -------------------------       " + " ------------");



		int r=0;
	do{
	
	System.out.print("\n\t\t\t\t\t\t\t\tChoose your option  : "); 
	r=nextInt();
	if(r>4)
		{
			
sounddef();
System.out.println("\u001b[0m\033[0;91m\n\t\t\tSorry you have entered a wrong number. Please try again... :)");

System.out.println("\n\t\t\t\tPlease press enter to continue...");

String m = input.nextLine();
String mst2 = input.nextLine();
if (mst2.trim().isEmpty())
{
	raw cl=new raw();
	cl.cls();
	signupm();
}

		}
		
       }
	   
    while(r>4);
raw c2=new raw();
		switch(r)
		{
		case 1: 
		c2.cls();
		logins();
		break;
			
		case 2: 
		c2.cls();
     	loginb();
		break;
		
		case 3:
	    c2.cls();		
	    first();
		break;
		
		case 4: 
	    c2.cls();
		log();
		loadr(100);
		exit();
		break;
		  
		default:
		
		sounddef();
			System.out.println("\u001b[0m\033[0;91m\n\t\t\t\t\tSorry you have entered a wrong number. Please try again... :)");
		break;
			
		}
		
		}
		
///////////////////////////////////signup as a seller//////////////////////////////////////////
public void signups()
{
	
	

File f= new File("seller");
if(f.exists())
	{
		
	}
	else
	{
		f.mkdir();
	}
String p= f.getAbsolutePath();

String mail,uname,name,pass, dob, passport, id, phn,nation,skill;
double rat1, rat2;
int pub1, pub2;
String mail2,uname2,name2,pass2, dob2, passport2, id2, phn2,nation2,skill2;
Scanner input= new Scanner(System.in); 
	

	raw cm4=new raw();
	cm4.cls();

	
			color("color 03");
			time();

System.out.println("\u001b[32;1m\n\n\n\t\t\t\t\t\t\t\t==============================");
                  System.out.println("\t\t\t\t\t\t\t\t*****Please sign up first*****");
                  System.out.println("\t\t\t\t\t\t\t\t==============================\n");
  
  
  
  System.out.println("\t\t\t\t*** [Note: If you want to go back while taking the input, you can go back by taking blank input.]\n\n");


try
{
FileWriter s1 = new FileWriter(p+"/register.rw", true);
Formatter form1 = new Formatter(s1);

System.out.print("\t\t\t  [1] Enter your user Name                                   : ");
uname=input.nextLine();
if (uname.trim().isEmpty())
{
	raw cl=new raw();
	cl.cls();
	signupm();
}

if(uname.indexOf("~")!=-1 || uname.indexOf("`")!=-1)
{
	
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
                        System.out.print("\n\n\t\t\t\t\t\t\t      Please press enter to input again...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signups();
}
     
}
uname=uname.replace(' ','~');





try{
	File file =new File(p+"/register.rw");
	if (file.length() == 0) 
{
}	
else{	
	Scanner read= new Scanner(file);
		

	while(read.hasNext())
	{
		uname2=read.next();
		mail2=read.next();
		pass2=read.next(); 
		name2=read.next();
		dob2=read.next();
		id2=read.next(); 
		nation2=read.next();
		passport2=read.next(); 
		phn2=read.next();
		skill2=read.next();
rat2=read.nextDouble();
pub2=read.nextInt();
if(uname.equals(uname2))
{
	
	System.out.println("\u001b[0m\033[0;91m\n\t\t\t\t\t\tOOPs this user name is already in our database choose another one..");
	
System.out.print("\n\t\t\t\t\t\t\t\tPlease press enter to go again...\n");

String q = input.nextLine();

if (q.trim().isEmpty())
{
	raw c4=new raw();
	c4.cls();
	signups();
}

	
}

	}
	read.close();
}
	
	}catch(Exception e)
{
	System.out.print(e);
	
}

System.out.print("\t\t\t  [2] Enter your mail address                                : ");
mail=input.nextLine();
if (mail.trim().isEmpty())
{
		raw cl=new raw();
	cl.cls();
	signupm();
}
raw check=new raw();
if(check.mailcheck(mail))
{
	
}
else{
		System.out.println("\n\n\n\t\t\t\t\t\tYou have entered a wrong email....");
	
System.out.print("\n\n\t\t\t\t\t\t\tPlease press enter to go again...\n");

String q2 = input.nextLine();

if (q2.trim().isEmpty())
{
	raw c2=new raw();
	c2.cls();
	signups();
}

}


if(mail.indexOf("~")!=-1 || mail.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to input again...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signups();
}
     
}
mail=mail.replace(' ','~');


try{
	File file1 =new File(p+"/register.rw");
		
if (file1.length() == 0) 
{
}	
else{		
	Scanner read1= new Scanner(file1);
		

	while(read1.hasNext())
	{
		uname2=read1.next();
		mail2=read1.next();
		pass2=read1.next(); 
		name2=read1.next();
		dob2=read1.next();
		id2=read1.next(); 
		nation2=read1.next();
		passport2=read1.next(); 
		phn2=read1.next();
		skill2=read1.next();
rat2=read1.nextDouble();
pub2=read1.nextInt();
if(mail.equals(mail2))
{
	
	System.out.println("\u001b[0m\033[0;91m\n\t\t\t\t\t\tYou are caught. This mail is already in our Database.");
	
System.out.print("\n\t\t\t\t\t\t\tPlease press enter to go previous menu...\n");

String q = input.nextLine();

if (q.trim().isEmpty())
{
	raw c4=new raw();
	c4.cls();
	signupm();
}
	
	
}

	}
	read1.close();
}
	
	}catch(Exception e)
{
	System.out.print(e);
	
}

pass= passmask.readpass("\t\t\t  [3] Enter your Password                                    : ");

if (pass.trim().isEmpty())
{	
    raw cl=new raw();
	cl.cls();
	signupm();
}


if(pass.indexOf("~")!=-1 || pass.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to input again...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signups();
}
     
}
pass=pass.replace(' ','~');


raw pas=new raw();
if(pas.passcheck(uname,pass)==false)
{

System.out.println("\n\t\t\t\tPlease press enter to continue...");
String mt3 = input.nextLine();
if (mt3.trim().isEmpty())
{
    raw c31=new raw();
    c31.cls();
    signups();
}
}


System.out.print("\t\t\t  [4] Enter your Full Name                                   : ");
name=input.nextLine();
if (name.trim().isEmpty())
{
		raw cl=new raw();
	cl.cls();
	signupm();
}



if(name.indexOf("~")!=-1 || name.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to input again...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signups();
}
     
}
name=name.replace(' ','~');

System.out.print("\t\t\t  [5] Enter your date of birth                               : ");
dob=input.nextLine();
if (dob.trim().isEmpty())
{
		raw cl=new raw();
	cl.cls();
	signupm();
}


if(dob.indexOf("~")!=-1 || dob.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to input again...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signups();
}
     
}
dob=dob.replace(' ','~');


System.out.print("\t\t\t  [6] Enter your nationality                                 : ");
nation=input.nextLine();
if (nation.trim().isEmpty())
{
		raw cl=new raw();
	cl.cls();
	signupm();
}


if(nation.indexOf("~")!=-1 || nation.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to go previous menu...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signups();
}
     
}
nation=nation.replace(' ','~');


System.out.print("\t\t\t  [7] Enter your national id no.(Enter no if you have no NID): ");
id=input.nextLine();
if (id.trim().isEmpty())
{
		raw cl=new raw();
	cl.cls();
	signupm();
}


if(id.equals("no")|| id.equals("NO")|| id.equals("No")|| id.equals("nO"))
{
System.out.print("\t\t\t  [or] Enter your Passport No.                               : ");
passport=input.nextLine();
if (passport.trim().isEmpty())
{
		raw cl=new raw();
	cl.cls();
	signupm();
}


if(passport.indexOf("~")!=-1 || passport.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to input again...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signups();
}
     
}

passport=passport.replace(' ','~');





}
else
{
	passport="no";
}



if(id.indexOf("~")!=-1 || id.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to input again...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signups();
}
     
}

id=id.replace(' ','~');

System.out.print("\t\t\t  [8]Enter your contact no                                   : ");
phn=input.nextLine();
if (phn.trim().isEmpty())
{
		raw cl=new raw();
	cl.cls();
	signupm();
}




if(phn.indexOf("~")!=-1 || phn.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to input again...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signups();
}
     
}

phn=phn.replace(' ','~');

System.out.print("\t\t\t  [9]Enter your skill                                        : ");
skill=input.nextLine();
if (skill.trim().isEmpty())
{
		raw cl=new raw();
	cl.cls();
	signupm();
}


if(skill.indexOf("~")!=-1 || skill.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to go previous menu...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signups();
}
     
}
skill=skill.replace(' ','~');

rat1=0.0;
pub1=0;
form1.format("%s %s %s %s %s %s %s %s %s %s %f %d\r\n",uname, mail, pass, name, dob, id, nation, passport, phn,skill,rat1,pub1 );

	form1.close();
	
}catch(Exception e)
{
	System.out.print(e);
	
}

loadg(20);

System.out.println("\033[0;93m\n\n\n\t\t\t\t\t\t\t\tYour sign up is successful...");

sounddef();


System.out.println("\n\t\t\t\t\t\t\t      Please press enter to continue...");


String mst3 = input.nextLine();
if (mst3.trim().isEmpty())
{
	raw c3=new raw();
	c3.cls();
    first();
}
first();


}



///////////////////////////////////////////////sign up as buyer////////////////////////////////////////
public void signupb()
{
	Scanner input= new Scanner(System.in); 

	raw cm5=new raw();
	cm5.cls();	

	
String mail,uname,name,pass, dob, passport, id, phn,nation;

		double rat1, rat2,rat3;
int pub1, pub2,pub3;
File f= new File("buyer");
if(f.exists())
	{
		
	}
	else
	{
		f.mkdir();
	}
String p= f.getAbsolutePath();
    
color("color 03");
time();
	
  System.out.println("\u001b[32;1m\n\t\t\t\t\t\t\t\t==============================");
                System.out.println("\t\t\t\t\t\t\t\t*****Please Sign up first*****");
                System.out.println("\t\t\t\t\t\t\t\t==============================\n\n");
	
System.out.println("\t\t\t\t*** [Note: If you want to go back while taking the input, you can go back by taking blank input.]\n\n");
	
	
	
String mail2,uname2,name2,pass2, dob2, passport2, id2, phn2,nation2;
String mail3,uname3,name3,pass3, dob3, passport3, id3, phn3,nation3;

try
{
FileWriter s2 = new FileWriter(p+"/register.rw", true);
Formatter form2 = new Formatter(s2);

System.out.print("\t\t\t     [1]Enter your user Name                                     : ");
uname=input.nextLine();
if (uname.trim().isEmpty())
{
	raw c1=new raw();
	c1.cls();
	signupm();
}


if(uname.indexOf("~")!=-1 || uname.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to go previous menu...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signupb();
}
     
}
uname=uname.replace(' ','~');

try{
File file3 =new File(p+"/register.rw");
	
	
		
if (file3.length() == 0) 
{
}	
else{	
Scanner read= new Scanner(file3);
	while(read.hasNext())
	{
		uname2=read.next();
		mail2=read.next();
		pass2=read.next(); 
		name2=read.next();
		dob2=read.next();
		id2=read.next(); 
		nation2=read.next();
		passport2=read.next(); 
		phn2=read.next();
		rat2=read.nextDouble();
        pub2=read.nextInt();

if(uname.equals(uname2))
{
	
	sounddef();
System.out.println("\u001b[0m\033[0;91m\n\t\t\t\t\tOOPS this user name is already in our database. choose another...");
	
System.out.print("\n\t\t\t\t\t\t\t\t\tPlease press enter to go again...\n");

String q = input.nextLine();

if (q.trim().isEmpty())
{
		raw c3=new raw();
	c3.cls();
	signupb();
}
	
	
}

	}
read.close();
}
	
	}catch(Exception e)
{
	System.out.print(e);
	
}


System.out.print("\t\t\t     [2]Enter your mail address                                  : ");
mail=input.nextLine();
if (mail.trim().isEmpty())
{
	raw c1=new raw();
	c1.cls();
	signupm();
}
raw check=new raw();
if(check.mailcheck(mail))
{
	
}
else
{
	sounddef();
System.out.println("\n\t\t\t\t\t\t\tYou have entered a wrong email here...");
	
System.out.print("\n\t\t\t\t\t\t      Please press enter to go again...\n");

String q2 = input.nextLine();

if (q2.trim().isEmpty())
{
	raw c2=new raw();
	c2.cls();
	signupb();
}

}


if(mail.indexOf("~")!=-1 || mail.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to go previous menu...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signupb();
}
     
}
mail=mail.replace(' ','~');

try{	
	File file1 =new File(p+"/register.rw");
	
	
		
if (file1.length() == 0) 
{
}	
else{
	Scanner read1= new Scanner(file1);
	while(read1.hasNext())
	{
		uname3=read1.next();
		mail3=read1.next();
		pass3=read1.next(); 
		name3=read1.next();
		dob3=read1.next();
		id3=read1.next(); 
		nation3=read1.next();
		passport3=read1.next(); 
		phn3=read1.next();
		rat3=read1.nextDouble();
        pub3=read1.nextInt();

if(mail.equals(mail3))
{
	
System.out.println("\u001b[0m\033[0;91m\n\t\t\t\t\t\tYou are caught. This mail is already in our Database.");
	
System.out.print("\n\t\t\t\t\t\t\tPlease press enter to go previous menu...\n");

String q = input.nextLine();

if (q.trim().isEmpty())
{
		raw c3=new raw();
	c3.cls();
	signupm();
}
	
	
}

	}
read1.close();
}
	}catch(Exception e)
{
	System.out.print(e);
	
}


pass= passmask.readpass("\t\t\t     [3]Enter your Password                                      : ");
if (pass.trim().isEmpty())
{
		raw c3=new raw();
	c3.cls();
	signupm();
}


if(pass.indexOf("~")!=-1 || pass.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to go previous menu...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signupb();
}
     
}
pass=pass.replace(' ','~');


raw pas=new raw();
if(pas.passcheck(uname,pass)==false)
{

System.out.println("\n\t\t\t\t\t\tPlease press enter to continue...");
String mt3 = input.nextLine();
if (mt3.trim().isEmpty())
{
    raw c31=new raw();
    c31.cls();
    signupb();
}
}



System.out.print("\t\t\t     [4]Enter your Full Name                                     : ");
name=input.nextLine();
if (name.trim().isEmpty())
{
		raw c3=new raw();
	c3.cls();
	signupm();
}


if(name.indexOf("~")!=-1 || name.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to go previous menu...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signupb();
}
     
}

name=name.replace(' ','~');

System.out.print("\t\t\t     [5]Enter your date of birth                                 : ");
dob=input.nextLine();
if (dob.trim().isEmpty())
{
		raw c3=new raw();
	c3.cls();
	signupm();
}




if(dob.indexOf("~")!=-1 || dob.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to go previous menu...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signupb();
}
     
}

dob=dob.replace(' ','~');


System.out.print("\t\t\t     [6]Enter your nationality                                   : ");
nation=input.nextLine();
if (nation.trim().isEmpty())
{
		raw c3=new raw();
	c3.cls();
	signupm();
}


if(nation.indexOf("~")!=-1 || nation.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to go previous menu...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signupb();
}
     
}

nation=nation.replace(' ','~');



System.out.print("\t\t\t     [7]Enter your national id no.(Enter (no) if you have no NID): ");
id=input.nextLine();
if (id.trim().isEmpty())
{
		raw c3=new raw();
	c3.cls();
	signupm();
}


if(id.equals("no")|| id.equals("NO")|| id.equals("No")|| id.equals("nO"))
{
System.out.print("\t\t\t     [or]Enter your Passport No.                                 : ");
passport=input.nextLine();
if (passport.trim().isEmpty())
{
	raw c3=new raw();
	c3.cls();
	signupm();
}


if(passport.indexOf("~")!=-1 || passport.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to go previous menu...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signupb();
}
     
}
passport=passport.replace(' ','~');

}
else
{
	passport="no";
}



if(id.indexOf("~")!=-1 || id.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to go previous menu...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signupb();
}
     
}
id=id.replace(' ','~');


System.out.print("\t\t\t     [8]Enter your contact no                                    : ");
phn=input.nextLine();
if (phn.trim().isEmpty())
{
		raw c3=new raw();
	c3.cls();
	signupm();
}




if(phn.indexOf("~")!=-1 || phn.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\t   Please press enter to go previous menu...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	signupb();
}
     
}

phn=phn.replace(' ','~');

rat1=0.0;
pub1=0;
form2.format("%s %s %s %s %s %s %s %s %s %f %d\r\n",uname, mail, pass, name, dob, id, nation, passport, phn, rat1, pub1 );

	

	form2.close();
	
}catch(Exception e)
{
	System.out.print(e);
	
}

loadg(20);

System.out.println("\033[0;93m\n\n\n\t\t\t\t\t\t\t\tYour sign up is successful...");

sounddef();


System.out.println("\n\t\t\t\t\t\t\t      Please press enter to continue...");
String mst3 = input.nextLine();
if (mst3.trim().isEmpty())
{
	raw c3=new raw();
	c3.cls();
    first();
}

}



///////////////////////////////////////////////login as seller////////////////////////////////////////
public void logins()
{
	 String mail1, pass1;
	 String mail,uname,name,pass, dob, passport, id, phn,nation,skill;
	 double rat;
	 int pub;
	 Scanner input= new Scanner(System.in); 
	 
	raw cm6=new raw();
	cm6.cls();	
	
	color("color 03");
	time();
	
  System.out.println("\033[0;33m\n\n\n\t\t\t\t\t\t\t      ================================");
    System.out.println("\t\t\t\t\t\t\t      ***** Please Log in first ******");
    System.out.println("\t\t\t\t\t\t\t      ================================\n\n");
	
	System.out.println("\n\n\t\t\t\t*** [Note: If you want to go back while taking the input, you can go back by taking blank input.]\n\n");
		
File f= new File("seller");
if(f.exists())
	{
		
	}
	else
	{
		f.mkdir();
	}
String p= f.getAbsolutePath();

System.out.print("\n\n\t\t\t\t\t  [1]Enter your mail address    : ");
mail1=input.nextLine();


if(mail1.indexOf("~")!=-1 || mail1.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\tPlease press enter to go previous menu...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	logins();
}
     
}


if (mail1.trim().isEmpty())
{
	raw c3=new raw();
	c3.cls();	
	loginm();
}


pass1= passmask.readpass("\t\t\t\t\t  [2]Enter your Password        : ");

if(pass1.indexOf("~")!=-1 || pass1.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\tPlease press enter to go previous menu...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	logins();
}
     
}

if (pass1.trim().isEmpty())
{
	raw c3=new raw();
	c3.cls();
	loginm();
}



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
		skill=read1.next();
		rat=read1.nextDouble();
pub=read1.nextInt();
mail=mail.replace('~',' ');
pass=pass.replace('~',' ');
if(mail.equals(mail1)&& pass.equals(pass1))
{
	
	seller s1 = new seller();
	s1.setmail(mail);
	s1.setuname(uname);
    
    sounddef();
	System.out.println("\u001b[34;1m\n\n\n\t\t\t\t\t\t                      You have entered valid informations.");
	                System.out.println("\n\t\t\t\t\t\t                        Please press enter to continue...");
					
String mst3 = input.nextLine();
if (mst3.trim().isEmpty())
{
	raw c3=new raw();
	c3.cls();
	logi();
	loadr(100);
    s1.options();
}
	raw clsl=new raw();
	clsl.cls();
	logi();
	loadr(100);
s1.options();

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
System.out.println("\u001b[0m\033[0;91m\n\n\n\n\t\t\t\t\t\t\t         Sorry your Mail or Password is invalid...");
                       System.out.println("\n\n\t\t\t\t\t\t\t              Please press enter to continue...");

String mst3 = input.nextLine();
if (mst3.trim().isEmpty())
{
	raw c3=new raw();
	c3.cls();
   logins();
}
	raw caa=new raw();
	caa.cls();
   logins();
}


///////////////////////////////////////////////login as buyer////////////////////////////////////////
public void loginb()
{
	 String mail1, pass1;
	 String mail,uname,name,pass, dob, passport, id, phn,nation,skill;
	 double rat;
	 int pub;
	 Scanner input= new Scanner(System.in); 
	 

	raw cm7=new raw();
	cm7.cls();	

			color("color 03");
			time();
	 
  System.out.println("\033[0;33m\n\n\n\t\t\t\t\t\t             ================================");
    System.out.println("\t\t\t\t\t\t             ***** Please Log in first ******");
    System.out.println("\t\t\t\t\t\t             ================================");
	System.out.println("\n\n\t\t\t\t*** [Note: If you want to go back while taking the input, you can go back by taking blank input.]\n\n");
	File f= new File("buyer");
if(f.exists())
	{
		
	}
	else
	{
		f.mkdir();
	}
String p= f.getAbsolutePath();
System.out.print("\n\n\t\t\t\t  [1]Enter your mail address    : ");
mail1=input.nextLine();


if(mail1.indexOf("~")!=-1 || mail1.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\t\t\t\t\t\t\tPlease press enter to go previous menu...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	loginb();
}
     
}

if (mail1.trim().isEmpty())
{
	raw cb=new raw();
	cb.cls();
	loginm();
}



pass1= passmask.readpass("\t\t\t\t  [2]Enter your Password        : ");



if(pass1.indexOf("~")!=-1 || pass1.indexOf("`")!=-1)
{
	sounddef();
   System.out.println("\u001b[0m\033[0;91m\n\n\t\t\t\t\t\t    Sorry you cann't use (~,`) signs in input...");
   
   System.out.print("\n\n\n\t\t\t\t\t\t\tPlease press enter to go previous menu...\n");

String q1 = input.nextLine();

if (q1.trim().isEmpty())
{
	raw cn=new raw();
	cn.cls();
	loginb();
}
     
}

if (pass1.trim().isEmpty())
{
	raw cb=new raw();
	cb.cls();	
	loginm();
}


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
		rat=read1.nextDouble();
pub=read1.nextInt();
		
mail=mail.replace('~',' ');
pass=pass.replace('~',' ');



if(mail.equals(mail1) && pass.equals(pass1))
{	

buyer b1 = new buyer();
	b1.setmail(mail);
	b1.setuname(uname);
	sounddef();
	System.out.println("\u001b[34;1m\n\n\n\t\t\t\t\t\t                      You have entered valid informations.");
	                System.out.println("\n\t\t\t\t\t\t                        Please press enter to continue...");
String mst3 = input.nextLine();
if (mst3.trim().isEmpty())
{
	raw cb=new raw();
	cb.cls();
	logi();
    loadr(100);
	cb.cls();
	b1.optionb();
}
raw clds=new raw();
	clds.cls();
	logi();
    loadr(100);
b1.optionb();
	
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
System.out.println("\u001b[0m\033[0;91m\n\n\n\n\t\t\t\t\t\t\t               Sorry your Mail or Password is invalid...");

                       System.out.println("\n\n\t\t\t\t\t\t\t                    Please press enter to continue...");
String mst3 = input.nextLine();
if (mst3.trim().isEmpty())
{
	raw c3=new raw();
	c3.cls();
    loginb();
}
	raw caa1=new raw();
	caa1.cls();
    loginb();
}
}


class passmask {

   public static String readpass (String p) {
      erase e = new erase(p);
      Thread mask = new Thread(e);
      mask.start();

      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String pass = "";

      try {
          pass = in.readLine();
      } catch (IOException ioe) {
          ioe.printStackTrace();
      }
      e.stopmask();
      return pass;
   }
}   

class erase implements Runnable {
   private boolean stop;

   public erase(String p) {
       System.out.print(p);
   }

   public void run () {
      while (!stop){
         System.out.print("\010*");
         try {
            Thread.currentThread().sleep(1);
         } catch(InterruptedException ie) {
            ie.printStackTrace();
         }
      }
   }

   public void stopmask() {
      this.stop = true;
   }
}	
	
	
