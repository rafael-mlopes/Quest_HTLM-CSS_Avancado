public class MeuIphone {

    public static void main(String[] args) {
        IPhone meuIphone = new IPhone();

        System.out.println("--- Criando meu novo iPhone ---\n");

        System.out.println("--- 🎶 Testando o Reprodutor Musical ---");
        meuIphone.selecionarMusica("Stairway to Heaven - Led Zeppelin");
        meuIphone.tocar();
        meuIphone.pausar();
        System.out.println();

        System.out.println("--- ☎️ Testando o Aparelho Telefônico ---");
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        System.out.println();

        System.out.println("--- 🖥️ Testando o Navegador na Internet ---");
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
        System.out.println();

        System.out.println("--- Demonstração finalizada ---");
    }
}