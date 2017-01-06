package com.game.algorithm;

import java.util.*;

public class Nimble {

	public static void main(String[] args) {
		int T;
        Scanner sc = new Scanner(System.in);
        // read number of test cases
        T = sc.nextInt();
        T = (T>= 1 && T <= 100) ? T : 100;
        while(T > 0){
            int N;
            // read number of squares
            N = sc.nextInt();
            // create array for squares
            int[] squares = new int[N];
            int val = 0;
            
            for(int i=0;i<N;i++){
            	squares[i] = sc.nextInt();
            	if(squares[i] > 0){
            		val = val ^ (squares[i]%2 == 1 ? i : 0);
            	}
            }
            
            if(val == 0){
            	System.out.println("Second");
            } else{
            	System.out.println("First");
            }
            T--;
        }
        sc.close();
	}
}