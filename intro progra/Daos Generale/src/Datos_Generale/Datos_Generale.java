package Datos_Generale;

import java.util.Arrays;
import java.util.Scanner;

public class Datos_Generale {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String Nombre_de_Curso, Periodo_Lectivo, Carrera, Modalidad, Cantidad_de_Estudiantes;
		double Cod_de_curso, Cod_de_Asignatura, Cod_de_programa, Grupo, Primer_Parcial, Segundo_Parcial, Sistematico, Proyecto_de_Curso;
		String ArraysNombre_de_Curso[] = {"Introduccion a la programacion"};
		String i_Nombre_de_Curso;
		String ArraysPeriodoLectivo[] = {"Primer semestre 2021", "Segundo semestre 2021"};
		String i_Periodo_de_Lectivo;
		String ArraysCarrera[] = {"Arquitectura", "Ingenieria de sistemas", "Ingenieria civil", "Mecanica", "Ingenieria industrial"};
		String i_Carrera;
		String ArraysModalidad [] = {"regular", "nocturno", "vespertino","diurno"};
		String i_Modalidad;
		
		String seguir = "si";
		while  (seguir.equals("si")){
		
		System.out.println("Datos Generales");
		System.out.print("curso:  ");
		i_Nombre_de_Curso = leer.nextLine();
		
		while (!Arrays.asList(ArraysNombre_de_Curso).contains(i_Nombre_de_Curso)) {
			System.out.println(" ERROR, Nombre de curso incorrecto/o no disponible en esta univerisdad, favor volver a ingresar su curso");
			i_Nombre_de_Curso = leer.nextLine();
			
		}
		System.out.print("Periodo Lectivo:  ");
		i_Periodo_de_Lectivo = leer.nextLine();
		
		while (!Arrays.asList(ArraysPeriodoLectivo).contains(i_Periodo_de_Lectivo)) { 
			System.out.println("ERROR, Su periodo de curso es incorrecto, favor vuelva a intentarlo");
			i_Periodo_de_Lectivo = leer.nextLine();
	}
		System.out.print("Carrera:  ");
		i_Carrera = leer.nextLine();
		
		while (!Arrays.asList(ArraysCarrera).contains(i_Carrera)) {
			System.out.println("ERROR, su carrera esta incorrecto/o no esta disponible en esta universidad, favor volver a ingresar su carrera");
			i_Carrera = leer.nextLine();
		}
		System.out.print("Modalidad:  ");
		i_Modalidad = leer.nextLine();
		
		while (!Arrays.asList(ArraysModalidad).contains(i_Modalidad)) {
			System.out.println("ERROR, su modalidad no exite/o no disponible, favor vuelva a ingresar su modalidad");
			i_Modalidad = leer.nextLine();
		}
		System.out.print("Cod. de Curso:  ");
		 Cod_de_curso = leer.nextDouble();
		 
		 if ( Cod_de_curso < 0 ) {
			 System.out.println("ERROR, su codigo de curso no puede ser negativo, favor volver a ingresar su codigo");
			 continue;
		 }
		 System.out.print("Grupo:  ");
		 Grupo = leer.nextDouble();
		 
		 boolean tieneLetra = false;
	      boolean tieneNumero = false;
	      char ch;
	      for(int i=0;i < Grupo;i++) {
	        if( Character.isDigit(i)) {
	            tieneNumero = true;
	        }
	        else if (Character.isLetter(i)) {
	            tieneLetra = true;
}
	        if (!tieneNumero || !tieneLetra) {
	        	System.out.println("Error, su grupo tiene que tener al menos una letra");
	        	continue;
	        }}
	        System.out.print("Cod. de Asignatura:  ");
	        Cod_de_Asignatura = leer.nextDouble();
	        
	        boolean TieneLetra = false;
		      boolean TieneNumero = false;
		      char bt;
		      for(int a=0;a < Grupo;a++) {
		        if( Character.isDigit(a)) {
		            TieneNumero = true;
		        }
		        else if (Character.isLetter(a)) {
		            TieneLetra = true;
	}
		        if (!TieneNumero || !TieneLetra) {
		        	System.out.println("Error, su codigo de asignatura tiene que tener al menos una letra");
		        	continue;
		        }}
		   System.out.print("Cod. de programa:  ");
		   Cod_de_programa = leer.nextDouble();
		   
		   if (Cod_de_programa < 0) {
			   System.out.println("ERROR, su codigo no puede ser negativo, favor volver a ingresar su codigo");
			   continue;
		   }}
		System.out.print("Primer Parcial:  ");
		Primer_Parcial = leer.nextDouble();
		
		if  (Primer_Parcial > 35) {
    		System.out.println("ERROR, Su nota del Primer Parcial debe de ser menor que 35, favor volver a ingresar su nota");
    		Primer_Parcial =Double.parseDouble(leer.nextLine());
    	}
    	while (Primer_Parcial < 0) {
    		System.out.println("ERROR, Su nota de primer parcial no puede ser negativo, favor volver a ingresarlo");
    		Primer_Parcial =Double.parseDouble(leer.nextLine());
    	}
    	System.out.print("Segundo Parcial:  ");
    	Segundo_Parcial = leer.nextDouble();
    	if  (Segundo_Parcial > 35) {
    		System.out.println("ERROR, Su nota del segundo Parcial debe de ser menor que 35, favor volver a ingresar su nota");
    		Segundo_Parcial = Double.parseDouble(leer.nextLine());
    	}
    	while (Segundo_Parcial < 0) {
    		System.out.println("ERROR, Su nota de segundo parcial no puede ser negativo, favor volver a ingresarlo");
    	}
    	System.out.print("Sistematicos:  ");
    	Sistematico = Double.parseDouble(leer.nextLine());
    	if  (Sistematico > 35) {
    		System.out.println("ERROR, Su nota del sistematico debe de ser menor que 35, favor volver a ingresar su nota ");
    		Sistematico  =Double.parseDouble(leer.nextLine());
    	}
    	while (Sistematico < 0) {
    		System.out.println("ERROR, Su nota de sistematico  no puede ser negativo, favor volver a ingresarlo");
    		Sistematico  =Double.parseDouble(leer.nextLine());
    	}
    	System.out.print("Proyecto de Curso:  ");
    	Proyecto_de_Curso = Double.parseDouble(leer.nextLine());
    	if  (Proyecto_de_Curso > 35) {
    		System.out.println("ERROR, Su nota del proyecto de curso debe de ser menor que 35, favor volver a ingresar su nota");
    		Proyecto_de_Curso = Double.parseDouble(leer.nextLine());
    	}
    	while (Proyecto_de_Curso < 0) {
    		System.out.println("ERROR, Su proyecto de curso  no puede ser negativo, favor volver a ingresarlo");
    		Proyecto_de_Curso =Double.parseDouble(leer.nextLine());
    	}
    	System.out.println("¿Quiere intentarlo de nuevo?");
    	seguir = leer.nextLine();
        System.out.println("Take care, Thanks");
        leer.close();
}
	


	}


