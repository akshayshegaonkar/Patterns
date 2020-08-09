package com.pattern.basic;

/*Pattern 1
*
   *
   * *
   * * *
   * * * *

* */
public class Pattern1 {
    public static void main(String[] args) {
        /*First for loop will for rows */
        for (int i=1;i<=4;i++){
            /*First for loop will for column */
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
