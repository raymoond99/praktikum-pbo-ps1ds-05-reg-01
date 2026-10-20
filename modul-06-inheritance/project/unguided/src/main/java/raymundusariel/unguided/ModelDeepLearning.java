/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raymundusariel.unguided;

/**
 *
 * @author ACER
 */
public class ModelDeepLearning extends ModelKlasifikasi {
    private int jumlahLayer;

    public ModelDeepLearning(String nama, int dataLatih,
                             int jumlahKelas, int jumlahLayer) {
        super(nama, dataLatih, jumlahKelas);
        this.jumlahLayer = jumlahLayer;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah layer: " + this.jumlahLayer);
    }

    @Override
    public int hitungBiaya() {
        return super.hitungBiaya() + (this.jumlahLayer * 200);
    }
}