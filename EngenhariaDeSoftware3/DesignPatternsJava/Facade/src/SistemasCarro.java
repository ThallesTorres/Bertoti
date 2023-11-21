// Facade: Sistemas do Carro
class SistemasCarro {
    private ReprodutorMusica reprodutorMusica;
    private SistemaNavegacao sistemaNavegacao;
    private ControleArCondicionado controleArCondicionado;

    public SistemasCarro() {
        this.reprodutorMusica = new ReprodutorMusica();
        this.sistemaNavegacao = new SistemaNavegacao();
        this.controleArCondicionado = new ControleArCondicionado();
    }

    public void ligarCarro() {
        reprodutorMusica.ligar();
        sistemaNavegacao.ligar();
        controleArCondicionado.ligar();
        System.out.println("Carro ligado");
    }

    public void desligarCarro() {
        reprodutorMusica.desligar();
        sistemaNavegacao.desligar();
        controleArCondicionado.desligar();
        System.out.println("Carro desligado");
    }

    public void tocarMusica(String musica) {
        reprodutorMusica.reproduzirMusica(musica);
    }

    public void definirDestino(String destino) {
        sistemaNavegacao.iniciarRota(destino);
    }

    public void ajustarTemperaturaArCondicionado(int temperatura) {
        controleArCondicionado.ajustarTemperatura(temperatura);
    }
}