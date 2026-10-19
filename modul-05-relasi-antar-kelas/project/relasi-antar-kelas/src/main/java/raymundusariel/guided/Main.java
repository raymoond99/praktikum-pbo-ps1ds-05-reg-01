
package raymundusariel.guided;

import raymundusariel.guided.guided2.*;
import raymundusariel.guided.guided3.*;

public class Main {
    public static void main(String[] args) {
        runGuided2();
        runGuided3();
    }

    public static void runGuided2() {
        raymundusariel.guided.guided2.Mahasiswa m1 =
                new raymundusariel.guided.guided2.Mahasiswa(
                        "103132430021", "Raymundus Ariel Abas");

        raymundusariel.guided.guided2.Mahasiswa m2 =
                new raymundusariel.guided.guided2.Mahasiswa(
                        "103132430022", "Keyla Azzahra");

        raymundusariel.guided.guided2.Jurusan jur =
                new raymundusariel.guided.guided2.Jurusan(
                        "DS", "Data Science");

        jur.AddMahasiswa(m1);
        jur.AddMahasiswa(m2);

        jur.DisplayMahasiswa();
    }

    public static void runGuided3() {
        raymundusariel.guided.guided3.Komputer pc =
                new raymundusariel.guided.guided3.Komputer(
                        "Intel Core i5", 3200,
                        "LG 24 Inch", "Logitech", "Wireless");

        pc.displaySpecKomputer();
    }
}
