/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author SMK TELKOM
 */
public class Mapel extends Pengajar{
     public String mapel;
    
    public Mapel(String id, String nama, String mapel){
        super(id, nama);
        this.mapel = mapel;
    }
    
    //override
    public void ket(){
        super.ket();
        System.out.println("Mengajar Pelajaran : "+this.mapel);
    }
}
