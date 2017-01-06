package com.game.algorithm;

import java.util.*;

public class PokerNim {

	public static void main(String[] args) {
		int T;
        Scanner sc = new Scanner(System.in);
        // read number of test cases
        T = sc.nextInt();
        T = (T>= 1 && T <= 100) ? T : 1;
        while(T > 0){
            int n,k;
            n = sc.nextInt();
            n = (n>= 1 && n <= 100) ? n : 1;
            k = sc.nextInt();
            k = (k>= 1 && k <= 100) ? k : 1;
            
            int[] chips = new int[n];
            int chip = 0;
            for(int i=0;i<n;i++){
            	chips[i] = sc.nextInt();
            	chip = chip ^ chips[i];
            }
            
            if(chip > 0){
            	System.out.println("First");
            } else{
            	System.out.println("Second");
            }
            
            T--;
        }
        sc.close();
	}

}
