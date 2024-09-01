package Hoja_de_matricula;

import java.util.Arrays;
import java.util.Scanner;

public class Hoja_de_MatriculaHW {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
				Scanner lector= new Scanner(System.in);
				Scanner lector1= new Scanner(System.in);
				Scanner lector2= new Scanner(System.in);
				Scanner lector3= new Scanner(System.in);
				Scanner lector4= new Scanner(System.in);
				System.out.println("HOJA DE MATRICULA");
				System.out.println("AÑO ACADEMICO 2021");
				double No_Recibido, No_Inscripcion, Plan_de_Estudio,Fecha, No, Aula, Cred, F, R;
				String Nombre_y_Apellido, Carrera, Carnet, Semestre, Turno, Asignatura, Grupo;
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
			    while  (seguir.equals("si")){
				System.out.print("Ingrese Numero del recibo: ");
				No_Recibido = leer.nextDouble();
				if ( No_Recibido < 0 ) {
			         System.out.println("ERROR, su No_Recibido no puede ser negativo, favor volver a ingresar su codigo");
			        System.out.print("Ingrese Numero del recibo:  ");
			         No_Recibido = Double.parseDouble(leer.nextLine());
			      }
				do {
				long re= lector.nextLong();
				
				long ins;
				do {
					
					System.out.print(" Ingrese el Numero de inscripción");
					ins=lector.nextShort();
					if(ins>1000|| re<=0) {
						System.out.println("Error. los numeros de inscripción son 3, escribir de nuevo el numero de inscripción");
						System.out.print(" Ingrese el Numero de inscripción");
						ins=lector.nextShort();
					}
				}while(ins>=1000 || ins<=0);
				
				System.out.print(" Ingrese sus Nombres y apelllidos: ");
				Nombre_y_Apellido = leer.nextLine();
				
				System.out.print(" Ingrese su Numero de carnet: ");
				long carnet= lector.nextLong();
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
			          System.out.println("Error, su grupo tiene que tener al menos una letra y un numero");
			          System.out.print("Carnet:  ");
			          Carnet = leer.nextLine();
			        }
			        else {
			          break;
			        }
			       }
				
				System.out.print("Ingresar la Carrera: ");
				String carrera=lector1.nextLine();
				 while (i_Carrera == "" || !Arrays.asList(ArraysCarrera).contains(i_Carrera.toLowerCase())) {
				        System.out.println(" ERROR, Nombre de carrera incorrecto/o no disponible en esta univerisdad, favor volver a ingresar su curso");
				        System.out.print("Carrera:  ");
				        i_Carrera = leer.nextLine();
				      }
				
				System.out.print("Ingrese Turno: ");
				String turno=lector1.nextLine();
				  while (i_Turno == "" || !Arrays.asList(ArraysTurno).contains(i_Turno.toLowerCase())){ 
				        System.out.println("ERROR, Su turno es incorrecto, favor vuelva a intentarlo");
				        System.out.print("Turno:  ");
				          i_Turno = leer.nextLine();
				      }
				
				System.out.print(" Ingrese su de Plan de estudio: ");
				String plan= lector1.next();
				 while (i_Plan_de_Estudio == "" || !Arrays.asList(ArraysPlandeEstudio).contains(i_Plan_de_Estudio.toLowerCase())) {
				        System.out.println(" ERROR, su plan de estudio esta  incorrecto, favor volver a ingresar su curso");
				        System.out.print("Plan de estudio:  ");
				        String plan1 = lector1.next();
			       }
				 if (Plan_de_Estudio < 0) {
			    	   System.out.println("ERROR, Su plan de estudio no puede ser negativo, favor volver a ingresarlo");
			    	   System.out.print("Plan de estudio:  ");
				       Plan_de_Estudio = leer.nextDouble();
				 }
				
				System.out.print("Ingrese el Semestre: ");
				String semestre=lector2.nextLine();
				while (i_Semestre == "" || !Arrays.asList(ArraysSemestre).contains(i_Semestre.toLowerCase())){ 
			        System.out.println("ERROR, Su semestre es incorrecto, favor vuelva a intentarlo");
			        System.out.print("Semestre:  ");
			          i_Semestre = leer.nextLine();
			      }
				
				System.out.print("Ingresar la Fecha de matricula: ");
				String fecha= lector2.next();
				if (Fecha < 0) {
			    	   System.out.println("ERROR, Su fecha no puede ser negativo, favor volver a ingresar la fecha");
			    	   System.out.print("Fecha:  ");
				       Fecha = leer.nextDouble();
			       }
				
				short clases=0;
				
				do {
				System.out.println("¿Cuantas clases quieres inscribir?");
				clases=lector.nextShort();
				if(clases<=0 || clases>7) {
					System.out.println("ERROR");
					System.out.println(" Deben ser de 1 a 7 clases.");
				}
				}while(clases<=0 || clases>7);
				System.out.println(" Ingrese el Codigo de las asignatura");
				
