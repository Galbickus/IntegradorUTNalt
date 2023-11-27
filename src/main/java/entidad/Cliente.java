/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Set;
import lombok.Data;
import javax.persistence.*;

/**
 *
 * @author ASUS
 */
@Data
@Entity
@Table(name="cliente")
public class Cliente {

    private int idCliente;
    private boolean activo;
    private String razonSocial;   // o nombre en caso de tratarse de persona física
    private String cuit;    //o cuil
    private String mail;
    private String telefono;
    private Set<Producto> ProductosContratados = null;  //productos en gral, pueden ser servicios o sistemas

    public Cliente() {
    }

    public Cliente(boolean activo, String razonSocial, String cuit, String mail, String telefono) {
        this.activo = activo;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.mail = mail;
        this.telefono = telefono;
;
    }

    public Cliente(int idCliente, boolean activo, String razonSocial, String cuit, String mail, String telefono, Set<Producto> ProductosContratados) {
        this.idCliente = idCliente;
        this.activo = activo;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.mail = mail;
        this.telefono = telefono;
        this.ProductosContratados = ProductosContratados;
    }
    
    
    
    //////////////

    public void agregarServicioContratado(Producto producto) {

    }

    public void modificarDatosContacto(String mail, String telefono) {

    }

    public Set<Producto> obtenerServiciosContratados() {
        Set<Producto> serviciosContratados = null;
        return serviciosContratados;
    }

    //Retorna un informe con los incidentes reportados por el cliente.
    public String generarReporteIncidentes() {
        String reporte = "";
        return reporte;
    }

    //Permite que el cliente cancele o elimine un servicio contratado.
    public void eliminarServicioContratado(Producto producto) {

    }

    public void ModificaDatos(Cliente cliente) {

    }

}
