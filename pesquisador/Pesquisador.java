package pesquisador;

public abstract class Pesquisador {
    protected String nome;
    protected String areaPesquisa;
    protected int numeroProjetos;

    public Pesquisador(String nome, String areaPesquisa, int numeroProjetos) {
        this.nome = nome;
        this.areaPesquisa = areaPesquisa;
        this.numeroProjetos = numeroProjetos;
    }

    // Método abstrato: cada subclasse implementa o cálculo
    public abstract double calcularFinanciamento();
}