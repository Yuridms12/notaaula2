public class Funcionario {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNascimento() {
        return nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

    protected String nome;
    protected double salario;
    protected int nascimento;


    public Funcionario(String nome, double salario, int nascimento) {
        this.nome = nome;
        this.salario = salario;
        this.nascimento = nascimento;
    }

    public Funcionario(){}


    public void informarSalario(){
        System.out.println("Meu salário é: "+this.salario);
    }

    public void calcularidade(){
        int idade = 2024 - this.nascimento;
        System.out.println("Minha idade é: " + idade);
    }


}


