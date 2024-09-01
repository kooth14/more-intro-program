package TrabajosQueEntregar;
import java.util.*;
public class Matricula {
	public static void main(String[] args) {
		System.out.println("Bienvenido");
		Scanner lector= new Scanner(System.in);
		Scanner lector1= new Scanner(System.in);
		Scanner lector2= new Scanner(System.in);
		Scanner lector3= new Scanner(System.in);
		Scanner lector4= new Scanner(System.in);
		System.out.print("Ingrese Numero del recibo: ");
		String continuar="Si";
		do {
		long re= lector.nextLong();
		
		long ins;
		do {
			
			System.out.print(" Ingrese el Numero de inscripción");
			ins=lector.nextShort();
			if(ins>1000|| re<=0) {
				System.out.println("Error. los numeros de inscripción son 3, escribir de nuevo el numero de inscripción");
			}
		}while(ins>=1000 || ins<=0);
		
		System.out.print(" Ingrese sus Nombres y apelllidos: ");
		String nombres=lector1.nextLine();
		
		System.out.print(" Ingrese su Numero de carnet: ");
		long carnet= lector.nextLong();
		
		System.out.print("Ingresar la Carrera: ");
		String carrera=lector1.nextLine();
		
		System.out.print("Ingrese Turno: ");
		String turno=lector1.nextLine();
		
		System.out.print(" Ingrese su de Plan de estudio: ");
		String plan= lector1.next();
		
		System.out.print("Ingrese el Semestre: ");
		String semestre=lector2.nextLine();
		
		System.out.print("Ingresar la Fecha de matricula: ");
		String fecha= lector2.next();
		System.out.println("");
		
		short clases=0;
		
		do {
		System.out.println("¿Cuantas clases quieres inscribir?");
		clases=lector.nextShort();
		if(clases<=0 || clases>7) {
			System.out.println("ERROR");
			System.out.println(" Deben ser de 1 a 7 clases.");
		}
		}while(clases<=0 || clases>7);
		System.out.println("");
		System.out.println(" Ingrese el Codigo de las asignatura");
		String[]cod= new String[clases];
		for(int i=0; i<cod.length; i++) {
			System.out.println("Codigo de la clase #"+(i+1));
			cod[i]=lector2.next();
		}
		System.out.println("");
		String [] asignatura= new String[clases];
		System.out.println(" Ingresar los Nombres de las asignaturas: ");
		for(int i=0; i<asignatura.length; i++) {
			System.out.println("Asignatura #"+(i+1));
			asignatura[i]=lector3.nextLine();
		}
		System.out.println("");
		System.out.println("Ingrese el nombre del Grupo");
		String []grupo= new String[clases];
		for(int i=0; i<grupo.length; i++) {
			System.out.println("Grupo de la asignatura "+ asignatura[i]+": ");
			grupo[i]=lector4.next();
		}
		System.out.println("");
		System.out.println("Ingrese el numero de la  Aula");
		long aula[]=new long [clases];
		for(int i=0; i<grupo.length; i++) {
			System.out.println("Aula de la asignatura "+ asignatura[i]+": ");
			aula[i]=lector.nextInt();
		}
		System.out.println("");
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
		System.out.println("");
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
		System.out.println	("Nombres y apellidos: "+nombres);
		System.out.println	("Carrera: "+carrera+"                    "+"Carnet: "+carnet+"                 "+"Turno: "+turno);
		System.out.println	("Plan de estudio: "+plan+"                    "+"Semestre: "+semestre+"                 "+"Fecha: "+fecha);
		System.out.println("");
		
		System.out.println("No."+"                "+"             Asignatura              "+"   Grupo     "+"   Aula  "+"   Credito  "+" F "+"  R  " );
		for(int i=0; i<clases; i++) {
			 System.out.println((i+1)+"                             "+cod[i]+"  "+asignatura[i]+"                 "+grupo[i]+"        "+aula[i]+"     "+credito[i]+"   "+frecuencia[i]+" "+retirar[i]);
		}
		System.out.println("¿Desea continuar?(Si/No)");
		continuar=lector4.next();
		}while(continuar.equalsIgnoreCase("Si"));
		
	}

}


