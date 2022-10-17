
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Msys
 */
public class LeastSimpleSubstitution {
    static String  key;
    static String  plaintext;
    static String  ciphertext;
    
    //cleaning the plaintext or ciphertext from special characters and spaces
  static ArrayList<Character> cleanText(char []characters)
   {
       ArrayList<Character> capitalLetters = new ArrayList<Character>();
        for(int i=0;i<characters.length;i++)
       {
           if(characters[i]>= 'A' && characters[i]<= 'Z')
           { 
               capitalLetters.add(characters[i]);
           }
       }
        
      return capitalLetters;
   }
  
    //printing the cleand text
 static void printCleanText(ArrayList<Character> letters)
  {
             for(Character letter : letters)
       {
           System.out.printf("%c",letter);
       }
        System.out.println("");
        System.out.println("");
  }
    
    public static void encrypt(String plaintext1,String key1)
    {
        key=key1;
        plaintext=plaintext1;
        
        char [] plaintextChar=plaintext.toCharArray();
        char [] permutationOfLetters=key.toCharArray();
        char [] alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        ArrayList<Character> PlaintextLetters = new ArrayList<Character>();
        ArrayList<Character> ciphertextLetters = new ArrayList<Character>();
        ArrayList<Character> keyLetters = new ArrayList<Character>();
        
        

        //cleaning the plaintext from special characters and spaces
        PlaintextLetters = cleanText(plaintextChar);
        
        //printing the plaintext that is cleaned from any special character or space
       System.out.println("Cleaned plaintext without any special character or space : ");
       printCleanText(PlaintextLetters);
       
        //cleaning the key from special characters and spaces
        keyLetters = cleanText(permutationOfLetters);
        
        System.out.println("alphabet : ");
        for(int i=0;i<26;i++)
        {
            System.out.printf("%c",alphabet[i]);
        }
        System.out.println(" ");
       //printing the key that is cleaned from any special character or space
       System.out.println("Cleaned key without any special character or space : ");
       printCleanText(keyLetters);
       
       if(keyLetters.size()!=26)
       {
           System.out.println("key should be 26 letters !");
       }
       
       else
       {
           ciphertextLetters=PlaintextLetters;
           int index=0;
           
           for(Character letter : ciphertextLetters)
       {   
            
            char c;
            switch(letter)
            {
                case 'A':{
                   c=keyLetters.get(0);
                   ciphertextLetters.set(index, c);
                   break;
                }
                
                case 'B':{
                   c=keyLetters.get(1);
                   ciphertextLetters.set(index, c);
                   break;
                }
                
                case 'C':{
                   c=keyLetters.get(2);
                   ciphertextLetters.set(index, c);
                   break;
                }
                
                 case 'D':{
                   c=keyLetters.get(3);
                   ciphertextLetters.set(index, c);
                   break;
                }
                 
                  case 'E':{
                   c=keyLetters.get(4);
                   ciphertextLetters.set(index, c);
                   break;
                }
                  case 'F':{
                   c=keyLetters.get(5);
                   ciphertextLetters.set(index, c);
                   break;
                }
                  
                  case 'G':{
                   c=keyLetters.get(6);
                   ciphertextLetters.set(index, c);
                   break;
                }
                    case 'H':{
                   c=keyLetters.get(7);
                   ciphertextLetters.set(index, c);
                   break;
                }
                    
                   case 'I':{
                   c=keyLetters.get(8);
                   ciphertextLetters.set(index, c);
                   break;
                }
                   
                   case 'J':{
                   c=keyLetters.get(9);
                   ciphertextLetters.set(index, c);
                   break;
                }
                   
                   case 'K':{
                   c=keyLetters.get(10);
                   ciphertextLetters.set(index, c);
                   break;
                }
                   
                   case 'L':{
                   c=keyLetters.get(11);
                   ciphertextLetters.set(index, c);
                   break;
                }
                   case 'M':{
                   c=keyLetters.get(12);
                   ciphertextLetters.set(index, c);
                   break;
                }
                   case 'N':{
                   c=keyLetters.get(13);
                   ciphertextLetters.set(index, c);
                   break;
                }
                    case 'O':{
                   c=keyLetters.get(14);
                   ciphertextLetters.set(index, c);
                   break;
                }
                   case 'P':{
                   c=keyLetters.get(15);
                   ciphertextLetters.set(index, c);
                   break;
                }
                   case 'Q':{
                   c=keyLetters.get(16);
                   ciphertextLetters.set(index, c);
                   break;
                }
                   
                   case 'R':{
                   c=keyLetters.get(17);
                   ciphertextLetters.set(index, c);
                   break;
                }
                   
                   case 'S':{
                   c=keyLetters.get(18);
                   ciphertextLetters.set(index, c);
                   break;
                }
                   
                   case 'T':{
                   c=keyLetters.get(19);
                   ciphertextLetters.set(index, c);
                   break;
                }
                   
                   case 'U':{
                   c=keyLetters.get(20);
                   ciphertextLetters.set(index, c);
                   break;
                }
                   
                   case 'V':{
                   c=keyLetters.get(21);
                   ciphertextLetters.set(index, c);
                   break;
                }
                   
                   case 'W':{
                   c=keyLetters.get(22);
                   ciphertextLetters.set(index, c);
                   break;
                }
                   
                   case 'X':{
                   c=keyLetters.get(23);
                   ciphertextLetters.set(index, c);
                   break;
                }
                   
                   case 'Y':{
                   c=keyLetters.get(24);
                   ciphertextLetters.set(index, c);
                   break;
                }
                   
                   case 'Z':{
                   c=keyLetters.get(25);
                   ciphertextLetters.set(index, c);
                   break;
                }
            }
            index++;
       }
           //printing the ciphertext
           System.out.println("ciphertext :");
           for(Character letter : ciphertextLetters)
           {
               System.out.printf("%c",letter);
           }
           
           System.out.println(" ");
           
       }
       
    }
    
