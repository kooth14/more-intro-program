package Control_Menstrual;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Control_M {
  
  public static void main(String[] args) {
    double  Ciclo_ovulacion, C_M;
    int P_ovulacion,metodo_anticonceptivo;
    String  planificar, nombre, m_fecha;
      LocalDate F_Ciclo_M;
      
    Scanner leer = new Scanner(System.in);
    String Seguir = "si";
    while (Seguir.equals("si")) {
      System.out.println("Ingrese su nombre: ");
      nombre = leer.nextLine();

      while (true) {
        System.out.println("Ingrese la fecha de inicio de su periodo mentrual (formato: d/m/a): ");
        m_fecha = leer.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        try {
          F_Ciclo_M = LocalDate.parse(m_fecha, formatter);
          break;
        }
        catch (Exception e) {
          System.out.println("La fecha no es correcta. Otra vez. ");
        }
      }
          
      System.out.println("Ingrese la duracion de su periodo menstrual: ");
      P_ovulacion = Integer.parseInt(leer.nextLine());
      
      while (P_ovulacion <0) {
        System.out.println("ERROR, la duracion de su periodo no puede ser negativo, favor volver a ingresar la duracion de su periodo");
        P_ovulacion = Integer.parseInt(leer.nextLine());
      }

      System.out.println("¿Ha planificado o esta planificando?");
      planificar = leer.nextLine();
      if (planificar.equals("si")== true ) {
        System.out.println("¿Que tipo/tipos de metodo anticonceptivo esta usando, pastilla o inyeccion(P o I)?");
        metodo_anticonceptivo = leer.nextLine().charAt(0);
        System.out.println("Recuerda tomarla de forma correcta que fue recetada");
      } 

      System.out.println( nombre + ", Su periodo sera: "+ F_Ciclo_M.plusDays(P_ovulacion + 28));

      System.out.println("¿Quiere intentarlo de nuevo?");
      Seguir = leer.nextLine();
      System.out.println("Take care, Thanks");
      
    }
    leer.close();
  }
}
