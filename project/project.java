/**
* @author Dina Zaripova
* 01-961
* Project
*/

import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        final String BLACK = "\u001B[40m";
        final String RESET = "\u001B[0m";
        final String GREEN = "\u001B[42m";
        final String YELLOW = "\u001B[43m";
        Scanner sc = new Scanner(System.in);
        String array[][] = {{" "," "," "}, {" "," "," "}, {" "," "," "}};;
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(BLACK + array[i][j] + "  " + RESET);
            }
            System.out.println();
        }
        for (int k = 0; k<9; k++) {
            System.out.print("Введите ряд (от 1 до 3) и столбец (от 1 до 3)");
            System.out.println();
            int n = sc.nextInt();
            int m = sc.nextInt();
            switch (k) {
                case 0:
                case 2:
                case 4:
                case 6:
                case 8:
                    array[n-1][m-1]= "x";
                    for (int i=0;i<3;i++) {
                        for(int j = 0;j < 3; j++) {
                        System.out.print(GREEN + array[i][j]+ " " + RESET);
                    }
                    System.out.println();
                }
                    break;
            }
            switch (k) {
                case 1:
                case 3:
                case 5:
                case 7:
                    array[n - 1][m - 1]= "0";
                    for (int i = 0;i < 3; i++) {
                        for(int j = 0;j < 3; j++) {
                            System.out.print(YELLOW + array[i][j]+" " + RESET);
                        }
                        System.out.println();
                    }
                    break;
            }
            if (array[0][0] == array[0][1] && array[0][1] == array[0][2] && array[0][2] == "0") {
                System.out.print("Победа 0");
                k=9;
            } else if (array[1][0] == array[1][1] && array[1][1] == array[1][2] && array[1][1] == "0") {
                System.out.print("Победа 0");
                k=9;
            } else if (array[2][0] == array[2][1] && array[2][2] == array[2][1] && array[2][0] == "0") {
                System.out.print("Победа 0");
                k=9;
            } else if (array[0][0] == array[1][0] && array[1][0] == array[2][0] && array[0][0] == "0") {
                System.out.print("Победа 0");
                k=9;
            } else if (array[0][1] == array[1][1] && array[1][1] == array[2][1] && array[2][1] == "0") {
                System.out.print("Победа 0");
                k=9;
            } else if (array[0][2] == array[1][2] && array[0][2] == array[2][2] && array[2][2] == "0") {
                System.out.print("Победа 0");
                k=9;
            } else if (array[0][1] == array[1][1] && array[1][1] == array[2][1] && array[2][1] == "0") {
                System.out.print("Победа 0");
                k=9;
            } else if (array[0][0] == array[1][1] && array[1][1] == array[2][2] && array[2][2] == "0") {
                System.out.print("Победа 0");
                k=9;
            } else if (array[0][2] == array[1][1] && array[1][1] == array[2][0] && array[2][0] == "0") {
                System.out.print("Победа 0");
                k=9;
            }
            if (array[0][0] == array[0][1] && array[0][1] == array[0][2] && array[0][2] =="x") {
                System.out.print("Победа x");
                k=9;
            } else if (array[1][0] == array[1][1] && array[1][1] == array[1][2] && array[1][1] == "x") {
                System.out.print("Победа x");
                k=9;
            } else if (array[2][0] == array[2][1] && array[2][2] == array[2][1] && array[2][0] == "x") {
                System.out.print("Победа x");
                k=9;
            } else if (array[0][0] == array[1][0] && array[1][0] == array[2][0] && array[0][0] == "x") {
                System.out.print("Победа x");
                k=9;
            } else if (array[0][1] == array[1][1] && array[1][1] == array[2][1] && array[2][1] == "x") {
                System.out.print("Победа x");
                k=9;
            } else if (array[0][2] == array[1][2] && array[0][2] == array[2][2] && array[2][2] == "x") {
                System.out.print("Победа x");
                k=9;
            } else if (array[0][1] == array[1][1] && array[1][1] == array[2][1] && array[2][1] == "x") {
                System.out.print("Победа x");
                k=9;
            } else if (array[0][0] == array[1][1] && array[1][1] == array[2][2] && array[2][2] == "x") {
                System.out.print("Победа x");
                k=9;
            } else if (array[0][2] == array[1][1] && array[1][1] == array[2][0] && array[2][0] == "x") {
                System.out.print("Победа x");
                k=9;
            }
    }
    }
}
