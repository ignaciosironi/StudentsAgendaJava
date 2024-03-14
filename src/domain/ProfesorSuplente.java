package domain;

public class ProfesorSuplente extends Profesor {

    protected String departamento;

    
    public ProfesorSuplente(){
        
    }
    
    @Override
    public void mostrarDatosProfesores() {
        System.out.println("Datos profesor suplente:\n" + "Nombre:" + super.nombre + "\n" + "Apellido: " + super.apellido + "\n" + "Departamento: " + this.departamento + "\n"); 

    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    
}
