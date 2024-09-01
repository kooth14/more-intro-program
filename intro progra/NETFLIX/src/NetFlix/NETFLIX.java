package NetFlix;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NETFLIX {

	public static void main(String[] args) {
		String seguir = "si";
	    while (seguir.equals("si")) {
	    	Scanner leer=new Scanner(System.in);
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
			
			System.out.println("---NETFLIX---");
			String usuario, perfil, correo, nombreyapellido;
			double contraseña;
			String user [] = new String[5];
			user [0]= "kim";
			user [1]="jeon";
			user [2]="min";
			user [3]="wang";
			user [4]="lee";
			System.out.println("Tiene una cuenta?");
			String opcion = "si";
		    while (opcion.equals("si")) {
		    	System.out.println("Ingrese su cuenta:  ");
		    	usuario = leer.nextLine();
		    	System.out.println("Ingrese su contraseña:  ");
		    	contraseña = leer.nextDouble();
		    	if (contraseña < 6) {
		            System.out.println("ERROR, debe ser mas de 6 caracteres. Otra vez.");
		            continue;
		          }

		          if (contraseña > 10) {
		            System.out.println("ERROR, debe ser menos de 10 caracteres. Otra vez.");
		            continue;
		          }

		          boolean tieneLetra = false;
		          boolean tieneNumero = false;
		          char ch = 0;
		          for(int i=0;i < contraseña;i++) {
		
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
		    
		    do {
		    	System.out.println("Registrese");
		    	System.out.println("Ingrese su nombre y apellido: ");
		    	nombreyapellido = leer.nextLine();
		    	System.out.println("Ingrese su contraseña:  ");
		    	contraseña = leer.nextDouble();
		    	if (contraseña < 6) {
		            System.out.println("ERROR, debe ser mas de 6 caracteres. Otra vez.");
		            continue;
		          }

		          if (contraseña > 10) {
		            System.out.println("ERROR, debe ser menos de 10 caracteres. Otra vez.");
		            continue;
		          }

		          boolean tieneLetra2= false;
		          boolean tieneNumero2 = false;
		          char a = 0;
		          for(int i=0;i < contraseña;i++) {
		
		            if( Character.isDigit(a)) {
		                tieneNumero = true;
		            }
		            else if (Character.isLetter(a)) {
		                tieneLetra = true;
		            }
		          }
		          if (!tieneNumero || !tieneLetra) {
		            System.out.println("ERROR, debe tener al menos un numero y una letra. Ingrese otra ves su contreña.");
		            continue;
		          }
		          break;
		    }
		    
		    System.out.println("En cual perfil accedera?");
		   user.next();
		    }
	}
}
}


 	