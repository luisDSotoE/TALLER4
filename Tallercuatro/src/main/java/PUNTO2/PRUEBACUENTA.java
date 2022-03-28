/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PUNTO2;


public class PRUEBACUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         CUENTA cuenta1 = new CUENTA();
        cuenta1.noCuenta = (594867);
        cuenta1.nombreCaliente = "jose";
        cuenta1.Saldo = (2000000);
        cuenta1.Consignar = (500000);
        cuenta1.retirar = (1000000);
        cuenta1.CUENTA00();
        System.out.print( "\n");
        CUENTA cuenta2 = new CUENTA();
        cuenta2.noCuenta = (985438);
        cuenta2.nombreCaliente = "andres";
        cuenta2.Saldo = (4000000);
        cuenta2.Consignar = (700000);
        cuenta2.retirar = (3000000);
        cuenta2.CUENTA00();
        
    }
    
}
