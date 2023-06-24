/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1Lab6;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Admin
 */
public class NewClass {
        JFileChooser filechoose = new JFileChooser();
         public File openFile(){ 
             File file = null ;
             filechoose.showOpenDialog(null);
             return file;
         }
           public void saveFile(){ 
             filechoose.showSaveDialog(null);
         }
    }
    

