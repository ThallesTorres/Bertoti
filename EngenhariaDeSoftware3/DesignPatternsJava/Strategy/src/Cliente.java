public class Cliente {
    private Aparelho aparelho;

    // Utilizando um construtor para inicializar o cliente
    public Cliente(Aparelho aparelho) {
        this.aparelho = aparelho;
    }

    // Método para configurar o aparelho em tempo de execução
    public void setAparelho(Aparelho aparelho) {
        this.aparelho = aparelho;
    }

    // Método para exibir o orçamento
    public void verOrcamento() {
        this.aparelho.fazerOrcamento();
    }
}