
package boletincolegio;

/**
 *
 * @author dfernandezguerreiro
 */
public class Ensinante extends ColeComun {
    protected String materia;

    public Ensinante(String nome, String direccion, String materia) {
        super(nome, direccion);
        this.materia=materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia=materia;
    }

    @Override
    public String toString() {
        return super.toString() + " Materia: " + materia;
    }
    
    
}
