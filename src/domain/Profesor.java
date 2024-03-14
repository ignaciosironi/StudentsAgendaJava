package domain;

public class Profesor {

    protected String nombre;
    protected String apellido;

    public Profesor (){
        
    }
    
    public void mostrarDatosProfesores() {
        System.out.println("Datos profeosr titular\n" + "Nombre: " + this.nombre + "\n" + "Apellido: " + this.apellido + "\n");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
