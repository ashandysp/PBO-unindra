/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2_sepeda;

/**
 *
 * @author fdnuser
 */
public class MainSepeda {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda("S01", "Mountain Bike", 3, 15000);
        Sepeda sepeda2 = new Sepeda("S02", "Sepeda Lipat", 2, 20000);
        
        sepeda1.tampilData();
        sepeda2.tampilData();
    }
}
