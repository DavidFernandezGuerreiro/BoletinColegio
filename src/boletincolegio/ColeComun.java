
package boletincolegio;

/**
 *
 * @author dfernandezguerreiro
 */
public class ColeComun {
    protected String nome;
    protected String direccion;

    public ColeComun(String nome, String direccion) {
        this.nome=nome;
        this.direccion=direccion;
    }

    public String getNome() {
        return nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public void setDireccion(String direccion) {
        this.direccion=direccion;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Dirección: " + direccion +", ";
    }

}
