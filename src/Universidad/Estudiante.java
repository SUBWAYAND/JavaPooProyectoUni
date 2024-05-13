package Universidad;

public class Estudiante extends Persona {

    private String carrera, semestre;
    private int creditos;
    private double valor_semestre;

    public Estudiante(String nombre, String apellido, String rol,
            String modalidad, int id, String carrera, String semestre, int creditos,  int valor_semestre) {
        super(nombre, apellido, rol, modalidad, id);
        this.carrera = carrera;
        this.modalidad = modalidad;
        this.creditos = creditos;
        this.semestre = semestre;
        this.valor_semestre = valor_semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public double getValor_semestre() {
        return valor_semestre;
    }

    public void setValor_semestre(int valor_semestre) {
        this.valor_semestre = valor_semestre;
    }

    @Override

    public void mostrarDetalles() {

        System.out.println("----ESTUDIANTE----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Rol: " + rol);
        System.out.println("Modalidad: " + modalidad);
        System.out.println("ID: " + id);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestres: " + semestre);
        System.out.println("Creditos: " + creditos);
        System.out.println("Valor Semestre: " + valor_semestre);
    }
}
