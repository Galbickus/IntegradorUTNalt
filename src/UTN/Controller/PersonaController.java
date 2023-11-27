package TPI.Controller;

import TPI.Model.Cliente;
import TPI.Model.Tecnico;
import TPI.Repository.EspecialidadRepository;
import TPI.Repository.PersonaRepository;
import java.util.List;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class PersonaController {

    private PersonaRepository pr;

    public PersonaRepository getPr() {
        return pr;
    }

    public void setPr(PersonaRepository pr) {
        this.pr = pr;
    }

    public PersonaController() {
        this.pr = new PersonaRepository();
    }

    public void agregarCliente(Scanner scanner) {
        System.out.print("Ingrese el nombre del cliente: ");
        //scanner.next(); // Limpia el buffer antes de leer la línea completa
        String nombreCliente = scanner.next();  //en vez de next..nextLine

        Cliente cliente = new Cliente();
        cliente.setNombre(nombreCliente);

        pr.getEm().getTransaction().begin();
        pr.insertar(cliente);
        pr.getEm().getTransaction().commit();

        System.out.println("Especialidad agregada con éxito.\n");
    }

    public void agregarTecnico(Scanner scanner) {
        System.out.print("Ingrese el nombre del tecnico: ");
        String nombre = scanner.next();

        Tecnico tecnico = new Tecnico();
        tecnico.setNombre(nombre);
       
        pr.getEm().getTransaction().begin();
        pr.insertar(tecnico);
        pr.getEm().getTransaction().commit();

        System.out.println("Tecnico agregado con éxito.\n");
    }

    public void mostrarClientes() {
        System.out.println("Clientes:");
        pr.buscarClientes().forEach(
                cliente -> System.out.println(cliente));
        System.out.println();
    }

    public Cliente buscarClienteId(long nroCliente) {
        Cliente cliente = pr.buscarUno(nroCliente);
        if (cliente != null) {
            System.out.println(cliente);
        } else {
            System.out.println("El cliente no existe");
        }
        return cliente;
    }

    public void mostrarTecnicos() {
        List<Tecnico> tecnicos = pr.obtenerTecnicos(); // llama al método de PersonaRepository para obtener los técnicos
        if (tecnicos.isEmpty()) {
            System.out.println("No hay técnicos registrados.");
        } else {
            System.out.println("Lista de Técnicos:");
            for (Tecnico tecnico : tecnicos) {
                System.out.println(tecnico.getId() + " - " + tecnico.getNombre());
            }
        }
    }

    public Tecnico buscarTecnicoId(long idTecnico) {
        // Tecnico tecnico = pr.buscarUno(idTecnico);

        Tecnico tecnico = pr.buscarDos(idTecnico);  //ir a persona repository y agregar el metodo buscar persona (tecnico)por id

        if (tecnico != null) {
            System.out.println(tecnico);
        } else {
            System.out.println("El técnico no existe");
        }
        return tecnico;
    }
}
