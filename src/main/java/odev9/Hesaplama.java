package odev9;

public class Hesaplama {

    public static int hesapla(int a, int b) {
        if (a == b) {
            throw new HesaplamaHatasi();
        }

        if (a < 0 || b < 0) {
            throw new ParametreHatasi();
        }

        return a + b;
    }

	
}
