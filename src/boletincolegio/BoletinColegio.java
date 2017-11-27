
package boletincolegio;

/**
 *
 * @author dfernandezguerreiro
 */
public class BoletinColegio {

    /**
     * @param args the command line arguments
     */
/**Codifica un programa e fai o correspondente diagrama de clases do xeito seguinte:
1.- Temos unha clase Estudante atributos: nome, direccion, nomeCole e nivel.
2.- Clase Ensinante → nome, direccion e materia.
3.- Clase EstudanteInternacional → nome, direccion, nomeCole, nivel e pais.
En cada clase debe levar constructor, getters e setters e toStrings.
Na clase principal → Crea un obxeto de tipo Estudante, Ensinante e EstudanteInternacional 
* e visualiza todos os atributos.
Cambialle o nivel ao estudante e cambialle a materia ao ensinante. (Volvemos a visualizar.
*/
    public static void main(String[] args) {
        Estudante est1=new Estudante("David","Goián","FP Daniel Castelao",1);
        System.out.println("Estudante:\n"+est1.toString());
        
        Erasmus eras1=new Erasmus("David","Goián","FP Daniel Castelao",1,"Galicia");
        System.out.println("Estudante erasmus:\n"+eras1.toString());
        
        Ensinante ensi1=new Ensinante("Nina","García Barbón","Programación");
        System.out.println("Ensinante:\n"+ensi1.toString());
    }
    
}
