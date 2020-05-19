package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        int i = 0;
        int j = 0;
        int a = 1; //счетчик;
        int g=n-1; //переменная для шага;
        int p=0; // переменная для шага;

        do {
        while (j<g) {
            array[i][j] = a;
            a++;
            j++;
        }
        while (i<g){
            array[i][j]=a;
            a++;
            i++;
        }
        while (j>p){
            array[i][j]=a;
            a++;
            j--;
        }
        g--;
        p++;
        while (i>p){
            array[i][j]=a;
            a++;
            i--;
        }

        } while (a!=n*n);

        if (array[i][j]==0){
            array[i][j]=a;
        }


            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + "    ");
                }
                System.out.println();
            }
        }
    }
