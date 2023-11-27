package TPI;

import PatronRepository.EmpleadoRepository;
import TPI.Controller.EspecialidadController;
import TPI.Controller.IncidenteController;
import TPI.Controller.PersonaController;
import TPI.Model.Cliente;
import TPI.Model.Especialidad;
import TPI.Model.Tecnico;
import TPI.Repository.IncidenteRepository;
import TPI.Repository.PersonaRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class MainTPI {
//   1 *** EntityManager***

    public static EntityManager getEntityManager() {
        EntityManagerFactory factory
                = Persistence.createEntityManagerFactory(
                        "JPA_PU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        EntityManager em = getEntityManager();

        PersonaController pc = new PersonaController();

        //seteando el entityManager al repository
        pc.getPr().setEm(em);

        IncidenteController ic = new IncidenteController();
        //seteando el entityManager al repository
        ic.getIr().setEm(em);

        EspecialidadController ec = new EspecialidadController();
        //seteando el entityManager al repository
        ec.getIr().setEm(em);

        // Scanner scanner = new Scanner(System.in);
        int opcion;
        long idCliente;
        do {
            System.out.println("Menú Principal");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Registrar Técnico");
            System.out.println("3. Mostrar Clientes");
            System.out.println("4. Mostrar Técnicos");
            System.out.println("5. Registrar Especialidad");
            System.out.println("6. Registrar Incidente");
            System.out.println("7. Agregar especialidad a técnico");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    pc.agregarCliente(scanner);
                    break;
                case 2:
                    pc.agregarTecnico(scanner);
                    break;
                case 3:
                    pc.mostrarClientes();
                    break;
                case 4:
                    // mostrarTecnicos();
                    pc.mostrarTecnicos();
                    break;
                case 5:
                    //ec.agregarEspecialidad(scanner);
                    ec.agregarEspecialidad3(scanner);
                    break;
                case 6:

                    pc.mostrarClientes();
                    System.out.println("Ingrese el numero del cliente");
                    idCliente = scanner.nextLong();
                    Cliente cliente = pc.buscarClienteId(idCliente);
                    
                    /////////////////////////////
                    System.out.println("");
                    System.out.println("Ingrese los detalles del incidente relatados por el cliente");

                    String detalles = scanner.next();   //ver de sacar el ln
                   
                    ////////////////////////////
 System.out.println("");
                    pc.mostrarTecnicos();
                    System.out.println("Ingrese el numero del técnico asignado al Incidente");
                    long idTecnico = scanner.nextLong();
                    Tecnico tecnicoAsignado = pc.buscarTecnicoId(idTecnico);  ///voy a hacer el metodo buscar tecnico por ID
                    


                    ic.agregarIncidente(cliente, tecnicoAsignado, detalles);

                    // ic.agregarIncidente(pc.buscarClienteId(idCliente)
                    // tc.mostrar tecnicos   
                    System.out.println("");
                    break;
                case 7:
//                        ec.agregarEspecialidad();     //hacer mátodo listar especialidades
//                         ec.mostrarEspecialidades();
//                    //ec.agregarEspecialidad(scanner);
//                    ec.agregarEspecialidad3(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    }

}
