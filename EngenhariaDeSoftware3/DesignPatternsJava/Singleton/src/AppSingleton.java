public class AppSingleton {
    public static void main(String[] args) {
        // Teste de uso do Singleton para configurações de aplicativo
        ConfiguracaoApp configuracao = ConfiguracaoApp.getInstancia();

        // Modificando as configurações
        configuracao.setIdioma("Inglês");
        configuracao.setCorDeFundo("Azul");

        // Obtendo novamente a instância (deveria ser a mesma)
        ConfiguracaoApp outraConfiguracao = ConfiguracaoApp.getInstancia();

        // Exibindo as configurações (deveriam ser as mesmas)
        configuracao.exibirConfiguracoes();
        outraConfiguracao.exibirConfiguracoes();
    }
}

