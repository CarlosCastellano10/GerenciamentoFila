import java.util.Scanner;

public class AppTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        GerenciadorFila gerenciador = new GerenciadorFila();
        
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n=== MENU DE ATENDIMENTO OO ===");
            System.out.println("1. Cadastrar Pessoa na Fila");
            System.out.println("2. Chamar Proximo (Maior Idade)");
            System.out.println("3. Listar Fila de Espera");
            System.out.println("4. Sair do Sistema");
            System.out.print("Escolha uma opcao: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 1) {
                System.out.print("Digite o CPF (apenas numeros): ");
                String cpf = scanner.nextLine();
                
                System.out.print("Digite o Nome: ");
                String nome = scanner.nextLine();
                
                System.out.print("Digite o Telefone: ");
                String telefone = scanner.nextLine();
                
                System.out.print("Digite o Ano de Nascimento (AAAA): ");
                int ano = scanner.nextInt();
                scanner.nextLine();

                gerenciador.cadastrarPessoa(nome, cpf, telefone, ano);

            } else if (opcao == 2) {
                gerenciador.chamarProximo();

            } else if (opcao == 3) {
                gerenciador.listarFila();
            }
        }
        
        System.out.println("\nSistema encerrado com sucesso.");
        scanner.close();
    }
}
