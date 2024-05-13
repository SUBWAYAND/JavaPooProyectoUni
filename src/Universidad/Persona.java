package Universidad;

public abstract class Persona {

    protected String nombre, apellido, rol, modalidad;
    protected int id;

    public Persona(String nombre, String apellido, String rol, String modalidad, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.modalidad = modalidad;
        this.id = id;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public abstract void  mostrarDetalles();

}
