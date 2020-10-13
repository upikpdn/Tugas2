package com.fauziyah.tugas2;

public class DemoClub {
    public static void main(String[] args) {
        Club club1 = new Club();
        Club club2 = new Club("Perburjoan");
        Club club3 = new Club("Perburjoan", "Ada Burjo di Sepatumu");
        Club club4 = new Club("Perburjoan", 2011, "Mana Aja Boleh");
        Club club5 = new Club("Perburjoan", 2011, "Mana Aja Boleh", 03, "Ada Burjo di Sepatumu");

        club1.getTeam();
        club2.getTeam();
        club3.getTeam();
        club4.getTeam();
        club5.getTeam();
    }
}
