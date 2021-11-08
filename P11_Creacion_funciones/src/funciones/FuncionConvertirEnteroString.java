package funciones;

import java.util.Scanner;

public class FuncionConvertirEnteroString {
    public static void convertirIntString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.- Ingrese el numero o String a convertir en su viceversa -");
        System.out.println("\nString a int : ");
        String str = sc.nextLine();
        System.out.println("El String " + str + " es un int " + convertirIntString(str));
        System.out.println("\nint a String : ");
        int n = sc.nextInt();
        System.out.println("El Int " + n + " es un String " + convertirIntString(n));

    }

    // Método genérico convertir de int  a string
    public  static  String convertirIntString( int dato ){
        String enteroString = Integer.toString(dato);
        return enteroString;
    }
    // Metodo genérico convertir de String a int
    public  static  int convertirIntString( String  dato ){
        int  entero = Integer.parseInt(dato);
        return entero;
    }

}
