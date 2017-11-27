
package boletincolegio;

/**
 *
 * @author dfernandezguerreiro
 */
public class Erasmus extends Estudante {
    protected String pais;

    public Erasmus(String nome, String direccion, String nomeCole, int nivel, String pais) {
        super(nome, direccion, nomeCole, nivel);
        this.pais=pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais=pais;
    }

    @Override
    public String toString() {
        return super.toString() + ", Pais: " + pais;
    }
    
    
}
