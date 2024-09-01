package Datos_Generales;

import java.util.Arrays;
import java.util.Scanner;

public class Datos_Generales {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		String Nombre_de_Curso, Periodo_Lectivo, Carrera, Modalidad, Cantidad_de_Estudiantes;
		double Cod_de_curso, Cod_de_Asignatura, Cod_de_programa_de_Asignatura, Grupo;
		String ArraysNombre_de_Curso[] = {"Arquitectura", "Ingenieria de sistemas", "Ingenieria civil", "Mecanica", "Ingenieria industrial"};
		String i_Nombre_de_Curso;
		String ArraysPeriodoLectivo[] = {"Primer semestre 2021", "Segundo semestre 2021"};
		String i_Periodo_de_Lectivo;
		
		String seguir = "si";
		while  (seguir.equals("si")){
		
		System.out.println("Datos Generales");
		System.out.print("curso:  ");
		i_Nombre_de_Curso = leer.nextLine();
		
		while (!Arrays.asList(ArraysNombre_de_Curso).contains(i_Nombre_de_Curso)) {
			System.out.println("Nombre de curso incorrecto/o no disponible en esta univerisdad");
			i_Nombre_de_Curso = leer.nextLine();
		}
		System.out.print("Periodo Lectivo:  ");
		i_Periodo_de_Lectivo = leer.nextLine();
		
		while (!Arrays.asList(ArraysPeriodoLectivo).contains(i_Periodo_de_Lectivo)) 
	}

}
}