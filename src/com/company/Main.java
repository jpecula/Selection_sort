package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 2, 5, 8, 3, 2, 5, 6};
        int min;
        int minPosition = 0;
        boolean swapped = true;
        for (int i = 0; i <numbers.length; i++){
            min = numbers[i];
            swapped = false;
            for (int x = i; x < numbers.length;x++){
                if(numbers[x] < min){
                    min = numbers[x];
                    minPosition = x;
                    swapped = true;
                }
            }
            if(swapped){
                numbers[minPosition]= numbers[i];
                numbers[i] = min;
            }
        }
        for (int x: numbers){
            System.out.println(x);
        }

    }
}