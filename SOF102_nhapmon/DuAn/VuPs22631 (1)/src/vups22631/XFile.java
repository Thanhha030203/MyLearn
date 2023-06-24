/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vups22631;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Anh Vu
 */
public class XFile {
    JFileChooser fileChooser = new JFileChooser();
    public File openFile(){
    File file = null;
            fileChooser.showOpenDialog(null);
            return file;
    }
    public void saveFile(){
            fileChooser.showSaveDialog(null);
    }
    
}
