/*

Task 3: Diagonal Sum of a Matrix
Write a Java program to calculate the sum of the main diagonal and the secondary diagonal of a
square matrix. Use user input to create the matrix.
Example Input:
Enter size of matrix: 3
Enter elements row by row:
1 2 3
4 5 6
7 8 9


*/
/*

Nichita Selchin , Student No : sba24331

Repository link : https://github.com/Nichita777/Task3

*/


package com.mycompany.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the matrix
        System.out.print("Enter size of matrix: ");
        int size = scanner.nextInt();

        // Create and populate the matrix
        int[][] matrix = new int[size][size];
        System.out.println("Enter elements row by row:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sums of the main and secondary diagonals
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < size; i++) {
            mainDiagonalSum += matrix[i][i];                 // Main diagonal: row index = column index
            secondaryDiagonalSum += matrix[i][size - 1 - i]; // Secondary diagonal: row index + column index = size - 1
        }

        // Output the results
        System.out.println("Main diagonal sum: " + mainDiagonalSum);
        System.out.println("Secondary diagonal sum: " + secondaryDiagonalSum);

        scanner.close();
    }
}
