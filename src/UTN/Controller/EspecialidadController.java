package TPI.Controller;

import TPI.Model.Cliente;
import TPI.Model.Especialidad;
import TPI.Model.Incidente;
import TPI.Repository.EspecialidadRepository;
import TPI.Repository.IncidenteRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.Scanner;

public class EspecialidadController {

    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }

    private EspecialidadRepository ir;

    public EspecialidadRepository getIr() {
        return ir;
    }

    public void setIr(EspecialidadRepository ir) {
        this.ir = ir;
    }

    public EspecialidadController() {
        this.ir = new EspecialidadRepository();
    }

    public void agregarEspecialidad() {

        Especialidad inc = new Especialidad("Especialidad 1");

        ir.getEm().getTransaction().begin();
        ir.insertar(inc);
        ir.getEm().getTransaction().commit();

    }

    public void agregarEspecialidad3(Scanner scanner) {
        System.out.print("Ingrese el nombre de la especialidad: ");
        //scanner.next(); // Limpia el buffer antes de leer la línea completa
        String nombreEspecialidad = scanner.next();  //en vez de next..nextLine

        Especialidad especialidad = new Especialidad();
        //especialidad.setNombre(nombreEspecialidad);
        especialidad.setNombre(nombreEspecialidad);
        
        

        ir.getEm().getTransaction().begin();
        ir.insertar(especialidad);
        ir.getEm().getTransaction().commit();

        System.out.println("LA ESPECIALIDAD HA SIDO AGREGADA CON ÉXITO.\n");
    }
    
///////////////////////////////////////////
    ///hacer metodo mostrar especialidades
     public void mostrarEspecialidades() {
         EspecialidadRepository er = new EspecialidadRepository();
        System.out.println("Especialidades:");
        er.buscar().forEach(especialidad->System.out.println(especialidad) );
        System.out.println();
    }
    ////////////////////////////////////////////////////
}
