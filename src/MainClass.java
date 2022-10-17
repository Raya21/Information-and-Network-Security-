
import java.io.InputStream;
import java.util.Scanner;
//import RailFenceCipher.java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Msys
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner input = new Scanner(System.in);
            int cipher;
            int operation;
            int keyInt;
            String keyString;
            String plaintext="";
            String ciphertext="";

            
             while(true)
             {
            System.out.println("Please choose one from these two ciphers algorithms :");
            System.out.println("1- Rail Fence Cipher");
            System.out.println("2- Least-Simple Substitution");
            cipher=input.nextInt();
            //System.out.println(choiceNumber);
            System.out.println("Choose one of these operations :");
            System.out.println("1- Encrypt");
            System.out.println("2- Decrypt");
            System.out.println("3- Crack");
            operation=input.nextInt();
            
            if(cipher==1)
            {
                if(operation==1)
            {
                System.out.println("Enter a plaintext:");
                input.nextLine();
                plaintext=input.nextLine();
                System.out.println("Enter a key :");
                keyInt=input.nextInt();
                if(keyInt <=0 )
                {
                    System.out.println("The key should be a positive integer number! Enter the key again :");
                    keyInt=input.nextInt();
                }
                
                RailFenceCipher.encrypt(plaintext, keyInt);
                
            }
            
            else if(operation==2)
            {
                System.out.println("Enter a ciphertext:");
                input.nextLine();
                ciphertext=input.nextLine();
                
                System.out.println("Enter a key :");
                keyInt=input.nextInt();
                if(keyInt <=0 )
                {
                    System.out.println("The key should be a positive integer number! Enter the key again :");
                    keyInt=input.nextInt();
                }
                RailFenceCipher.decrypt(ciphertext, keyInt);
            }
             
            else if(operation==3)
            {
                System.out.println("Enter a ciphertext:");
                input.nextLine();
                ciphertext=input.nextLine();
                RailFenceCipher.crack(ciphertext);
            }
                else
            {
                System.out.println("choosen number should be from 1 to 3");
            }
            }
            
            else if(cipher==2)
            {
                if(operation==1)
                {
                System.out.println("Enter a plaintext:");
                input.nextLine();
                plaintext=input.nextLine();
                System.out.println("Enter a key :");
                 //input.nextLine();
                keyString=input.nextLine();

                
                LeastSimpleSubstitution.encrypt(plaintext, keyString);
                }
                
                 else if(operation==2)
            {
                System.out.println("Enter a ciphertext:");
                input.nextLine();
                ciphertext=input.nextLine();
                
                System.out.println("Enter a key :");
                keyString=input.nextLine();

                LeastSimpleSubstitution.decrypt(ciphertext, keyString);
            }
                 
                 else if(operation==3)
            {
                System.out.println("Enter a ciphertext:");
                input.nextLine();
                ciphertext=input.nextLine();
                LeastSimpleSubstitution.crack(ciphertext);
            }
                else
            {
                System.out.println("choosen number should be from 1 to 3");
            }
            }
            
                 System.out.println(" ");
             }
          // String ciphertext="PBFPVYFBQXZTYFPBFEQJHDXXQVAPTPQJKTOYQWIPBVWLXTOXBTFXQWAXBVCXQWAXFQJVWLEQNTOZQGGQLFXQWAKVWLXQWAEBIPBFXFQVXGTVJVWLBTPQWAEBFPBFHCVLXBQUFEVWLXGDPEQVPQGVPPBFTIXPFHXZHVFAGFOTHFEFBQUFTDHZBQPOTHXTYFTODXQHFTDPTOGHFQPBQWAQJJTODXQHFOQPWTBDHHIXQVAPBFZQHCFWPFHPBFIPBQWKFABVYYDZBOTHPBQPQJTQOTOGHFQAPBFEQJHDXXQVAVXEBQPEFZBVFOJIWFFACFCCFHQWAUVWFLQHGFXVAFXQHFUFHILTTAVWAFFAWTEVOITDHFHFQAITIXPFHXAFQHEFZQWGFLVWPTOFFA";
           //LeastSimpleSubstitution.crack(ciphertext);
            
            //MAVAUMQIAAXKQCXFFGVQIAJXKQFA
            
            //ciphertext=input.nextLine();
            
           /* System.out.print("Enter a string: ");  
String str=input.nextLine();              //reads string   
System.out.print("You have entered: "+str);  */
            
            // defend the east wall of the castle
           //  DEFEND THE EAST WALL OF THE CASTLE
                     
            // phqgi umeay lnofd xjkr cvst zwb
            // PHQGI UMEAY LNOFD XJKR CVST ZWB        
                     
                    
            
    }
    
}
