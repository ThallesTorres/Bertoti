public class Teste {
    public static void main(String[] args) throws Exception {
        Cliente carlos = new Cliente();

        carlos.setOrcamento(new Notebook());
        carlos.verOrcamento();

        carlos.setOrcamento(new Microondas());
        carlos.verOrcamento();
    }
}
