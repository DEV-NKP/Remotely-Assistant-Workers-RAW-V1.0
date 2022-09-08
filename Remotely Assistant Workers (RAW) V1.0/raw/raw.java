/*
***MAKE SURE THIS JAVA FILE IS IN A PACKAGE NAME "raw"***

*/
package raw;
import java.io.IOException;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
public class raw{
	
	
	public static void cls()
{
	try
	{	
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	}catch(Exception E)
		{
			System.out.println(E);
		}
}
	
	
	public static boolean mailcheck(String email) 
    { 
        String emailRegex = "^[a-z0-9_+&*-]+(?:\\."+ 
                            "[a-z0-9_+&*-]+)*@" + 
                            "(?:[a-z0-9-]+\\.)+[a-z" + 
                            "]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
	
	
public static boolean passcheck(String uname, String upass)
        {
                boolean valid = true;
                if (upass.length() > 16 || upass.length() < 8)
                {
                        System.out.println("Password should be less than 16 and more than or equal 8 characters in length.");
                        valid = false;
						return valid;
                }
                if (upass.indexOf(uname) > -1)
                {
                        System.out.println("Password Should not be same as user name");
                        valid = false;
							return valid;
                }
                String upercase = "(.*[A-Z].*)";
                if (!upass.matches(upercase))
                {
                        System.out.println("Password should contain atleast one upper case alphabet");
                        valid = false;
							return valid;
                }
                String lowercase = "(.*[a-z].*)";
                if (!upass.matches(lowercase ))
                {
                        System.out.println("Password should contain atleast one lower case alphabet");
                        valid = false;
							return valid;
                }
                String number = "(.*[0-9].*)";
                if (!upass.matches(number))
                {
                        System.out.println("Password should contain atleast one number.");
                        valid = false;
							return valid;
                }
                String special = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
                if (!upass.matches(special))
                {
                        System.out.println("Password should contain atleast one special character");
                        valid = false;
							return valid;
                }
                if (valid)
                {
                   return valid;     	
                }
				return valid;
        }
}