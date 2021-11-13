
package practica6;

import java.util.Scanner;


public class Practica6 {

    public static void main(String args[])
    {
        Scanner sn = new Scanner(System.in);
        
        Automovil listaAuto[]  = new Automovil[10];
        
        
        
        int i,opc,gasolina ;
        String direccion;
        
        listaAuto[0] = new Automovil("ford", "x", "150,000","rojo");
        listaAuto[1] = new Automovil("a", "y", "140,000","azul");
        listaAuto[2] = new Automovil("b", "z", "130,000","verde");
        listaAuto[3] = new Automovil("c", "x", "120,000","rojo");
        listaAuto[4] = new Automovil("d", "y", "110,000","amarillo");
        listaAuto[5] = new Automovil("e", "z", "100,000","negro");
        listaAuto[6] = new Automovil("f", "x", "90,000","azul");
        listaAuto[7] = new Automovil("g", "y", "80,000","gris");
        listaAuto[8] = new Automovil("h", "z", "70,000","rojo");
        listaAuto[9] = new Automovil("i", "x", "60,000","naranja");
        
        for( i = 0; i < 10; i++)
        {
            System.out.println(listaAuto[i].toString(i+1));
            do
            {
                System.out.println("¿Qué desea hacer ?");
                System.out.println("1) Encender "+
                                    "\n2) Avanzar "+
                                    "\n3) Vuelta "+
                                    "\n4) Frenar "+
                                    "\n0) Salir ");
                opc = sn.nextInt();
                
                switch(opc)
                {
                    case 0:
                        break;
                    case 1:
                        System.out.println(listaAuto[i].Encernder());
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad de gasolina que contiene el tanque en litros");
                        gasolina = sn.nextInt();
                        System.out.println(listaAuto[i].Avanzar(gasolina));
                        break;
                    case 3:
                        System.out.println("¿Hacía donde quiere dar vuelta izquierda o derecha?\ningrese:");
                        direccion = sn.next();
                        System.out.println(listaAuto[i].Vuelta(direccion));
                        break;
                    case 4:
                        listaAuto[i].frenar();
                        break;
                    default:
                        System.out.println("Ingrese un valor valido");
                }
            }while(opc != 0);
            
            
        }
        
    }
    
}
