//package one.dio.basecamp;

/*public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        String nome;

        a = 5;
        b = 2;
        c = a / b;
        nome = "abacate";

        System.out.println("o valor do " + nome + " é " + c);
        int d;
        d = (int)c;
        System.out.println(d);
    }

}*/
package one.dio.basecamp;

public class Main {
    public static void main(String[] args) {

        //calculadora
        System.out.println("Exercício da calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);
        System.out.println("");

        //Mensagem
        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(25);
        System.out.println("");

        //Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);

    }

}