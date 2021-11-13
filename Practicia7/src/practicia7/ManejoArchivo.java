/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicia7;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ivan5
 */
public class ManejoArchivo {
    public void readFile(File fname) {

        FileReader fr = null;
        try
        {
            fr = new FileReader(fname);
            int i;
            while((i=fr.read())!=-1)
                a[] = i.split(',');
               
                aut.seMarca(a[0])
                System.out.println((char)i);
           
        }
        catch
           (FileNotFoundException ex){
            System.out.println("Algo Salio mal");
        }
        catch (IOException e)
        {
            System.out.println("Algo Salio doblemente mal");
        }
    }
}
