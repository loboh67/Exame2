package loboh67;

import java.util.ArrayList;

public abstract class Viagem {

    protected Destino destino;
    protected String dataInicio;
    protected int duracao;
    protected int custoTotal;

    public Viagem() {
    }

    public Viagem(Destino destino, String dataInicio, int duracao, int custoTotal) {
        this.destino = destino;
        this.dataInicio = dataInicio;
        this.duracao = duracao;
        this.custoTotal = custoTotal;
    }

    public Destino getDestino() {
        return destino;
    }

    public abstract String tipoViagem();

    public static void getCustoPessoal(ArrayList<Viagem> viagens) {
        int custoPessoal;
        for (Viagem v : viagens) {
            if (v.tipoViagem().equals("Ferias")) {
                Ferias f = (Ferias) v;
                custoPessoal = f.custoTotal;
                System.out.println(custoPessoal);
            } else if (v.tipoViagem().equals("Trabalho")) {
                Trabalho t = (Trabalho) v;
                custoPessoal = t.getCustosPessoais();
                System.out.println(custoPessoal);
            }
        }
    }

    public static void oxigenio(ArrayList<Viagem> viagens) {
        for (Viagem v : viagens) {
            if (v.getDestino().tipoDestino().equals("Montanha")) {
                Montanha m = (Montanha) v.getDestino();
                if (m.getAltitude() > 6000) {
                    System.out.println("Necessita máscara de oxigénio");
                }
            }
        }
    }

}
