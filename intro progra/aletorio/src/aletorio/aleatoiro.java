package aletorio;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import  static java.lang.Math.*;
public class aleatoiro {

			public static void main(String[] args) {
				Scanner leer = new Scanner(System.in);
			    int[] arrNumeros = new int[5000];
			    int posicion;
			    
			    // llenar el array hasta 5000
			    for(int i = 0; i < 5000 ; i++) {
			      arrNumeros[i] = ThreadLocalRandom.current().nextInt(1, 100 + 1);
			    }
			    
			    // loop para seguir
			    String seguir = "si";
			    while  (seguir.equals("si")) {
			    	public void OrdenPorMezcla(int A [], int IndiceIzq, int  IndiceMedio, int IndiceDer  );
			    	if (IndiceIzq < IndiceDer) {
			    		int IndiceMedio = round ((IndiceIzq + IndiceDer) /2);
			    		OrdenPormezcla (A, IndiceMedio + 1, IndiceDer);
			    		mezcla (A, IndiceIzq, IndiceMedio, IndiceDer);
			    	}
			    	
			      // pedir posicion
			      System.out.print("Ingrese posicion:  ");
			      posicion = Integer.parseInt(leer.nextLine());
			      while ( posicion < 1 || posicion > 5000 ) {
			        System.out.println("ERROR, la posicion debe ser entre 1 y 5000");
			        System.out.print("Ingrese posicion:  ");
			        posicion = Integer.parseInt(leer.nextLine());
			      }
			      
			      int i = IndiceIzq;
			      int j = IndiceMedio +1 ;
			      int k = IndiceDer;
			       int B [] = new int [IndiceDer + 1];
			       while ((i <= IndiceMedio ) && (j <= IndiceDer)) {
			    	   if ( A [i] < A [j]) {
			    		   B[k] = A [i];
			    		   i = i +1;
			    	   }else {
			    		   B[k] = A[j];
			    		   j =j + 1;
			    	   }
			    	   k = k + 1;
			       }
			       while (i < IndiceMedio) {
			    	   B[k] = A[j];
			    	   i = i + 1; k = k + 1;
			       }
			       for (int x = IndiceIzq; x < IndiceDer + 1; x++ ) {
			    	   A[x] = B[x];
			    	  
			       }
			       public void MostrarArreglo(int A[], int n) {
			    	   for (int i1 = 0; i1 < n; i1++ ) {
			    		   System.out.println(A [i1] +"  ");
			    	   }
			    	   System.out.println();
			       }
			       
			      // imprimir numero de la posicion
			      System.out.println("El numero de posicion " + posicion + " es:  " + arrNumeros[posicion - 1]);
			      obj.MostrarNumero(A,A.length);
			      obj.OrdenPorMezcla(A,0, A.length - 1);
			      
			      System.out.println("¿Quiere intentarlo de nuevo?");
			      seguir = leer.nextLine();
			    }
			    
			    System.out.println("Take care, Thanks");
			    leer.close();
			  

			}

	}
