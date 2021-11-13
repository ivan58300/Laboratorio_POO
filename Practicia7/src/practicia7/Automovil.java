/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicia7;

/**
 *
 * @author ivan5
 */
public class Automovil {

    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    private String marca;
    private String modelo;
    private String precio;
    
    private void encender (int gas){
        if(gas > 0)
        {
            System.out.println("Automóvil encendido ");
        }
        else 
        {
            System.out.println("Automóvil no enciende por falta de gasolina");
        }
    }
    
    public String alto()
    {
        return "Automóvil se detiene";
    }
    
    public String movimiento(String mov)
    {
        return "Automóvil da vuelta a la "+ mov;
    }
   
    public Automovil ( String marca, String modelo, String precio,int gas  )
    {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.encender(gas);
    }
    public Automovil()
    {
    }
    
    
}
