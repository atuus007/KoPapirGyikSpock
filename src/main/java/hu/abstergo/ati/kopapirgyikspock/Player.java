/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.abstergo.ati.kopapirgyikspock;

/**
 *
 * @author Ati
 */
public class Player {

    private static String nev1, nev2, valast;
    private static int pontszam_p1, pontszam_p2;

    public static void setNev1(String nev1) {
        Player.nev1 = nev1;
    }

    public static void setNev2(String nev2) {
        Player.nev2 = nev2;
    }
    public static String getNev1() {
        return nev1;
    }
     public static String getNev2() {
        return nev2;
    }
    public static int getPontszam1() {
        return pontszam_p1;
    }
    public static int getPontszam2() {
        return pontszam_p2;
    }
    public static void setPontszam1(int pontszam) {
        Player.pontszam_p1 = pontszam;
    }
    public static void setPontszam2(int pontszam) {
        Player.pontszam_p2 = pontszam;
    }

   

}
