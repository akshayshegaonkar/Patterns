package com.pattern.intermediate;
/*
Pattern9
    *
    * *
    * * *
    * * * *
    * * *
    * *
    *

 */
public class Pattern9 {
    public static void main(String[] args) {
        for (int i = 1;i <= 4;i++){
            for (int j = 1;j <= i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int k = 1;k <= 4;k++){
            for (int m = 3;m >= k;m--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
