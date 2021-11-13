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
//heredar
public class Perro extends Animal {
    
    private String raza;
    
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    public String ladrar(){
        return "Perro ladrando";
    }
    
    public String caminar(){
        return "Perro camina";
    }
    public Perro(){
        
    }
}
