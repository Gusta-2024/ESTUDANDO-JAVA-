package pesquisador;

public class PesquisadorDoutor extends Pesquisador {
    public PesquisadorDoutor(String nome, String areaPesquisa, int numeroProjetos) {
        super(nome, areaPesquisa, numeroProjetos);
    }

    @Override
    public double calcularFinanciamento() {
        return numeroProjetos * 15000; // R$ 15.000 por projeto
    }
}

