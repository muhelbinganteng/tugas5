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
class Rekursi {
    char[] listHeksa
            = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f'};

    void desimalToHeksa(int n) {
        if (n > 1) {
            desimalToHeksa(n / 16);
        }
        System.out.print(listHeksa[n % 16]);
    }
}

