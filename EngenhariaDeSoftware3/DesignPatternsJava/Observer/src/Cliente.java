public class Cliente {
    private Aparelho aparelho;
    
    public void setOrcamento(Aparelho aparelho) {
        this.aparelho = aparelho;
    }

    public void verOrcamento() {
        this.aparelho.fazerOrcamento();
    }
}
