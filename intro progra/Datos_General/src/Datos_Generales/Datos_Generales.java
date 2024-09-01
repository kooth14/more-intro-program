package Datos_Generales;

import java.util.Scanner;

public class Datos_Generales {

	public static void main(String[] args) {
		String Curso, Periodo_Lectivo, Carrera, Modalidad;
		double Cod_Curso, Grupo, Cod_Asignatura, Cod_Programa, Primer_Parcial, Segundo_Parcial, Sistematicos, Proyectos_de_Curso;
		Scanner leer = new Scanner(System.in);
		
		String seguir = "si";
		   
	    while (seguir.equals("si")) {
	    	System.out.println("Datos Generales");
	    	System.out.print("Curso:  ");
	    	Curso = leer.nextLine();
	    	System.out.print("Periodo Lectivo:  ");
	    	Periodo_Lectivo = leer.nextLine();
	    	System.out.print("Carrera:  ");
	    	Carrera = leer.nextLine();
	    	System.out.print("Modalidad:  ");
	    	Modalidad = leer.nextLine();
	    	System.out.print("Cod. de curso:  ");
	    	Cod_Curso =Double.parseDouble(leer.nextLine());
	    	while (Cod_Curso < 0) {
	    		System.out.println("ERROR, Su Cod. de Curso no puede ser negativo, favor volver a ingresarlo");
	    		Cod_Curso =Double.parseDouble(leer.nextLine());
	    		continue;
	    	}
	    	System.out.print("Grupo:  ");
	    	Grupo = Double.parseDouble(leer.nextLine());
	    	while (Grupo < 0) {
	    		System.out.println("ERROR, Su curso no puede ser negativo, favor volver a ingresarlo");
	    		Grupo =Double.parseDouble(leer.nextLine());
	    	}
	    	System.out.print("Cod. de Asignatura:  ");
	    	Cod_Asignatura = leer.nextDouble();
	    	while (Cod_Asignatura < 0) {
	    		System.out.println("ERROR, Su Cod. de Asignatura no puede ser negativo, favor volver a ingresarlo");
	    		Cod_Asignatura =Double.parseDouble(leer.nextLine());
	    	}
	    	System.out.print("Cod. de Programa:  ");
	    	Cod_Programa = leer.nextDouble();
	    	while (Cod_Programa < 0) {
	    		System.out.println("ERROR, Su Cod. de programa no puede ser negativo, favor volver a ingresarlo");
	    		Cod_Programa = Double.parseDouble(leer.nextLine());
	    	}
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
	    	Sistematicos = Double.parseDouble(leer.nextLine());
	    	if  (Sistematicos > 35) {
	    		System.out.println("ERROR, Su nota del sistematico debe de ser menor que 35, favor volver a ingresar su nota ");
	    		Sistematicos  =Double.parseDouble(leer.nextLine());
	    	}
	    	while (Sistematicos < 0) {
	    		System.out.println("ERROR, Su nota de sistematico  no puede ser negativo, favor volver a ingresarlo");
	    		Sistematicos  =Double.parseDouble(leer.nextLine());
	    	}
	    	System.out.print("Proyecto de Curso:  ");
	    	Proyectos_de_Curso = Double.parseDouble(leer.nextLine());
	    	if  (Proyectos_de_Curso > 35) {
	    		System.out.println("ERROR, Su nota del proyecto de curso debe de ser menor que 35, favor volver a ingresar su nota");
	    		Proyectos_de_Curso = Double.parseDouble(leer.nextLine());
	    	}
	    	while (Proyectos_de_Curso < 0) {
	    		System.out.println("ERROR, Su proyecto de curso  no puede ser negativo, favor volver a ingresarlo");
	    		Proyectos_de_Curso =Double.parseDouble(leer.nextLine());
	    	}

	}

}
}

