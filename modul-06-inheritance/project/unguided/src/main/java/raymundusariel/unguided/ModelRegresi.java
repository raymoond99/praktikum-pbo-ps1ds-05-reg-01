/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raymundusariel.unguided;

/**
 *
 * @author ACER
 */
public class ModelRegresi extends ModelML {
    private int jumlahFitur;

    public ModelRegresi(String nama, int dataLatih, int jumlahFitur) {
        super(nama, dataLatih);
        this.jumlahFitur = jumlahFitur;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah fitur: " + this.jumlahFitur);
    }

    @Override
    public int hitungBiaya() {
        return super.hitungBiaya() + (this.jumlahFitur * 10);
    }

    public int hitungBiaya(int epoch, int ukuranBatch) {
        return (getDataLatih() * epoch) / ukuranBatch;
    }
}