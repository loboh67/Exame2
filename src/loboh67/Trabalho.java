package loboh67;

public class Trabalho extends Viagem {

    private int despesaEmpregador;
    private int custosPessoais;

    public Trabalho(Destino destino, String dataInicio, int duracao, int custoTotal, int custosPessoais) {
        super(destino, dataInicio, duracao, custoTotal);
        this.custosPessoais = custosPessoais;
    }

    @Override
    public String tipoViagem() {
        return "Trabalho";
    }

    public int getCustosPessoais() {
        return custosPessoais;
    }

}
