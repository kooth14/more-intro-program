package NetFlix;

import java.util.Scanner;

public class nWFBDCo {
String seguir = "si";
while (seguir.equals("si")) {
	String [] series = new String [5];
	series[0] ="Drama";
	series[1] ="Romance";
	series[2] ="Accion";
	series[3] ="Terror";
	series[4] ="Animado";
    String drama[] = new String [5];
    drama [0]="Vincenzo";
    drama[1]="Elite";
    drama[2]="Vagabond";
    drama[3]="Friends";
    drama[4]="Stranger Things";
    String romance [] = new String [5];
    romance[0]="Heirs";
    romance[1]="Un amor tan hermoso";
    romance[2]="My secret Romance";
    romance[3]="Recuestate sobre mi hombro";
    romance[4]="Jardin de meteoros";
    String accion[] = new String [5];
    accion[0]="Rugal";
    accion[1]="Penthouse";
    accion[2]="Flash and Furious";
    accion[3]="Maze Runner: la cura mortal"; 
    accion[4]="SPLIT";
    String terror [] = new String[5];
	terror[0]="Voices";
	terror[1]="THE WALKING DEAD";
	terror[2]="Eli";
	terror[3]="No Respires";
	terror[4]="En Hierba Alta";
	String animado [] = new String [5];
	animado [0] = "Raya";
	animado [1]="Minions";
	animado [2]="Hotel Transilvania";
	animado [3]="titanes del pacifico ";
	animado [4]="Demon slayer";
	
	String Ingrese, Registrarse, correo;
	Scanner leer=new Scanner(System.in);
	System.out.println("---NETFLIX---");
	String [] cuenta = new String [1];
	cuenta[0] ="Ingresar";
	cuenta[1] ="Registrarse";
	String[] correo = new String [1];
	correo [0] = "   ";
	correo [1] = "   ";
	
	 Object contra;
	while(Ingrese.equals("0")== true) {
		System.out.println("==================");
    	System.out.println("Ingrese su correo:  ");
    	System.out.println("==================");
    	correo = leer.nextLine();
    	System.out.println("Ingrese su contraseña:");
        contra = leer.nextLine();
        
        if (((String) contra).length() < 6) {
          System.out.println("ERROR, debe ser mas de 6 caracteres. Otra vez.");
          continue;
        }

        if (((String) contra).length() > 10) {
          System.out.println("ERROR, debe ser menos de 10 caracteres. Otra vez.");
          continue;
        }

        boolean tieneLetra = false;
        boolean tieneNumero = false;
        char ch;
        for(int i=0;i < ((String) contra).length();i++) {
          ch = ((String) contra).charAt(i);
          if( Character.isDigit(ch)) {
              tieneNumero = true;
          }
          else if (Character.isLetter(ch)) {
              tieneLetra = true;
          }
        }
        if (!tieneNumero || !tieneLetra) {
          System.out.println("ERROR, debe tener al menos un numero y una letra. Ingrese otra ves su contreña.");
          continue;
        }
        break;
      }

      while (true) {
        System.out.println("Ahora, confirme su contraseña:");
        Object contra2 = leer.nextLine();
        if (!contra.equals(contra2)) {
          System.out.println("ERROR, la segunda no coincide con la primera. Ingrese otra ves su contreña.");
          continue;
        }
        break;
      }
	System.out.println("==================");
	System.out.println("Registrarse:  ");
	System.out.println("==================");
	Registrarse = leer.nextLine();
	System.out.println("Ingrese el nombre del usuario ");
	String Ususario= leer.next();
	System.out.println("Ingrese la contraseña");
    if (((String) contra).length() < 6) {
          System.out.println("ERROR, debe ser mas de 6 caracteres. Otra vez.");
          continue;
        }

        if (((String) contra).length() > 10) {
          System.out.println("ERROR, debe ser menos de 10 caracteres. Otra vez.");
          continue;
        }

        boolean tieneLetra = false;
        boolean tieneNumero = false;
        char ch;
        for(int i=0;i < ((String) contra).length();i++) {
          ch = ((String) contra).charAt(i);
          if( Character.isDigit(ch)) {
              tieneNumero = true;
          }
          else if (Character.isLetter(ch)) {
              tieneLetra = true;
          }
        }
        if (!tieneNumero || !tieneLetra) {
          System.out.println("ERROR, debe tener al menos un numero y una letra. Ingrese otra ves su contreña.");
          continue;
        }
        break;

      while (true) {
        System.out.println("Ahora, confirme su contraseña:");
        Object contra2 = leer.nextLine();
        Object contra1;
		if (!contra1.equals(contra2)) {
          System.out.println("ERROR, la segunda no coincide con la primera. Ingrese otra ves su contreña.");
          continue;
        }
        break;
      }
      
  	System.out.println("Que desea ver ahorita");
  	System.out.println("Peliculas");
  	System.out.println("Series");
  	

  	int opcion = leer.nextInt();
  	
  	int opcionvolver;
	int regresar;
	switch(opcion) {
  	
  	case  1  :{///aqui empieza peñicula ///
  		System.out.println("=====================");
  		 System.out.println("    PELICULAS ");
  		 System.out.println("=====================");
  		 System.out.println("Eliga que categoria desea ver");
  		 int[] peliculas;
		for(int i=0; i<peliculas.length;i++) {
  			 System.out.println( i+1 + ")" + peliculas[i]); 
  		 }
  		 int opcioncategoriapelicula = leer.nextInt();
  		 switch(opcioncategoriapelicula) {
  		 case 1: 
  			 System.out.println("Ha escogido drama, estas son las peliculas que tenemos en este genero:");
  			 for(int i = 0;i<drama.length;i++) {
  				 
  				 System.out.println(i+1 + ")" + drama[i]);
  				 
  			 }
  			 System.out.println("Escoja una pelicula");
  			 String peli = leer.next();
  			 System.out.println("Reproduciendo");
  			 	for(int i=0; i<10; i++) {
  			 	System.out.println("");	
  			 	System.out.print("*");
  			 	 Esperar ();
  			 	
  			 	
  			 	}
  			 	System.out.println("PELICULA FINALIZADA	");
  			 	System.out.println("======================");
  			 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
  			 	 opcionvolver = leer.nextInt();
  			 	 if(opcionvolver==1){
  			 		 regresar = 1 ;
  			 	 }else {
  			 		 regresar = 0;
  			 		 System.out.println("GRACIAS POR PREFERIRNOS VUELVA PRONTO");
  			 	 }
  			 break;///drama///
  			 
  		 case  2:
  			 System.out.println("Eligio la categoria romance esta son las peliculas que tenemos en este genero");
  				for(int i= 0; i<romance.length;i++) {
  					System.out.println(i+1 +")"+romance[i]);
  				}
  				System.out.println("Eliga la pelicula");
  				 String peli1 = leer.next();
  				 System.out.println("Reproduciendo");
  				 	for(int i=0; i<10; i++) {
  				 	System.out.println("");	
  				 	System.out.print("*");
  				 	 Esperar ();
  				 	}
  				 	System.out.println("PELICULA FINALIZADA	");
  				 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
  				 	 opcionvolver = leer.nextInt();
  				 	 if(opcionvolver==1){
  				 		 regresar = 1 ;
  				 	 }else {
  				 		 regresar = 0;
  				 		 System.out.println("GRACIAS POR PREFERIRNOS VUELVA PRONTO");
  				 	 }
  				break;
  		
  		 case 3: 
  			 System.out.println("Eligio la categoria Accion esta son las peliculas que tenemos en este genero");
  			 	for(int i =0 ;i<accion1.length;i++) {
  			 		System.out.println(i+1 + ")" + accion1[i]);
  			 	}
  			 	System.out.println("Eliga la pelicula");
  				 String peli2 = leer.next();
  				 System.out.println("Reproduciendo");
  				 	for(int i=0; i<20; i++) {
  				 	System.out.println("");	
  				 	System.out.print("*");
  				 	 Esperar ();
  				 	}
  				 	System.out.println("PELICULA FINALIZADA	");
  				 	System.out.println("======================");
  				 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
  				 	 opcionvolver = leer.nextInt();
  				 	 if(opcionvolver==1){
  				 		 regresar = 1 ;
  				 	 }else {
  				 		 regresar = 0;
  				 		 System.out.println("GRACIAS POR PREFERIRNOS VUELVA PRONTO");
  				 	 }
  			 	break;
  		 case 4:
  			 System.out.println("Eligio la categoria TERRROR esta son las peliculas que tenemos en este genero");
  			 	for(int i = 0;i<terror1.length;i++) {
  			 		System.out.println(i+1 + ")" + terror1[i]);
  			 	}
  			 	System.out.println("Eliga la pelicula");
  				 String peli3 = leer.next();
  				 System.out.println("Reproduciendo");
  				 	for(int i=0; i<20; i++) {
  				 	System.out.println("");	
  				 	System.out.print("*");
  				 	 Esperar ();
  				 	}
  				 	System.out.println("PELICULA FINALIZADA	");
  				 	System.out.println("======================");
  				 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
  				 	 opcionvolver = leer.nextInt();
  				 	 if(opcionvolver==1){
  				 		 regresar = 1 ;
  				 	 }else {
  				 		 regresar = 0;
  				 		 System.out.println("GRACIAS POR PREFERIRNOS VUELVA PRONTO");
  				 	 }
  			 	break;
  		 case 5:
  			 System.out.println("Eligio la categoria Animado esta son las peliculas que tenemos en este genero");
  			 	for(int i =0; i<animado1.length;i++) {
  			 		System.out.println(i+1 + ")"+ animado1[i]);
  			 	}
  			 	System.out.println("Eliga la pelicula");
  				 String peli4 = leer.next();
  				 System.out.println("Reproduciendo");
  				 	for(int i=0; i<20; i++) {
  				 	System.out.println("");	
  				 	System.out.print("*");
  				 	 Esperar ();
  				 	
  				 	
  				 	}
  				 	System.out.println("PELICULA FINALIZADA	");
  				 	System.out.println("======================");
  				 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
  				 	 opcionvolver = leer.nextInt();
  				 	 if(opcionvolver==1){
  				 		 regresar = 1 ;
  				 	 }else {
  				 		 regresar = 0;
  				 		 System.out.println("GRACIAS POR PREFERIRNOS VUELVA PRONTO");
  				 	 }
  			 	break;
  		 }///aquie termina el primer caso de categoria/
  	}break;///aquie termina caso 1 de pelicula/// 
  	case 2 : {
  		System.out.println("=================");
  		System.out.println("     SERIES       ");
  		System.out.println("==================");
  		System.out.println("Eliga que categoria desea ver");
  		for(int j= 0; j<series.length;j++) {
  			System.out.println(j+1 + ")" + series[j]);
  		}
  		int opcionseries = leer.nextInt();
  		switch (opcionseries) {
  		case 1:
  			System.out.println("Eligio la categoria Drama esta son las series que tenemos en este genero");
  				for(int j=0 ; j<drama.length;j++) {
  					System.out.println(j+1 + ")" + drama[j] ); 
  				}
  				System.out.println("Eliga la serie");
  				 String SERIE = leer.next();
  				 System.out.println("Reproduciendo");
  				 	for(int i=0; i<20; i++) {
  				 	System.out.println("");	
  				 	System.out.print("*");
  				 	 Esperar ();
  				 	}
  				 	System.out.println("PELICULA FINALIZADA	");
  				 	System.out.println("======================");
  				 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
  				 	 opcionvolver = leer.nextInt();
  				 	 if(opcionvolver==1){
  				 		 regresar = 1 ;
  				 	 }else {
  				 		 regresar = 0;
  				 		 System.out.println("GRACIAS POR PREFERIRNOS VUELVA PRONTO");
  				 	 }
  				break;
  		case 2:	
  			System.out.println("Eligio la categoria Romance esta son las series que tenemos en este genero");
  			for(int j=0 ; j<romance.length;j++) {
  				System.out.println(j+1 + ")" + romance[j] ); 
  			}
  			System.out.println("Eliga la serie");
  			 String SERIE1 = leer.next();
  			 System.out.println("Reproduciendo");
  			 	for(int i=0; i<20; i++) {
  			 	System.out.println("");	
  			 	System.out.print("*");
  			 	 Esperar ();
  			 	}
  			 	System.out.println("PELICULA FINALIZADA	");
  			 	System.out.println("======================");
  			 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
  			 	 opcionvolver = leer.nextInt();
  			 	 if(opcionvolver==1){
  			 		 regresar = 1 ;
  			 	 }else {
  			 		 regresar = 0;
  			 		 System.out.println("GRACIAS POR PREFERIRNOS VUELVA PRONTO");
  			 	 }
  			break;
  		case 3:
  			System.out.println("Eligio la categoria Accion esta son las series que tenemos en este genero");
  			for(int j=0 ; j<accion.length;j++) {
  				System.out.println(j+1 + ")" + accion[j] ); 
  			}
  			System.out.println("Eliga la serie");
  			 String SERIE2 = leer.next();
  			 System.out.println("Reproduciendo");
  			 	for(int i=0; i<20; i++) {
  			 	System.out.println("");	
  			 	System.out.print("*");
  			 	 Esperar ();
  			 	}
  			 	System.out.println("PELICULA FINALIZADA	");
  			 	System.out.println("======================");
  			 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
  			 	 opcionvolver = leer.nextInt();
  			 	 if(opcionvolver==1){
  			 		 regresar = 1 ;
  			 	 }else {
  			 		 regresar = 0;
  			 		 System.out.println("GRACIAS POR PREFERIRNOS VUELVA PRONTO");
  			 	 }
  			break;
  		case 4:
  			System.out.println("Eligio la categoria Terror esta son las series que tenemos en este genero");
  			for(int j=0 ; j<terror.length;j++) {
  				System.out.println(j+1 + ")" + terror[j] ); 
  			}
  			System.out.println("Eliga la serie");
  			 String SERIE3 = leer.next();
  			 System.out.println("Reproduciendo");
  			 	for(int i=0; i<20; i++) {
  			 	System.out.println("");	
  			 	System.out.print("*");
  			 	 Esperar ();
  			 	}
  			 	System.out.println("PELICULA FINALIZADA	");
  			 	System.out.println("======================");
  			 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
  			 	 opcionvolver = leer.nextInt();
  			 	 if(opcionvolver==1){
  			 		 regresar = 1 ;
  			 	 }else {
  			 		 regresar = 0;
  			 		 System.out.println("GRACIAS POR PREFERIRNOS VUELVA PRONTO");
  			 	 }
  			break;
  			
  		case 5:
  			System.out.println("Eligio la categoria Animado esta son las series que tenemos en este genero");
  			for(int j=0 ; j<animado.length;j++) {
  				System.out.println(j+1 + ")" + animado[j] ); 
  			}
  			System.out.println("Eliga la serie");
  			 String SERIES4 = leer.next();
  			 System.out.println("Reproduciendo");
  			 	for(int i=0; i<20; i++) {
  			 	System.out.println("");	
  			 	System.out.print("*");
  			 	 Esperar ();
  			 	}
  			 	System.out.println("PELICULA FINALIZADA	");
  			 	System.out.println("======================");
  			 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
  			 	 opcionvolver = leer.nextInt();
  			 	 if(opcionvolver==1){
  			 		 regresar = 1 ;
  			 	 }else {
  			 		 regresar = 0;
  			 		 System.out.println("GRACIAS POR PREFERIRNOS VUELVA PRONTO");
  			 	 }
  			break;
  		}break;///aqui termina el swuict de opcion series
  		
  		}///aqui termina el caso 2 ///
  	
  	}///termina el swicht//
  	
  	}
}

}

private static void Esperar() {
// TODO Auto-generated method stub

}

}



