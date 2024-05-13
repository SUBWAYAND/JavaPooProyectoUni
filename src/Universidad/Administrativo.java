package Universidad;

public class Administrativo extends Persona {

    private String tipo_contrato, area;

    public Administrativo(String nombre, String apellido, String rol, 
            String modalidad, int id, String tipo_contrato, String area) {
        super(nombre, apellido, rol, modalidad, id);
        this.tipo_contrato = tipo_contrato;
        this.area = area;
    }

    public String getTipo_contrato() {
        return tipo_contrato;
    }

    public void setTipo_contrato(String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void mostrarDetalles() {

        System.out.println("----ADMINISTRATIVOS----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Rol: " + rol);
        System.out.println("Modalidad: " + modalidad);
        System.out.println("ID: " + id);
        System.out.println("Tipo contrato: "+ tipo_contrato);
        System.out.println("Area de servico: "+ area);
        
    }

}
