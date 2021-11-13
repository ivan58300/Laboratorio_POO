/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_4;

import static com.sun.xml.internal.messaging.saaj.packaging.mime.util.ASCIIUtility.getBytes;
import java.util.Arrays;
import static sun.security.krb5.Confounder.bytes;

/**
 *
 * @author ivan5
 */
public class Practica_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Strings palabra = new Strings();
        
        palabra.setPalabra1("jolas");
        
        System.out.println(Arrays.toString(palabra.guion(palabra.getPalabra1())));
    }
    
}
