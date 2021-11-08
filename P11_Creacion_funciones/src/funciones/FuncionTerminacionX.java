package funciones;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Scanner;

public class FuncionTerminacionX {

    public static void terminacionX(){
        System.out.println("\n3.- Encuentra los numeros que terminan en X ");
        Scanner sc = new Scanner(System.in);

        int numero;
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList numerosX = new ArrayList();

        //genera numeros del 1 al 10,000
        for (int i = 0; i < 100; i++){
            numero = (int)(Math.random() * 10000 + 1);
            if(numeros.contains(numero)){
                i--;
            }else {
                numeros.add(numero);
            }
        }
        //buscar numeros que terminan con x
        System.out.println("Digite la teminacion de los numeros ");
        int x = Integer.valueOf(sc.nextLine());
        for (int elemento : numeros){
            if (elemento%10 == x){
                System.out.println(elemento);
            }

        }

    }
}
