public class AppStrategy {
    public static void main(String[] args) {
        // Criando instâncias de diferentes aparelhos
        Aparelho notebook = new Notebook();
        Aparelho microondas = new Microondas();
        Aparelho tv = new Tv();

        // Criando instância do cliente com um Notebook
        Cliente carlos = new Cliente(notebook);
        carlos.verOrcamento();

        // Configurando o cliente com um Microondas e exibindo o orçamento
        carlos.setAparelho(microondas);
        carlos.verOrcamento();

        // Configurando o cliente com uma TV e exibindo o orçamento
        carlos.setAparelho(tv);
        carlos.verOrcamento();
    }
}