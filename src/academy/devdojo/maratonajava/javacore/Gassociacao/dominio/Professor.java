package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime(){
        System.out.println("Professor: " + nome);
        System.out.println("Especialidade: " + especialidade);
        if (seminarios == null) return;
        for (Seminario seminario : this.seminarios) {
            System.out.println("-----SEMINARIO----- ");
            System.out.println(seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null) continue;
            System.out.println("## ALUNOS ##");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println(aluno.getNome() + "Idade: " + aluno.getIdade());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
