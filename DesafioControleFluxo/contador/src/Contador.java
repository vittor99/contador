import java.util.Scanner;

// Exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos parâmetros
        System.out.println("Digite o primeiro parâmetro");
        int primeiroParametro = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = scanner.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("Erro: " + e.getMessage());
        }

        // Fechando o scanner
        scanner.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se o segundo parâmetro é menor que o primeiro e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        // Calcular a diferença e realizar a contagem
        int contagem = parametroDois - parametroUm;

        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
