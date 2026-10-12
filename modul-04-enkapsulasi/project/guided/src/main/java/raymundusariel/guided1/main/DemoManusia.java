/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raymundusariel.guided1.main;

import raymundusariel.guided1.manusia.Manusia;

/**
 *
 * @author ACER
 */
public class DemoManusia {
    public static void main(String[] args){
        Manusia arrMns[] = new Manusia[3];

        //Cons pertama
        Manusia objMns1 = new Manusia();

        //Cons kedua
        Manusia objMns2 = new Manusia("Ignatius Loyola");

        //Cons ketiga
        Manusia objMns3 = new Manusia("Aloysius Gonzaga", 17);

        arrMns[0] = objMns1;
        arrMns[1] = objMns2;
        arrMns[2] = objMns3;

        for (int i=0; i<3; i++){
            System.out.println("Nama:  " + arrMns[i].getNama());
            System.out.println("Umur:  " + arrMns[i].getUmur());
            System.out.println();
        }
    }
}