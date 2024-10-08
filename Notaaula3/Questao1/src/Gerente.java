public class Gerente extends Funcionario{
    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    protected String projeto;

    public Gerente(String projeto, String nome, int nascimento, double salario){
        super(nome, salario, nascimento);
        this.projeto = projeto;
    }

    public void informarProjeto(){
        System.out.println("Meu projeto é: " + this.projeto);
    }


}