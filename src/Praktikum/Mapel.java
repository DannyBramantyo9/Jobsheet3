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
public class Mapel extends sekolah{
    public String pengajar;
    public int idMapel;
  
    public void setIdMapel(int idMapel){
        this.idMapel = idMapel;
    }
    public void setPengajar(String pengajar){
        this.pengajar=pengajar;
    }
    public void setnamaSekolah (String namaSekolah){
        super.namaSekolah = namaSekolah;
    }
    public void setAlamat (String alamat){
        super.alamat = alamat;
    }
    public void setTelp ( String Telp){
        super.telp = Telp;
    }
    
}