				String[]cod= new String[clases];
				for(int i=0; i<cod.length; i++) {
					System.out.println("Codigo de la clase #"+(i+1));
					cod[i]=lector2.next();
				}
				String [] asignatura= new String[clases];
				System.out.println(" Ingresar los Nombres de las asignaturas: ");
				while (i_Asignatura == "" || !Arrays.asList(ArraysAsignatura).contains(i_Asignatura.toLowerCase())) {
			        System.out.println(" ERROR, su asignatura esta incorrecto/o no disponible en esta univerisdad, favor volver a ingresar su curso");
			        System.out.print("Asignatura:  ");
			        i_Asignatura= leer.nextLine();
			      }
				for(int i=0; i<asignatura.length; i++) {
					System.out.println("Asignatura #"+(i+1));
					asignatura[i]=lector3.nextLine();
				}
				System.out.println("Ingrese el nombre del Grupo");
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
				String []grupo= new String[clases];
				for(int i=0; i<grupo.length; i++) {
					System.out.println("Grupo de la asignatura "+ asignatura[i]+": ");
					grupo[i]=lector4.next();
				}
				System.out.println("Ingrese el numero de la  Aula");
				if (Aula < 0) {
		        	System.out.println("ERROR,Su aula no puede ser negativo, favor volver a ingresar su numero de aula");
		        	 System.out.print("Aula:  ");
		 	        Aula = leer.nextDouble();
		        }
				long aula[]=new long [clases];
				for(int i=0; i<grupo.length; i++) {
					System.out.println("Aula de la asignatura "+ asignatura[i]+": ");
					aula[i]=lector.nextInt();
				}
				System.out.println("Ingrese su Credito");
				short credito[]= new short[clases];
				short tcredito=0;
				for(int i=0; i<grupo.length; i++) {
					do {
					do {
					System.out.println("credito de la asignatura "+ asignatura[i]+": ");
					credito[i]=lector.nextShort();
					if(credito[i]>4 || credito[i]<0) {
						System.out.println("ERROR");
						System.out.println("Vuelva a introducir el credito por favor");
					}
					}while(credito[i]>4 || credito[i]<0);
				
					 tcredito=(short)(credito[i]+tcredito);
					 if(tcredito>28) {
						 System.out.println("Sobrepasaste los creditos, vuelve a introducir los creditos de la clase. Acuerdate que son solo 28 creditos");
					 }
					}while(tcredito>28);
				}
				System.out.println("Ingrese su Frecuencia");
				short frecuencia[]=new short[clases];
				for(int i=0; i<grupo.length; i++) {
					do {
					System.out.println("credito de la asignatura "+ asignatura[i]+": ");
					frecuencia[i]=lector.nextShort();
					if(frecuencia[i]>3 || frecuencia[i]<0) {
						System.out.println("ERROR");
						System.out.println("Vuelva a introducir la frecuencia por favor");
					}
					}while(frecuencia[i]>3 || frecuencia[i]<0);
				}
				System.out.println("");
				System.out.println("Retirar clases");
				String retirar[]=new String[clases];
				short reti[]=new short[clases];
				for(int i=0; i<reti.length; i++) {
					do {
					System.out.println("Deseas retirar la asignatura de: "+asignatura[i]);
					System.out.println("1. Si");
					System.out.println("2. No");
					reti[i]=lector.nextShort();
					if(reti[i]>2 || reti[i]<=0) {
						System.out.println("Escribir nuevamente. 1 o 2");
					}
					if(reti[i]==1) {
						retirar[i]="Si";
					}else{
						retirar[i]="No";
					}
					
					}while(reti[i]>2 || reti[i]<=0 );
				}
				
				System.out.println();
				System.out.println();
				System.out.println("No. Recibo: "+re+"           "+" No. inscripcion: "+ins);
				System.out.println	("Nombres y apellidos: "+ Nombre_y_Apellido);
				System.out.println	("Carrera: "+carrera+"                    "+"Carnet: "+carnet+"                 "+"Turno: "+turno);
				System.out.println	("Plan de estudio: "+plan+"                    "+"Semestre: "+semestre+"                 "+"Fecha: "+fecha);
				System.out.println("");
				
				System.out.println("No."+"                "+"             Asignatura              "+"   Grupo     "+"   Aula  "+"   Credito  "+" F "+"  R  " );
				for(int i=0; i<clases; i++) {
					 System.out.println((i+1)+"                             "+cod[i]+"  "+asignatura[i]+"                 "+grupo[i]+"        "+aula[i]+"     "+credito[i]+"   "+frecuencia[i]+" "+retirar[i]);
				}
				System.out.println("¿Desea continuar?(Si/No)");
				seguir =lector4.next();
				}while(seguir.equalsIgnoreCase("Si"));
				}
			    
}
}
}

