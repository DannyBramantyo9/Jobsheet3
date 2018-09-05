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
public class Waktu extends Mapel{
        private String waktu;
    
    public Waktu(String id, String nama, String mapel, String waktu){
        super(id, nama, mapel);
        this.waktu = waktu;
    }
    
    //override
    public void ket() {
        super.ket();
        System.out.println("Waktu Pelajaran : "+this.waktu);
        
    }
}
