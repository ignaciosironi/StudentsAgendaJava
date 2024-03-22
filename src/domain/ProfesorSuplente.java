package domain;

public class ProfesorSuplente extends Profesor {

    protected static String departamento;

    
    public ProfesorSuplente(){
        
    }
    
    @Override
    public void mostrarDatosProfesores() {
        System.out.println("Datos profesor suplente:\n" + "Nombre:" + super.nombre + "\n" + "Apellido: " + super.apellido + "\n" + "Departamento: " + this.departamento + "\n"); 

    }
    
    public static String getDepartamento() {
        return departamento;
    }

    public static void setDepartamento(String departamento) {
        departamento = departamento;
    }

    
}
