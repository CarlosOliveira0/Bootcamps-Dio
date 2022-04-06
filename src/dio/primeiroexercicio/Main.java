package dio.primeiroexercicio;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(7, 6);
        Calculadora.subtracao(9, 7.5);
        Calculadora.multiplicacao(9, 8);
        Calculadora.divisao(15, 2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(17);
        Mensagem.obterMensagem(3);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1250, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1250, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1250, 5);

    }
}
