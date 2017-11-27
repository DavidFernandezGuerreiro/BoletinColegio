
package boletincolegio;

/**
 *
 * @author dfernandezguerreiro
 */
public class Estudante extends ColeComun {
    protected String nomeCole;
    protected int nivel;

    public Estudante(String nome, String direccion, String nomeCole, int nivel) {
        super(nome, direccion);
        this.nomeCole=nomeCole;
        this.nivel=nivel;
    }

    public String getNomeCole() {
        return nomeCole;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNomeCole(String nomeCole) {
        this.nomeCole=nomeCole;
    }

    public void setNivel(int nivel) {
        this.nivel=nivel;
    }

    @Override
    public String toString() {
        return super.toString() + "Nome colexio: " + nomeCole + ", Nivel: " + nivel;
    }
}
