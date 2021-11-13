/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author ivan5
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PastorAleman pa = new PastorAleman();
        Chihuahua chi = new Chihuahua();
        Persa per = new Persa();
        Siames sia = new Siames();
        Perico peri = new Perico();
        Canario can = new Canario();
        
        System.out.println("\t- Pastor aleman -");
        System.out.println(pa.ladrar());
        System.out.println(pa.caminar());
        System.out.println(pa.Correr());
        System.out.println(pa.tamaño());
        
        System.out.println("\n\t- Chihuahua -");
        System.out.println(chi.ladrar());
        System.out.println(chi.caminar());
        System.out.println(chi.Correr());
        System.out.println(chi.tamaño());
        
        System.out.println("\n\t- Persa -");
        System.out.println(per.maullido());
        System.out.println(per.brinca());
        System.out.println(per.complecion());
        System.out.println(per.fuerza());
    
        System.out.println("\n\t- Siames -");
        System.out.println(sia.maullido());
        System.out.println(sia.brinca());
        System.out.println(sia.agil());
        System.out.println(sia.fuerza());
        
        System.out.println("\n\t- Perico -");
        System.out.println(peri.volar());
        System.out.println(peri.ataca());
        System.out.println(peri.hablar());
        
        System.out.println("\n\t- Canario -");
        System.out.println(can.volar());
        System.out.println(can.cantar());
        System.out.println(can.complecion());
    }
    
}
