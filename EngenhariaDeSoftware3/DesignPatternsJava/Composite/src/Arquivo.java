// Leaf
class Arquivo implements Elemento {
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir() {
        System.out.println("Arquivo: " + nome);
    }
}
