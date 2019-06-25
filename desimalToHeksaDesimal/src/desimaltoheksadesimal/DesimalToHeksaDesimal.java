/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desimaltoheksadesimal;

/**
 *
 * @author Muh. Elbin
 */
public class DesimalToHeksaDesimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rekursi rk = new Rekursi();
        System.out.print("Bentuk heksaDesimal dari " + 1 + " :");
        rk.desimalToHeksa(1);
        System.out.println("");
        System.out.print("Bentuk heksaDesimal dari " + 18 + " :");
        rk.desimalToHeksa(18);
        System.out.println("");
        System.out.print("Bentuk heksaDesimal dari " + 200 + " :");
        rk.desimalToHeksa(200);
        System.out.println("");
        System.out.print("Bentuk heksaDesimal dari " + 1000 + " :");
        rk.desimalToHeksa(1000);
        System.out.println("");
        System.out.print("Bentuk heksaDesimal dari " + 2000 + " :");
        rk.desimalToHeksa(2000);
        System.out.println("");

    }
}
