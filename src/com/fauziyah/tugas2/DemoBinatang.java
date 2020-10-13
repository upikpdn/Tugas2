package com.fauziyah.tugas2;

public class DemoBinatang {
    public static void main(String[] args) {
        Binatang superclass = new Binatang();
        Burung subclass = new Burung();
        Ikan subbclass = new Ikan();
        Kucing subclasss = new Kucing();

        System.out.println("Sifat - Sifat Binatang :\n");
        superclass.getNama("Babon Gorila");
        System.out.println();
        subclass.getNama("Burung Nuri");
        subclass.buwung();
        System.out.println();
        subbclass.getNama("Ikan Bantal");
        subbclass.iwak();
        System.out.println();
        subclasss.getNama("Kucing Italia");
        subclasss.kuciang();
    }
}
