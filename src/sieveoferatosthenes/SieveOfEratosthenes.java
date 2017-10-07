/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sieveoferatosthenes;

import java.util.ArrayList;

/**
 *
 * @author Eranga
 */
public class SieveOfEratosthenes {
    
    public ArrayList<Integer> getPrimes(int limit) {
        int sqrt = (int)Math.round(Math.sqrt(limit));
        boolean[] array = new boolean[limit];
        ArrayList<Integer> primes = new ArrayList();
        for (int i=2; i<sqrt; i++) {
            if(!array[i]) {
                primes.add(i);
                int square = i*i;
                int count = 1;
                for (int j= square; j<limit; j=j+count*i){
                    array[j]=true;
                }
            }
        }
        for (int i=sqrt; i<limit; i++) {
            if(!array[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
    
}
