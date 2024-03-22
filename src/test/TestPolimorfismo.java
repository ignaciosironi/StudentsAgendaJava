package test;

import domain.*;
import java.util.Scanner;

public class TestPolimorfismo {

    public static void main(String args[]) {

        Array array1 = new Array();
        
        Profesor profesorTitular = new Profesor();
        
        ProfesorSuplente profesorSuplente = new ProfesorSuplente();
        
        
        IngresoDatosConsola ingresoDatosConsola = new IngresoDatosConsola();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese número de opción:\n" + "Ingresar datos=1\n" + "Buscar datos=2\n" + "Terminar=3\n");

        try {
            ingresoDatosConsola.opcion = Integer.parseInt(scanner.nextLine());
            
            while(ingresoDatosConsola.opcion!=1 && ingresoDatosConsola.opcion!=2 && ingresoDatosConsola.opcion!=3){ 
                ingresoDatosConsola.metodoIngresoDatosErroneosMenu();
                ingresoDatosConsola.metodoIngresoOpcionNuevamente();
            }

            while (ingresoDatosConsola.opcion == 1 || ingresoDatosConsola.opcion == 2 || ingresoDatosConsola.opcion != 3) { 
             
                if (ingresoDatosConsola.opcion == 2) {
                    do { 
                        
                        System.out.println("Ingrese profesor a buscar: ");
                        
                        var buscarElementoEnLista = scanner.nextLine();
                        
                        
                        var contactoProfesor=buscarElementoEnLista;
                        boolean existeContacto=false;
                        
                        for(var recorrerLista:Array.lista){ 
                        
                            if(recorrerLista.equals(contactoProfesor)){ 
                            
                                existeContacto=true;
                                break;
                            }
                            
                        }
                        
                        if(existeContacto==true){ 
                            System.out.println("Ese profesor ya se ingresó");
                            break;
                        }
                        else{
                            System.out.println("no se encontró profesor");
                        }
                        
                        
                        
                        ingresoDatosConsola.metodoBuscarDatos();

                        while (ingresoDatosConsola.opcion != 1 && ingresoDatosConsola.opcion != 2) {

                            ingresoDatosConsola.metodoIngresoDatosErroneos();

                            ingresoDatosConsola.metodoBuscarDatos();
                        }
                        
                    } while (ingresoDatosConsola.opcion == 1); 

                } else if (ingresoDatosConsola.opcion == 1) {

                    do {

                        ingresoDatosConsola.metodoDatosConsola();

                        array1.añadirDatosProfesoresTitulares(profesorTitular);
                        //Array.añadirDatosProfesoresTitulares(profesorTitular);
                        
                        array1.añadirDatosProfesoresSuplentes(profesorSuplente);
                        //Array.añadirDatosProfesoresSuplentes(profesorSuplente);

                        ingresoDatosConsola.metodoRepuestaDatosConsola();

                        while (ingresoDatosConsola.getRespuestaIngresoDatos() != 1 && ingresoDatosConsola.getRespuestaIngresoDatos() != 2) {

                            ingresoDatosConsola.metodoIngresoDatosErroneos();

                            ingresoDatosConsola.metodoRepuestaDatosConsola();
                        }

                    } while (ingresoDatosConsola.getRespuestaIngresoDatos() == 1);

                    System.out.println("Los datos ingresados son: ");

                    array1.mostrarLista(); 

                }
                
                
                ingresoDatosConsola.metodoIngresoOpcionNuevamente();
                    
                while(ingresoDatosConsola.opcion!=1 && ingresoDatosConsola.opcion!=2 && ingresoDatosConsola.opcion!=3){ 
                        
                    ingresoDatosConsola.metodoIngresoDatosErroneosMenu();
                    ingresoDatosConsola.metodoIngresoOpcionNuevamente();
                    }
                
            }
            
        } catch (Exception e) {
            System.out.println("Ocurrió un error. No ha ingresado un número entero.");

        }

        System.out.println("Programa terminado"); 

    }

}
