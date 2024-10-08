public class Main {
    public static void main(String[] args) {

        Gerente g = new Gerente("Kamikaze", "Yuri", 2005, 10000);
        Programador p = new Programador("Paulo", 2003, 7000, "Java");
        Funcionario f = new Funcionario("Pedro", 3500, 2004);


        g.informarProjeto();

        p.informarLinguagem();

        f.informarSalario();
        f.calcularidade();


        


    }
}