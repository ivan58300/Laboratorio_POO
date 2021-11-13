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
public class Gato {
    
    private String raza;
    
    //get y set de raza
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    
    public String maullido(){
        return "Gato maulla";
    }
    public String brinca(){
        return "Gato brinca";
    }
    
}
