/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raymundusariel.guided.guided5;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.setJarijari(7);

        System.out.println("Jari-jari: " + bola.getJarijari());
        System.out.println("Luas Permukaan Bola (Override): " + bola.getLuas());
        System.out.println("Volume Bola: " + bola.getVolume());
        System.out.println("Luas Lingkaran (Overload): " + bola.getLuas(7));
    }
}