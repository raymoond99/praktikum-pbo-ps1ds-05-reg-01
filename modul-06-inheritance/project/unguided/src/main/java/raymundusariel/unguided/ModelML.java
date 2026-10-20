/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package raymundusariel.unguided;

/**
 *
 * @author ACER
 */
public class ModelML {
    private String nama;
    private int dataLatih;

    public ModelML(String nama, int dataLatih) {
        this.nama = nama;
        this.dataLatih = dataLatih;
    }

    public int getDataLatih() {
        return this.dataLatih;
    }

    public void tampilkanInfo() {
        System.out.println("Model: " + this.nama
                + " | Data latih: " + this.dataLatih);
    }

    public int hitungBiaya() {
        return this.dataLatih * 2;
    }

    public int hitungBiaya(int epoch) {
        return this.dataLatih * epoch;
    }
}