package loboh67;

public class Cidade extends Destino {

    public Cidade(String nome, String pais) {
        super(nome, pais);
    }

    @Override
    public String tipoDestino() {
        return "Cidade";
    }
}
