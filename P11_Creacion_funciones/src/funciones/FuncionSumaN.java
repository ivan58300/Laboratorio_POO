package funciones;

import java.util.Scanner;

public class FuncionSumaN {

    public static void sumaN(){
        double suma = 0;
        System.out.println("\n2.- Ingrese n numeros a sumar (digite 0 para finalizar suma) -");
        Scanner sc = new Scanner(System.in);
        double n;
        do{
            n = Double.valueOf(sc.nextLine());
            suma += n;
        }while (n != 0);
        System.out.println("El resultado de la suma es igual a: " + suma);
    }
}
