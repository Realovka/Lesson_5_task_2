package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] array = new int[n][n];
        int i = 0;
        int j = 0;
        int a = 1;
        int b=0;


        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                while (b<2*n) {

                    for (j = 0; j < array.length; j++) {
                        i = 0;
                        array[i][j] = a;
                        a++;
                    }
                    b++;
                    for (i = 1; i < array.length; i++) {
                        j = array.length - 1;
                        array[i][j] = a;
                        a++;
                    }
                    b++;
                    for (j = array.length-2; j >= 0; j--) {
                        i = array.length-1;
                        array[i][j] = a;
                        a++;
                    }
                    b++;
                    for (i = array.length-2; i >=j+1; i--) {
                        j = 0;
                        array[i][j] = a;
                        a++;
                    }
                    b++;


                }
            }
        }


            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + "  ");
                }
                System.out.println();
            }
        }
    }
