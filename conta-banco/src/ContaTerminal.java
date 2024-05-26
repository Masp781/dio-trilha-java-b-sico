import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite seu nome.");
            String nome = scanner.next();

            System.out.println("Digite a senha de acesso de 4 dígitos para concluir a criação da sua conta.");
            int senha = scanner.nextInt();
           
            //Na linha abaixo foram criadas as variáveis agência, saldo e numero da conta recebendo assim os valores recebidos pelo usuário.
           // Usei a criatividade e fiz algumas alterações como o número da agencia já inserido em uma variável e criei uma "senha" para criar a conta.
            
            senha = senha + 0;
            String agencia = ("067-8");
            double saldo = 237.48;
            int numeroConta = 1021;
           
            //Na linha seguinte estão os comandos de saída, exibindo os dados da conta bancária do usuário
           
            System.out.println("Obrigado " + nome + ", você acaba de criar uma conta em nosso banco com os seguintes dados:");
            System.out.println("Agência: " + agencia);
            System.out.println("Número da conta: " + numeroConta);
            System.out.println("Saldo já dísponivel para sacar no valor de :" + saldo);
        }
    }
}
