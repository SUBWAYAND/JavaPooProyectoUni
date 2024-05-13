package Universidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Persona> personas = new ArrayList<>();

        while (true) {

            System.out.println("Agrega una nueva persona IBERO");
            System.out.println("1. Estudiante");
            System.out.println("2. Docente");
            System.out.println("3. Administrativo");
            System.out.println("4. Proveedor");
            System.out.println("5. Detalles");
            System.out.println("6. Salir");

            int opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese el nombre: ");
                    String nombreEstudiante = entrada.nextLine();
                    System.out.println("Ingrese Apellido");
                    String apellidoEstudiante = entrada.nextLine();
                    System.out.println("Ingrese el Rol: ");
                    String rolEstudiante = entrada.nextLine();
                    System.out.println("Ingrese la modalidad del estudiante: ");
                    String modalidadEstudiante = entrada.nextLine();
                    System.out.println("Asigne el ID: ");
                    int idEstudiante = entrada.nextInt();
                    System.out.println("Ingrese la carrera a cursar");
                    String carreraEstudiante = entrada.nextLine();
                    System.out.println("Ingrese el semestre: ");
                    String semestreEstudiante = entrada.nextLine();
                    System.out.println("Ingrese la cantidad de creditos a inscribir: ");
                    int creditosEstudiante = entrada.nextInt();
                    System.out.println("Ingrese el valor del semestre: ");
                    int valorSemestre = entrada.nextInt();
                    entrada.nextLine();
                    personas.add(new Estudiante(nombreEstudiante, apellidoEstudiante, rolEstudiante, modalidadEstudiante, idEstudiante,
                            carreraEstudiante, semestreEstudiante,  creditosEstudiante, valorSemestre));

                    break;

                case 2:

                    System.out.println("Ingrese el nombre: ");
                    String nombreDocente = entrada.nextLine();
                    System.out.println("Ingrese apellido: ");
                    String apellidoDocente = entrada.nextLine();
                    System.out.println("Ingrese el Rol: ");
                    String rolDocente = entrada.nextLine();
                    System.out.println("Ingrese modalidad del trabajo: ");
                    String modalidadDocente = entrada.nextLine();
                    System.out.println("Asigne ID: ");
                    int idDocente = entrada.nextInt();
                    System.out.println("Ingrese programa a enseñar: ");
                    String programaDocente = entrada.nextLine();
                    System.out.println("Ingrese Horario: ");
                    String horarioDocente = entrada.nextLine();
                    entrada.nextLine();
                    personas.add(new Docente(nombreDocente, apellidoDocente, rolDocente,
                            modalidadDocente, idDocente, programaDocente, horarioDocente));

                    break;

                case 3:

                    System.out.println("Ingrese el nombre: ");
                    String nombreAdmi = entrada.nextLine();
                    System.out.println("Ingrese apellido: ");
                    String apellidoAdmi = entrada.nextLine();
                    System.out.println("Ingrese el Rol: ");
                    String rolAdmi = entrada.nextLine();
                    System.out.println("Ingrese modalidad de trabajo: ");
                    String modalidadAdmi = entrada.nextLine();
                    System.out.println("Asigne ID: ");
                    int idAdmi = entrada.nextInt();
                    System.out.println("Ingrese tipo de contrato: ");
                    String contratoAdmi = entrada.nextLine();
                    System.out.println("Ingrese Area de Servicio: ");
                    String servicioAdmi = entrada.nextLine();
                    entrada.nextLine();
                    personas.add(new Administrativo(nombreAdmi, apellidoAdmi, 
                            rolAdmi, modalidadAdmi, idAdmi, contratoAdmi, servicioAdmi));

                    break;

                case 4:

                    System.out.println("Ingrese nombre: ");
                    String nombreProveedor = entrada.nextLine();
                    System.out.println("Ingrese apellido: ");
                    String apellidoProveedor = entrada.nextLine();
                    System.out.println("Ingrese Rol: ");
                    String rolProveedor = entrada.nextLine();
                    System.out.println("Ingrese modalidad del servicio: ");
                    String modalidadProveedor = entrada.nextLine();
                    System.out.println("Asigne ID: ");
                    int idProveedor = entrada.nextInt();
                    System.out.println("Indique ubicacion del servicio: ");
                    String ubicacionProveedor = entrada.nextLine();
                    System.out.println("Ingrese el tipo de servicio: ");
                    String servicioProveedor = entrada.nextLine();
                    System.out.println("Ingrese el costo del servicio: ");
                    double costo_servicioProveedor = entrada.nextDouble();
                    entrada.nextLine();
                    personas.add(new Proveedor(nombreProveedor, apellidoProveedor, rolProveedor, modalidadProveedor,
                            idProveedor, ubicacionProveedor, servicioProveedor, costo_servicioProveedor));

                    break;

                case 5:

                    System.out.println("Detalles de personas");
                    for (Persona persona : personas) {
                        persona.mostrarDetalles();
                        System.out.println("---------------");
                    }

                    break;

                case 6:

                    System.out.println("Saliendo del Programa.....");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion invalida, por favor ingrese opcion (1-4)");
            }

        }
    }

}
