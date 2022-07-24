
import java.util.HashSet;
import javafx.util.converter.NumberStringConverter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author User
 */
public class Hashsetprartice{

   public static void main (String args[]){
       HashSet  <String> student = new HashSet();
   student.add ( "soham" );
   student.add ( "mohan" );
   student.add ( "aksah" );
   student.add ( "sager" );
   System.out.println (student);
    for(String i:student) {
        System.out.println(i);
    }
    
   }
    
}

