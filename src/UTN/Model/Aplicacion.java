package TPI.Model;

import javax.persistence.*;

@Entity
@Table(name = "aplicacion")
public class Aplicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombre;

    public Aplicacion() {
    }

    public Aplicacion(String nombre) {
        this.nombre = nombre;
    }

    public Aplicacion(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Aplicacion{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
}
