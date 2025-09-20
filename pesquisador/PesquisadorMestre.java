package pesquisador;

public class PesquisadorMestre extends Pesquisador {
    public PesquisadorMestre(String nome, String areaPesquisa, int numeroProjetos) {
        super(nome, areaPesquisa, numeroProjetos);
    }

    @Override
    public double calcularFinanciamento() {
        return numeroProjetos * 10000; // R$ 10.000 por projeto
    }
}

