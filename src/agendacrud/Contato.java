package agendacrud;

public class Contato {
    private String numero;
    private String nome;
    private String grupo;
    private int id;

    public Contato(String numero, String nome, String grupo) {
        this.numero = numero;
        this.nome = nome;
        this.grupo = grupo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", numero=" + numero + ", grupo=" + grupo + ", id=" + id + '}';
    } 
}
