package Matricula;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Hoja_de_matricula {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		double No_Recibido, No_Inscripcion, Plan_de_Estudio = 0, No = 0, Aula, Cred, F, R;
		String Nombre_y_Apellido, Carrera = null, Carnet, Semestre = null, Turno = null, Asignatura = null, Grupo, Fecha;
		String ArraysCarrera[] = {"arquitectura", "ingenieria de sistemas", "ingenieria civil", "mecanica", "ingenieria industrial"};
    String i_Carrera;
    String ArraysSemestre[] = {"primer semestre 2021", "segundo semestre 2021"};
    String i_Semestre;
    String ArraysTurno [] = {"regular", "nocturno", "vespertino", "diurno"};
    String i_Turno;
    String ArraysAsignatura[] = {"redaccion", "matematicas", "filosofia", "ingles", "contabilidad", "introduccion a la programacion"};
    String i_Asignatura;
    String ArraysPlandeEstudio [] = {"2021"};
    String i_Plan_de_Estudio;

		String seguir = "si";
	  while  (seguir.equals("si")) {

      System.out.print("Ingrese Numero del recibo:  ");
      No_Recibido = Double.parseDouble(leer.nextLine());
      while ( No_Recibido < 0 ) {
        System.out.println("ERROR, su No_Recibido no puede ser negativo, favor volver a ingresar su codigo");
        System.out.print("Ingrese Numero del recibo:  ");
        No_Recibido = Double.parseDouble(leer.nextLine());
      }

      System.out.print("Ingrese su nombre y apellido:  ");
      Nombre_y_Apellido = leer.nextLine();

      System.out.print("No. de inscripcion:  ");
      No_Inscripcion = Double.parseDouble(leer.nextLine());
      while ( No_Inscripcion < 0 ) {
        System.out.println("ERROR, su No. de inscripcion: no puede ser negativo, favor volver a ingresar su codigo");
        System.out.print("No. de inscripcion:  ");
        No_Inscripcion = Double.parseDouble(leer.nextLine());
      }
      while(No_Inscripcion >= 1000 || No_Inscripcion <= 100) {
        System.out.println("Error. los numeros de inscripci�n son 3, escribir de nuevo el numero de inscripci�n");
        System.out.print("No. de inscripcion:  ");
        No_Inscripcion = Double.parseDouble(leer.nextLine());
      }

      System.out.print("Carrera:  ");
      i_Carrera = leer.nextLine();
      while (i_Carrera == "" || !Arrays.asList(ArraysCarrera).contains(i_Carrera.toLowerCase())) {
        System.out.println(" ERROR, Nombre de carrera incorrecto/o no disponible en esta univerisdad, favor volver a ingresar su curso");
        System.out.print("Carrera:  ");
        i_Carrera = leer.nextLine();
      }

      System.out.print("Carnet:  ");
      Carnet = leer.nextLine();
      char ch;
      while (true) {
        boolean tieneLetra = false;
        boolean tieneNumero = false;
        for(int i=0;i < Carnet.length();i++) {
          ch = Carnet.charAt(i);
          if( Character.isDigit(ch)) {
            tieneNumero = true;
          }
          else if (Character.isLetter(ch)) {
            tieneLetra = true;
          }
        }
        if (!tieneNumero || !tieneLetra) {
          System.out.println("Error, su grupo tiene que tener al menos una letra y un numero.");
          System.out.print("Carnet:  ");
          Carnet = leer.nextLine();
        }
        else {
          break;
        }
      }
      System.out.print("Turno:  ");
      i_Turno = leer.nextLine();
      while (i_Turno == "" || !Arrays.asList(ArraysTurno).contains(i_Turno.toLowerCase())){ 
        System.out.println("ERROR, Su turno es incorrecto, favor vuelva a intentarlo");
        System.out.print("Turno:  ");
        i_Turno = leer.nextLine();
      }

      System.out.print("Plan de estudio:  ");
      i_Plan_de_Estudio = leer.nextLine();
      while (i_Plan_de_Estudio == "" || !Arrays.asList(ArraysPlandeEstudio).contains(i_Plan_de_Estudio.toLowerCase())) {
        System.out.println(" ERROR, su plan de estudio esta  incorrecto, favor volver a ingresar su curso");
        System.out.print("Plan de estudio:  ");
        i_Plan_de_Estudio = leer.nextLine();
      }

      System.out.print("Semestre:  ");
      i_Semestre = leer.nextLine();
      while (i_Semestre == "" || !Arrays.asList(ArraysSemestre).contains(i_Semestre.toLowerCase())) { 
        System.out.println("ERROR, Su semestre es incorrecto, favor vuelva a intentarlo");
        System.out.print("Semestre:  ");
        i_Semestre = leer.nextLine();
      }

      System.out.print("Fecha:  ");   
      Fecha = leer.nextLine();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
    
      System.out.print("Asignatura:  ");
      i_Asignatura = leer.nextLine();
      while (i_Asignatura == "" || !Arrays.asList(ArraysAsignatura).contains(i_Asignatura.toLowerCase())) {
        System.out.println(" ERROR, su asignatura esta incorrecto o no disponible en esta univerisdad, favor volver a ingresar su curso");
        System.out.print("Asignatura:  ");
        i_Asignatura= leer.nextLine();
      }

      System.out.print("Grupo:  ");
      Grupo = leer.nextLine();
      char a;
      while (true) {
        boolean tieneLetra = false;
        boolean tieneNumero = false;
        for(int i=0;i < Carnet.length();i++) {
          a = Carnet.charAt(i);
          if( Character.isDigit(a)) {
            tieneNumero = true;
          }
          else if (Character.isLetter(a)) {
            tieneLetra = true;
          }
        }
        if (!tieneNumero || !tieneLetra) {
          System.out.println("Error, su grupo tiene que tener al menos una letra y un numero");
          System.out.print("Grupo:  ");
          Grupo = leer.nextLine();
        }
        else {
          break;
        }
      }

      System.out.print("Aula:  ");
      Aula = Double.parseDouble(leer.nextLine());
      while (Aula < 0) {
        System.out.println("ERROR,Su aula no puede ser negativo, favor volver a ingresar su numero de aula");
        System.out.print("Aula:  ");
        Aula = Double.parseDouble(leer.nextLine());
      }

      System.out.print("cred:  ");
      Cred = Double.parseDouble(leer.nextLine());
      while(Cred > 28) {
        System.out.println("Sobrepasaste los creditos, vuelve a introducir los creditos de la clase. Acuerdate que son solo 28 creditos");
        System.out.print("cred:  ");
        Cred = Double.parseDouble(leer.nextLine());
      }
      System.out.println("HOJA DE MATRICULA");
		System.out.println("A�o ACADEMICO 2021");

      System.out.println();
      System.out.println();
      System.out.println("No. Recibo: "+ No_Recibido +"           "+" No. inscripcion: "+ No_Inscripcion);
      System.out.println("Nombres y apellidos: "+ Nombre_y_Apellido);
      System.out.println("Carrera: "+ Carrera+"                     "+"Carnet: "+ Carnet+"                 "+"Turno: "+ Turno);
      System.out.println("Plan de estudio: "+ Plan_de_Estudio +"    "+"Semestre: "+ Semestre +"            "+"Fecha: "+ Fecha);
      System.out.println("");
      System.out.println("No."+"                "+  No +"             Asignatura              "+  Asignatura +"   Grupo     "+ Grupo +"   Aula  "+ Aula +"   Credito  " + Cred +" F "+"  R  "  );
      System.out.println("�Quiere intentarlo de nuevo?");
      seguir = leer.nextLine();
    }
	 System.out.println("Take care, Thanks");
	    leer.close();

	  }
}


