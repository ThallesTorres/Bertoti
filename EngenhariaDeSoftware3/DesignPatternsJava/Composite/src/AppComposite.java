public class AppComposite {
    public static void main(String[] args) {
        // Criando arquivos
        Elemento documento = new Arquivo("Documento.txt");
        Elemento imagem = new Arquivo("Imagem.jpg");

        // Criando pastas e adicionando arquivos
        Pasta pastaImagens = new Pasta("Imagens");
        pastaImagens.addElemento(imagem);

        Pasta pastaRaiz = new Pasta("Raiz");
        pastaRaiz.addElemento(documento);
        pastaRaiz.addElemento(pastaImagens);

        // Exibindo a estrutura do sistema de arquivos
        pastaRaiz.exibir();
    }
}