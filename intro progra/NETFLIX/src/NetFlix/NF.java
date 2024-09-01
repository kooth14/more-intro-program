package NetFlix;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class NF {
	static Scanner lector = new Scanner (System.in);
	public static void main(String[] args) {
		String [] series = new String [5];
		series[0] ="Drama";
		series[1] ="Romance";
		series[2] ="Accion";
		series[3] ="Terror";
		series[4] ="Animado";
	    String drama[] = new String [5];
	    drama [0]="Dinastia";
	    drama[1]="Riverdalle";
	    drama[2]="Quien mato a sara";
	    drama[3]="Outlander";
	    drama[4]="Stranger Things";
	    String romance [] = new String [5];
	    romance[0]="Un lugar para soñar";
	    romance[1]="Un amor tan hermoso";
	    romance[2]="Toradora";
	    romance[3]="El amor es la meta";
	    romance[4]="Jardin de meteoros";
	    String accion[] = new String [5];
	    accion[0]="Arrow";
	    accion[1]="Final space";
	    accion[2]="El legado de jupiter";
	    accion[3]="Rick y morty"; 
	    accion[4]="THE FLASH";
	    String terror [] = new String[5];
		terror[0]="Castelvania";
		terror[1]="THE WALKING DEAD";
		terror[2]="Nacion Z";
		terror[3]="Un lobo adolecente";
		terror[4]="Dulce hogar";
		String animado [] = new String [5];
		animado [0] = "De yakuza a amo de casa";
		animado [1]="yasuke";
		animado [2]="Record of Grancrest war";
		animado [3]="titanes del pacifico ";
		animado [4]="Demon slayer";
		String [] peliculas = new String [5];
		peliculas[0] ="Drama";
		peliculas[1] ="Romance";
		peliculas[2] ="Accion";
		peliculas[3] ="Terror";
		peliculas[4] ="Animado";
		String drama1[] = new String [5];
	    drama1[0]="Juego de honor";
	    drama1[1]="El pianista";
	    drama1[2]="Cara cortada";
	    drama1[3]="Sospecha mortal";
	    drama1[4]="Inquebrantable";
	    String romance1 [] = new String [5];
	    romance1[0]="Your name";
	    romance1[1]="Amor de gata";
	    romance1[2]="La teoria del todo";
	    romance1[3]="Time freak";
	    romance1[4]="Crepusculo";
	    String accion1[] = new String [5];
	    accion1[0]="La caida del halcon negro";
	    accion1[1]="Overlord";
	    accion1[2]="47 RONIN";
	    accion1[3]="Tranformers"; 
	    accion1[4]="Rescantando al soldado ryan";
	    String terror1 [] = new String[5];
		terror1[0]="#Vivo";
		terror1[1]="Paredes siniestras";
		terror1[2]="Guerra mundial z";
		terror1[3]="El amanecer de los muertos";
		terror1[4]="Un lugar en silencio";
		String animado1 [] = new String [5];
		animado1[0] = "Una voz silenciosa";
		animado1[1]="Evangelio Death(true)";
		animado1[2]="Batman ninja";
		animado1 [3]="Ni no kuni ";
		animado1[4]="Nezha el renacer de un dios";
		
	System.out.println("Benvenido a netflix ");
	System.out.println("Ingrese el nombre del usuario ");
	String Ususario= lector.next();
	System.out.println("Ingrese la contraseña");
	String contraseña = lector.next();
	int regresar = 1;
	int opcionvolver = 1 ;
	while (regresar ==1) {
	System.out.println("Que desea ver ahorita");
	System.out.println("1-Peliculas");
	System.out.println("2-Series");
	

	int opcion = lector.nextInt();
	
	switch(opcion) {
	
	case  1  :{///aqui empieza peñicula ///
		System.out.println("=====================");
		 System.out.println("    PELICULAS ");
		 System.out.println("=====================");
		 System.out.println("Eliga que categoria desea ver");
		 for(int i=0; i<peliculas.length;i++) {
			 System.out.println( i+1 + ")" + peliculas[i]); 
		 }
		 int opcioncategoriapelicula = lector.nextInt();
		 switch(opcioncategoriapelicula) {
		 case 1: 
			 System.out.println("Eligio  la categoria de Drama esta son las peliculas que tenemos en este genero:");
			 for(int i = 0;i<drama1.length;i++) {
				 
				 System.out.println(i+1 + ")" + drama1[i]);
				 
			 }
			 System.out.println("Eliga la pelicula");
			 String peli = lector.next();
			 System.out.println("Reproduciendo");
			 	for(int i=0; i<20; i++) {
			 	System.out.println("");	
			 	System.out.print("*");
			 	 Esperar ();
			 	
			 	
			 	}
			 	System.out.println("PELICULA FINALIZADA	");
			 	System.out.println("======================");
			 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
			 	 opcionvolver = lector.nextInt();
			 	 if(opcionvolver==1){
			 		 regresar = 1 ;
			 	 }else {
			 		 regresar = 0;
			 		 System.out.println("GRACIAS POR PREFERIRNOS VUELVA PRONTO");
			 	 }
			 break;///drama///
			 
		 case  2:
			 System.out.println("Eligio la categoria romance esta son las peliculas que tenemos en este genero");
				for(int i= 0; i<romance1.length;i++) {
					System.out.println(i+1 +")"+romance1[i]);
				}
				System.out.println("Eliga la pelicula");
				 String peli1 = lector.next();
				 System.out.println("Reproduciendo");
				 	for(int i=0; i<20; i++) {
				 	System.out.println("");	
				 	System.out.print("*");
				 	 Esperar ();
				 	}
				 	System.out.println("PELICULA FINALIZADA	");
				 	System.out.println("======================");
				 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
				 	 opcionvolver = lector.nextInt();
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
				 String peli2 = lector.next();
				 System.out.println("Reproduciendo");
				 	for(int i=0; i<20; i++) {
				 	System.out.println("");	
				 	System.out.print("*");
				 	 Esperar ();
				 	}
				 	System.out.println("PELICULA FINALIZADA	");
				 	System.out.println("======================");
				 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
				 	 opcionvolver = lector.nextInt();
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
				 String peli3 = lector.next();
				 System.out.println("Reproduciendo");
				 	for(int i=0; i<20; i++) {
				 	System.out.println("");	
				 	System.out.print("*");
				 	 Esperar ();
				 	}
				 	System.out.println("PELICULA FINALIZADA	");
				 	System.out.println("======================");
				 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
				 	 opcionvolver = lector.nextInt();
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
				 String peli4 = lector.next();
				 System.out.println("Reproduciendo");
				 	for(int i=0; i<20; i++) {
				 	System.out.println("");	
				 	System.out.print("*");
				 	 Esperar ();
				 	
				 	
				 	}
				 	System.out.println("PELICULA FINALIZADA	");
				 	System.out.println("======================");
				 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
				 	 opcionvolver = lector.nextInt();
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
		int opcionseries = lector.nextInt();
		switch (opcionseries) {
		case 1:
			System.out.println("Eligio la categoria Drama esta son las series que tenemos en este genero");
				for(int j=0 ; j<drama.length;j++) {
					System.out.println(j+1 + ")" + drama[j] ); 
				}
				System.out.println("Eliga la serie");
				 String SERIE = lector.next();
				 System.out.println("Reproduciendo");
				 	for(int i=0; i<20; i++) {
				 	System.out.println("");	
				 	System.out.print("*");
				 	 Esperar ();
				 	}
				 	System.out.println("PELICULA FINALIZADA	");
				 	System.out.println("======================");
				 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
				 	 opcionvolver = lector.nextInt();
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
			 String SERIE1 = lector.next();
			 System.out.println("Reproduciendo");
			 	for(int i=0; i<20; i++) {
			 	System.out.println("");	
			 	System.out.print("*");
			 	 Esperar ();
			 	}
			 	System.out.println("PELICULA FINALIZADA	");
			 	System.out.println("======================");
			 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
			 	 opcionvolver = lector.nextInt();
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
			 String SERIE2 = lector.next();
			 System.out.println("Reproduciendo");
			 	for(int i=0; i<20; i++) {
			 	System.out.println("");	
			 	System.out.print("*");
			 	 Esperar ();
			 	}
			 	System.out.println("PELICULA FINALIZADA	");
			 	System.out.println("======================");
			 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
			 	 opcionvolver = lector.nextInt();
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
			 String SERIE3 = lector.next();
			 System.out.println("Reproduciendo");
			 	for(int i=0; i<20; i++) {
			 	System.out.println("");	
			 	System.out.print("*");
			 	 Esperar ();
			 	}
			 	System.out.println("PELICULA FINALIZADA	");
			 	System.out.println("======================");
			 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
			 	 opcionvolver = lector.nextInt();
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
			 String SERIES4 = lector.next();
			 System.out.println("Reproduciendo");
			 	for(int i=0; i<20; i++) {
			 	System.out.println("");	
			 	System.out.print("*");
			 	 Esperar ();
			 	}
			 	System.out.println("PELICULA FINALIZADA	");
			 	System.out.println("======================");
			 	System.out.println("¿Desea volver al inicio?(1->si /2->no)");
			 	 opcionvolver = lector.nextInt();
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
	
	public static void Esperar() {
		{
			try {
				Thread.sleep(800);
					}catch(InterruptedException ex) {
							Logger.getLogger(AplicacionDeNetflix.class.getName()).log(Level.SEVERE,null,ex);
					}
				
				
		}
	}

	
	
	
}
