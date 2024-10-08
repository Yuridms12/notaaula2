public class Programador extends Funcionario{
    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    protected String linguagem;

    public Programador(String nome, int nascimento, double salario, String linguagem) {
        super(nome,salario,nascimento);
        this.linguagem = linguagem;
    }

    public void informarLinguagem(){
        System.out.println("A linguagem utilizada é: "+ this.linguagem);

    }







}