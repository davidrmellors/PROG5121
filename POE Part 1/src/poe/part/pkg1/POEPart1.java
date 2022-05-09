/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe.part.pkg1;
import java.util.HashSet;
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
    
    private static Login a = new Login();
    
    public static void main(String[] args) {
        // TODO code application logic here
        String firstName = JOptionPane.showInputDialog("Please enter your first name: ");
        String lastName = JOptionPane.showInputDialog("Please enter your last name: ");
        
        a.setFirstName(firstName);
        a.setLastName(lastName);
        
        Username();
        Password();
        UserLogin();
        
        
    }
    
     public static void Username()
             {
                 
                
            String username = JOptionPane.showInputDialog("Please enter a username: ");
            
                while(checkUserName(username) == false)
                {    
                    JOptionPane.showMessageDialog(null, "Username is not correctly formatted,\nplease ensure that your username contains"
                        + " an underscore and is no more than 5 characters in length.");
                    username = JOptionPane.showInputDialog("Please enter a username: ");
                }
                
                JOptionPane.showMessageDialog(null, "Username succesfully captured");
                a.setUsername(username);         
            }
     
     public static void Password()
     {
         String password = JOptionPane.showInputDialog("Please enter a password: ");
        
            while (checkPasswordComplexity(password) == false || hasSpecialCharacters(password) == false || passwordLength(password) == false)
            {
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted,\nplease ensure that the password contains"
                        + " at least 8 characters, a capital letter, a number and a special character.");
                password = JOptionPane.showInputDialog("Please enter a password: ");
            }
            
            JOptionPane.showMessageDialog(null, "Password succesfully captured");
            a.setPassword(password);
            
            System.out.println(a.getPassword());
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
       
         Pattern symbolPattern = Pattern.compile("[^a-zA-Z0-9]");
         Matcher symbolMatcher = symbolPattern.matcher(passwordInput);
         boolean isStringContainsSpecialCharacter = symbolMatcher.find();
         
         if(isStringContainsSpecialCharacter)
         {
            return true;
         }
        return false;
     }
     
     public static void UserLogin()
        {
                    JOptionPane.showMessageDialog(null, "Please login to your account.");
                    String usernameLogin = JOptionPane.showInputDialog("Please enter your username: ");
                    String passwordLogin = JOptionPane.showInputDialog("Please enter your password: ");
  
                    if(usernameLogin.equals(a.getUsername()) && passwordLogin.equals(a.getPassword()))
                        {
                        JOptionPane.showMessageDialog(null, "Welcome " + a.getFirstName() +", " + a.getLastName() + " it is great to see you again." ); 
                        }
                    else
                        {
                            JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again.");                          
                        }

        }
    
}
