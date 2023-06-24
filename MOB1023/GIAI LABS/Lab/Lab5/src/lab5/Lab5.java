/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Minh Man
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException , FileNotFoundException, ClassNotFoundException {
        // TODO code application logic here
       List<Student> list = new ArrayList<>(); 
         list.add (new Student ("An",5.4,"UD")) ;
           list.add (new Student ("Binh",7.8,"TK")) ;
             list.add (new Student ("Hung",9.2,"MB")) ;
//             XFile x = new XFile ();
             XFile.writeObject("c:/temp/Students.dat",list );
              List<Student>  list1 = ( List<Student>)XFile.readObject("c:/temp/Students.dat");
             for (Student sv:list){
                 System.out.println("Họ và Tên : "+sv.name);
             }
    }
    
}
