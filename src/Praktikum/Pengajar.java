/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author SMK TELKOM
 */
public class Pengajar {
    private String id;
    private String nama;
   
    
    public Pengajar (String id, String nama){
        this.id=id;
        this.nama=nama;
      
    }
    
    public void ket(){

        System.out.println("ID     : "+this.id);
        System.out.println("NAMA   : "+this.nama);
        
    }
}
