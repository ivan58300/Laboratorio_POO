/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

/**
 *
 * @author ivan5
 */
public class Automovil extends Trasporte implements IAvanzar, IFrenar  {

    private String marca;
    private String modelo;
    private String precio;
    private String color;
    
    //Costructor 
    public Automovil()
    {    
    }
    public Automovil(String marca, String modelo, String precio, String color)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
    }

    public String toString(int i) {
        return i+".- Automovil" + "\nmarca: " + marca + "\nmodelo: " + modelo + "\nprecio: " + precio + "\ncolor: " + color + "\n";
        
    }
    
    //Métodos get y set 
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
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
    
    //método vuelta
    public String Vuelta(String Der_izq){
        return "Vuelta " + Der_izq;
    }

    @Override
    public String Encernder() {
        return "Encendido";
    }

    @Override
    public String Avanzar(int gasolina) {
    
        if( gasolina > 0)
        {
            return "Avanza";
        }else
        {
            return "Falta gasolina para avanzar";
        }
    }

    @Override
    public void frenar() {
        System.out.println("Frenar");
    }
    
   
}

