/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raymundusariel.guided.guided5;

/**
 *
 * @author ACER
 */
public class Lingkaran {
    private int jarijari;

    public void setJarijari(int jarijari) {
        this.jarijari = jarijari;
    }

    public int getJarijari() {
        return this.jarijari;
    }

    // Method getLuas tanpa parameter
    public int getLuas() {
        return (int) (Math.PI * jarijari * jarijari);
    }

    // Overload method getLuas dengan parameter
    public int getLuas(int jarijari) {
        return (int) (Math.PI * jarijari * jarijari);
    }
}