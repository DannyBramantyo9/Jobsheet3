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
public class Web extends Mapel{
    public String Modul;
    
    public void setModul(String Modul){
        this.Modul=Modul;
    }
    public void setIdMapel(String IdMapel){
        super.idMapel=idMapel;
    }
    public void setPengajar(String Pengajar){
        super.pengajar=pengajar;
    }
    public void tampilkan(){
        System.out.println("Berikut ini adalah data yang anda inginkan");
        System.out.println("Nama Sekolah  = "+namaSekolah);
        System.out.println("Telepon = "+telp);
        System.out.println("Mapel = "+idMapel);
        System.out.println("Pengajar = "+pengajar);
        System.out.println("Modul = "+Modul);
        System.out.println("Makasih");
        
        
    }
    public static void main(String[] args) {
        Web web = new Web();
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan ID Mapel : ");
        String IdMapel = masukan.next();
        System.out.println("Pengajar : ");
        String pengajar = masukan.next();
        
        web.setIdMapel(IdMapel);
        web.setPengajar(pengajar);
        web.setModul(IdMapel);
    }
}