    public static void decrypt(String ciphertext1,String key1)
    {
         key=key1;
        ciphertext=ciphertext1;
        
        char [] ciphertextChar=ciphertext.toCharArray();
        char [] permutationOfLetters=key.toCharArray();
        char [] alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        ArrayList<Character> PlaintextLetters = new ArrayList<Character>();
        ArrayList<Character> ciphertextLetters = new ArrayList<Character>();
        ArrayList<Character> keyLetters = new ArrayList<Character>();
        
        

        //cleaning the ciphertext from special characters and spaces
        ciphertextLetters = cleanText(ciphertextChar);
        
        //printing the ciphertext that is cleaned from any special character or space
       System.out.println("Cleaned ciphertext without any special character or space : ");
       printCleanText(ciphertextLetters);
       
        //cleaning the key from special characters and spaces
        keyLetters = cleanText(permutationOfLetters);
        
        System.out.println("alphabet : ");
        for(int i=0;i<26;i++)
        {
            System.out.printf("%c",alphabet[i]);
        }
        System.out.println(" ");
       //printing the key that is cleaned from any special character or space
       System.out.println("Cleaned key without any special character or space : ");
       printCleanText(keyLetters);
       
       if(keyLetters.size()!=26)
       {
           System.out.println("key should be 26 letters !");
       }
       
       else
       {
           PlaintextLetters=ciphertextLetters;
           int index=0;
           int i=0;
           
           for(Character letter : PlaintextLetters)
       {   
           
            index=keyLetters.indexOf(letter);
            PlaintextLetters.set(i, alphabet[index]);
            i++;
       }
           
           //printing the plaintext
           System.out.println("plaintext :");
           for(Character letter : PlaintextLetters)
           {
               System.out.printf("%c",letter);
           }
           
           System.out.println(" ");
           
       }
       
    }
    
