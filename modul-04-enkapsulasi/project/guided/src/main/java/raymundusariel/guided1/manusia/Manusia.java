/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raymundusariel.guided1.manusia;

/**
 *
 * @author ACER
 */
public class Manusia {
    //definisi atribut ([Akses modifier] [Data Type] [Nama atribut])
    private String nama;
    private int umur;

    //4.2 constructor
    //default
    public Manusia(){};
    //bukan default
    public Manusia(String nama){
        this.nama = nama;
    }
    public Manusia(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    //method setter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }

    //method getter
    public String getNama(){
        return nama;
    }
    public int getUmur(){
        return umur;
    }
}