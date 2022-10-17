
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Msys
 */
public class RailFenceColumn {
    
     ArrayList<Character> letters = new ArrayList<Character>();
     int railsCount;
     
     RailFenceColumn ()
     {
         railsCount=RailFenceCipher.key;
         for(int i=0;i<railsCount;i++)
         {
             letters.add(' ');
         }
     }
}
