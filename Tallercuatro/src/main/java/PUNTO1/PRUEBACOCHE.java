/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PUNTO1;

/**
 *
 * @author luisc
 */
public class PRUEBACOCHE {

    public static void main(String[] args) {
        CLASECOCHE coche1 = new CLASECOCHE();
        coche1.marca = "audi";
        coche1.modelo = "2021";
        coche1.color = "verde";
        coche1.numerodecaballos = (65);
        coche1.numerodepuertas = (4);
        coche1.ConstructorCoches();
        System.out.print( "\n");
        CLASECOCHE coche2 = new CLASECOCHE();
        coche2.marca = "ford";
        coche2.modelo = "2022";
        coche2.color = "azul";
        coche2.numerodecaballos = (100);
        coche2.numerodepuertas = (6);
        coche2.ConstructorCoches();
        System.out.print( "\n");
        CLASECOCHE coche3 = new CLASECOCHE();
        coche3.marca = "BMW.";
        coche3.modelo = "2023";
        coche3.color = "rojo";
        coche3.numerodecaballos = (150);
        coche3.numerodepuertas = (6);
        coche3.ConstructorCoches();
    }
    
}