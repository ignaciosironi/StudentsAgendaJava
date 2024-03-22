package domain;

import java.util.*;

public class Array {
    
    public static ArrayList <Profesor> lista;
    
    private static ArrayList <ProfesorSuplente> lista1;
    
    public Array(){
        lista= new ArrayList <Profesor>();
        lista1= new ArrayList <ProfesorSuplente>();
    }

    public static void añadirDatosProfesoresTitulares(Profesor profesorTitular) {
        lista.add(profesorTitular); 
    }
    
    public static void añadirDatosProfesoresSuplentes(ProfesorSuplente profesorSuplente){
        lista1.add(profesorSuplente);
    }
    
    public void mostrarLista() {
       
        System.out.println("\n" + "Elementos de la lista del profesor titular:\n");
        
        for (Profesor elementosLista : lista) {
            elementosLista.mostrarDatosProfesores();
        }
        
        System.out.println("\n" + "Elementos de la lista del profesor suplente: \n");
        for(ProfesorSuplente elementosLista:lista1){
            elementosLista.mostrarDatosProfesores();
        }
        
    }

}
