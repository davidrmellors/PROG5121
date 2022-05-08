/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe.part.pkg1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/**
 *
 * @author David
 */
public class POEPart1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String firstName = JOptionPane.showInputDialog("Please enter your first name: ");
        String lastName = JOptionPane.showInputDialog("Please enter your last name: ");
        String username = JOptionPane.showInputDialog("Please enter a username: ");
        
            if (checkUserName(username) == true)
            {
                JOptionPane.showMessageDialog(null, "Username succesfully captured");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Username is not correctly formatted,\nplease ensure that your username contains"
                        + " an underscore and is no more than 5 characters in length.");
            }
        
        String password = JOptionPane.showInputDialog("Please enter a password: ");
        
            if (checkPasswordComplexity(password) && hasSpecialCharacters(password) && passwordLength(password))
            {
                JOptionPane.showMessageDialog(null, "Password succesfully captured");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted,\nplease ensure that the password contains"
                        + " at least 8 characters, a capital letter, a number and a special character.");
            }
    }
    
     public static boolean checkUserName(String usernameInput)
        {
            
            return usernameInput.length() <= 5 && usernameInput.contains("_");
        }
     
     
     
    public static boolean passwordLength(String passwordInput)
    {
        if (passwordInput.length() >= 8)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    
    
    public static boolean checkPasswordComplexity(String passwordInput)
        {
            boolean hasNum = false; boolean hasCap = false; boolean hasLow = false; char c; 
            
            for (int i = 0; i < passwordInput.length(); i++)
            {
                c = passwordInput.charAt(i);
                if (Character.isDigit(c))
                {
                    hasNum = true;
                }
                else if (Character.isUpperCase(c))
                {
                    hasCap = true;
                }
                else if (Character.isDigit(c))
                {
                    hasNum = true;
                }
                else if (Character.isLowerCase(c))
                {
                    hasLow = true;
                }
                if(hasNum && hasCap && hasLow)
                {
                    return true;
                }
            }
            return false;
        }
    
    
    
    
    
     
     public static boolean hasSpecialCharacters(String passwordInput)
     {
         Pattern sPattern = Pattern.compile("[^a-zA-Z0-9]");
         Matcher sMatcher = sPattern.matcher(passwordInput);
         if(!sMatcher.matches())
         {
            return true;
         }
         else
         {
            return false;
         }
     }
    
}
