package Universidad;

public class Docente extends Persona {

    private String programa;
    private String horario;

    public Docente(String nombre, String apellido, String rol,
            String modalidad, int id, String programa, String horario) {
        super(nombre, apellido, rol, modalidad, id);
        this.programa = programa;
        this.horario = horario;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("----DOCENTES----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Rol: " + rol);
        System.out.println("Modalidad: " + modalidad);
        System.out.println("ID: " + id);
        System.out.println("Programa: "+ programa);
        System.out.println("Horario: "+ horario);

    }

}
