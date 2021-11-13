/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author ivan5
 */
public class Telefono extends DispositivoElectronico implements IWifiConexion , IMessages, IVideoCalls {

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the marca
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    private String marca;
    private String precio; 
    private String color;
    private String modelo;
    
    public Telefono(String marca, String precio, String modelo,String color)
    {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.color = color;
        
    }
    public void iniciarllamada( Contacto c ){
        System.out.println("Llamando a " + c.getNom()); 
    }
    
    private int iniciarllamada(int numero){
        return numero;
    }
    
    public String finalizarLlamada()
    {
        return "Llamada finalizada...";
    }

    @Override
    public void encender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String apagar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String setPasswordWF(String psswd) {
        
        if (psswd.isEmpty()){
           return "False";
        }else{
           return "True";
        }
        
        
    }

    @Override
    public String enviarMensaje(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String removerMensaje(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String iniciarVideoCalls() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String finalizarVideoCalls() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Telefono\n" + "marca=" + marca + ", precio=" + precio + ", color=" + color + ", modelo=" + modelo ;
    }
    
}
    
