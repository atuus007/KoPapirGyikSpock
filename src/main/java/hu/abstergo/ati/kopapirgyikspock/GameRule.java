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
public class GameRule {
    public String v1, v2;
    public GameRule(String valasz1, String valasz2){
        this.v1=valasz1;
        this.v2=valasz2;
        
    }
    public String rule(){
        if(v1.equals("Kő")&&(v2.equals("Olló")||v2.equals("Gyík"))){
            Player.setPontszam1(Player.getPontszam1()+1);
            return Player.getNev1();
        }else {
             return Player.getNev2();
        }
    }
}
