public class GerenciadorFila {
    private Pessoa[] fila = new Pessoa[100]; 
    private int totalPessoas = 0;           
    private int proximaSenha = 1;           

    public void cadastrarPessoa(String nome, String cpf, String telefone, int anoNascimento) {
        boolean jaExiste = false;
        for (int i = 0; i < totalPessoas; i++) {
            if (fila[i].getCpf().equals(cpf)) {
                jaExiste = true;
            }
        }

        if (jaExiste == true) {
            System.out.println("\nErro! Uma pessoa com este CPF ja esta na fila!");
        } else {
            Pessoa novaPessoa = new Pessoa(nome, cpf, telefone, anoNascimento, proximaSenha);
            
            fila[totalPessoas] = novaPessoa;
            totalPessoas++;

            System.out.println("\n[Sucesso] " + nome + " adicionado(a) à fila!");
            System.out.println("SUA SENHA É: " + proximaSenha + " (Idade: " + novaPessoa.getIdade() + " anos)");
            
            proximaSenha++;
        }
    }

    public void chamarProximo() {
        if (totalPessoas == 0) {
            System.out.println("\nA fila esta vazia!");
            return;
        }

        int indiceMaisVelho = 0;
        for (int i = 1; i < totalPessoas; i++) {
            if (fila[i].getIdade() > fila[indiceMaisVelho].getIdade()) {
                indiceMaisVelho = i;
            }
        }

        Pessoa escolhida = fila[indiceMaisVelho];
        System.out.println("\nCHAMANDO SENHA: " + escolhida.getSenha());
        System.out.println("Nome: " + escolhida.getNome() + " (" + escolhida.getIdade() + " anos)");

        for (int i = indiceMaisVelho; i < totalPessoas - 1; i++) {
            fila[i] = fila[i + 1];
        }
        
        fila[totalPessoas - 1] = null; 
        totalPessoas--;              
    }

    public void listarFila() {
        if (totalPessoas == 0) {
            System.out.println("\nNinguem aguardando na fila.");
        } else {
            System.out.println("\n Pessoas na Fila");
            for (int i = 0; i < totalPessoas; i++) {
                System.out.println("- Senha: " + fila[i].getSenha() + " | Nome: " + fila[i].getNome() + " | Idade: " + fila[i].getIdade() + " anos");
            }
        }
    }
}
