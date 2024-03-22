package domain;

public class Profesor {

    protected static String nombre;
    protected static String apellido;

    public Profesor (){
        
    }
    
    public void mostrarDatosProfesores() {
        System.out.println("Datos profeosr titular\n" + "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n");
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        nombre = nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
