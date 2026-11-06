public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private int anoNascimento;
    private int senha;

    public Pessoa(String nome, String cpf, String telefone, int anoNascimento, int senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.anoNascimento = anoNascimento;
        this.senha = senha;
    }

    public int getIdade() {
        return 2026 - this.anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getSenha() {
        return senha;
    }
}
