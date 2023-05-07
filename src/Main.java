import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nome ;
        String tipoConta ;
        double saldoInicial ;
        int    operacao = 0;
        double receber ;
        double transferir;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome ?");
        nome = scanner.nextLine();
        System.out.println("Qual Tipo da Conta Corrente ou Poupança ?");
        tipoConta = scanner.nextLine();
        System.out.println("Qual seu Saldo Inicial ?");
        saldoInicial = scanner.nextDouble();

        System.out.println("**************************************");
        System.out.println("\nDados Iniciais do cliente:");
        System.out.println("Nome:          " + nome);
        System.out.println("Tipo conta:    " + tipoConta );
        System.out.println("Saldo inicial: R$ " + saldoInicial);
        System.out.println("\n**************************************");


        while (operacao != 4){
            System.out.println("\nOperações\n");

            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");


            System.out.println("Digite o número da operação desejada:");
            operacao = scanner.nextInt();

            if (operacao == 1){
                System.out.println("Seu saldo é R$ " + saldoInicial);
            } else if (operacao == 2 ) {
                System.out.println("Quanto ira receber:");
                receber = scanner.nextDouble();
                saldoInicial += receber;
                System.out.println("Seu novo saldo é de R$" + saldoInicial);
            } else if (operacao ==3) {
                System.out.println("quanto ira transferir:");
                transferir = scanner.nextDouble();
                if (transferir <= saldoInicial){
                    saldoInicial -= transferir;
                    System.out.println("Seu novo saldo é de R$" + saldoInicial);
                }else {
                    System.out.println("Saldo insuficiente");
                }
            } else if ( operacao == 4) {
                break;
            }else {
                System.out.println("Opção Invalida");
            }
        }
    }
}