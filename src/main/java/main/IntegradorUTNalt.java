/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import data.*;
import entidad.*;

/**
 *
 * @author ASUS
 */

/*    private boolean activo;
    private String razonSocial;   // o nombre en caso de tratarse de persona física
    private String cuit;    //o cuil
    private String mail;
    private String telefono;
    private Set<Producto> ProductosContratados;  //productos en gral, pueden ser servicios o sistemas*/

public class IntegradorUTNalt {

    public static void main(String[] args) {
    ClienteData cd = new ClienteData();
    Cliente cliente = new Cliente(true,"Diario Clarín", "30-98754632-5", "Tech@clarin.com.ar", "011-585-3654");
    cd.guardarCliente(cliente);
        System.out.println(cliente);
    }
}
/*

*/