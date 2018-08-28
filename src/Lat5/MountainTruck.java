/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat5;

/**
 *
 * @author SMK TELKOM
 */
public class MountainTruck extends Truck{
    public int seatHeight;
    public MountainTruck (int startHeight,int startCadence,int startSpeed,int startGear){
        super(startCadence,startSpeed,startGear);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    public static void main(String[] args) {
        System.out.println("mulai berjalan");
        MountainTruck MB = new MountainTruck(0,0,0,0);
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.gear);
        MB.setGear(2);
        MB.speedup(2);
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.speedup(2);
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
        
    }
}
