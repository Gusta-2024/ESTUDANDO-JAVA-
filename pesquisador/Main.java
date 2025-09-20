package pesquisador;

public class Main {
    public static void main(String[] args) {
        Pesquisador doutor = new PesquisadorDoutor("Dr. Silva", "Física", 3);
        Pesquisador mestre = new PesquisadorMestre("Mestre Santos", "Biologia", 2);

        System.out.println(doutor.nome + " - Financiamento: R$ " + doutor.calcularFinanciamento());
        System.out.println(mestre.nome + " - Financiamento: R$ " + mestre.calcularFinanciamento());
    }
}

