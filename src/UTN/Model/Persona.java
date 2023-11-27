package TPI.Model;

import javax.persistence.*;

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "persona_id_seq")
    @SequenceGenerator(name = "persona_id_seq", sequenceName = "persona_id_seq", allocationSize = 1)
    private long id;
    private long codigo;
    private String nombre;

    public Persona() {
    }

    public Persona(long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Persona(long id, long codigo, String nombre) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
