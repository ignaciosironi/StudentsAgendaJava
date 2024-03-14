package domain;

import java.util.Scanner;

public class IngresoDatosConsola {

    Scanner scanner = new Scanner(System.in);
    
    Profesor profesorTitular = new Profesor();
    
    ProfesorSuplente profesorSuplente = new ProfesorSuplente();
    
    private static int respuestaIngresoDatos;
    
    public int opcion;

    public void metodoDatosConsola() {

        System.out.println("Ingrese Nombre profesor titular: ");
        profesorTitular.nombre = scanner.nextLine();

        System.out.println("Ingrese apellido profesor titular: ");
        profesorTitular.apellido=scanner.nextLine();
        
        
        System.out.println("Ingrese Nombre profesor suplente: ");
        profesorSuplente.nombre=scanner.nextLine();
        
        System.out.println("Ingrese apellido profesor suplente: ");
        profesorSuplente.apellido=scanner.nextLine();
        
        
        System.out.println("Ingrese departamento profesor suplente: ");
        profesorSuplente.departamento=scanner.nextLine();
    
    }
    
    public void metodoBuscarDatos(){
        System.out.println("Buscar datos de nuevo: 1. No volver a buscar datos de nuevo: 2");
        opcion = Integer.parseInt(scanner.nextLine());
    }

    public void metodoRepuestaDatosConsola() {
        System.out.println("Continuar cargando datos: 1. No continuar cargando datos: 2");
        respuestaIngresoDatos = Integer.parseInt(scanner.nextLine());
    }

    public void metodoIngresoOpcionNuevamente() {
        System.out.println("\n" + "Ingrese otra vez un número de opción:\n"+"Ingresar datos=1\n"+"Buscar profesor: 2\n"+"Terminar=3");
        opcion = Integer.parseInt(scanner.nextLine());
    }

    public void metodoIngresoDatosErroneos() {
        System.out.println("Debe ingresar el número 1 o 2");
    }
    
    public void metodoIngresoDatosErroneosMenu(){
        System.out.println("Debe ingresar el número 1, 2 o 3");
    }
    
    public static int getRespuestaIngresoDatos() {
        return respuestaIngresoDatos;
    }

    public static void setRespuestaIngresoDatos(int respuestaIngresoDatos) {
        IngresoDatosConsola.respuestaIngresoDatos = respuestaIngresoDatos;
    }

}
