
import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Msys
 */
public class RailFenceCipher {
    
   static String plaintext;
   static String ciphertext;
   static int key;
   
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
    
    public static void encrypt(String plaintext1,int key1)
    { 
       key=key1;
       plaintext=plaintext1;
       char [] plaintextChar=plaintext.toCharArray();
       ArrayList<Character> PlaintextLetters = new ArrayList<Character>();
       ArrayList<RailFenceColumn> columns = new ArrayList<RailFenceColumn>();
       boolean ascendingIndex=true;
       int index=0;
       int columnIndex=0;
       
       
       //cleaning the plaintext from special characters and spaces
       PlaintextLetters=cleanText(plaintextChar);
       
       //printing the plaintext that is cleaned from any special character or space
       System.out.println("Cleaned plaintext without any special character or space : ");
       printCleanText(PlaintextLetters);
       


       
              for(Character letter : PlaintextLetters)
       {
           RailFenceColumn column=new RailFenceColumn();
           columns.add(column);
           
            if(key==1)
           {
               columns.get(columnIndex).letters.set(0,letter);
           }
            else if(ascendingIndex==true)
           {
               columns.get(columnIndex).letters.set(index,letter);
               index++;
               if(index==key)
               {
                   index-=2;
                   ascendingIndex=false;
                   
               }
           }
               
               else{
                   columns.get(columnIndex).letters.set(index,letter);
                   index--;
                   if(index==-1)
                   {
                       index+=2;
                       ascendingIndex=true;
                       
                   }
               }
           
           columnIndex++;
       }
              
        //printing railfence letters     
       System.out.println("RailFence letters : ");
        
        for(int i=0;i<key;i++)
        {
         for(RailFenceColumn column : columns)
       {   char letter =column.letters.get(i);

               System.out.printf("%c",letter);

       }
            System.out.println(" ");
        }
       
         System.out.println(" ");
         
         
        //printing Ciphertext
        System.out.println("Ciphertext : ");
        
        for(int i=0;i<key;i++)
        {
         for(RailFenceColumn column : columns)
       {   char letter =column.letters.get(i);
           if(letter!= ' ')
           {
               System.out.printf("%c",letter);
           }
       }
          
        }
        
        System.out.println(" ");
        
    }
    
    public static void decrypt(String ciphertext1,int key1)
    {
       key=key1;
       ciphertext=ciphertext1;
       char [] ciphertextChar=ciphertext.toCharArray();
       ArrayList<Character> ciphertextLetters = new ArrayList<Character>();
       ArrayList<RailFenceColumn> columns = new ArrayList<RailFenceColumn>();
       boolean ascendingIndex=true;
       int index=0;
       int columnIndex=0;
       
       //cleaning the ciphertext from special characters and spaces
       ciphertextLetters=cleanText(ciphertextChar);
        
       //printing the ciphertext that is cleaned from any special character or space
       System.out.println("Cleaned ciphertext without any special character or space : ");
       printCleanText(ciphertextLetters);
        
       //determining the locations of the ciphertext letters by putting ones
       for(Character letter : ciphertextLetters)
       {
           RailFenceColumn column=new RailFenceColumn();
           columns.add(column);
           if(key==1)
           {
               columns.get(columnIndex).letters.set(0,'1');
           }
           else if(ascendingIndex==true)
           {
               columns.get(columnIndex).letters.set(index,'1');
               index++;
               if(index==key)
               {
                   index-=2;
                   ascendingIndex=false;
                   
               }
           }
               
               else{
                   columns.get(columnIndex).letters.set(index,'1');
                   index--;
                   if(index==-1)
                   {
                       index+=2;
                       ascendingIndex=true;
                       
                   }
               }
           
           columnIndex++;
       }
       
       //printing ones that are at the locations of the ciphertext letters 
        System.out.println("locations of the lettres in the railfence : ");
        
        for(int i=0;i<key;i++)
        {
         for(RailFenceColumn column : columns)
       {   char letter =column.letters.get(i);

               System.out.printf("%c",letter);
           
       }
            System.out.println(" ");
        }
        System.out.println(" ");
       
        //replacing ones with the ciphertext letters
          int lettersIndex=0;
          for(int i=0;i<key;i++)
        {
         for(RailFenceColumn column : columns)
       {   char letter =column.letters.get(i);
           if(letter == '1')
           {
               char cipherLetter=ciphertextLetters.get(lettersIndex);
               column.letters.set(i,cipherLetter);
               lettersIndex++;
               //System.out.printf("%d ",lettersIndex);
           }
       }
           
        }
          
       //printing the letters in the railfence
        System.out.println("lettres in the Railfence : ");
        
        for(int i=0;i<key;i++)
        {
         for(RailFenceColumn column : columns)
       {   char letter =column.letters.get(i);

               System.out.printf("%c",letter);
           
       }
            System.out.println(" ");
        }
       
       System.out.println(" ");
        //printing the plain text
        System.out.print("Plaintext : ");
       for(RailFenceColumn column : columns)
       {
           for(int i=0;i<key;i++)
           {   
               char c=column.letters.get(i);
               if(c!= ' ')
               {
                   System.out.printf("%c",c);
               }
           }
       }
       
       
    }
    
     public static void crack(String ciphertext1)
     {
         ciphertext=ciphertext1;
         int i;
         for(i=1;i<=10;i++)
         {
             System.out.printf("rail number %d :",i);
             System.out.println(" ");
             decrypt(ciphertext, i);
             System.out.println(" ");
             System.out.println("-------------------------------------------------------------------------------------------");
         }
     }
    
    
    
}


