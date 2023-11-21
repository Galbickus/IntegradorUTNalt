/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author ASUS
 */
@Data
public class Incidente {

    private int idIncidente;
    private Date fechaAlta;
    private Cliente cliente;
    private Producto producto;
    private String tipo;  //ver si no conviene hacerlo con un enum//la cntidad de hs estandard debe ir deacuerdo a est
    private Tecnico tecnicoAsignado;
    private boolean dificultadExtra;
    private int cantHsEstimadas;  //ver si se ajusta con el modelo o vuela
    private String informeTecnico;
    private Date fechaBaja;
    private Estado estado;       //cambio patron state por enum, en BD es un varchar

    public Incidente() {

    }
    
//constructor sin id
    public Incidente(Date fechaAlta, Cliente cliente, Producto producto, String tipo, Tecnico tecnicoAsignado, boolean dificultadExtra, int cantHsEstimadas, String informeTecnico, Date fechaBaja, Estado estado) {
        this.fechaAlta = fechaAlta;
        this.cliente = cliente;
        this.producto = producto;
        this.tipo = tipo;
        this.tecnicoAsignado = tecnicoAsignado;
        this.dificultadExtra = dificultadExtra;
        this.cantHsEstimadas = cantHsEstimadas;
        this.informeTecnico = informeTecnico;
        this.fechaBaja = fechaBaja;
        this.estado = estado;
    }
//constructor completo con inicializacion de Patron State

    public Incidente(int idIncidente, Date fechaAlta, Cliente cliente, Producto producto, String tipo, Tecnico tecnicoAsignado, boolean dificultadExtra, int cantHsEstimadas, String informeTecnico, Date fechaBaja, Estado estado) {
        this.idIncidente = idIncidente;
        this.fechaAlta = fechaAlta;
        this.cliente = cliente;
        this.producto = producto;
        this.tipo = tipo;
        this.tecnicoAsignado = tecnicoAsignado;
        this.dificultadExtra = dificultadExtra;
        this.cantHsEstimadas = cantHsEstimadas;
        this.informeTecnico = informeTecnico;
        this.fechaBaja = fechaBaja;
        this.estado = estado;
    }


///////////////////////////////////////////////////////
    public void asignarTecnico(Tecnico tecnico) {

    }
/*Marcar Como Resuelto
  Marca el incidente como resuelto y permite agregar consideraciones.*/

    public void marcarComoResuelto(String consideraciones) {

    }

/*Calcular Tiempo Estimado de Resolución:
  Calcula el tiempo estimado de resolución, considerando el colchón de horas si es aplicable.*/
    public int calcularTiempoEstimado() {
        int tiempoEstimado = 0;

        return tiempoEstimado;
    }

/*Generar Notificación al Cliente:
  Genera una notificación al cliente cuando el incidente es marcado como resuelto.*/
    public void generarNotificacionCliente() {

    }

    
}
