// Cliente
public class AppFacade {
    public static void main(String[] args) {
        SistemasCarro facade = new SistemasCarro();

        // Iniciar o carro e ajustar configurações
        facade.ligarCarro();
        facade.tocarMusica("Chitãozinho e Xororó - Grandes Clássicos");
        facade.definirDestino("Fatec Sjc");
        facade.ajustarTemperaturaArCondicionado(24);

        // Desligar o carro
        facade.desligarCarro();
    }
}