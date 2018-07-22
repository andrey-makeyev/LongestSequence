package com.company;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int[] myArray, maxSeqArray, tempArray;
        int n;
        int maxSeq;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter an array size: ");
                n = Integer.parseInt(scanner.nextLine());
                System.out.println("Fill your array: ");
                myArray = new int[n];
                maxSeqArray = new int[n];
                tempArray = new int[n];
                break;
            } catch (NumberFormatException e) {
                System.out.println("Only numbers!");
            }
        }
        int i, j, k = 0; // Counters

        /* Array elements input and zeroing */
        for (i = 0; i < n; i++) {
            System.out.print(i + 1 + " = ");
            myArray[i] = scanner.nextInt();
            maxSeqArray[i] = 0;
            tempArray[i] = 0;
        }

        /* Finding duplicate sequences */
        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                if (myArray[i] == myArray[j]) {
                    maxSeqArray[k]++;
                    tempArray[k] = myArray[i];
                } else {
                    break;
                }
            }
            k++;
        }

        /* Searching for the maximum sequence */
        maxSeq = maxSeqArray[0];
        for (i = 0; i < k; i++) {
            if (maxSeq < maxSeqArray[i]) {
                maxSeq = maxSeqArray[i];
            }
        }
        /* Searching for a number from the maximum sequence */
        for (i = 0; i < k; i++) {
            if (maxSeq == maxSeqArray[i]) {
                break;
            }
        }

        System.out.println("The longest recurring sequence of your array is  " + myArray[i]);
    }
}
