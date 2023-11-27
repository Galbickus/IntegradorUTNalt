package TPI.Model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "persona")
public class Tecnico extends Persona {

    @ManyToMany(targetEntity = Especialidad.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Especialidad> especialidades;

    public Tecnico() {
    }

    public Tecnico(Set<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public Set<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Set<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    @Override
    public String toString() {
        //return "Tecnico{" + "especialidades=" + especialidades + '}';
        return this.getNombre()+" ";
    }

}
/*ManyToMany Cascade, lazy*/
