public class Animal{
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    protected String nome;
   protected String raca;


    public Animal(){
        this.nome = "";
        this.raca = "";
    }



   public Animal(String nome, String raca) {
       this.nome = nome;
       this.raca = raca;
   }

   public void Caminha(){
       System.out.printf("%s, está caminhando   ", this.nome);
   }


}
