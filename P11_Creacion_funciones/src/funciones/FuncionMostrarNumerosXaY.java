package funciones;

import java.util.Scanner;

public class FuncionMostrarNumerosXaY {
    public static void mostrarXYConWhile(){
        System.out.println("\n4.- Mostar los numeros de X a Y con while. - ");
        System.out.println("Ingrese el valor para x : ");
        Scanner sc = new Scanner(System.in);
        int x = Integer.valueOf(sc.nextLine());
        System.out.println("ingrese el valor para y :");
        int y = Integer.valueOf(sc.nextLine());

        while(x <= y ){
            System.out.println(x);
            x++;
        }
    }
    public static void mostrarXYConDoWhile(){
        System.out.println("\n5.- Mostar los numeros de X a Y con do...while. - ");
        System.out.println("Ingrese el valor para x : ");
        Scanner sc = new Scanner(System.in);
        int x = Integer.valueOf(sc.nextLine());
        System.out.println("ingrese el valor para y :");
        int y = Integer.valueOf(sc.nextLine());

        do{
            System.out.println(x);
            x++;
        }while(x <= y);
    }
    public static void mostrarXYConFor(){
        System.out.println("\n6.- Mostar los numeros de X a Y con For - ");
        System.out.println("Ingrese el valor para x : ");
        Scanner sc = new Scanner(System.in);
        int x = Integer.valueOf(sc.nextLine());
        System.out.println("ingrese el valor para y :");
        int y = Integer.valueOf(sc.nextLine());

        for(int i = x; x <= y;x++ ){
            System.out.println(x);
        }
    }

}
