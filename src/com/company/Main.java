package com.company;

import java.util.Scanner;

public class Main {
    public static String Is_even(int x){
        if(x%2==0 && x!=2){
            return ("YES");
        }else{
            return ("NO");
        }
    }

    public static void main(String[] args) {
	int x;
        Scanner n = new Scanner(System.in);
        x= n.nextInt();
        String y= Is_even(x);

    }
}
