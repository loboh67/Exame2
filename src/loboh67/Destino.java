package loboh67;

public abstract class Destino {

    protected String nome;
    protected String pais;

    public Destino() {
    }

    public Destino(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    abstract public String tipoDestino();
}
