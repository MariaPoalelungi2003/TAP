class ClasaDeBaza {
    private int x;

    public ClasaDeBaza(int x) {
        this.x = x;
        System.out.println("Constructor cu un parametru din clasa de baza");
    }

    public ClasaDeBaza() {
        this(0);
        System.out.println("Constructor fără parametri din clasa de baza");
    }

    public ClasaDeBaza(int x, int y) {
        this(x);
        System.out.println("Constructor cu doi parametri din clasa de baza");
    }

    public void metoda1() {
        System.out.println("Metoda 1 din clasa de baza");
    }

    public void metoda2() {
        System.out.println("Metoda 2 din clasa de baza");
    }
}

class ClasaDerivata extends ClasaDeBaza {
    private int y;

    public ClasaDerivata() {
        super();
        System.out.println("Constructor fără parametri din clasa derivata");
    }

    public ClasaDerivata(int y) {
        super(y);
        this.y = y;
        System.out.println("Constructor cu un parametru din clasa derivata");
    }

    public ClasaDerivata(int x, int y) {
        super(x, y);
        System.out.println("Constructor cu doi parametri din clasa derivata");
    }

    @Override
    public void metoda2() {
        super.metoda2();
        System.out.println("Metoda 2 suprascrisa din clasa derivata");
    }

    public void metoda3() {
        System.out.println("Metoda 3 din clasa derivata");
    }
}

public class Main {
    public static void main(String[] args) {
        ClasaDeBaza obiectBaza1 = new ClasaDeBaza(5);
        System.out.println();

        ClasaDerivata obiectDerivat1 = new ClasaDerivata(10);
        System.out.println();

        ClasaDerivata obiectDerivat2 = new ClasaDerivata(20, 30);
        System.out.println();

        ClasaDeBaza obiectBaza2 = new ClasaDerivata(40, 50);
        System.out.println();

        obiectBaza1.metoda1();
        obiectBaza1.metoda2();
        System.out.println();

        obiectDerivat1.metoda1();
        obiectDerivat1.metoda2();
        obiectDerivat1.metoda3();
        System.out.println();

        obiectDerivat2.metoda1();
        obiectDerivat2.metoda2();
        obiectDerivat2.metoda3();
        System.out.println();

        obiectBaza2.metoda1();
        obiectBaza2.metoda2();
    }
}
