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

    private String nev;
    private int pontszam;

    public Player(String nev) {
        this.nev = nev;
        this.pontszam=0;
    }

    public String getNev() {
        return nev;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        return "Palyer{" + "nev=" + nev + ", pontszam=" + pontszam + '}';
    }

}
