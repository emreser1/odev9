package odev9;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTesti {

    @Test
    public void testHesaplamaBasarili() {
        int a = 5;
        int b = 10;

        int sonuc = Hesaplama.hesapla(a, b);

        assertEquals(15, sonuc);
    }

    @Test(expected = HesaplamaHatasi.class)
    public void testHesaplamaHatasi() {
        int a = 5;
        int b = 5;

        Hesaplama.hesapla(a, b);
    }

    @Test(expected = ParametreHatasi.class)
    public void testParametreHatasi1() {
        int a = -1;
        int b = 10;

        Hesaplama.hesapla(a, b);
    }

    @Test(expected = ParametreHatasi.class)
    public void testParametreHatasi2() {
        int a = 5;
        int b = 0;

        Hesaplama.hesapla(a, b);
    }}
