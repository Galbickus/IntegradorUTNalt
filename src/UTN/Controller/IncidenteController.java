package TPI.Controller;

import TPI.Model.Cliente;
import TPI.Model.Incidente;
import TPI.Model.Tecnico;
import TPI.Repository.IncidenteRepository;
import TPI.Repository.PersonaRepository;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class IncidenteController {

    private IncidenteRepository ir;

    public IncidenteRepository getIr() {
        return ir;
    }

    public IncidenteController() {
        this.ir = new IncidenteRepository();
    }

    public void setIr(IncidenteRepository ir) {
        this.ir = ir;
    }

    public void agregarIncidente(Cliente cliente, Tecnico tecnico, String detalles) {
        if (cliente != null && tecnico != null) {
            Incidente inc = new Incidente();
            inc.setCliente(cliente);
            inc.setTecnico(tecnico);
            inc.setDescripcion(detalles);
           

            ir.getEm().getTransaction().begin();
            ir.insertar(inc);
            ir.getEm().getTransaction().commit();
            System.out.println("INCIDENTE REGISTRADO CON ÉXITO");

        } else {
            System.out.println("No puedo registrar el incidente");
        }
    }

//////////////////////////////////////////////////////////////////////////////////////////////
    /*ESTE ES EL ORIGINAL DE LA PROFE*/
//    public void agregarIncidente(Cliente cliente) {
//        if(cliente!=null) {
//            Incidente inc = new Incidente();
//            inc.setCliente(cliente);
//
//            ir.getEm().getTransaction().begin();
//            ir.insertar(inc);
//            ir.getEm().getTransaction().commit();
//        }else{
//            System.out.println("No puedo registrar el incidente");
//        }
//    }
//////////////////////////////////////////////////////////////////////////////////////////////    
//        private IncidenteRepository ir;
//
//    public IncidenteRepository getIr() {
//        return ir;
//    }
//
//    public IncidenteController() {
//        this.ir = new IncidenteRepository();
//    }
//
//    public void setIr(IncidenteRepository ir) {
//        this.ir = ir;
//    }
//
////    public void agregarIncidente(Cliente cliente) {
////        if(cliente!=null) {
////            Incidente inc = new Incidente();
////            inc.setCliente(cliente);
////
////            ir.getEm().getTransaction().begin();
////            ir.insertar(inc);
////            ir.getEm().getTransaction().commit();
////        }else{
////            System.out.println("No puedo registrar el incidente");
////        }
////    }
//
//
////    private IncidenteRepository ir;
////
////    public IncidenteRepository getIr() {
////        return ir;
////    }
//    
//    
//     private EntityManager em;
//
//    public void setEm(EntityManager em) {
//        this.em = em;
//    }
//
//    
//    
//    
//    public void agregarIncidente(Cliente cliente, Scanner scanner) {
//    try {
//        System.out.print("Ingrese la descripción del incidente: ");
//        String descripcion = scanner.next(); // o scanner.nextLine() si la descripción puede contener espacios.
//
//        Incidente incidente = new Incidente();
//        incidente.setDescripcion(descripcion);
//        incidente.setCliente(cliente);
//
//        EntityTransaction transaction = em.getTransaction();
//
//        transaction.begin();
//
//        try {
//            em.persist(incidente);
//            transaction.commit();
//            System.out.println("Incidente agregado con éxito.\n");
//        } catch (Exception e) {
//            if (transaction.isActive()) {
//                transaction.rollback();
//            }
//            System.out.println("Error al agregar el incidente. Por favor, inténtelo de nuevo.");
//            e.printStackTrace(); // Puedes manejar las excepciones de manera más adecuada según tu caso.
//        }
//    } catch (Exception e) {
//        System.out.println("Error al manejar la entrada del usuario. Por favor, inténtelo de nuevo.");
//        e.printStackTrace(); // Puedes manejar las excepciones de manera más adecuada según tu caso.
//    }
//}
////    
//////    public void agregarIncidente(Cliente cliente, Scanner scanner) {
//////        try {
//////            System.out.print("Ingrese la descripción del incidente: ");
//////            String descripcion = scanner.next(); // o scanner.nextLine() si la descripción puede contener espacios.
//////
//////            Incidente incidente = new Incidente();
//////            incidente.setDescripcion(descripcion);
//////            incidente.setCliente(cliente);
//////
//////            EntityTransaction transaction = em.getTransaction();
//////
//////            transaction.begin();
//////
//////            try {
//////                em.persist(incidente);
//////                transaction.commit();
//////                System.out.println("Incidente agregado con éxito.\n");
//////            } catch (Exception e) {
//////                if (transaction.isActive()) {
//////                    transaction.rollback();
//////                }
//////                System.out.println("Error al agregar el incidente. Por favor, inténtelo de nuevo.");
//////                e.printStackTrace(); // Puedes manejar las excepciones de manera más adecuada según tu caso.
//////            }
//////        } catch (Exception e) {
//////            System.out.println("Error al manejar el EntityManager. Por favor, inténtelo de nuevo.");
//////            e.printStackTrace(); // Puedes manejar las excepciones de manera más adecuada según tu caso.
//////        }
//////    }
////
//////    public IncidenteController() {
////          
//////        
//////        this.ir = new IncidenteRepository();
//////    }
//////
//////    public void setIr(IncidenteRepository ir) {
//////        this.ir = ir;
//////    }
//////
//////    public void agregarIncidente(Cliente cliente) {
//////        if(cliente!=null) {
//////            Incidente inc = new Incidente();
//////            inc.setCliente(cliente);
//////
//////            ir.getEm().getTransaction().begin();
//////            ir.insertar(inc);
//////            ir.getEm().getTransaction().commit();
//////        }else{
//////            System.out.println("No puedo registrar el incidente");
//////        }
//////    }
}
