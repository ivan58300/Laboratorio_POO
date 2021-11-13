/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;
import java.util.Scanner;

/**
 *
 * @author ivan5
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        
        Telefono listaTelefono[]  = new Telefono[5];
        Contacto listaContacto[]  = new Contacto[5];
        
        String marca,precio,modelo,color,pwwf;
        String nombre,mail;
        int telefono,i,j,res,opc,inc;
                
        
        for(i = 0; i < 2; i++)
        {
            System.out.println("\t-- Telefono --");
            System.out.println("Marca: ");
            marca = sn.next();
            System.out.println("precio");
            precio = sn.next();
            System.out.println("Modelo: ");
            modelo = sn.next();
            System.out.println("color:");
            color = sn.next();
            
            
            listaTelefono[i] = new Telefono(marca,precio, modelo, color);
            
            System.out.println("\nAgregar contacto");
            for(j = 0; j < 2; j++)
            {
                System.out.println("\n\t-- Contacto Nuevo --");
                System.out.println("Nombre: ");
                nombre = sn.next();
                System.out.println("Telefono: ");
                telefono = sn.nextInt();
                System.out.println("Mail; ");
                mail = sn.next();
                listaContacto[j] = new Contacto(nombre,mail,telefono);
                
            }
            
            
            listaTelefono[i].toString();
            System.out.println("\n\t-- lista de contactos --");
            for(int k = 0; k < 2; k ++){
                System.out.println(k+1 + ") Nombre: " + listaContacto[k].getNom() + " Telefono: "+ listaContacto[k].getTel());
                listaTelefono[i].toString();
            }
            System.out.println("\t-- menu --");
            System.out.println("1) llamar a ...");
            System.out.println("2) apagar");
            System.out.println("3) encender");
            System.out.println("4) enviar mensanje");
            System.out.println("5) video llamada");
            System.out.println("6) remover mensaje ");
            System.out.println("Digite la opcion que desea realizar: ");
            
            res = sn.nextInt();
            
            switch(res)
            {
                case 1: 
                    System.out.println("Elija el inciso del contacto a llamar");
                    opc = sn.nextInt();
                    listaTelefono[i].iniciarllamada(listaContacto[opc-1]);
                    System.out.println("Digite 0 para finalizar la llamada ");
                    inc = sn.nextInt();
                    if(inc == 0){
                        listaTelefono[i].finalizarLlamada();
                    }
                        
                    
            }
            
        }
        
        
        
        
    }

    
}
