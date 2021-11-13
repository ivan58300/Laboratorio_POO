/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_4;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;

/**
 *
 * @author ivan5
 */
public class Strings {

    public String[] getPalabra1() {
        return palabra1;
    }
    public void setPalabra1(String palabra1[]) {
        this.palabra1 = palabra1;
    }
    public String[] getPalabra2() {
        return palabra2;
    }
    public void setPalabra2(String palabra2[]) {
        this.palabra2 = palabra2;
    }
    
    
    private String palabra1[];
    private String palabra2[];
    
    public Strings(){
        
    }
    public Strings(String palabra1[]){
        this.palabra1 = palabra1;
    }
    public Strings(String palabra1[], String palabra2[]){
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
    }
    
    // cadena = c-a-d-e-n-a
    public String[] guion(String palabra1[]){
        int size,i;
        size = length(palabra1);
        
        String new_word[] = null;
        
        for(i = 0; i < size; i+=2)
        {
            new_word[i] = palabra1[i];
            new_word[i+1] = "-"; 
        }
        return new_word;
        
    }

    




}
