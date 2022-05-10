/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe.part.pkg1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author David
 */
public class Login {
    
    private String strUsername, strPassword, strFirstName, strLastName, strLoginUsername, strLoginPassword;
    
    public void setUsername(String username)
    {strUsername = username;}
    
    public String getUsername()
    {return strUsername;}
    
    public void setPassword(String password)
    {strPassword = password;}
    
    public String getPassword()
    {return strPassword;}
    
    public void setFirstName(String firstName)
    {strFirstName = firstName;}
    
    public String getFirstName()
    {return strFirstName;}
    
    public void setLastName(String lastName)
    {strLastName = lastName;}
    
    public String getLastName()
    {return strLastName;}
    
    public void setLoginUsername(String loginUsername)
    {strLoginUsername = loginUsername;}
    
    public void setLoginPassword(String loginPassword)
    {strLoginPassword = loginPassword;}
    
    public String registerUser()
    {
        String output;
       
        if(checkUserName(strUsername))
        {
            output = "Username succesfully captured.";
            
            if(checkPasswordComplexity(strPassword))
            {
                output = "Username and password succesfully captured.";
            }
            else
            {
                output = output + "\n\nPassword is not correctly formatted,\nplease ensure that the password contains"
                        + " at least 8 characters, a capital letter, a number and a special character.";
            }
        }
        
        else
        {
            output = "Username is not correctly formatted,\nplease ensure that your username contains"
                                                + " an underscore and is no more than 5 characters in length.";    
        }
         
        return output;
    }
    
    public static boolean checkUserName(String usernameInput)
    {return usernameInput.length() <= 5 && usernameInput.contains("_");}
    
    public static boolean checkPasswordComplexity(String passwordInput)
        {
            boolean hasNum = false, hasCap = false, hasLow = false, hasSymb = false, meetsLength = false; char c;
            
            for (int i = 0; i < passwordInput.length(); i++)
            {
                c = passwordInput.charAt(i);
                
                if (Character.isDigit(c))
                {hasNum = true;}
                
                else if (Character.isUpperCase(c))
                {hasCap = true;}
                
                else if (Character.isDigit(c))
                {hasNum = true;}
                
                else if (Character.isLowerCase(c))
                {hasLow = true;}
                
                else if(passwordInput.length() >= 8)
                {meetsLength = true;}
            }
            
            Pattern symbolPattern = Pattern.compile("[^a-zA-Z0-9]");
            Matcher symbolMatcher = symbolPattern.matcher(passwordInput);
            boolean isStringContainsSpecialCharacter = symbolMatcher.find();
         
            if(isStringContainsSpecialCharacter)
            {hasSymb = true;}
            
            if(hasNum && hasCap && hasLow && hasSymb && meetsLength)
            {return true;}
            
            else
            {return false;}
            
        }
    public static boolean loginUser()
    {
                    
  
                    if(strLoginUsername.equals(strUsername) && strLoginPassword.equals(strPassword))
                        {
                        JOptionPane.showMessageDialog(null, "Welcome " + a.getFirstName() +", " + a.getLastName() + " it is great to see you again." ); 
                        }
                    else
                        {
                            JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again.");                          
                        }
    }
    
     
    
}
