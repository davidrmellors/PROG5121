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
        String username = JOptionPane.showInputDialog("Please create a username: ");
        String password = JOptionPane.showInputDialog("Please create a password: ");
        a.setFirstName(firstName);
        a.setLastName(lastName);
        a.setUsername(username);
        a.setPassword(password);
        
        JOptionPane.showMessageDialog(null, a.registerUser());
        
        JOptionPane.showMessageDialog(null, "Please login to your account.");
        username = JOptionPane.showInputDialog("Please enter your username: ");
        password = JOptionPane.showInputDialog("Please enter your password: ");
        a.setLoginUsername(username);
        a.setLoginPassword(password);
        
        
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
