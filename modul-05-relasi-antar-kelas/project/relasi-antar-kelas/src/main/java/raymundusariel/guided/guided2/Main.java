/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raymundusariel.guided.guided2;

/**
 *
 * @author ACER
 */

public class Main {
    public static void main(String[] args) {
        // Objek Mahasiswa berdiri sendiri
        Mahasiswa mhs1 = new Mahasiswa("103132430021", "Raymundus Ariel Abas");
        Mahasiswa mhs2 = new Mahasiswa("103132430021", "Keyla Azzahra");

        // Objek Jurusan menampung referensi objek Mahasiswa (Agregasi)
        Jurusan jur = new Jurusan("DS", "Data Science");
        jur.AddMahasiswa(mhs1);
        jur.AddMahasiswa(mhs2);

        jur.DisplayMahasiswa();
    }
}
