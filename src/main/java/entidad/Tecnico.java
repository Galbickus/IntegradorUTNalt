/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lombok.Data;

/**
 *
 * @author ASUS
 */
@Data
public class Tecnico {
    private int Legajo; // en realidad es el ID
    private String nombre;
    private String mail;
    private String telefono;
    private boolean telNotificaPreferencia;
    private Set<Especialidad> expertise;
    private List<Incidente> incidentesAsignados;

    public Tecnico() {
    }

    //constructor sin id
    public Tecnico(String nombre, String mail, String telefono, boolean telNotificaPreferencia, Incidente incidente, Set<Especialidad> expertise, List<Incidente> insidentesAsignados) {
        this.nombre = nombre;
        this.mail = mail;
        this.telefono = telefono;
        this.telNotificaPreferencia = telNotificaPreferencia;
        this.expertise = expertise;
        this.incidentesAsignados = insidentesAsignados;
    }

    //constructor completo
    public Tecnico(int Legajo, String nombre, String mail, String telefono, boolean telNotificaPreferencia, Incidente incidente, Set<Especialidad> expertise, List<Incidente> insidentesAsignados) {
        this.Legajo = Legajo;
        this.nombre = nombre;
        this.mail = mail;
        this.telefono = telefono;
        this.telNotificaPreferencia = telNotificaPreferencia;
        this.expertise = expertise;
        this.incidentesAsignados = insidentesAsignados;
    }

    //////////////// métodos específicos ////////////////
    public void agregarEspecialidad(Especialidad especialidad) {

    }

    //ver si cambio el estado desde acá o desde incidente
    public void marcarIncidenteComoResuelto(Incidente incidente, String consideraciones) {

    }

    public List<Incidente> obtenerIncidentesPendientes() {
        ArrayList incidentesPendientes = null;

        return incidentesPendientes;
    }
    //para permitir que el técnico actualice su medio preferido de notificación

    public void establecerMedioComunicacion(String medio) {

    }
   
}
