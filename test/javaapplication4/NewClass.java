/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import calculatrice.model.Calculatrice;

/**
 *
 * @author Tecno
 */
public class NewClass {
    public static void main(String[] args) {
        Calculatrice cal = new Calculatrice();
        for(int i= 1 ; i<5;i++){
            System.out.println(cal.getTexteLabelResultat(i));
            System.out.println(cal.getTexteLabelResultat('d'));
        }
        
    }
}
