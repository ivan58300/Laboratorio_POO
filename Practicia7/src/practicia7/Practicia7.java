package practicia7;

import java.util.ArrayList;
import java.util.Scanner;

public class Practicia7 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <Automovil> al = new ArrayList<> (10);
        
        Automovil aut = new Automovil();
        int i, gasolina;
        String marca, modelo, precio, vuelta;
        for(i = 0; i < 10; i++)
        {
            System.out.println("Ingrese la marca del auto: ");
            marca = sc.next();
            System.out.println("Ingrese el modelo del auto: ");
            modelo = sc.next();
            System.out.println("Ingrese el precio del auto: ");
            precio = sc.next();
            System.out.println("Ingrese la cantidad de gasolina que cueta el vehiculo: ");
            gasolina = sc.nextInt();
            /*if(gasolina > 0 )
            {
                System.out.println("hacia donde quiere dar vuelta: ");
                vuelta = sc.next();
                aut.movimiento(vuelta);
            }
            */
            aut.setMarca(marca);
            aut.setModelo(modelo);
            aut.setPrecio(precio);
            al.add(aut);
        }
        
        for(Automovil elem : al)
        {
            elem.getMarca();
            elem.getModelo();
            elem.getPrecio();
           // elem.movimiento(vuelta);
        }
        
        
    }
    
}
