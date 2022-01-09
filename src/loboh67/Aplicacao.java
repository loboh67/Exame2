package loboh67;

import java.util.ArrayList;

public class Aplicacao {

    public static void main(String[] args) {
        ArrayList<Viagem> viagens = new ArrayList<Viagem>();
        Cidade c1 = new Cidade("Lisboa", "Portugal");
        Montanha m1 = new Montanha("Serra da Estrela", "Portugal", 3000);
        Ferias f1 = new Ferias(c1, "06/01/2022", 7, 530);
        Trabalho t1 = new Trabalho(m1, "06/01/2022", 14, 780, 220);
        viagens.add(f1);
        viagens.add(t1);
        Viagem.getCustoPessoal(viagens);
        Viagem.oxigenio(viagens);
    }
}
