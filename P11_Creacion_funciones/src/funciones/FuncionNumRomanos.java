package funciones;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Hashtable;
import java.util.Scanner;

public class FuncionNumRomanos {
    public static void convertidorDeNumeroRomanos(){
        Scanner sc = new Scanner(System.in);
        Hashtable<Integer, String> numeroRomano = new Hashtable<Integer, String>();

        numeroRomano.put(1,"I");
        numeroRomano.put(5,"V");
        numeroRomano.put(10,"X");
        numeroRomano.put(50,"L");
        numeroRomano.put(100,"C");
        numeroRomano.put(500,"D");
        numeroRomano.put(1000,"M");



        System.out.println("\n7.- Esta función convierte un numero entero a nuemero romano ");
        System.out.println("Ingrese el numero: ");
        int numero = Integer.valueOf(sc.nextLine());

        if ( numero < 4000 ){
            System.out.print("Su número romano es: ");
            int mod = numero%1000;
            for (int i = 0; i < (numero/1000); i++){
                System.out.print(numeroRomano.get(1000));
            }
            int cMod = mod%100;
            switch (mod/100){
                case 9:
                    System.out.print(numeroRomano.get(100)+numeroRomano.get(1000));
                    break;
                case 8:
                case 7:
                case 6:
                case 5:
                    System.out.print(numeroRomano.get(500));
                    for(int i = 0; i < (mod/100)-5;i++ ){
                        System.out.print(numeroRomano.get(100));
                    }
                    break;
                case 4:
                    System.out.print(numeroRomano.get(100)+numeroRomano.get(500));
                    break;
                case 3:
                case 2:
                case 1:
                    for (int i = 0; i < mod/100; i++){
                        System.out.print(numeroRomano.get(100));
                    }
                    break;
            }
            int dMod = cMod%10;
            switch (cMod/10){
                case 9:
                    System.out.print(numeroRomano.get(10)+numeroRomano.get(100));
                    break;
                case 8:
                case 7:
                case 6:
                case 5:
                    System.out.print(numeroRomano.get(50));
                    for(int i = 0; i < (cMod/10)-5;i++ ){
                        System.out.print(numeroRomano.get(10));
                    }
                    break;
                case 4:
                    System.out.print(numeroRomano.get(10)+numeroRomano.get(50));
                    break;
                case 3:
                case 2:
                case 1:
                    for (int i = 0; i < cMod/10; i++){
                        System.out.print(numeroRomano.get(10));
                    }
                    break;
            }
            switch (dMod){
                case 9:
                    System.out.print(numeroRomano.get(1)+numeroRomano.get(10));
                    break;
                case 8:
                case 7:
                case 6:
                case 5:
                    System.out.print(numeroRomano.get(5));
                    for(int i = 0; i < (dMod)-5;i++ ){
                        System.out.print(numeroRomano.get(1));
                    }
                    break;
                case 4:
                    System.out.print(numeroRomano.get(1)+numeroRomano.get(5));
                    break;
                case 3:
                case 2:
                case 1:
                    for (int i = 0; i < dMod; i++){
                        System.out.print(numeroRomano.get(1));
                    }
                    break;
            }
        }else{
            System.out.println("ingrese un valor menor que 4000 ");
        }
    }
}