     public static void crack(String ciphertext1)
     {
         ciphertext=ciphertext1;
         char [] ciphertextChar=ciphertext.toCharArray();
         char [] letterFrequencyInOrder1="ETAOINSRHDLUCMFYWGPBVKXQJZ".toCharArray();
          char [] letterFrequencyInOrder2="ETAIONSRHDLUCMFYWGPBVKXQJZ".toCharArray();
          char [] letterFrequencyInOrder3="ETAOISNRHDLUCMFYWGPBVKXQJZ".toCharArray();
           char [] letterFrequencyInOrder4="ETAOINSHRDLUCMFYWGPBVKXQJZ".toCharArray();
          
          String [] letterFrequency={"ETAOINSRHDLUCMFYWGPBVKXQJZ","ETAIONSRHDLUCMFYWGPBVKXQJZ",
              "ETAOISNRHDLUCMFYWGPBVKXQJZ","ETAOINSHRDLUCMFYWGPBVKXQJZ",
          "ETAOINSHRDLCUMFYWGPBVKXQJZ","ETAOINSHRDLUMCFYWGPBVKXQJZ"}; 
          
         char [] alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
         int count []=new int[26] ;
         ArrayList<Character> ciphertextLetters = new ArrayList<Character>();
         
         
         //cleaning the ciphertext from special characters and spaces
        ciphertextLetters = cleanText(ciphertextChar);
        //printing the ciphertext that is cleaned from any special character or space
       System.out.println("Cleaned ciphertext without any special character or space : ");
       printCleanText(ciphertextLetters);
       
       //filling the array with zeros
       for(int i=0;i<26;i++)
       {
           count [i]=0;
       }
       
       //counting letters in the ciphertext
       for(Character letter:ciphertextLetters)
       {
           for(int i=0;i<26;i++)
           {
               if(letter==alphabet[i])
               {
                   count[i]++;
                   break;
               }
                   
           }
               
       }
       
       //ordering counts and letters that are related to them in descending order
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<25;j++)
            {
                if(count[j]<count[j+1])
                {
                    int t=count[j];
                    count[j]=count[j+1];
                    count[j+1]=t;
                    
                    char c=alphabet[j];
                    alphabet[j]=alphabet[j+1];
                    alphabet[j+1]=c;
                }
            }
        }
        
        
       int x;
       for( x=0;x<letterFrequency.length;x++)    
       {   ArrayList<Character> plaintextLetters = new ArrayList<Character>();
           plaintextLetters.addAll(ciphertextLetters);
          // plaintextLetters=ciphertextLetters;//
           System.out.println(" ");
           System.out.printf("Analysis #%d :",x+1);
            char [] letterFrequencyInOrder=letterFrequency[x].toCharArray();
            System.out.println(" ");
            
            //printing letter frequency in descending order
        System.out.printf("%s","substitution letters :       ");
         for(int i=0;i<26;i++)
         {
             System.out.printf("%c",letterFrequencyInOrder[i]);
         }
         
         System.out.println(" ");
         System.out.printf("%s","letters location :           ");
                  for(int i=0;i<26;i++)
         {
             System.out.printf("%c",alphabet[i]);
         }
          
           System.out.println(" ");        
        
        //replacing each letter in the ciphertext with letters store in letterFrequencyInOrder array to obtain plaintext
        int index=0;
        for(Character letter:plaintextLetters)
        {
            for(int i=0;i<26;i++)
            {
                if(letter==alphabet[i])
                {
                    plaintextLetters.set(index, letterFrequencyInOrder[i]);
                    break;
                }
            }
            
            index++;
        }
        
        
           
           //printing the plaintext
           System.out.printf("%s","plaintext :                  ");
           for(Character letter : plaintextLetters)
           {
               System.out.printf("%c",letter);
           }
           
           System.out.println(" ");
       }
        
     }
    
}
