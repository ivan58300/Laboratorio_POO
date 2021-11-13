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
public class Contacto {

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public int getTel() {
        return tel;
    }
    public void setTel(int tel) {
        this.tel = tel;
    }
    
    private String nom;
    private String mail;
    private int tel;
    
    public Contacto(String nom, String mail,int tel){
        this.nom = nom;
        this.mail = mail;
        this.tel = tel;
    }
    
    //metodo agregar 
    public void agregarContacto()
    {
        System.out.println("Nmbre");
        
    }
}
