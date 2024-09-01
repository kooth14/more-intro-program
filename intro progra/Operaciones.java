/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author UNI LAB
 */
public class Operaciones {

    public static String Scontinuar = null;
    public static boolean continuar = false;
    public static Scanner sn = new Scanner(System.in);
    
    public static Scanner M = new Scanner(System.in);
    
    public static Scanner N = new Scanner(System.in);

    public static boolean salir = false;

    public static int opcion, m, n; //Guardaremos la opcion del usuario

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        while (!salir) {

            System.out.println("1. Generar una Matriz 0 de n x m");
            System.out.println("2. Sumar 2 Matrices");
            System.out.println("3. Restar 2 Matrices");
            System.out.println("4. Multiplicar 2 Matrices compatibles");
            System.out.println("5. Verificar si 2 matrices son iguales");
            System.out.println("6. Multiplicar un escalar por una matriz de n x m ");
            System.out.println("7. Obtener el inverso aditivo de una matriz");
            System.out.println("9. Obtener mariz identidad de tamaño n");
            System.out.println("10. Obtener el determinante de una matriz de tamaño n");
            System.out.println("11. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("***Generar Matriz***");
                        System.out.println();
                        System.out.println("***Digite M***");
                        m = M.nextInt();
                        System.out.println("***Digite N***");
                        n = N.nextInt();
                        GenerarMatriz(m, n);
                        Continuar();
                        break;
                    case 2:
                        System.out.println("***Sumar 2 Matrices***");
                        SumarMatrices();
                        Continuar();
                        break;
                    case 3:
                        System.out.println("***Restar 2 Matrices***");
                        RestarMatrices();
                        Continuar();
                        break;
                    case 4:
                        System.out.println("***Multiplicar 2 Matrices***");
                        MultipicarMatrices();
                        Continuar();
                        break;
                    case 5:
                        System.out.println("***No disponible***");
                        break;
                    case 6:
                        System.out.println("***No disponible***");
                        break;
                    case 7:
                        System.out.println("***No disponible***");
                        break;
                    case 8:
                        System.out.println("***No disponible***");
                        break;
                    case 9:
                        System.out.println("***No disponible***");
                        break;
                    case 10:
                        System.out.println("***No disponible***");
                        break;
                    case 11:
                        salir = true;
                        break;
                    default:
                    ClearConsole();
                    System.out.println("Solo números entre 1 y 11");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

    public static void ClearConsole() {
        try {
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system

            if (operatingSystem.contains("Windows")) {
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void Continuar() {
        System.out.println("Continuar? si/no");
        Scontinuar = sn.next().toString();
        if (!Scontinuar.equals("si")) {
            salir = true;
        }
    }

    public static void SumarMatrices() {
        int matriz_uno[][] = new int[3][3];
        int matriz_dos[][] = new int[3][3];
        int matriz_resultante[][] = new int[3][3];

        //Llenado de la primer matriz
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno.length; j++) {
                matriz_uno[i][j] = (int) (Math.random() * 5);
            }
        }

        //Llenado de la segunda matriz
        for (int i = 0; i < matriz_dos.length; i++) {
            for (int j = 0; j < matriz_dos.length; j++) {
                matriz_dos[i][j] = (int) (Math.random() * 5);
            }
        }

        //Suma de matrices
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_dos.length; j++) {
                matriz_resultante[i][j] = matriz_uno[i][j] + matriz_dos[i][j];
                //matriz_resultante[i][j] = matriz_uno[i][j] - matriz_dos[i][j];
            }
        }

        //imprimiendo las matrices
        for (int i = 0; i < matriz_uno.length; i++) {

            for (int j = 0; j < matriz_uno.length; j++) {
                System.out.print("[ " + matriz_uno[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  +   ");
            } else {
                System.out.print("      ");
            }

            for (int j = 0; j < matriz_dos.length; j++) {
                System.out.print("[ " + matriz_dos[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }

            for (int j = 0; j < matriz_resultante.length; j++) {
                System.out.print("[ " + matriz_resultante[i][j] + " ]");
            }

            System.out.println("");
        }
    }

    public static void RestarMatrices() {
        int matriz_uno[][] = new int[3][3];
        int matriz_dos[][] = new int[3][3];
        int matriz_resultante[][] = new int[3][3];

        //Llenado de la primer matriz
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno.length; j++) {
                matriz_uno[i][j] = (int) (Math.random() * 5);
            }
        }

        //Llenado de la segunda matriz
        for (int i = 0; i < matriz_dos.length; i++) {
            for (int j = 0; j < matriz_dos.length; j++) {
                matriz_dos[i][j] = (int) (Math.random() * 5);
            }
        }

        //resta de matrices
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_dos.length; j++) {
                matriz_resultante[i][j] = matriz_uno[i][j] - matriz_dos[i][j];
            }
        }

        //imprimiendo las matrices
        for (int i = 0; i < matriz_uno.length; i++) {

            for (int j = 0; j < matriz_uno.length; j++) {
                System.out.print("[ " + matriz_uno[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  -   ");
            } else {
                System.out.print("      ");
            }

            for (int j = 0; j < matriz_dos.length; j++) {
                System.out.print("[ " + matriz_dos[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }

            for (int j = 0; j < matriz_resultante.length; j++) {
                System.out.print("[ " + matriz_resultante[i][j] + " ]");
            }

            System.out.println("");
        }
    }

    public static void MultipicarMatrices() {
        int matriz_uno[][] = new int[2][3];
        int matriz_dos[][] = new int[3][2];
        int matriz_resultante[][] = new int[2][2];

        //Llenado de la matriz uno
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz_uno[i][j] = (int) (Math.random() * 5);
            }
        }

        //Llenado de matriz dos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz_dos[i][j] = (int) (Math.random() * 5);
            }
        }

        //Multiplicación de matrices
        for (int i = 0; i < 4; i++) {

            if (matriz_resultante[0][0] == 0) {
                int temporal = (matriz_uno[0][0] * matriz_dos[0][0])
                        + (matriz_uno[0][1] * matriz_dos[1][0])
                        + (matriz_uno[0][2] * matriz_dos[2][0]);

                matriz_resultante[0][0] = temporal;

            } else if (matriz_resultante[1][0] == 0) {
                int temporal = (matriz_uno[1][0] * matriz_dos[0][0])
                        + (matriz_uno[1][1] * matriz_dos[1][0])
                        + (matriz_uno[1][2] * matriz_dos[2][0]);

                matriz_resultante[1][0] = temporal;

            } else if (matriz_resultante[0][1] == 0) {
                int temporal = (matriz_uno[0][0] * matriz_dos[0][1])
                        + (matriz_uno[0][1] * matriz_dos[1][1])
                        + (matriz_uno[0][2] * matriz_dos[2][1]);

                matriz_resultante[0][1] = temporal;

            } else if (matriz_resultante[1][1] == 0) {
                int temporal = (matriz_uno[1][0] * matriz_dos[0][1])
                        + (matriz_uno[1][1] * matriz_dos[1][1])
                        + (matriz_uno[1][2] * matriz_dos[2][1]);

                matriz_resultante[1][1] = temporal;

            }
        }

        //imprimiendo matrices
        for (int i = 0; i < 3; i++) {

            if (i < 2) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[ " + matriz_uno[i][j] + " ]");
                }
                if (i == 1) {
                    System.out.print("   x   ");
                } else {
                    System.out.print("       ");
                }
            } else {
                System.out.print("                      ");
            }

            for (int j = 0; j < 2; j++) {
                System.out.print("[ " + matriz_dos[i][j] + " ]");
            }
            if (i == 1) {
                System.out.print("   =   ");
            } else {
                System.out.print("       ");
            }

            if (i < 2) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("[ " + matriz_resultante[i][j] + " ]");
                }
            }
            System.out.println("");
        }
    }
    
    public static void GenerarMatriz(int m, int n){
        
        System.out.println("Matriz "+m+" x "+n);
        int matriz_uno[][] = new int[m][n];

        //Llenado de la primer matriz
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno[i].length; j++) {
                matriz_uno[i][j] = (int) (Math.random() * 9);
            }
        }
        
        //imprimiendo las matrices
        for (int i = 0; i < matriz_uno.length; i++) {

            for (int j = 0; j < matriz_uno[i].length; j++) {
                System.out.print("[ " + matriz_uno[i][j] + " ]");
            }

            System.out.println("");
        }
    }

}
