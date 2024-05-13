package Universidad;

public class Proveedor extends Persona {

    private String ubicacion, servicio;
    private double costo_servicio;

    public Proveedor(String nombre, String apellido, String rol,
            String modalidad, int id, String ubicacion, String servicio, double costo_servicio) {
        super(nombre, apellido, rol, modalidad, id);
        this.ubicacion = ubicacion;
        this.servicio = servicio;
        this.costo_servicio = costo_servicio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getCosto_servicio() {
        return costo_servicio;
    }

    public void setCosto_servicio(double costo_servicio) {
        this.costo_servicio = costo_servicio;
    }

    @Override
    public void mostrarDetalles() { 

        System.out.println("----PROVEEDOR DE SERVICIO----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Rol: " + rol);
        System.out.println("Modalidad: " + modalidad);
        System.out.println("ID: " + id);
        System.out.println("Ubicacion: "+ ubicacion);
        System.out.println("Tipo de Servicio: "+ servicio);
        System.out.println("Costo del servicio: "+ costo_servicio);
        
    }

}
