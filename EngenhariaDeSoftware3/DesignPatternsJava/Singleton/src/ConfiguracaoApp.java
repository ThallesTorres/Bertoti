public class ConfiguracaoApp {
    // A instância única da classe
    private static ConfiguracaoApp instancia;

    // Configurações do aplicativo
    private String idioma;
    private String corDeFundo;

    // Um construtor privado para evitar instâncias adicionais
    private ConfiguracaoApp() {
        // Inicialização das configurações padrão
        this.idioma = "Português";
        this.corDeFundo = "Preto";
    }

    // Método estático para obter a instância única
    public static ConfiguracaoApp getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracaoApp();
        }
        return instancia;
    }

    // Métodos para acessar e modificar as configurações
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getCorDeFundo() {
        return corDeFundo;
    }

    public void setCorDeFundo(String corDeFundo) {
        this.corDeFundo = corDeFundo;
    }

    public void exibirConfiguracoes() {
        System.out.println("Configurações do Aplicativo:");
        System.out.println("Idioma: " + idioma);
        System.out.println("Cor de Fundo: " + corDeFundo);
    }

}