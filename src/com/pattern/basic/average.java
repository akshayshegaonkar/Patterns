package com.pattern.basic;

public class average {
    public static void main(String[] args) {
        int sum = 0; int avg = 0;int count = 0;
        for (int  i = 1; i <= 10; i++){
            if (i % 2 == 0){
                sum += i;
                count++;
                System.out.println("Even No are "+i);
            }

        }
        avg = sum/count;
        
        System.out.println("Even No count "+count);
        System.out.println("Even No Sum is "+sum);
        System.out.println("Even No avg is "+avg);
    }
}
