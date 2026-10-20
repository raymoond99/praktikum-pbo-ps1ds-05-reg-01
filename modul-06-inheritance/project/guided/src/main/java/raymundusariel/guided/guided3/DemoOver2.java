package raymundusariel.guided.guided3;

public class DemoOver2 {
    public static void main(String[] args) {
        Lagu d, e;
        d = new Lagu();
        e = new Lagu();

        d.IsiParam("Lagu 1");
        e.IsiParam("Lagu 2", "aku");

        d.Tampilkan();
        e.Tampilkan();
    }
}