
package raymundusariel.guided.guided3;

public class Main {
    public static void main(String[] args) {
        runKomposisi();
    }

    public static void runKomposisi() {
        Komputer pc = new Komputer(
            "Intel Core i7",
            3200,
            "LG UltraGear",
            "Logitech",
            "Wireless"
        );

        pc.displaySpecKomputer();
    }
}
