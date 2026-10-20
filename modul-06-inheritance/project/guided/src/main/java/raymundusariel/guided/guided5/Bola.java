/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raymundusariel.guided.guided5;

/**
 *
 * @author ACER
 */
public class Bola extends Lingkaran {
    private int jarijari; // Sesuai class diagram

    // Override method getLuas() dari class Lingkaran
    @Override
    public int getLuas() {
        // Rumus luas permukaan bola: 4 * PI * r^2
        int r = super.getJarijari(); 
        return (int) (4 * Math.PI * r * r);
    }

    // Method baru khusus class Bola
    public int getVolume() {
        // Rumus volume bola: (4/3) * PI * r^3
        int r = super.getJarijari();
        return (int) ((4.0 / 3.0) * Math.PI * Math.pow(r, 3));
    }
}