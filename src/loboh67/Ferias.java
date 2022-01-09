package loboh67;

public class Ferias extends Viagem{

    public Ferias(Destino destino, String dataInicio, int duracao, int custoTotal) {
        super(destino, dataInicio, duracao, custoTotal);
    }

    @Override
    public String tipoViagem() {
        return "Ferias";
    }

}
